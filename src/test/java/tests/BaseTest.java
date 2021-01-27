package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.*;

public class BaseTest {
    private WebDriver webDriver;
    public DitexMainPage ditexMainPage;
    private ChromeOptions options = new ChromeOptions();

    //String front = "https://ditex.app"; //PROD
    //String front = "https://dev.ditex.io"; //DEV
    String front = "https://test.ditex.io"; //TEST

    //String uniqueKey = "B111E89E12C848679FBBB9BF0C55709D"; //PROD
    //String uniqueKey = "003EED0A6FAA42BCAEFF92B6E4734556"; //DEV
    String uniqueKey = "2DAE56A0C9AE4CBE98CE70E537770853"; //TEST


    String username = "gdd0070@gmail.com";
    String usernameWithoutKYC = "testv199514@gmail.com";
    String usernameForUniqueKey = "key.auto@test.com";
    String usernameChange1 = "testChange1@auto.com";
    String usernameChange2 = "testChange2@auto.com";
    String password = "123456";

    /*String walletBitcoin = "3BuKVffPztuBfPpddd3W6bqHZmVhvKJwnt";
    String walletEtherium = "0x709018df04780d4c8df8e056302da93cfc081654";
    String walletUSDT = "0x50abcd5c049f74814f726847965b39bb83d6704a";
    String walletUSDC = "0x50abcd5c049f74814f726847965b39bb83d6704a";
    String walletRUB = "4276380154786375";*/
    String walletEUR = "4627055100023968";
    String walletRUBWithSpace = "4276 3801 5478 6375";

    String walletBitcoin = "3Nof8XF9kd4atsaWGAWE1EZgCc9PKX6HJ7";
    String walletEtherium = "0x709018df04780d4c8df8e056302da93cfc081654";
    String walletUSDT = "0x709018df04780d4c8df8e056302da93cfc081654";
    String walletUSDC = "0x709018df04780d4c8df8e056302da93cfc081654";
    String walletRUB = "5536 9138 1402 4770";

    String BTCQuality = "0.0015";
    String ETHQuality = "0.07";
    String USDTQualityForBTC = "20";
    String USDTQualityForETH = "20";
    String USDTQualityForRUB = "20";
    String USDCQualityForETH = "20";
    String USDCQualityForBTC = "20";
    String USDCQualityForRUB = "20";

    String RUBQuality = "1000";
    String RUBQualityForUSDT = "1400";
    String RUBQualityForBTC = "1500";
    String RUBQualityForETH = "4000";
    String EURQuality = "50";
    String EURQualityBigNumber = "500";

    String BTC = "BTC";
    String ETH = "ETH";
    String RUB = "RUB";
    String USDT = "USDT";
    String EUR = "EUR";
    String USD = "USD";
    String USDC = "USDC";

    String errorMessageEmpty = "Поле не должно быть пустым";
    String errorMessageZero = "Введите число больше нуля";
    String errorMessageIncorrect = "Не корректный адрес кошелька. Пожалуйста введите адрес снова.";
    String errorMessageIncorrectCode = "Неверный код";

    String changePasswordText = "Изменить пароль";
    String incorrectYourCurrentPassword = "Текущий пароль введен неверно";
    String incorrectNewPasswordSmall = "Введено неверное количество символов";
    String changeEmailText = "Изменить e-mail";

    protected void authorization(String username) {
        Assert.assertTrue(ditexMainPage.ditexMainPageIsLoaded(),"Ditex main page is not loaded.");
        ditexMainPage.login(username,password);
        Assert.assertEquals(ditexMainPage.nicknameIsLoaded(),username,"Login main page is not loaded.");
    }

