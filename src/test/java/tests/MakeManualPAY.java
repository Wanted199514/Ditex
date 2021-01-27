package tests;

import com.fasterxml.jackson.databind.ObjectMapper;
import forPay.DitexSignature;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MakeManualPAY {
    @Test
    public void pay() {
        String request = sendRequest();
        Assert.assertNotNull(request,"Answer is 'NULL'");
    }
     private String sendRequest() {
         String secretKey = "ef1d3261eb3a4957b708556a00d45544"; //TEST

         String amount = "";
         String userId = "ditex_userId";
         String ditexAmount = "ditex_amount";
         String orderId = "ditex_orderId";
         String username = "gdd0070@gmail.com";
         String sign = "ditex_sign";
         String orderForPAY = "";

         final String URL = "https://testapi.ditex.io/api/v1/payment/payOrder";

         CloseableHttpClient httpclient = HttpClients.createDefault();
         HttpPost httpPost = new HttpPost(URL);
         HttpPost httpPostForAuth = new HttpPost("https://testapi.ditex.io/api/v1/uaa/oauth/token");
         httpPostForAuth.
                 setHeader("Authorization","Basic d2ViX3NpdGVfY2xpZW50OndlYl9zaXRlX2NsaWVudF9zZWNyZXRfa2V5");
         List<NameValuePair> form_data = new ArrayList<NameValuePair>();
         form_data.add(new BasicNameValuePair("grant_type","password"));
         form_data.add(new BasicNameValuePair("username",username));
         form_data.add(new BasicNameValuePair("password","123456"));
         try {
             httpPostForAuth.setEntity(new UrlEncodedFormEntity(form_data));
         } catch (UnsupportedEncodingException e) {
             e.printStackTrace();
         }

         CloseableHttpResponse authResponse = null;
         try {
             authResponse = httpclient.execute(httpPostForAuth);
         } catch (IOException e) {
             e.printStackTrace();
         }
         Token token = null;
         InputStream authContent = null;
         try {
             authContent = authResponse.
                     getEntity().getContent();

             token = new ObjectMapper().readValue(authContent, Token.class);
         } catch (IOException e) {
             e.printStackTrace();
         }

         List<NameValuePair> nvps = new ArrayList<NameValuePair>();

         nvps.add(new BasicNameValuePair(userId, username));
         nvps.add(new BasicNameValuePair(ditexAmount, amount));
         nvps.add(new BasicNameValuePair(orderId, orderForPAY));

         Map<String, String> parameters = new HashMap<>();
         parameters.put(userId, username);
         parameters.put(ditexAmount, amount);
         parameters.put(orderId, orderForPAY);
         DitexSignature signature = DitexSignature.from(parameters, secretKey);
         nvps.add(new BasicNameValuePair(sign, signature.makeSignature()));
         try {
             httpPost.setEntity(new UrlEncodedFormEntity(nvps));
             httpPost.setHeader("Authorization", "Bearer " + token.getAccess_token());
         } catch (UnsupportedEncodingException e) {
             e.printStackTrace();
         }
         CloseableHttpResponse response2 = null;
         try {
             response2 = httpclient.execute(httpPost);
         } catch (IOException e) {
             e.printStackTrace();
         }

         InputStream content = null;
         int statusCode = 0;
         try {
             statusCode = response2.getStatusLine().getStatusCode();
             content = response2.getEntity().getContent();
         } catch (IOException e) {
             e.printStackTrace();
         }
         Assert.assertEquals(statusCode,200,"Status code is " + statusCode + ".");
         try {
             return new BufferedReader(new InputStreamReader(content)).readLine();
         } catch (IOException e) {
             e.printStackTrace();
         }
         return null;
     }
}
