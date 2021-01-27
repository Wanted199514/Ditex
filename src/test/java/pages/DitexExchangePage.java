package pages;

import com.fasterxml.jackson.databind.ObjectMapper;
import forPay.DitexSignature;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import tests.Token;

import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DitexExchangePage extends BasePage {
    @FindBy(xpath = "//div[1]/span/span[@class='ng-star-inserted'][3]")
    private WebElement exchangeRate;

    @FindBy(xpath = "//div[2]/span/span[@class='ng-star-inserted'][1]")
    private WebElement exhangeFee;

    @FindBy(xpath = "//div[3]/span/span[@class='ng-star-inserted'][1]")
    private WebElement networkFee;

    @FindBy(xpath = "//input[contains(@class,'input-wallet')]")
    private WebElement walletField;

    @FindBy(xpath = "//input[@onlynumber]")
    private WebElement myCoins;

    @FindBy(xpath = "//button[contains(@class,'btn-default')]")
    private WebElement continueButton;

    @FindBy(xpath = "//div[contains(@class,'active-step')]/div/div/h1[@translate='processing_page.step2_header']")
    private WebElement secondStepText;

    @FindBy(xpath = "//div[contains(@class,'active-step')]/div/div/h1[@translate='processing_page.step3_header']")
    private WebElement thirdStepText;

    @FindBy(xpath = "//div[2]/div/div/div[2]/div[@class='fee-data']")
    private WebElement myCoinsQualityOnSecondStep;

    @FindBy(xpath = "//div[@class='fee-data text-blue']")
    private WebElement youGet;

    @FindBy(xpath = "//div[1]/div/div/div[1]/div[@class='fee-data']")
    private WebElement oneCoinEquality;

    @FindBy(xpath = "//div[1]/div/div/div[2]/div[@class='fee-data']")
    private WebElement comissionNumber;

    @FindBy(xpath = "//div[3]/div[@class='fee-data']")
    private WebElement comissionNetwork;

    @FindBy(xpath = "//div[1]/div/div/div[2]/div[@class='fee-title']")
    private WebElement comissionPercent;

    @FindBy(xpath = "//div[2]/span[@class='fee-title']")
    private WebElement comissionPercentForFirstStep;

    @FindBy(xpath = "//img[@alt='Scan me!']")
    private WebElement QRCode;

    @FindBy(xpath = "//app-processing-step-order/p[2]/span[@class='text-blue'][1]")
    private WebElement myCoinsQualityOnThirdStep;

    @FindBy(xpath = "//span[@id='link-for-copy']")
    private WebElement linkForCopy;

    @FindBy(xpath = "//app-exchange-form-column/form/div/div[1]/div[1]/div")
    private WebElement chooseCryptoForSell;

    @FindBy(xpath = "//app-exchange-form-column/form/div/div[2]/div[1]/div")
    private WebElement chooseCryptoForBuy;

    @FindBy(xpath = "//div[1]/div/div/ul/li/div/span[contains(text(),'BTC')]")
    private WebElement chooseBTC;

    @FindBy(xpath = "//div[1]/div/div/ul/li/div/span[contains(text(),'ETH')]")
    private WebElement chooseETH;

    @FindBy(xpath = "//div[1]/div/div/ul/li/div/span[contains(text(),'RUB')]")
    private WebElement chooseRUB;

    @FindBy(xpath = "//div[1]/div/div/ul/li/div/span[contains(text(),'USDT')]")
    private WebElement chooseUSDT;

    @FindBy(xpath = "//div[1]/div/div/ul/li/div/span[contains(text(),'EUR')]")
    private WebElement chooseEUR;

    @FindBy(xpath = "//div[1]/div/div/ul/li/div/span[contains(text(),'JPY')]")
    private WebElement chooseJPY;

    @FindBy(xpath = "//div[1]/div/div/ul/li/div/span[contains(text(),'USD')]")
    private WebElement chooseUSD;

    @FindBy(xpath = "//div[@class='select-exchange select-exchange-from']/div")
    private WebElement chosenCryptoForSell;

    @FindBy(xpath = "//div[@class='select-exchange select-exchange-to']/div")
    private WebElement chosenCryptoForBuy;

    @FindBy(xpath = "//div[@data-error-type='errors.input.amount_zero']")
    private WebElement errorMessageNumberField;

    @FindBy(xpath = "//div[@data-error-type='errors.input.required']")
    private WebElement errorMessageWalletField;

    @FindBy(xpath = "//label/div[@class='error-text']")
    private WebElement errorMessageWrongFormatField;

    @FindBy(xpath = "//img[@alt='Visa']")
    private WebElement visaLogo;

    @FindBy(xpath = "//img[@alt='MasterCard']")
    private WebElement mastercardLogo;

    @FindBy(xpath = "//img[@alt='MobiMoney']")
    private WebElement mobimoneyLogo;

    @FindBy(xpath = "//input[@placeholder='Е-mail Mobimoney']")
    private WebElement emailMobimoneyField;

    @FindBy(xpath = "//div[@class='modal-content popup']")
    private WebElement operationCannotBeDoneTab;

    @FindBy(xpath = "//div[contains(@class,'order-id-wrapper')]/div[2]")
    private WebElement orderID;

    @FindBy(xpath = "//span[@translate='processing_page.go_to_profile']")
    private WebElement goToOrderList;

    @FindBy(xpath = "//div[@class='mat-checkbox-inner-container']")
    private WebElement checkboxSaveMyWallet;

    public DitexExchangePage(WebDriver webDriver) {
        initializationWebElements(webDriver);
    }

    public boolean ditexExhangePageIsLoaded() {
        waitUntilElementIsAppear(walletField);
        return webDriver.getCurrentUrl().equals(front + "/processing/offer");
    }

    public boolean ditexSecondStepExchangeIsLoaded() {
        waitUntilElementIsAppear(secondStepText);
        return webDriver.getCurrentUrl().equals(front + "/processing/confirmation");
    }


    public void firstStepWithoutClickContinueButton(String wallet) {
        sleep(1000);
        waitUntilElementIsAppear(myCoins);
        waitUntilElementIsAppear(walletField);
        walletField.sendKeys(wallet);
        sleep(2000);
        scrollDown();
        sleep(1000);
    }

    public void firstStep(String wallet) {
        firstStepWithoutClickContinueButton(wallet);
        waitUntilElementIsAppear(continueButton);
        continueButton.click();
    }

    public void firstStepWithoutClickContinueButton(String coins, String wallet) {
        sleep(2000);
        waitUntilElementIsAppear(myCoins);
        myCoins.click();
        myCoins.sendKeys(Keys.BACK_SPACE);
        myCoins.sendKeys(coins);
        sleep(1000);
        waitUntilElementIsAppear(walletField);
        walletField.sendKeys(wallet);
        sleep(1000);
    }

    public boolean visaLogoIsLoaded() {
        scrollDown();
        waitUntilElementIsAppear(visaLogo);
        return visaLogo.isDisplayed();
    }

    public boolean mastercardLogoIsLoaded() {
        scrollDown();
        waitUntilElementIsAppear(mastercardLogo);
        return mastercardLogo.isDisplayed();
    }

    public boolean mobimoneyLogoIsLoaded() {
        scrollDown();
        return mobimoneyLogo.isDisplayed();
    }

    public boolean emailMobimoneyFieldIsLoaded() {
        scrollDown();
        return emailMobimoneyField.isDisplayed();
    }

    public boolean operationCannotBeDoneTabIsLoaded() {
        waitUntilElementIsAppear(operationCannotBeDoneTab);
        return operationCannotBeDoneTab.isDisplayed();
    }

    public PlatioPage clickOnVisaLogo() {
        visaLogo.click();
        return new PlatioPage(webDriver);
    }

    public DitexMyOrdersPage clickOnGoToOrderList() {
        goToOrderList.click();
        return new DitexMyOrdersPage(webDriver);
    }

    public void clickOnMastercardLogo() {
        mastercardLogo.click();
    }

    public void clickOnMobimoneyLogo() {
        mobimoneyLogo.click();
    }

    public boolean secondStepIsLoaded() {
        waitUntilElementIsAppear(secondStepText);
        waitUntilElementIsAppear(comissionNumber);
        return secondStepText.isDisplayed();
    }

    public boolean thirdStepIsLoaded() {
        waitUntilElementIsAppear(thirdStepText);
        return thirdStepText.isDisplayed();
    }

    public String myCoinsOnSecondStepIsCorrect() {
        sleep(1000);
        return myCoinsQualityOnSecondStep.getText();
    }

    public Double myCoinsQualityOnSecondStepNumber() {
        return Double.parseDouble(getOnlyNumber(myCoinsQualityOnSecondStep.getText()));
    }

    public String orderIDGetText() {
        return orderID.getText();
    }

    private String getOnlyNumber(String number) {
        return number.substring(0,number.indexOf(" "));
    }

    private String getOnlyNumberForOneCoinEquallyNumber(String number) {
        return number.substring(number.indexOf("= ") + 1,number.lastIndexOf(" "));
    }

    private String getOnlyNumberForPercent(String number) {
        return number.substring(number.indexOf("(") + 1,number.indexOf("%"));
    }

    public Double youGetNumber() {
        return Double.parseDouble(getOnlyNumber(youGet.getText()));
    }

    private String youGetNumberGetText() {
        return youGet.getText();
    }


    public Double oneCoinEquallyNumber() {
        return Double.parseDouble(getOnlyNumberForOneCoinEquallyNumber(oneCoinEquality.getText()));
    }

    public Double comissionNumber() {
        return Double.parseDouble(getOnlyNumber(comissionNumber.getText()));
    }

    public Double comissionNetworkNumber() {
        return Double.parseDouble(getOnlyNumber(comissionNetwork.getText()));
    }

    private Double comissionPercentNumber() {
        return Double.parseDouble(getOnlyNumberForPercent(comissionPercent.getText()));
    }

    private String comissionPercentGetText() {
        return comissionPercent.getText();
    }

    public String comissionPercentGetTextForFirstStep() {
        scrollDown();
        waitUntilElementIsAppear(comissionPercentForFirstStep);
        return comissionPercentForFirstStep.getText();
    }

    private Double trueComissionNumberForFiat() {
        return (youGetNumberWithoutComission()/100)*comissionPercentNumber();
    }

    public Double trueComissionNumberForFiatWithLimiter() {
        return limiterForFiat(trueComissionNumberForFiat());
    }

    private Double trueComissionNumberForCrypto() {
        return (youGetNumberWithoutComission()/100)*comissionPercentNumber();
    }

    public Double trueComissionNumberForCryptoWithLimiter() {
        return limiter(trueComissionNumberForCrypto(),comissionPercentGetText());
    }

    public void secondStepIsOver() {
        waitUntilElementIsAppear(continueButton);
        continueButton.click();
    }

    private Double youGetNumberWithoutComission() {
        return myCoinsQualityOnSecondStepNumber()*oneCoinEquallyNumber();
    }

    private Double trueYouGetNumber() {
        return youGetNumberWithoutComission()-(trueComissionNumberForCrypto()+comissionNetworkNumber());
    }

    public Double trueYouGetNumberWithLimiter() {
        return limiter(trueYouGetNumber(),youGetNumberGetText());
    }

    private Double trueYouGetNumberForFiat() {
        return youGetNumberWithoutComission()-(trueComissionNumberForFiat()+comissionNetworkNumber());
    }

    public Double trueYouGetNumberForFiatWithLimiter() {
        return limiterForFiat(trueYouGetNumberForFiat());
    }

    private Double limiter(Double number, String numberForLength) {
        Double result = new BigDecimal(number).setScale(numberForLength.substring(numberForLength.indexOf(".") + 1,numberForLength.indexOf(" ")).length(), RoundingMode.HALF_DOWN).doubleValue();
        return result;
    }

    private Double limiterForFiat(Double number) {
        Double result = new BigDecimal(number).setScale(0, RoundingMode.DOWN).doubleValue();
        return result;
    }

    public boolean qrCodeIsLoaded() {
        sleep(500);
        scrollDown();
        return QRCode.isDisplayed();
    }

    public String myCoinsQualityOnThirdStep() {
        waitUntilElementIsAppear(myCoinsQualityOnThirdStep);
        scrollDown();
        return myCoinsQualityOnThirdStep.getText();
    }

    public boolean linkForCopyIsLoaded() {
        sleep(500);
        scrollDown();
        return linkForCopy.isDisplayed();
    }

    public String linkForCopyGetText() {
        return linkForCopy.getText();
    }

    private void chooseMyWalletForSell() {
        sleep(2000);
        scrollDown();
        waitUntilElementIsAppear(chooseCryptoForSell);
        chooseCryptoForSell.click();
    }

    public void chooseMyCryptoBTCForSell() {
        chooseMyWalletForSell();
        waitUntilElementIsAppear(chooseBTC);
        chooseBTC.click();
        sleep(500);
    }

    public void chooseMyCryptoETHForSell() {
        chooseMyWalletForSell();
        waitUntilElementIsAppear(chooseETH);
        chooseETH.click();
        sleep(500);
    }

    public void chooseMyWalletRUBForSell() {
        chooseMyWalletForSell();
        waitUntilElementIsAppear(chooseRUB);
        chooseRUB.click();
        sleep(500);
    }

    public void chooseMyWalletJPYForSell() {
        chooseMyWalletForSell();
        waitUntilElementIsAppear(chooseJPY);
        chooseRUB.click();
        sleep(500);
    }

    public void chooseMyWalletUSDForSell() {
        chooseMyWalletForSell();
        waitUntilElementIsAppear(chooseUSD);
        chooseUSD.click();
        sleep(500);
    }

    private void chooseMyWalletForBuy() {
        sleep(2000);
        scrollDown();
        waitUntilElementIsAppear(chooseCryptoForBuy);
        chooseCryptoForBuy.click();
    }

    public void chooseMyCryptoBTCForBuy() {
        chooseMyWalletForBuy();
        waitUntilElementIsAppear(chooseBTC);
        chooseBTC.click();
        sleep(500);
    }

    public void chooseMyCryptoETHForBuy() {
        chooseMyWalletForBuy();
        waitUntilElementIsAppear(chooseETH);
        chooseETH.click();
        sleep(500);
    }

    public void chooseMyCryptoRUBForBuy() {
        chooseMyWalletForBuy();
        waitUntilElementIsAppear(chooseRUB);
        chooseRUB.click();
        sleep(500);
    }

    public void chooseMyCryptoJPYForBuy() {
        chooseMyWalletForBuy();
        waitUntilElementIsAppear(chooseJPY);
        chooseJPY.click();
        sleep(500);
    }

    public void chooseMyCryptoUSDForBuy() {
        chooseMyWalletForBuy();
        waitUntilElementIsAppear(chooseUSD);
        chooseUSD.click();
        sleep(500);
    }

    public String chosenCryptoForSellIsLoaded() {
        return chosenCryptoForSell.getText();
    }

    public String chosenCryptoForBuyIsLoaded() {
        return chosenCryptoForBuy.getText();
    }

    public String errorMessageWalletFieldIsLoaded() {
        waitUntilElementIsAppear(errorMessageWalletField);
        return errorMessageWalletField.getText();
    }

    public String errorMessageNumberFieldIsLoaded() {
        waitUntilElementIsAppear(errorMessageNumberField);
        return errorMessageNumberField.getText();
    }

    public String errorMessageWrongFormatFieldIsLoaded() {
        waitUntilElementIsAppear(errorMessageWrongFormatField);
        return errorMessageWrongFormatField.getText();
    }

    public void clickOnCheckBoxSaveMyWallet() {
        checkboxSaveMyWallet.click();
    }

    public void fileWrite(String quality, String sell, String buy) {
        try {
            FileWriter writer = new FileWriter("C:\\Users\\gdd00\\Desktop\\EXCHANGE.txt",true);
            writer.write(orderIDGetText() + " - " + quality + " " + sell + "-" + buy);
            writer.append('\n');

            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

    InputStream content;

    public InputStream content() {
        return content;
    }

    public String sendRequest(String amount) {
        String secretKey = "ef1d3261eb3a4957b708556a00d45544"; //TEST

        String userId = "ditex_userId";
        String ditexAmount = "ditex_amount";
        String orderId = "ditex_orderId";
        String username = "gdd0070@gmail.com";
        String sign = "ditex_sign";
        String orderForPAY = orderIDGetText();

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