    protected void afterChooseWalletForCryptoAndCheckCryptoNumbers(String quality, String wallet, String currency) {
        ditexMainPage.mainStep(quality);
        DitexExchangePage ditexExchangePage = ditexMainPage.clickOnExchangeButton();
        Assert.assertTrue(ditexExchangePage.ditexExhangePageIsLoaded(),"Processing page is not loaded.");
        ditexExchangePage.firstStep(wallet);
        Assert.assertTrue(ditexExchangePage.secondStepIsLoaded(),"Second step is not loaded.");
        Assert.assertEquals(ditexExchangePage.comissionNumber(),ditexExchangePage.trueComissionNumberForCryptoWithLimiter(),"Comission number is not correct.");
        Assert.assertEquals(ditexExchangePage.youGetNumber(),ditexExchangePage.trueYouGetNumberWithLimiter(),"'You Get' number is not correct.");
        ditexExchangePage.secondStepIsOver();
        Assert.assertTrue(ditexExchangePage.thirdStepIsLoaded(),"Third step is not loaded.");
        Assert.assertEquals(ditexExchangePage.myCoinsQualityOnThirdStep(),quality,"My coins on third step is not correct.");
        Assert.assertTrue(ditexExchangePage.qrCodeIsLoaded(),"QR code is not loaded.");
        Assert.assertTrue(ditexExchangePage.linkForCopyIsLoaded(),"Link for copy is not loaded.");
        String orderID = ditexExchangePage.orderIDGetText();
        DitexMyOrdersPage ditexMyOrdersPage = ditexExchangePage.clickOnGoToOrderList();
        Assert.assertTrue(ditexMyOrdersPage.myOrdersPageIsLoaded(),"My orders page is not loaded.");
        ditexMainPage.clickOnLanguageButton();
        ditexMainPage.clickOnRussianLanguage();
        Assert.assertEquals(ditexMainPage.languageIsSelected(),"ru","Russian language is not selected.");
        Assert.assertEquals(ditexMyOrdersPage.newOrderStatus(),"Ожидание оплаты","Order is not loaded..");
        Assert.assertEquals(ditexMyOrdersPage.newOrderID(),orderID,"Order ID is not correct.");
        Assert.assertEquals(ditexMyOrdersPage.newOrderSumNumber(),quality + " " + currency,"Exchange amount is not correct.");
        Assert.assertEquals(ditexMyOrdersPage.newOrderReceiver(),wallet,"Receiver is not correct.");
    }

    protected void afterChooseWalletForCryptoAndCheckSaveWallet(String quality, String wallet) {
        ditexMainPage.mainStep(quality);
        DitexExchangePage ditexExchangePage = ditexMainPage.clickOnExchangeButton();
        Assert.assertTrue(ditexExchangePage.ditexExhangePageIsLoaded(),"Processing page is not loaded.");
        ditexExchangePage.firstStep(wallet);
        Assert.assertTrue(ditexExchangePage.secondStepIsLoaded(),"Second step is not loaded.");
        ditexExchangePage.secondStepIsOver();
        Assert.assertTrue(ditexExchangePage.thirdStepIsLoaded(),"Third step is not loaded.");
        DitexWalletsPage ditexWalletsPage = ditexMainPage.clickOnWalletsAndCardsButton();
        Assert.assertTrue(ditexWalletsPage.walletsPageIsLoaded(),"'Wallets and Cards' page is not loaded.");
        Assert.assertTrue(ditexWalletsPage.walletItemIsLoaded(),"Wallet item is not loaded.");
    }

    protected void afterChooseWalletForCryptoAndCheckFiatNumbers(String quality, String wallet, String currency) {
        ditexMainPage.mainStep(quality);
        DitexExchangePage ditexExchangePage = ditexMainPage.clickOnExchangeButton();
        Assert.assertTrue(ditexExchangePage.ditexExhangePageIsLoaded(),"Processing page is not loaded.");
        ditexExchangePage.firstStep(wallet);
        Assert.assertTrue(ditexExchangePage.secondStepIsLoaded(),"Second step is not loaded.");
        Assert.assertEquals(ditexExchangePage.comissionNumber(),ditexExchangePage.trueComissionNumberForFiatWithLimiter(),"Comission number is not correct.");
        Assert.assertEquals(ditexExchangePage.youGetNumber(),ditexExchangePage.trueYouGetNumberForFiatWithLimiter(),"'You Get' number is not correct.");
        ditexExchangePage.secondStepIsOver();
        Assert.assertTrue(ditexExchangePage.thirdStepIsLoaded(),"Third step is not loaded.");
        Assert.assertEquals(ditexExchangePage.myCoinsQualityOnThirdStep(),quality,"My coins on third step is not correct.");
        Assert.assertTrue(ditexExchangePage.qrCodeIsLoaded(),"QR code is not loaded.");
        Assert.assertTrue(ditexExchangePage.linkForCopyIsLoaded(),"Link for copy is not loaded.");
        String orderID = ditexExchangePage.orderIDGetText();
        DitexMyOrdersPage ditexMyOrdersPage = ditexExchangePage.clickOnGoToOrderList();
        Assert.assertTrue(ditexMyOrdersPage.myOrdersPageIsLoaded(),"My orders page is not loaded.");
        ditexMainPage.clickOnLanguageButton();
        ditexMainPage.clickOnRussianLanguage();
        Assert.assertEquals(ditexMainPage.languageIsSelected(),"ru","Russian language is not selected.");
        Assert.assertEquals(ditexMyOrdersPage.newOrderStatus(),"Ожидание оплаты","Order is not loaded..");
        Assert.assertEquals(ditexMyOrdersPage.newOrderID(),orderID,"Order ID is not correct.");
        Assert.assertEquals(ditexMyOrdersPage.newOrderSumNumber(),quality + " " + currency,"Exchange amount is not correct.");
        Assert.assertEquals(ditexMyOrdersPage.newOrderReceiver(),wallet,"Receiver is not correct.");
    }

