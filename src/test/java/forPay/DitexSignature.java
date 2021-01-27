package forPay;


import org.apache.commons.codec.binary.Base64;

import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public class DitexSignature {
    private final Map<String, String> formParams;
    private final String secretKey;

    private DitexSignature(Map<String, String> formParams, String secretKey) {
        this.formParams = formParams;
        this.secretKey = secretKey;
    }

    public static DitexSignature from(Map<String, String> formParams, String secretKey) {
        return new DitexSignature(formParams, secretKey);
    }

    public String makeSignature() {

        SortedSet<String> keys = new TreeSet<>(this.formParams.keySet());
        StringBuilder concatedBuilder = new StringBuilder();
        for (String key : keys) {
            // соберем строчку конкатенации из значений параметров
            concatedBuilder
                    .append(this.formParams.get(key))
                    .append(":");
        }
        concatedBuilder.append(this.secretKey);

        return Base64.encodeBase64String(HashUtils.hashBySHA256(concatedBuilder.toString().getBytes()));
    }
}
