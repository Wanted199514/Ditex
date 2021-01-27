package forPay;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.xml.bind.DatatypeConverter;

public class HashUtils {

    private HashUtils() {
    }

    public static String hashByMD5(String value) {
        return createHash(value, "MD5");
    }

    public static byte[] hashByMD5(byte[] value) {
        try {
            return createDigest(value, "MD5");
        } catch (NoSuchAlgorithmException e) {
            System.out.println(e.getMessage());
        }
        return new byte[0];
    }

    public static String hashBySHA256(String value) {
        return createHash(value, "SHA-256");
    }

    public static byte[] hashBySHA256(byte[] value) {
        try {
            return createDigest(value, "SHA-256");
        } catch (NoSuchAlgorithmException e) {
            System.out.println(e.getMessage());
        }
        throw new IllegalStateException();
    }

    private static String createHash(String value, String algorithm) {
        String hash = null;
        try {
            hash = DatatypeConverter.printHexBinary(createDigest(value, algorithm)).toLowerCase();
        } catch (NoSuchAlgorithmException e) {
            System.out.println(e.getMessage());
        }
        return hash;
    }

    private static byte[] createDigest(String value, String algorithm) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        messageDigest.update(value.getBytes());
        return messageDigest.digest();
    }

    private static byte[] createDigest(byte[] value, String algorithm) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        messageDigest.update(value);
        return messageDigest.digest();
    }
}