    protected void afterChooseWalletForCryptoWithPAID(String quality, String wallet, String walletForSell, String walletForBuy) {
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
        //String request = ditexExchangePage.sendRequest(quality);
        //Assert.assertNotNull(request,"Answer is 'NULL'.");
        ditexExchangePage.fileWrite(quality,walletForSell,walletForBuy);
    }

    protected void afterChooseWalletForFiatAndCheckCryptoNumbers(String quality, String wallet) {
        ditexMainPage.mainStep(quality);
        DitexExchangePage ditexExchangePage = ditexMainPage.clickOnExchangeButton();
        Assert.assertTrue(ditexExchangePage.ditexExhangePageIsLoaded(),"Processing page is not loaded.");
        ditexExchangePage.firstStep(wallet);
        Assert.assertTrue(ditexExchangePage.secondStepIsLoaded(),"Second step is not loaded.");
        Assert.assertEquals(ditexExchangePage.comissionNumber(),ditexExchangePage.trueComissionNumberForCryptoWithLimiter(),"Comission number is not correct.");
        Assert.assertEquals(ditexExchangePage.youGetNumber(),ditexExchangePage.trueYouGetNumberWithLimiter(),"'You Get' number is not correct.");
        ditexExchangePage.secondStepIsOver();
        Assert.assertTrue(ditexExchangePage.thirdStepIsLoaded(),"Third step is not loaded.");
        Assert.assertTrue(ditexExchangePage.visaLogoIsLoaded(),"Visa Logo is not loaded.");
        Assert.assertTrue(ditexExchangePage.mastercardLogoIsLoaded(),"MasterCard Logo is not loaded.");
        PlatioPage platioPage = ditexExchangePage.clickOnVisaLogo();
        Assert.assertTrue(platioPage.platioPageIsLoaded(),"Platio page is not loaded.");
    }

    protected void afterChooseWalletForFiatAndCheckFiatNumbers(String quality, String wallet) {
        ditexMainPage.mainStep(quality);
        DitexExchangePage ditexExchangePage = ditexMainPage.clickOnExchangeButton();
        Assert.assertTrue(ditexExchangePage.ditexExhangePageIsLoaded(),"Processing page is not loaded.");
        ditexExchangePage.firstStep(wallet);
        Assert.assertTrue(ditexExchangePage.secondStepIsLoaded(),"Second step is not loaded.");
        Assert.assertEquals(ditexExchangePage.comissionNumber(),ditexExchangePage.trueComissionNumberForFiatWithLimiter(),"Comission number is not correct.");
        Assert.assertEquals(ditexExchangePage.youGetNumber(),ditexExchangePage.trueYouGetNumberForFiatWithLimiter(),"'You Get' number is not correct.");
        ditexExchangePage.secondStepIsOver();
        Assert.assertTrue(ditexExchangePage.thirdStepIsLoaded(),"Third step is not loaded.");
        Assert.assertTrue(ditexExchangePage.visaLogoIsLoaded(),"Visa Logo is not loaded.");
        Assert.assertTrue(ditexExchangePage.mastercardLogoIsLoaded(),"MasterCard Logo is not loaded.");
        PlatioPage platioPage = ditexExchangePage.clickOnVisaLogo();
        Assert.assertTrue(platioPage.platioPageIsLoaded(),"Platio page is not loaded.");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.setProperty("webdriver.chrome.driver","C:\\Windows\\System32\\chromedriver.exe");
        webDriver = new ChromeDriver(options.addArguments("--disable-notifications"));
        ditexMainPage = new DitexMainPage(webDriver);
        webDriver.manage().window().maximize();
        webDriver.get(front + "/");
    }

    @AfterMethod
    public void afterMethod() {
        webDriver.quit();
    }
}
