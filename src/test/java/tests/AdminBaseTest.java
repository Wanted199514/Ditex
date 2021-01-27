package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.DitexAdminLoginPage;
import pages.DitexExchangePage;
import pages.DitexMainPage;

public class AdminBaseTest {
    //String admin = "http://100.64.0.201:8887"; //PROD
    //String admin = "http://100.64.0.211:8887";  //DEV
    String admin = "http://100.64.0.231:8887";  //TEST


    private WebDriver webDriver;
    public DitexAdminLoginPage ditexAdminLoginPage;
    private ChromeOptions options = new ChromeOptions();

    //String username = "admin@test.test"; //DEV
    //String password = "test"; //DEV

    //String orderID = "b296d1ff-e69c-49d2-ba7d-e1e4c0576037"; //PROD
    //String orderID = "1d4b4aa0-2590-47f3-8e44-4b7be2c25e61"; //DEV
    String orderID = "cee57840-af4d-42c3-8c6e-8d5035add1c2"; //TEST

    String walletBitcoin = "3BuKVffPztuBfPpddd3W6bqHZmVhvKJwnt";

    String username = "test@admin.com";
    String password = "123456";

    String comissonPercent = "2";

    public void createOrder(String quality, String wallet) {
        DitexMainPage ditexMainPage = ditexAdminLoginPage.openFrontSite();
        Assert.assertTrue(ditexMainPage.ditexMainPageIsLoaded(),"Ditex main page is not loaded.");
        ditexMainPage.login("gdd0070@gmail.com","123456");
        Assert.assertEquals(ditexMainPage.nicknameIsLoaded(),"gdd0070@gmail.com","Login main page is not loaded.");
        ditexMainPage.chooseMyCryptoETHForSell();
        ditexMainPage.chooseMyCryptoBTCForBuy();
        ditexMainPage.mainStep(quality);
        DitexExchangePage ditexExchangePage = ditexMainPage.clickOnExchangeButton();
        Assert.assertTrue(ditexExchangePage.ditexExhangePageIsLoaded(),"Processing page is not loaded.");
        ditexExchangePage.firstStep(wallet);
        Assert.assertTrue(ditexExchangePage.secondStepIsLoaded(),"Second step is not loaded.");
        ditexExchangePage.secondStepIsOver();
        Assert.assertTrue(ditexExchangePage.thirdStepIsLoaded(),"Third step is not loaded.");
        Assert.assertEquals(ditexExchangePage.myCoinsQualityOnThirdStep(),quality,"My coins on third step is not correct.");
        Assert.assertTrue(ditexExchangePage.qrCodeIsLoaded(),"QR code is not loaded.");
        Assert.assertTrue(ditexExchangePage.linkForCopyIsLoaded(),"Link for copy is not loaded.");
        ditexAdminLoginPage.openAdminSite();
    }

    public void openFirstStepAndCheckComissionPercent(String quality) {
        DitexMainPage ditexMainPage = ditexAdminLoginPage.openFrontSite();
        Assert.assertTrue(ditexMainPage.ditexMainPageIsLoaded(),"Ditex main page is not loaded.");
        ditexMainPage.login("gdd0070@gmail.com","123456");
        Assert.assertEquals(ditexMainPage.nicknameIsLoaded(),"gdd0070@gmail.com","Login main page is not loaded.");
        ditexMainPage.chooseMyRUBForSell();
        ditexMainPage.chooseMyUSDForBuy();
        ditexMainPage.mainStep(quality);
        DitexExchangePage ditexExchangePage = ditexMainPage.clickOnExchangeButton();
        Assert.assertTrue(ditexExchangePage.ditexExhangePageIsLoaded(),"Processing page is not loaded.");
        ditexMainPage.clickOnLanguageButton();
        ditexMainPage.clickOnRussianLanguage();
        Assert.assertEquals(ditexMainPage.languageIsSelected(),"ru","Russian language is not selected.");
        Assert.assertEquals(ditexExchangePage.comissionPercentGetTextForFirstStep(),"Комиссия за обмен(" + comissonPercent + " %):","Comission percent is not correct.");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.setProperty("webdriver.chrome.driver","C:\\Windows\\System32\\chromedriver.exe");
        webDriver = new ChromeDriver(options.addArguments("--disable-notifications"));
        ditexAdminLoginPage = new DitexAdminLoginPage(webDriver);
        webDriver.manage().window().maximize();
        webDriver.get(admin + "/login");
    }

    @AfterMethod
    public void afterMethod() {
        webDriver.quit();
    }
}
