package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class MainTest extends BaseTest {
    /**
     * ТС8
     */
    @Test
    public void clickOnExchangeButtonCorrect() {
        authorization(username);
        ditexMainPage.chooseMyCryptoETHForSell();
        ditexMainPage.chooseMyCryptoBTCForBuy();
        DitexExchangePage ditexExchangePage = ditexMainPage.clickOnExchangeButton();
        Assert.assertTrue(ditexExchangePage.ditexExhangePageIsLoaded(),"Processing page is not loaded.");
    }

    /**
     * ТС8неЗалог
     */
    @Test
    public void clickOnExchangeButtonIncorrect() {
        Assert.assertTrue(ditexMainPage.ditexMainPageIsLoaded(),"Ditex main page is not loaded.");
        ditexMainPage.chooseMyCryptoETHForSell();
        ditexMainPage.chooseMyCryptoBTCForBuy();
        ditexMainPage.clickOnExchangeButton();
        Assert.assertTrue(ditexMainPage.loginWindowIsLoaded(),"Login window is not loaded.");
    }

    /**
     * ТС49
     */
    @Test
    public void clickOnExchangeSwitcher() {
        Assert.assertTrue(ditexMainPage.ditexMainPageIsLoaded(),"Ditex main page is not loaded.");
        ditexMainPage.chooseMyCryptoETHForSell();
        ditexMainPage.chooseMyCryptoBTCForBuy();
        ditexMainPage.clickOnExchangeSwitcher();
        Assert.assertEquals(ditexMainPage.chosenCryptoForSellIsCorrect(),BTC,BTC + " for sell is not choose.");
        Assert.assertEquals(ditexMainPage.chosenCryptoForBuyIsCorrect(),ETH,ETH + " for buy is not choose.");
    }

    /**
     * ТС9BTCForETH
     */
    @Test
    public void checkExchangeWorkingBuyBTCForETH() {
        authorization(username);
        ditexMainPage.chooseMyCryptoBTCForSell();
        ditexMainPage.chooseMyCryptoETHForBuy();
        afterChooseWalletForCryptoAndCheckCryptoNumbers(BTCQuality,walletEtherium,BTC);
    }

    /**
     * ТС9
     */
    @Test
    public void checkExchangeWorkingBuyETHForBTC() {
        authorization(username);
        ditexMainPage.chooseMyCryptoETHForSell();
        ditexMainPage.chooseMyCryptoBTCForBuy();
        afterChooseWalletForCryptoAndCheckCryptoNumbers(ETHQuality,walletBitcoin,ETH);
    }

    @Test
    public void checkExchangeWorkingBuyRUBForBTC() {
        authorization(username);
        ditexMainPage.chooseMyRUBForSell();
        ditexMainPage.chooseMyCryptoBTCForBuy();
        afterChooseWalletForFiatAndCheckCryptoNumbers(RUBQualityForBTC,walletBitcoin);
    }

    /**
     * ТС9ETHForRUB
     */
    /*@Test
    public void checkExchangeWorkingBuyETHForRUB() {
        authorization(username);
        ditexMainPage.chooseMyCryptoETHForSell();
        ditexMainPage.chooseMyCryptoRUBForBuy();
        afterChooseWalletForCryptoAndCheckFiatNumbers(ETHQuality,walletRUB,ETH);
    }*/

    /**
     * ТС9USDTForETH
     */
    @Test
    public void checkExchangeWorkingBuyUSDTForETH() {
        authorization(username);
        ditexMainPage.chooseMyCryptoUSDTForSell();
        ditexMainPage.chooseMyCryptoETHForBuy();
        afterChooseWalletForCryptoAndCheckCryptoNumbers(USDTQualityForBTC,walletEtherium,USDT);
    }

    /**
     * BTC - USDT
     */
    @Test
    public void checkExchangeWorkingBuyBTCForUSDT() {
        authorization(username);
        ditexMainPage.chooseMyCryptoBTCForSell();
        ditexMainPage.chooseMyCryptoUSDTForBuy();
        afterChooseWalletForCryptoAndCheckCryptoNumbers(BTCQuality,walletUSDT,BTC);
    }

    /**
     * ETH - USDT
     */
    @Test
    public void checkExchangeWorkingBuyETHForUSDT() {
        authorization(username);
        ditexMainPage.chooseMyCryptoETHForSell();
        ditexMainPage.chooseMyCryptoUSDTForBuy();
        afterChooseWalletForCryptoAndCheckCryptoNumbers(ETHQuality,walletUSDT,ETH);
    }

    /**
     * USDT - BTC
     */
    @Test
    public void checkExchangeWorkingBuyUSDTForBTC() {
        authorization(username);
        ditexMainPage.chooseMyCryptoUSDTForSell();
        ditexMainPage.chooseMyCryptoBTCForBuy();
        afterChooseWalletForCryptoAndCheckCryptoNumbers(USDTQualityForBTC,walletBitcoin,USDT);
    }

    /**
     * USDT - RUB
     */
    @Test
    public void checkExchangeWorkingBuyUSDTForRUB() {
        authorization(username);
        ditexMainPage.chooseMyCryptoUSDTForSell();
        ditexMainPage.chooseMyCryptoRUBForBuy();
        afterChooseWalletForCryptoAndCheckFiatNumbers(USDTQualityForRUB,walletRUB,USDT);
    }

    /**
     * BTC - RUB
     */
    @Test
    public void checkExchangeWorkingBuyBTCForRUB() {
        authorization(username);
        ditexMainPage.chooseMyCryptoBTCForSell();
        ditexMainPage.chooseMyCryptoRUBForBuy();
        afterChooseWalletForCryptoAndCheckFiatNumbers(BTCQuality,walletRUB,BTC);
    }

    /**
     * ETH - USDC
     */
    @Test
    public void checkExchangeWorkingBuyETHForUSDC() {
        authorization(username);
        ditexMainPage.chooseMyCryptoETHForSell();
        ditexMainPage.chooseMyCryptoUSDCForBuy();
        afterChooseWalletForCryptoAndCheckCryptoNumbers(ETHQuality,walletUSDC,ETH);
    }

    /**
     * USDC - ETH
     */
    @Test
    public void checkExchangeWorkingBuyUSDCForETH() {
        authorization(username);
        ditexMainPage.chooseMyCryptoUSDCForSell();
        ditexMainPage.chooseMyCryptoETHForBuy();
        afterChooseWalletForCryptoAndCheckCryptoNumbers(USDCQualityForETH,walletEtherium,USDC);
    }

    /**
     * USDC - BTC
     */
    @Test
    public void checkExchangeWorkingBuyUSDCForBTC() {
        authorization(username);
        ditexMainPage.chooseMyCryptoUSDCForSell();
        ditexMainPage.chooseMyCryptoBTCForBuy();
        afterChooseWalletForCryptoAndCheckCryptoNumbers(USDCQualityForBTC,walletBitcoin,USDC);
    }

    /**
     * BTC - USDC
     */
    @Test
    public void checkExchangeWorkingBuyBTCForUSDC() {
        authorization(username);
        ditexMainPage.chooseMyCryptoBTCForSell();
        ditexMainPage.chooseMyCryptoUSDCForBuy();
        afterChooseWalletForCryptoAndCheckCryptoNumbers(BTCQuality,walletUSDC,BTC);
    }

    /**
     * USDC - RUB
     */
    @Test
    public void checkExchangeWorkingBuyUSDCForRUB() {
        authorization(username);
        ditexMainPage.chooseMyCryptoUSDCForSell();
        ditexMainPage.chooseMyCryptoRUBForBuy();
        afterChooseWalletForCryptoAndCheckFiatNumbers(USDCQualityForRUB,walletRUB,USDC);
    }

    /**
     * ETH - USD
     */
    /*@Test
    public void checkExchangeWorkingBuyETHForUSD() {
        authorization(username);
        ditexMainPage.chooseMyCryptoETHForSell();
        ditexMainPage.chooseMyUSDForBuy();
        afterChooseWalletForCryptoAndCheckFiatNumbers(ETHQuality,"",ETH);
    }*/

    /**
     * BTC - USD
     */
    /*@Test
    public void checkExchangeWorkingBuyBTCForUSD() {
        authorization(username);
        ditexMainPage.chooseMyCryptoBTCForSell();
        ditexMainPage.chooseMyUSDForBuy();
        afterChooseWalletForCryptoAndCheckFiatNumbers(BTCQuality,"",BTC);
    }*/

    /**
     * ETH - EUR
     */
    /*@Test
    public void checkExchangeWorkingBuyETHForEUR() {
        authorization(username);
        ditexMainPage.chooseMyCryptoETHForSell();
        ditexMainPage.chooseMyEURForBuy();
        afterChooseWalletForCryptoAndCheckFiatNumbers(ETHQuality,walletEUR,ETH);
    }*/

    /**
     * BTC - EUR
     */
    /*@Test
    public void checkExchangeWorkingBuyBTCForEUR() {
        authorization(username);
        ditexMainPage.chooseMyCryptoBTCForSell();
        ditexMainPage.chooseMyEURForBuy();
        afterChooseWalletForCryptoAndCheckFiatNumbers(BTCQuality,walletEUR,BTC);
    }*/

    /**
     * BTC - JPY
     */
    /*@Test
    public void checkExchangeWorkingBuyBTCForJPY() {
        authorization(username);
        ditexMainPage.chooseMyCryptoBTCForSell();
        ditexMainPage.chooseMyJPYForBuy();
        afterChooseWalletForCryptoAndCheckFiatNumbers(BTCQuality,"",BTC);
    }*/

    /**
     * ETH - JPY
     */
    /*@Test
    public void checkExchangeWorkingBuyETHForJPY() {
        authorization(username);
        ditexMainPage.chooseMyCryptoBTCForSell();
        ditexMainPage.chooseMyJPYForBuy();
        afterChooseWalletForCryptoAndCheckFiatNumbers(ETHQuality,"",ETH);
    }*/

    /**
     * EUR - USDC
     */
    @Test
    public void checkExchangeWorkingBuyEURForUSDC() {
        authorization(username);
        ditexMainPage.chooseMyEURForSell();
        ditexMainPage.chooseMyCryptoUSDCForBuy();
        afterChooseWalletForFiatAndCheckCryptoNumbers(EURQuality,walletUSDC);
    }

    /**
     * EUR - USDT
     */
    @Test
    public void checkExchangeWorkingBuyEURForUSDT() {
        authorization(username);
        ditexMainPage.chooseMyEURForSell();
        ditexMainPage.chooseMyCryptoUSDTForBuy();
        afterChooseWalletForFiatAndCheckCryptoNumbers(EURQuality,walletUSDT);
    }

    /**
     * EUR - ETH
     */
    @Test
    public void checkExchangeWorkingBuyEURForETH() {
        authorization(username);
        ditexMainPage.chooseMyEURForSell();
        ditexMainPage.chooseMyCryptoETHForBuy();
        afterChooseWalletForFiatAndCheckCryptoNumbers(EURQuality,walletEtherium);
    }

    /**
     * EUR - BTC
     */
    @Test
    public void checkExchangeWorkingBuyEURForBTC() {
        authorization(username);
        ditexMainPage.chooseMyEURForSell();
        ditexMainPage.chooseMyCryptoBTCForBuy();
        afterChooseWalletForFiatAndCheckCryptoNumbers(EURQuality,walletBitcoin);
    }

    /**
     * RUB - ETH
     */
    /*@Test
    public void checkExchangeWorkingBuyRUBForETH() {
        authorization(username);
        ditexMainPage.chooseMyRUBForSell();
        ditexMainPage.chooseMyCryptoETHForBuy();
        afterChooseWalletForFiatAndCheckCryptoNumbers(RUBQuality,walletEtherium);
    }*/

    /**
     * USD - ETH
     */
    /*@Test
    public void checkExchangeWorkingBuyUSDForETH() {
        authorization(username);
        ditexMainPage.chooseMyUSDForSell();
        ditexMainPage.chooseMyCryptoETHForBuy();
        afterChooseWalletForFiatAndCheckCryptoNumbers("",walletEtherium);
    }*/

    /**
     * USD - BTC
     */
    /*@Test
    public void checkExchangeWorkingBuyUSDForBTC() {
        authorization(username);
        ditexMainPage.chooseMyUSDForSell();
        ditexMainPage.chooseMyCryptoBTCForBuy();
        afterChooseWalletForFiatAndCheckCryptoNumbers("",walletBitcoin);
    }*/

    /**
     * RUB - USDC
     */
    @Test
    public void checkExchangeWorkingBuyRUBForUSDC() {
        authorization(username);
        ditexMainPage.chooseMyRUBForSell();
        ditexMainPage.chooseMyCryptoUSDCForBuy();
        afterChooseWalletForFiatAndCheckCryptoNumbers(RUBQuality,walletUSDC);
    }

    /**
     * RUB - USDT
     */
    @Test
    public void checkExchangeWorkingBuyRUBForUSDT() {
        authorization(username);
        ditexMainPage.chooseMyRUBForSell();
        ditexMainPage.chooseMyCryptoUSDTForBuy();
        afterChooseWalletForFiatAndCheckCryptoNumbers(RUBQualityForUSDT,walletUSDT);
    }

    /**
     * JPY - ETH
     */
    /*@Test
    public void checkExchangeWorkingBuyJPYForETH() {
        authorization(username);
        ditexMainPage.chooseMyJPYForSell();
        ditexMainPage.chooseMyCryptoETHForBuy();
        afterChooseWalletForFiatAndCheckCryptoNumbers("",walletEtherium);
    }*/

    /**
     * JPY - BTC
     */
    /*@Test
    public void checkExchangeWorkingBuyJPYForBTC() {
        authorization(username);
        ditexMainPage.chooseMyJPYForSell();
        ditexMainPage.chooseMyCryptoBTCForBuy();
        afterChooseWalletForFiatAndCheckCryptoNumbers("",walletBitcoin);
    }*/

    @Test
    public void checkNewOrderDetailsForCrypto() {
        authorization(username);
        ditexMainPage.chooseMyCryptoETHForSell();
        ditexMainPage.chooseMyCryptoBTCForBuy();
        ditexMainPage.mainStep(ETHQuality);
        DitexExchangePage ditexExchangePage = ditexMainPage.clickOnExchangeButton();
        Assert.assertTrue(ditexExchangePage.ditexExhangePageIsLoaded(),"Processing page is not loaded.");
        ditexExchangePage.firstStep(walletBitcoin);
        Assert.assertTrue(ditexExchangePage.secondStepIsLoaded(),"Second step is not loaded.");
        ditexExchangePage.secondStepIsOver();
        Assert.assertTrue(ditexExchangePage.thirdStepIsLoaded(),"Third step is not loaded.");
        Assert.assertEquals(ditexExchangePage.myCoinsQualityOnThirdStep(),ETHQuality,"My coins on third step is not correct.");
        Assert.assertTrue(ditexExchangePage.qrCodeIsLoaded(),"QR code is not loaded.");
        Assert.assertTrue(ditexExchangePage.linkForCopyIsLoaded(),"Link for copy is not loaded.");
        String orderID = ditexExchangePage.orderIDGetText();
        String depositWallet = ditexExchangePage.linkForCopyGetText();
        DitexMyOrdersPage ditexMyOrdersPage = ditexExchangePage.clickOnGoToOrderList();
        Assert.assertTrue(ditexMyOrdersPage.myOrdersPageIsLoaded(),"My orders page is not loaded.");
        ditexMainPage.clickOnLanguageButton();
        ditexMainPage.clickOnRussianLanguage();
        Assert.assertEquals(ditexMainPage.languageIsSelected(),"ru","Russian language is not selected.");
        Assert.assertEquals(ditexMyOrdersPage.newOrderStatus(),"Ожидание оплаты","Order is not loaded.");
        Assert.assertEquals(ditexMyOrdersPage.newOrderID(),orderID,"Order ID is not correct.");
        Assert.assertEquals(ditexMyOrdersPage.newOrderSumNumber(),ETHQuality + " " + ETH,"Exchange amount is not correct.");
        Assert.assertEquals(ditexMyOrdersPage.newOrderReceiver(),walletBitcoin,"Receiver is not correct.");
        ditexMyOrdersPage.clickOnNewOrderDetailsButton();
        Assert.assertTrue(ditexMyOrdersPage.orderDetailsPageIsLoaded(),"Order details is not loaded.");
        Assert.assertEquals(ditexMyOrdersPage.orderIDDetails(),orderID,"Order id is not correct.");
        Assert.assertEquals(ditexMyOrdersPage.sumDetails(),ETHQuality + " " + ETH,"Exchange amount in details is not correct.");
        Assert.assertEquals(ditexMyOrdersPage.receiverDetails(),walletBitcoin,"Receiver details is not correct.");
        Assert.assertEquals(ditexMyOrdersPage.depositWalletDetails(),depositWallet,"Deposit wallet is not correct.");
        Assert.assertTrue(ditexMyOrdersPage.infoForPayIsLoaded(),"Info for pay is not loaded.");
        ditexMyOrdersPage.clickOnRepeatOrderDetailsButton();
        Assert.assertTrue(ditexExchangePage.ditexSecondStepExchangeIsLoaded(),"Ditex second step is not loaded.");
    }

    @Test
    public void checkNewOrderDetailsForFiat() {
        authorization(username);
        ditexMainPage.chooseMyRUBForSell();
        ditexMainPage.chooseMyCryptoUSDTForBuy();
        ditexMainPage.mainStep(RUBQualityForUSDT);
        DitexExchangePage ditexExchangePage = ditexMainPage.clickOnExchangeButton();
        Assert.assertTrue(ditexExchangePage.ditexExhangePageIsLoaded(),"Processing page is not loaded.");
        ditexExchangePage.firstStep(walletUSDT);
        Assert.assertTrue(ditexExchangePage.secondStepIsLoaded(),"Second step is not loaded.");
        ditexExchangePage.secondStepIsOver();
        Assert.assertTrue(ditexExchangePage.thirdStepIsLoaded(),"Third step is not loaded.");
        Assert.assertTrue(ditexExchangePage.visaLogoIsLoaded(),"Visa Logo is not loaded.");
        Assert.assertTrue(ditexExchangePage.mastercardLogoIsLoaded(),"MasterCard Logo is not loaded.");
        String orderID = ditexExchangePage.orderIDGetText();
        DitexMyOrdersPage ditexMyOrdersPage = ditexMainPage.clickOnMyOrdersButton();
        Assert.assertTrue(ditexMyOrdersPage.myOrdersPageIsLoaded(),"My orders page is not loaded.");
        ditexMainPage.clickOnLanguageButton();
        ditexMainPage.clickOnRussianLanguage();
        Assert.assertEquals(ditexMainPage.languageIsSelected(),"ru","Russian language is not selected.");
        Assert.assertEquals(ditexMyOrdersPage.newOrderStatus(),"Новая","Order is not loaded.");
        Assert.assertEquals(ditexMyOrdersPage.newOrderID(),orderID,"Order ID is not correct.");
        Assert.assertEquals(ditexMyOrdersPage.newOrderSumNumber(),RUBQualityForUSDT + " " + RUB,"Exchange amount is not correct.");
        Assert.assertEquals(ditexMyOrdersPage.newOrderReceiver(),walletUSDT,"Receiver is not correct.");
        ditexMyOrdersPage.clickOnNewOrderDetailsButton();
        Assert.assertTrue(ditexMyOrdersPage.orderDetailsPageIsLoaded(),"Order details is not loaded.");
        Assert.assertEquals(ditexMyOrdersPage.orderIDDetails(),orderID,"Order id is not correct.");
        Assert.assertEquals(ditexMyOrdersPage.sumDetails(),RUBQualityForUSDT + " " + RUB,"Exchange amount in details is not correct.");
        Assert.assertEquals(ditexMyOrdersPage.receiverDetails(),walletUSDT,"Receiver details is not correct.");
        Assert.assertTrue(ditexMyOrdersPage.infoForPayIsLoaded(),"Info for pay is not loaded.");
        ditexMyOrdersPage.clickOnRepeatOrderDetailsButton();
        Assert.assertTrue(ditexExchangePage.ditexSecondStepExchangeIsLoaded(),"Ditex second step is not loaded.");
    }

    /**
     * BTC - RUB
     */
    @Test
    public void checkSelectWalletFieldWithSpace() {
        authorization(username);
        ditexMainPage.chooseMyCryptoBTCForSell();
        ditexMainPage.chooseMyCryptoRUBForBuy();
        ditexMainPage.mainStep(BTCQuality);
        DitexExchangePage ditexExchangePage = ditexMainPage.clickOnExchangeButton();
        Assert.assertTrue(ditexExchangePage.ditexExhangePageIsLoaded(),"Processing page is not loaded.");
        ditexExchangePage.firstStep(walletRUBWithSpace);
        Assert.assertTrue(ditexExchangePage.secondStepIsLoaded(),"Second step is not loaded.");
    }

    @Test
    public void clickOnCreateNewOrderButton() {
        authorization(username);
        DitexMyOrdersPage ditexMyOrdersPage = ditexMainPage.clickOnMyOrdersButton();
        Assert.assertTrue(ditexMyOrdersPage.myOrdersPageIsLoaded(),"Order history is not loaded.");
        DitexExchangePage ditexExchangePage = ditexMyOrdersPage.clickOnCreateNewOrderButton();
        Assert.assertTrue(ditexExchangePage.ditexExhangePageIsLoaded(),"Ditex exchange page is not loaded.");
    }

    @Test
    public void clickOnRepeatOrder() {
        authorization(username);
        DitexMyOrdersPage ditexMyOrdersPage = ditexMainPage.clickOnMyOrdersButton();
        Assert.assertTrue(ditexMyOrdersPage.myOrdersPageIsLoaded(),"Order history is not loaded.");
        DitexExchangePage ditexExchangePage = ditexMyOrdersPage.clickOnNewOrderRepeatOrderButton();
        Assert.assertTrue(ditexExchangePage.ditexSecondStepExchangeIsLoaded(),"Ditex second step exchange page is not loaded.");
    }

    /**
     * ТС12
     */
    /*@Test
    public void checkExchangeEmptyWalletField() {
        authorization(usernameWithoutKYC);
        ditexMainPage.chooseMyCryptoETHForSell();
        ditexMainPage.chooseMyCryptoBTCForBuy();
        DitexExchangePage ditexExchangePage = ditexMainPage.clickOnExchangeButton();
        Assert.assertTrue(ditexExchangePage.ditexExhangePageIsLoaded(),"Exchange page is not loaded.");
        ditexExchangePage.firstStepWithoutClickContinueButton("");
        Assert.assertEquals(ditexExchangePage.errorMessageWalletFieldIsLoaded(),errorMessageEmpty,"Error message is not correct.");
    }*/

    /**
     * ТС13
     */
    @Test
    public void checkExchangeIncorrectWalletField() {
        authorization(username);
        ditexMainPage.chooseMyCryptoETHForSell();
        ditexMainPage.chooseMyCryptoBTCForBuy();
        DitexExchangePage ditexExchangePage = ditexMainPage.clickOnExchangeButton();
        Assert.assertTrue(ditexExchangePage.ditexExhangePageIsLoaded(),"Exchange page is not loaded.");
        ditexExchangePage.firstStep("fdadsfdsfasdf");
        Assert.assertEquals(ditexExchangePage.errorMessageWrongFormatFieldIsLoaded(),errorMessageIncorrect,"Error message is not correct.");
    }

    /**
     * ТС10
     */
    @Test
    public void checkExchangeEmptyCoinsField() {
        authorization(username);
        ditexMainPage.chooseMyCryptoETHForSell();
        ditexMainPage.chooseMyCryptoBTCForBuy();
        DitexExchangePage ditexExchangePage = ditexMainPage.clickOnExchangeButton();
        Assert.assertTrue(ditexExchangePage.ditexExhangePageIsLoaded(),"Exchange page is not loaded.");
        ditexExchangePage.firstStepWithoutClickContinueButton("",walletBitcoin);
        Assert.assertEquals(ditexExchangePage.errorMessageWalletFieldIsLoaded(),errorMessageEmpty,"Error message is not correct.");
    }

    /**
     * ТС11
     */
    @Test
    public void checkExchangeZeroCoinsField() {
        authorization(username);
        ditexMainPage.chooseMyCryptoETHForSell();
        ditexMainPage.chooseMyCryptoBTCForBuy();
        DitexExchangePage ditexExchangePage = ditexMainPage.clickOnExchangeButton();
        Assert.assertTrue(ditexExchangePage.ditexExhangePageIsLoaded(),"Exchange page is not loaded.");
        ditexExchangePage.firstStepWithoutClickContinueButton("0",walletBitcoin);
        Assert.assertEquals(ditexExchangePage.errorMessageNumberFieldIsLoaded(),errorMessageZero,"Error message is not correct.");
    }

    /**
     * ТС35
     */
    @Test
    public void clickOnAboutUsButton() {
        DitexAboutUsPage ditexAboutUsPage = ditexMainPage.clickOnAboutUsButton();
        Assert.assertTrue(ditexAboutUsPage.aboutUsPageIsLoaded(),"'About Us' page is not loaded.");
    }

    /**
     * ТС31
     */
    @Test
    public void clickOnHowItWorksButton() {
        DitexHowItWorksPage ditexHowItWorksPage = ditexMainPage.clickOnHowItWorksButton();
        Assert.assertTrue(ditexHowItWorksPage.howItWorksPageIsLoaded(),"'How it works' page is not loaded.");
    }

    /**
     * ТС29
     */
    @Test
    public void clickOnPrivacyPolicyButton() {
        DitexPrivacyPolicyPage ditexPrivacyPolicyPage = ditexMainPage.clickOnPrivacyPolicyButton();
        Assert.assertTrue(ditexPrivacyPolicyPage.privacyPolicyPageIsLoaded(),"'Privacy policy' page is not loaded.");
    }

    /**
     * ТС34
     */
    @Test
    public void clickOnTermsOfUseButton() {
        DitexTermsOfUsePage ditexTermsOfUsePage = ditexMainPage.clickOnTermsOfUseButton();
        Assert.assertTrue(ditexTermsOfUsePage.termsOfUsePageIsLoaded(),"'Terms of Use' page is not loaded.");
    }

    /**
     * ТС32
     */
    @Test
    public void clickOnFAQButton() {
        DitexFAQPage ditexFAQPage = ditexMainPage.clickOnFAQButton();
        Assert.assertTrue(ditexFAQPage.fAQPageIsLoaded(),"'FAQ' page is not loaded.");
    }

    @Test
    public void clickOnOTCTradingButton() {
        authorization(username);
        DitexOTCTradingPage ditexOTCTradingPage = ditexMainPage.clickOnOTCTradingButton();
        Assert.assertTrue(ditexOTCTradingPage.otcTradingPageIsLoaded(),"'OTC Trading' page is not loaded.");
    }

    @Test
    public void openOTCTradingWithoutLogin() {
        DitexOTCTradingPage ditexOTCTradingPage = ditexMainPage.clickOnOTCTradingButton();
        ditexMainPage.loginWithoutClickOnLoginButton(username,password);
        Assert.assertTrue(ditexOTCTradingPage.otcTradingPageIsLoaded(),"'OTC Trading' page is not loaded.");
    }

    @Test
    public void checkOTCTrading() {
        authorization(username);
        DitexOTCTradingPage ditexOTCTradingPage = ditexMainPage.clickOnOTCTradingButton();
        Assert.assertTrue(ditexOTCTradingPage.otcTradingPageIsLoaded(),"'OTC Trading' page is not loaded.");
        ditexOTCTradingPage.yourDataForConnection("Auto Auto","380555555555","gdd0070@gmail.com","1.123456789");
        Assert.assertTrue(ditexOTCTradingPage.windowIsLoaded(),"Window about order create is not loaded.");
    }

    @Test
    public void checkIncorrectOTCTradingInNameFieldWithSpace() {
        authorization(username);
        DitexOTCTradingPage ditexOTCTradingPage = ditexMainPage.clickOnOTCTradingButton();
        Assert.assertTrue(ditexOTCTradingPage.otcTradingPageIsLoaded(),"'OTC Trading' page is not loaded.");
        ditexOTCTradingPage.yourDataForConnection("Авто Авто","380555555555","gdd0070@gmail.com","1");
        Assert.assertTrue(ditexOTCTradingPage.errorTextIsLoaded(),"Error text is not loaded.");
    }

    @Test
    public void checkIncorrectOTCTradingInNameFieldWithDot() {
        authorization(username);
        DitexOTCTradingPage ditexOTCTradingPage = ditexMainPage.clickOnOTCTradingButton();
        Assert.assertTrue(ditexOTCTradingPage.otcTradingPageIsLoaded(),"'OTC Trading' page is not loaded.");
        ditexOTCTradingPage.yourDataForConnection("Auto A. Auto","380555555555","gdd0070@gmail.com","1");
        Assert.assertTrue(ditexOTCTradingPage.errorTextIsLoaded(),"Error text is not loaded.");
    }

    @Test
    public void checkIncorrectOTCTradingInPhoneField() {
        authorization(username);
        DitexOTCTradingPage ditexOTCTradingPage = ditexMainPage.clickOnOTCTradingButton();
        Assert.assertTrue(ditexOTCTradingPage.otcTradingPageIsLoaded(),"'OTC Trading' page is not loaded.");
        ditexOTCTradingPage.yourDataForConnectionWithoutPLUSInPhoneField("Auto A. Auto","380555555555","gdd0070@gmail.com","1");
        Assert.assertTrue(ditexOTCTradingPage.errorTextIsLoaded(),"Error text is not loaded.");
    }

    @Test
    public void checkIncorrectOTCTradingInPhoneFieldWithWords() {
        authorization(username);
        DitexOTCTradingPage ditexOTCTradingPage = ditexMainPage.clickOnOTCTradingButton();
        Assert.assertTrue(ditexOTCTradingPage.otcTradingPageIsLoaded(),"'OTC Trading' page is not loaded.");
        ditexOTCTradingPage.yourDataForConnection("Auto A. Auto","3qwertyuiopa","gdd0070@gmail.com","1");
        Assert.assertTrue(ditexOTCTradingPage.errorTextIsLoaded(),"Error text is not loaded.");
    }

    @Test
    public void checkIncorrectOTCTradingInEmailField() {
        authorization(username);
        DitexOTCTradingPage ditexOTCTradingPage = ditexMainPage.clickOnOTCTradingButton();
        Assert.assertTrue(ditexOTCTradingPage.otcTradingPageIsLoaded(),"'OTC Trading' page is not loaded.");
        ditexOTCTradingPage.yourDataForConnection("Auto A. Auto","380555555555","afdfdsfdsfsdfsdfsd","1");
        Assert.assertTrue(ditexOTCTradingPage.errorTextIsLoaded(),"Error text is not loaded.");
    }

    @Test
    public void checkIncorrectOTCTradingInSumField() {
        authorization(username);
        DitexOTCTradingPage ditexOTCTradingPage = ditexMainPage.clickOnOTCTradingButton();
        Assert.assertTrue(ditexOTCTradingPage.otcTradingPageIsLoaded(),"'OTC Trading' page is not loaded.");
        ditexOTCTradingPage.yourDataForConnection("Auto A. Auto","380555555555","afdfdsfdsfsdfsdfsd","");
        Assert.assertTrue(ditexOTCTradingPage.errorTextIsLoaded(),"Error text is not loaded.");
    }

    /**
     * ТС30
     */
    @Test
    public void clickOnContactsButton() {
        DitexContactsPage ditexContactsPage = ditexMainPage.clickOnContactsButton();
        Assert.assertTrue(ditexContactsPage.contactsPageIsLoaded(),"'Contacts' page is not loaded.");
    }

    /**
     * ТС16
     */
    /*@Test
    public void clickOnMyOrdersButton() {
        Assert.assertTrue(ditexMainPage.ditexMainPageIsLoaded(),"Ditex main page is not loaded.");
        ditexMainPage.login(username,password);
        Assert.assertEquals(ditexMainPage.nicknameIsLoaded(),username,"Login main page is not loaded.");
        ditexMainPage.clickOnNickname();
        DitexSettingsPage ditexSettingsPage = ditexMainPage.clickOnMyOrdersButton();
        Assert.assertTrue(ditexSettingsPage.profilePageIsLoaded(),"'Profile' page is not loaded.");
    }*/

    /**
     *
     */
    @Test
    public void clickOnNicknameButton() {
        Assert.assertTrue(ditexMainPage.ditexMainPageIsLoaded(),"Ditex main page is not loaded.");
        ditexMainPage.login(username,password);
        Assert.assertEquals(ditexMainPage.nicknameIsLoaded(),username,"Login main page is not loaded.");
        DitexProfilePage ditexProfilePage = ditexMainPage.clickOnNickname();
        Assert.assertTrue(ditexProfilePage.profilePageIsLoaded(),"'Profile' page is not loaded.");
        Assert.assertTrue(ditexProfilePage.changeEmailIsLoaded(),"'Change email' button is not loaded.");
        Assert.assertTrue(ditexProfilePage.changePasswordIsLoaded(),"'Change password' button is not loaded.");
        Assert.assertTrue(ditexProfilePage.qrCodeIsLoaded(),"'QR code' is not loaded.");
        Assert.assertTrue(ditexProfilePage.keyTextIsLoaded(),"'Key' is not loaded.");
        Assert.assertTrue(ditexProfilePage.copyKeyButtonIsLoaded(),"'Copy' button is not loaded.");
        Assert.assertTrue(ditexProfilePage.resetKeyButtonIsLoaded(),"'Reset' button is not loaded.");
    }

    @Test
    public void clickOnChangeEmailButton() {
        Assert.assertTrue(ditexMainPage.ditexMainPageIsLoaded(),"Ditex main page is not loaded.");
        ditexMainPage.login(username,password);
        Assert.assertEquals(ditexMainPage.nicknameIsLoaded(),username,"Login main page is not loaded.");
        DitexProfilePage ditexProfilePage = ditexMainPage.clickOnNickname();
        Assert.assertTrue(ditexProfilePage.profilePageIsLoaded(),"'Profile' page is not loaded.");
        ditexProfilePage.clickOnChangeEmailButton();
        Assert.assertTrue(ditexProfilePage.changeEmailWindowIsLoaded(),"'Change email' window is not loaded.");
    }

    @Test
    public void changeEmail() {
        Assert.assertTrue(ditexMainPage.ditexMainPageIsLoaded(),"Ditex main page is not loaded.");
        ditexMainPage.login(usernameChange1,password);
        Assert.assertEquals(ditexMainPage.nicknameIsLoaded(),usernameChange1,"Login main page is not loaded.");
        DitexProfilePage ditexProfilePage = ditexMainPage.clickOnNickname();
        Assert.assertTrue(ditexProfilePage.profilePageIsLoaded(),"'Profile' page is not loaded.");
        ditexProfilePage.clickOnChangeEmailButton();
        Assert.assertTrue(ditexProfilePage.changeEmailWindowIsLoaded(),"'Change email' window is not loaded.");
        ditexProfilePage.chooseNewEmail(usernameChange2);
        Assert.assertTrue(ditexProfilePage.windowIsLoaded(),"Confirm change email window is not loaded.");
        ditexProfilePage.clickOnOkButton();
        Assert.assertTrue(ditexMainPage.ditexMainPageIsLoaded(),"Ditex main page is not loaded.");
        Assert.assertTrue(ditexMainPage.windowIsLoaded(),"'Session expired' window is not loaded.");
        ditexMainPage.clickOnOkButton();
        ditexMainPage.login(usernameChange1,password);
        Assert.assertEquals(ditexMainPage.nicknameIsLoaded(),usernameChange2,"Login main page is not loaded.");
    }

    @Test
    public void changePassword() {
        Assert.assertTrue(ditexMainPage.ditexMainPageIsLoaded(),"Ditex main page is not loaded.");
        ditexMainPage.clickOnLoginButton();
        ditexMainPage.clickOnForgotPasswordButton();
        Assert.assertTrue(ditexMainPage.emailButtonIsLoaded(),"Ditex email button is not loaded.");
        Assert.assertTrue(ditexMainPage.keyButtonIsLoaded(),"Ditex key button is not loaded.");
        ditexMainPage.clickOnKeyButton();
        ditexMainPage.restorePasswordWithKey(uniqueKey);
        Assert.assertTrue(ditexMainPage.newPasswordIsLoaded(),"New Password is not loaded.");
        String newPassword = ditexMainPage.newPasswordGetText();
        ditexMainPage.clickOnLoginButtonForRestorePassword();
        ditexMainPage.loginForRestorePassword(usernameForUniqueKey,newPassword);
        Assert.assertEquals(ditexMainPage.nicknameIsLoaded(),usernameForUniqueKey,"Login main page is not loaded.");
        DitexProfilePage ditexProfilePage = ditexMainPage.clickOnNickname();
        Assert.assertTrue(ditexProfilePage.profilePageIsLoaded(),"'Profile' page is not loaded.");
        ditexProfilePage.clickOnChangePasswordButton();
        Assert.assertTrue(ditexProfilePage.changePasswordWindowIsLoaded(),"'Change password' window is not loaded.");
        ditexProfilePage.changePassword(newPassword,password);
        ditexProfilePage.clickOnOkButton();
        ditexProfilePage.clickOnLogOutButton();
        Assert.assertTrue(ditexMainPage.logOutWindowIsLoaded(),"'Log Out' window is not loaded.");
        ditexMainPage.clickOnOkButton();
        Assert.assertTrue(ditexMainPage.ditexMainPageIsLoaded(),"Ditex main page is not loaded.");
        ditexMainPage.login(usernameForUniqueKey,password);
        Assert.assertEquals(ditexMainPage.nicknameIsLoaded(),usernameForUniqueKey,"Login main page is not loaded.");
    }

    @Test
    public void checkWalletSaverInFirstStep() {
        authorization(usernameWithoutKYC);
        ditexMainPage.chooseMyCryptoETHForSell();
        ditexMainPage.chooseMyCryptoBTCForBuy();
        afterChooseWalletForCryptoAndCheckSaveWallet(ETHQuality,walletBitcoin);
    }

    @Test
    public void clickOnChangePasswordButton() {
        Assert.assertTrue(ditexMainPage.ditexMainPageIsLoaded(),"Ditex main page is not loaded.");
        ditexMainPage.login(username,password);
        Assert.assertEquals(ditexMainPage.nicknameIsLoaded(),username,"Login main page is not loaded.");
        DitexProfilePage ditexProfilePage = ditexMainPage.clickOnNickname();
        Assert.assertTrue(ditexProfilePage.profilePageIsLoaded(),"'Profile' page is not loaded.");
        ditexProfilePage.clickOnChangePasswordButton();
        Assert.assertTrue(ditexProfilePage.changePasswordWindowIsLoaded(),"'Change password' window is not loaded.");
    }

    @Test
    public void clickOnTwoFATab() {
        Assert.assertTrue(ditexMainPage.ditexMainPageIsLoaded(),"Ditex main page is not loaded.");
        ditexMainPage.login(username,password);
        Assert.assertEquals(ditexMainPage.nicknameIsLoaded(),username,"Login main page is not loaded.");
        DitexProfilePage ditexProfilePage = ditexMainPage.clickOnNickname();
        Assert.assertTrue(ditexProfilePage.profilePageIsLoaded(),"'Profile' page is not loaded.");
        DitexTwoFAPage ditexTwoFAPage = ditexProfilePage.clickOnTwoFATab();
        Assert.assertTrue(ditexTwoFAPage.twoFAPageIsLoaded(),"'2 step verification' page is not loaded.");
        Assert.assertTrue(ditexTwoFAPage.googlePlayButtonIsLoaded(),"'Google play' button is not loaded.");
        Assert.assertTrue(ditexTwoFAPage.appStoreButtonIsLoaded(),"'App store' button is not loaded.");
    }

    @Test
    public void clickOnTwoFASwitcher() {
        Assert.assertTrue(ditexMainPage.ditexMainPageIsLoaded(),"Ditex main page is not loaded.");
        ditexMainPage.login(username,password);
        Assert.assertEquals(ditexMainPage.nicknameIsLoaded(),username,"Login main page is not loaded.");
        DitexProfilePage ditexProfilePage = ditexMainPage.clickOnNickname();
        Assert.assertTrue(ditexProfilePage.profilePageIsLoaded(),"'Profile' page is not loaded.");
        DitexTwoFAPage ditexTwoFAPage = ditexProfilePage.clickOnTwoFATab();
        Assert.assertTrue(ditexTwoFAPage.twoFAPageIsLoaded(),"'2 step verification' page is not loaded.");
        ditexTwoFAPage.clickOnTwoFASwitcher();
        Assert.assertTrue(ditexTwoFAPage.twoFAWindowIsLoaded(),"'Two-factor authentication settings' window is not loaded.");
    }

    @Test
    public void confirmEnabledTwoFA() {
        Assert.assertTrue(ditexMainPage.ditexMainPageIsLoaded(),"Ditex main page is not loaded.");
        ditexMainPage.login(username,password);
        Assert.assertEquals(ditexMainPage.nicknameIsLoaded(),username,"Login main page is not loaded.");
        DitexProfilePage ditexProfilePage = ditexMainPage.clickOnNickname();
        Assert.assertTrue(ditexProfilePage.profilePageIsLoaded(),"'Profile' page is not loaded.");
        DitexTwoFAPage ditexTwoFAPage = ditexProfilePage.clickOnTwoFATab();
        Assert.assertTrue(ditexTwoFAPage.twoFAPageIsLoaded(),"'2 step verification' page is not loaded.");
        ditexTwoFAPage.clickOnTwoFASwitcher();
        Assert.assertTrue(ditexTwoFAPage.twoFAWindowIsLoaded());
        ditexTwoFAPage.clickOnOkButton();
        Assert.assertTrue(ditexTwoFAPage.qrCodeIsLoaded(),"'QR-code' is not loaded.");
        Assert.assertTrue(ditexTwoFAPage.enterCodeFieldIsLoaded(),"'Enter code' field is not loaded.");
        Assert.assertTrue(ditexTwoFAPage.saveButtonIsLoaded(),"'Save' button is not loaded.");
    }

    @Test
    public void clickOnSaveButtonWithEmptyEnterCodeField() {
        Assert.assertTrue(ditexMainPage.ditexMainPageIsLoaded(),"Ditex main page is not loaded.");
        ditexMainPage.login(username,password);
        Assert.assertEquals(ditexMainPage.nicknameIsLoaded(),username,"Login main page is not loaded.");
        DitexProfilePage ditexProfilePage = ditexMainPage.clickOnNickname();
        Assert.assertTrue(ditexProfilePage.profilePageIsLoaded(),"'Profile' page is not loaded.");
        DitexTwoFAPage ditexTwoFAPage = ditexProfilePage.clickOnTwoFATab();
        Assert.assertTrue(ditexTwoFAPage.twoFAPageIsLoaded(),"'2 step verification' page is not loaded.");
        ditexTwoFAPage.clickOnTwoFASwitcher();
        Assert.assertTrue(ditexTwoFAPage.twoFAWindowIsLoaded());
        ditexTwoFAPage.clickOnOkButton();
        Assert.assertTrue(ditexTwoFAPage.qrCodeIsLoaded(),"'QR-code' is not loaded.");
        Assert.assertTrue(ditexTwoFAPage.enterCodeFieldIsLoaded(),"'Enter code' field is not loaded.");
        Assert.assertTrue(ditexTwoFAPage.saveButtonIsLoaded(),"'Save' button is not loaded.");
        ditexTwoFAPage.clickOnSaveButton("");
        Assert.assertEquals(ditexTwoFAPage.errorMessageIsLoaded(),errorMessageEmpty,"Error message is not loaded.");
    }

    @Test
    public void clickOnSaveButtonWithIncorrectEnterCodeField() {
        Assert.assertTrue(ditexMainPage.ditexMainPageIsLoaded(),"Ditex main page is not loaded.");
        ditexMainPage.login(username,password);
        Assert.assertEquals(ditexMainPage.nicknameIsLoaded(),username,"Login main page is not loaded.");
        DitexProfilePage ditexProfilePage = ditexMainPage.clickOnNickname();
        Assert.assertTrue(ditexProfilePage.profilePageIsLoaded(),"'Profile' page is not loaded.");
        DitexTwoFAPage ditexTwoFAPage = ditexProfilePage.clickOnTwoFATab();
        Assert.assertTrue(ditexTwoFAPage.twoFAPageIsLoaded(),"'2 step verification' page is not loaded.");
        ditexTwoFAPage.clickOnTwoFASwitcher();
        Assert.assertTrue(ditexTwoFAPage.twoFAWindowIsLoaded());
        ditexTwoFAPage.clickOnOkButton();
        Assert.assertTrue(ditexTwoFAPage.qrCodeIsLoaded(),"'QR-code' is not loaded.");
        Assert.assertTrue(ditexTwoFAPage.enterCodeFieldIsLoaded(),"'Enter code' field is not loaded.");
        Assert.assertTrue(ditexTwoFAPage.saveButtonIsLoaded(),"'Save' button is not loaded.");
        ditexTwoFAPage.clickOnSaveButton("999999");
        Assert.assertEquals(ditexTwoFAPage.errorMessageIsLoaded(),errorMessageIncorrectCode,"Error message is not loaded.");
    }

    @Test
    public void clickOnPersonVerificationTab() {
        Assert.assertTrue(ditexMainPage.ditexMainPageIsLoaded(),"Ditex main page is not loaded.");
        ditexMainPage.login(username,password);
        Assert.assertEquals(ditexMainPage.nicknameIsLoaded(),username,"Login main page is not loaded.");
        DitexProfilePage ditexProfilePage = ditexMainPage.clickOnNickname();
        Assert.assertTrue(ditexProfilePage.profilePageIsLoaded(),"'Profile' page is not loaded.");
        DitexPersonVerificationPage ditexPersonVerificationPage = ditexProfilePage.clickOnPersonVerificationTab();
        Assert.assertTrue(ditexPersonVerificationPage.personVerificationIsLoaded(),"Person verification tab is not loaded.");
        Assert.assertTrue(ditexPersonVerificationPage.startButtonIsLoaded());
    }

    @Test
    public void openPersonVerificationSite() {
        Assert.assertTrue(ditexMainPage.ditexMainPageIsLoaded(),"Ditex main page is not loaded.");
        ditexMainPage.login(username,password);
        Assert.assertEquals(ditexMainPage.nicknameIsLoaded(),username,"Login main page is not loaded.");
        DitexProfilePage ditexProfilePage = ditexMainPage.clickOnNickname();
        Assert.assertTrue(ditexProfilePage.profilePageIsLoaded(),"'Profile' page is not loaded.");
        DitexPersonVerificationPage ditexPersonVerificationPage = ditexProfilePage.clickOnPersonVerificationTab();
        Assert.assertTrue(ditexPersonVerificationPage.personVerificationIsLoaded(),"Person verification tab is not loaded.");
        Assert.assertTrue(ditexPersonVerificationPage.startButtonIsLoaded(),"'Start' button is not loaded.");
        ditexPersonVerificationPage.clickOnStartButton();
        Assert.assertTrue(ditexPersonVerificationPage.verificationSiteIsLoaded(),"Verification site is not loaded.");
    }

    @Test
    public void clickOnFinanceTab() {
        Assert.assertTrue(ditexMainPage.ditexMainPageIsLoaded(),"Ditex main page is not loaded.");
        ditexMainPage.login(username,password);
        Assert.assertEquals(ditexMainPage.nicknameIsLoaded(),username,"Login main page is not loaded.");
        DitexProfilePage ditexProfilePage = ditexMainPage.clickOnNickname();
        Assert.assertTrue(ditexProfilePage.profilePageIsLoaded(),"'Profile' page is not loaded.");
        DitexFinancePage ditexFinancePage = ditexProfilePage.clickOnFinanceTab();
        Assert.assertTrue(ditexFinancePage.financePageIsLoaded(),"Finance page is not loaded.");
        Assert.assertTrue(ditexFinancePage.currenciesIsLoaded(),"Currencies is not loaded.");
    }

    @Test
    public void chooseEURCurrency() {
        Assert.assertTrue(ditexMainPage.ditexMainPageIsLoaded(),"Ditex main page is not loaded.");
        ditexMainPage.login(username,password);
        Assert.assertEquals(ditexMainPage.nicknameIsLoaded(),username,"Login main page is not loaded.");
        DitexProfilePage ditexProfilePage = ditexMainPage.clickOnNickname();
        Assert.assertTrue(ditexProfilePage.profilePageIsLoaded(),"'Profile' page is not loaded.");
        DitexFinancePage ditexFinancePage = ditexProfilePage.clickOnFinanceTab();
        Assert.assertTrue(ditexFinancePage.financePageIsLoaded(),"Finance page is not loaded.");
        Assert.assertTrue(ditexFinancePage.currenciesIsLoaded(),"Currencies is not loaded.");
        ditexFinancePage.clickOnEUR();
        DitexWalletsPage ditexWalletsPage = ditexMainPage.clickOnWalletsAndCardsButton();
        Assert.assertTrue(ditexWalletsPage.walletsPageIsLoaded(),"'Wallets and Cards' page is not loaded.");
        Assert.assertTrue(ditexWalletsPage.walletItemIsLoaded(),"Wallet item is not loaded.");
        Assert.assertEquals(ditexWalletsPage.financeCurrencyGetText(),"0.00 " + EUR,"Finance currency is not correct.");
    }

    @Test
    public void chooseRUBCurrency() {
        Assert.assertTrue(ditexMainPage.ditexMainPageIsLoaded(),"Ditex main page is not loaded.");
        ditexMainPage.login(username,password);
        Assert.assertEquals(ditexMainPage.nicknameIsLoaded(),username,"Login main page is not loaded.");
        DitexProfilePage ditexProfilePage = ditexMainPage.clickOnNickname();
        Assert.assertTrue(ditexProfilePage.profilePageIsLoaded(),"'Profile' page is not loaded.");
        DitexFinancePage ditexFinancePage = ditexProfilePage.clickOnFinanceTab();
        Assert.assertTrue(ditexFinancePage.financePageIsLoaded(),"Finance page is not loaded.");
        Assert.assertTrue(ditexFinancePage.currenciesIsLoaded(),"Currencies is not loaded.");
        ditexFinancePage.clickOnRUB();
        DitexWalletsPage ditexWalletsPage = ditexMainPage.clickOnWalletsAndCardsButton();
        Assert.assertTrue(ditexWalletsPage.walletsPageIsLoaded(),"'Wallets and Cards' page is not loaded.");
        Assert.assertTrue(ditexWalletsPage.walletItemIsLoaded(),"Wallet item is not loaded.");
        Assert.assertEquals(ditexWalletsPage.financeCurrencyGetText(),"0.00 " + RUB,"Finance currency is not correct.");
    }

    @Test
    public void chooseUSDCurrency() {
        Assert.assertTrue(ditexMainPage.ditexMainPageIsLoaded(),"Ditex main page is not loaded.");
        ditexMainPage.login(username,password);
        Assert.assertEquals(ditexMainPage.nicknameIsLoaded(),username,"Login main page is not loaded.");
        DitexProfilePage ditexProfilePage = ditexMainPage.clickOnNickname();
        Assert.assertTrue(ditexProfilePage.profilePageIsLoaded(),"'Profile' page is not loaded.");
        DitexFinancePage ditexFinancePage = ditexProfilePage.clickOnFinanceTab();
        Assert.assertTrue(ditexFinancePage.financePageIsLoaded(),"Finance page is not loaded.");
        Assert.assertTrue(ditexFinancePage.currenciesIsLoaded(),"Currencies is not loaded.");
        ditexFinancePage.clickOnUSD();
        DitexWalletsPage ditexWalletsPage = ditexMainPage.clickOnWalletsAndCardsButton();
        Assert.assertTrue(ditexWalletsPage.walletsPageIsLoaded(),"'Wallets and Cards' page is not loaded.");
        Assert.assertTrue(ditexWalletsPage.walletItemIsLoaded(),"Wallet item is not loaded.");
        Assert.assertEquals(ditexWalletsPage.financeCurrencyGetText(),"0.00 " + USD,"Finance currency is not correct.");
    }

    @Test
    public void checkEURCurrencyInWalletDetails() {
        Assert.assertTrue(ditexMainPage.ditexMainPageIsLoaded(),"Ditex main page is not loaded.");
        ditexMainPage.login(username,password);
        Assert.assertEquals(ditexMainPage.nicknameIsLoaded(),username,"Login main page is not loaded.");
        DitexProfilePage ditexProfilePage = ditexMainPage.clickOnNickname();
        Assert.assertTrue(ditexProfilePage.profilePageIsLoaded(),"'Profile' page is not loaded.");
        DitexFinancePage ditexFinancePage = ditexProfilePage.clickOnFinanceTab();
        Assert.assertTrue(ditexFinancePage.financePageIsLoaded(),"Finance page is not loaded.");
        Assert.assertTrue(ditexFinancePage.currenciesIsLoaded(),"Currencies is not loaded.");
        ditexFinancePage.clickOnEUR();
        DitexWalletsPage ditexWalletsPage = ditexMainPage.clickOnWalletsAndCardsButton();
        Assert.assertTrue(ditexWalletsPage.walletsPageIsLoaded(),"'Wallets and Cards' page is not loaded.");
        Assert.assertTrue(ditexWalletsPage.walletItemIsLoaded(),"Wallet item is not loaded.");
        DitexWalletDetailsPage ditexWalletDetailsPage = ditexWalletsPage.clickOnWalletItemUSDT();
        ditexWalletDetailsPage.clickOnCryptoCurrency();
        Assert.assertEquals(ditexWalletDetailsPage.fiatCurrencyGetText(),"0.00 " + EUR,"Finance currency is not correct.");
    }

    @Test
    public void openWalletsPage() {
        Assert.assertTrue(ditexMainPage.ditexMainPageIsLoaded(),"Ditex main page is not loaded.");
        ditexMainPage.login(usernameWithoutKYC,password);
        Assert.assertEquals(ditexMainPage.nicknameIsLoaded(),usernameWithoutKYC,"Login main page is not loaded.");
        DitexWalletsPage ditexWalletsPage = ditexMainPage.clickOnWalletsAndCardsButton();
        Assert.assertTrue(ditexWalletsPage.walletsPageIsLoaded(),"'Wallets and Cards' page is not loaded.");
    }

    @Test
    public void createNewBTCCryptoWallet() {
        Assert.assertTrue(ditexMainPage.ditexMainPageIsLoaded(),"Ditex main page is not loaded.");
        ditexMainPage.login(usernameWithoutKYC,password);
        Assert.assertEquals(ditexMainPage.nicknameIsLoaded(),usernameWithoutKYC,"Login main page is not loaded.");
        DitexWalletsPage ditexWalletsPage = ditexMainPage.clickOnWalletsAndCardsButton();
        Assert.assertTrue(ditexWalletsPage.walletsPageIsLoaded(),"'Wallets and Cards' page is not loaded.");
        ditexWalletsPage.clickOnAddWalletButton();
        Assert.assertTrue(ditexWalletsPage.windowIsLoaded(),"Window is not loaded.");
        ditexWalletsPage.chooseBTCCurrency();
        ditexWalletsPage.createNewWallet(BTC,walletBitcoin);
        Assert.assertTrue(ditexWalletsPage.walletItemIsLoaded(),"Wallet item is not loaded.");
    }

    @Test
    public void createNewBTCCryptoWalletWithoutName() {
        Assert.assertTrue(ditexMainPage.ditexMainPageIsLoaded(),"Ditex main page is not loaded.");
        ditexMainPage.login(usernameWithoutKYC,password);
        Assert.assertEquals(ditexMainPage.nicknameIsLoaded(),usernameWithoutKYC,"Login main page is not loaded.");
        DitexWalletsPage ditexWalletsPage = ditexMainPage.clickOnWalletsAndCardsButton();
        Assert.assertTrue(ditexWalletsPage.walletsPageIsLoaded(),"'Wallets and Cards' page is not loaded.");
        ditexWalletsPage.clickOnAddWalletButton();
        Assert.assertTrue(ditexWalletsPage.windowIsLoaded(),"Window is not loaded.");
        ditexWalletsPage.chooseBTCCurrency();
        ditexWalletsPage.createNewWallet("",walletBitcoin);
        Assert.assertTrue(ditexWalletsPage.walletItemIsLoaded(),"Wallet item is not loaded.");
    }

    @Test
    public void createNewETHCryptoWallet() {
        Assert.assertTrue(ditexMainPage.ditexMainPageIsLoaded(),"Ditex main page is not loaded.");
        ditexMainPage.login(usernameWithoutKYC,password);
        Assert.assertEquals(ditexMainPage.nicknameIsLoaded(),usernameWithoutKYC,"Login main page is not loaded.");
        DitexWalletsPage ditexWalletsPage = ditexMainPage.clickOnWalletsAndCardsButton();
        Assert.assertTrue(ditexWalletsPage.walletsPageIsLoaded(),"'Wallets and Cards' page is not loaded.");
        ditexWalletsPage.clickOnAddWalletButton();
        Assert.assertTrue(ditexWalletsPage.windowIsLoaded(),"Window is not loaded.");
        ditexWalletsPage.chooseETHCurrency();
        ditexWalletsPage.createNewWallet(ETH,walletEtherium);
        Assert.assertTrue(ditexWalletsPage.walletItemIsLoaded(),"Wallet item is not loaded.");
    }

    @Test
    public void createNewUSDTCryptoWallet() {
        Assert.assertTrue(ditexMainPage.ditexMainPageIsLoaded(),"Ditex main page is not loaded.");
        ditexMainPage.login(usernameWithoutKYC,password);
        Assert.assertEquals(ditexMainPage.nicknameIsLoaded(),usernameWithoutKYC,"Login main page is not loaded.");
        DitexWalletsPage ditexWalletsPage = ditexMainPage.clickOnWalletsAndCardsButton();
        Assert.assertTrue(ditexWalletsPage.walletsPageIsLoaded(),"'Wallets and Cards' page is not loaded.");
        ditexWalletsPage.clickOnAddWalletButton();
        Assert.assertTrue(ditexWalletsPage.windowIsLoaded(),"Window is not loaded.");
        ditexWalletsPage.chooseUSDTCurrency();
        ditexWalletsPage.createNewWallet(USDT,walletUSDT);
        Assert.assertTrue(ditexWalletsPage.walletItemIsLoaded(),"Wallet item is not loaded.");
    }

    @Test
    public void createNewUSDCCryptoWallet() {
        Assert.assertTrue(ditexMainPage.ditexMainPageIsLoaded(),"Ditex main page is not loaded.");
        ditexMainPage.login(usernameWithoutKYC,password);
        Assert.assertEquals(ditexMainPage.nicknameIsLoaded(),usernameWithoutKYC,"Login main page is not loaded.");
        DitexWalletsPage ditexWalletsPage = ditexMainPage.clickOnWalletsAndCardsButton();
        Assert.assertTrue(ditexWalletsPage.walletsPageIsLoaded(),"'Wallets and Cards' page is not loaded.");
        ditexWalletsPage.clickOnAddWalletButton();
        Assert.assertTrue(ditexWalletsPage.windowIsLoaded(),"Window is not loaded.");
        ditexWalletsPage.chooseUSDCCurrency();
        ditexWalletsPage.createNewWallet("USDC",walletUSDC);
        Assert.assertTrue(ditexWalletsPage.walletItemIsLoaded(),"Wallet item is not loaded.");
    }

    @Test
    public void deleteWallet() {
        Assert.assertTrue(ditexMainPage.ditexMainPageIsLoaded(),"Ditex main page is not loaded.");
        ditexMainPage.login(usernameWithoutKYC,password);
        Assert.assertEquals(ditexMainPage.nicknameIsLoaded(),usernameWithoutKYC,"Login main page is not loaded.");
        DitexWalletsPage ditexWalletsPage = ditexMainPage.clickOnWalletsAndCardsButton();
        Assert.assertTrue(ditexWalletsPage.walletsPageIsLoaded(),"'Wallets and Cards' page is not loaded.");
        ditexWalletsPage.clickOnAddWalletButton();
        Assert.assertTrue(ditexWalletsPage.windowIsLoaded(),"Window is not loaded.");
        ditexWalletsPage.chooseUSDCCurrency();
        ditexWalletsPage.createNewWallet("USDC",walletUSDC);
        Assert.assertTrue(ditexWalletsPage.walletItemIsLoaded(),"Wallet item is not loaded.");
        DitexWalletDetailsPage ditexWalletDetailsPage = ditexWalletsPage.clickOnWalletItem();
        Assert.assertTrue(ditexWalletDetailsPage.walletDetailsIsLoaded(),"Wallet details page is not loaded.");
        ditexWalletDetailsPage.clickOnDeleteWalletButton();
        Assert.assertTrue(ditexWalletDetailsPage.windowIsLoaded(),"Window is not opened.");
        ditexWalletDetailsPage.clickOnOkButton();
        Assert.assertTrue(ditexWalletsPage.walletsPageIsLoaded(),"Wallet page is not loaded");
        Assert.assertTrue(ditexWalletsPage.walletItemEmptyIsLoaded(),"Wallet item is not deleted.");
    }

    @Test
    public void changeWalletData() {
        Assert.assertTrue(ditexMainPage.ditexMainPageIsLoaded(),"Ditex main page is not loaded.");
        ditexMainPage.login(usernameWithoutKYC,password);
        Assert.assertEquals(ditexMainPage.nicknameIsLoaded(),usernameWithoutKYC,"Login main page is not loaded.");
        DitexWalletsPage ditexWalletsPage = ditexMainPage.clickOnWalletsAndCardsButton();
        Assert.assertTrue(ditexWalletsPage.walletsPageIsLoaded(),"'Wallets and Cards' page is not loaded.");
        ditexWalletsPage.clickOnAddWalletButton();
        Assert.assertTrue(ditexWalletsPage.windowIsLoaded(),"Window is not loaded.");
        ditexWalletsPage.chooseUSDCCurrency();
        ditexWalletsPage.createNewWallet("USDC",walletUSDC);
        Assert.assertTrue(ditexWalletsPage.walletItemIsLoaded(),"Wallet item is not loaded.");
        DitexWalletDetailsPage ditexWalletDetailsPage = ditexWalletsPage.clickOnWalletItem();
        Assert.assertTrue(ditexWalletDetailsPage.walletDetailsIsLoaded(),"Wallet details page is not loaded.");
        ditexWalletDetailsPage.clickOnChangeDataButton();
        Assert.assertTrue(ditexWalletDetailsPage.windowIsLoaded(),"Window is not opened.");
        ditexWalletDetailsPage.changeWallet(walletBitcoin);
        Assert.assertEquals(ditexWalletDetailsPage.walletNameText(),"AutoText","Wallet name is not correct.");
        Assert.assertEquals(ditexWalletDetailsPage.walletNumberText(),walletBitcoin,"Wallet number is not correct.");
        Assert.assertEquals(ditexWalletDetailsPage.currencyText(),BTC,"Currency text is not correct.");
    }

    @Test
    public void clickOnAddItemWallet() {
        Assert.assertTrue(ditexMainPage.ditexMainPageIsLoaded(),"Ditex main page is not loaded.");
        ditexMainPage.login(username,password);
        Assert.assertEquals(ditexMainPage.nicknameIsLoaded(),username,"Login main page is not loaded.");
        DitexWalletsPage ditexWalletsPage = ditexMainPage.clickOnWalletsAndCardsButton();
        Assert.assertTrue(ditexWalletsPage.walletsPageIsLoaded(),"'Wallets and Cards' page is not loaded.");
        ditexWalletsPage.clickOnAddItemWallet();
        Assert.assertTrue(ditexWalletsPage.windowIsLoaded(),"Window is not loaded.");
    }

    @Test
    public void clickOnAddItemCard() {
        Assert.assertTrue(ditexMainPage.ditexMainPageIsLoaded(),"Ditex main page is not loaded.");
        ditexMainPage.login(username,password);
        Assert.assertEquals(ditexMainPage.nicknameIsLoaded(),username,"Login main page is not loaded.");
        DitexWalletsPage ditexWalletsPage = ditexMainPage.clickOnWalletsAndCardsButton();
        Assert.assertTrue(ditexWalletsPage.walletsPageIsLoaded(),"'Wallets and Cards' page is not loaded.");
        DitexCardsPage ditexCardsPage = ditexWalletsPage.clickOnCardsTab();
        Assert.assertTrue(ditexCardsPage.cardsPageIsLoaded(),"Cards page is not loaded.");
        ditexCardsPage.clickOnAddItemCard();
        Assert.assertTrue(ditexCardsPage.windowIsLoaded(),"Window is not loaded.");
    }

    @Test
    public void checkTransactionHistory() {
        Assert.assertTrue(ditexMainPage.ditexMainPageIsLoaded(),"Ditex main page is not loaded.");
        ditexMainPage.login(username,password);
        Assert.assertEquals(ditexMainPage.nicknameIsLoaded(),username,"Login main page is not loaded.");
        DitexWalletsPage ditexWalletsPage = ditexMainPage.clickOnWalletsAndCardsButton();
        Assert.assertTrue(ditexWalletsPage.walletsPageIsLoaded(),"'Wallets and Cards' page is not loaded.");
        DitexWalletDetailsPage ditexWalletDetailsPage = ditexWalletsPage.clickOnWalletItemETH();
        Assert.assertTrue(ditexWalletDetailsPage.transactionHistoryIsLoaded(),"Transaction history is not loaded.");
    }

    @Test
    public void clickOnTransactionID() {
        Assert.assertTrue(ditexMainPage.ditexMainPageIsLoaded(),"Ditex main page is not loaded.");
        ditexMainPage.login(username,password);
        Assert.assertEquals(ditexMainPage.nicknameIsLoaded(),username,"Login main page is not loaded.");
        DitexWalletsPage ditexWalletsPage = ditexMainPage.clickOnWalletsAndCardsButton();
        Assert.assertTrue(ditexWalletsPage.walletsPageIsLoaded(),"'Wallets and Cards' page is not loaded.");
        DitexWalletDetailsPage ditexWalletDetailsPage = ditexWalletsPage.clickOnWalletItemETH();
        Assert.assertTrue(ditexWalletDetailsPage.transactionHistoryIsLoaded(),"Transaction history is not loaded.");
        ditexWalletDetailsPage.clickOnTransactionHistoryID();
        Assert.assertEquals(ditexWalletDetailsPage.transactionDetailsIsLoaded(),5,"Transaction details is not loaded.");
    }

    @Test
    public void checkFilterBTC() {
        Assert.assertTrue(ditexMainPage.ditexMainPageIsLoaded(),"Ditex main page is not loaded.");
        ditexMainPage.login(username,password);
        Assert.assertEquals(ditexMainPage.nicknameIsLoaded(),username,"Login main page is not loaded.");
        DitexWalletsPage ditexWalletsPage = ditexMainPage.clickOnWalletsAndCardsButton();
        Assert.assertTrue(ditexWalletsPage.walletsPageIsLoaded(),"'Wallets and Cards' page is not loaded.");
        ditexWalletsPage.clickOnFilterCurrency();
        ditexWalletsPage.clickOnBTCFilter();
        Assert.assertEquals(ditexWalletsPage.walletItemQuantityIsLoaded(),1,"BTC filter is not correct");
    }

    @Test
    public void checkFilterETH() {
        Assert.assertTrue(ditexMainPage.ditexMainPageIsLoaded(),"Ditex main page is not loaded.");
        ditexMainPage.login(username,password);
        Assert.assertEquals(ditexMainPage.nicknameIsLoaded(),username,"Login main page is not loaded.");
        DitexWalletsPage ditexWalletsPage = ditexMainPage.clickOnWalletsAndCardsButton();
        Assert.assertTrue(ditexWalletsPage.walletsPageIsLoaded(),"'Wallets and Cards' page is not loaded.");
        ditexWalletsPage.clickOnFilterCurrency();
        ditexWalletsPage.clickOnETHFilter();
        Assert.assertEquals(ditexWalletsPage.walletItemQuantityIsLoaded(),1,"ETH filter is not correct");
    }

    @Test
    public void checkFilterUSDC() {
        Assert.assertTrue(ditexMainPage.ditexMainPageIsLoaded(),"Ditex main page is not loaded.");
        ditexMainPage.login(username,password);
        Assert.assertEquals(ditexMainPage.nicknameIsLoaded(),username,"Login main page is not loaded.");
        DitexWalletsPage ditexWalletsPage = ditexMainPage.clickOnWalletsAndCardsButton();
        Assert.assertTrue(ditexWalletsPage.walletsPageIsLoaded(),"'Wallets and Cards' page is not loaded.");
        ditexWalletsPage.clickOnFilterCurrency();
        ditexWalletsPage.clickOnUSDCFilter();
        Assert.assertEquals(ditexWalletsPage.walletItemQuantityIsLoaded(),1,"USDC filter is not correct");
    }

    @Test
    public void checkFilterUSDT() {
        Assert.assertTrue(ditexMainPage.ditexMainPageIsLoaded(),"Ditex main page is not loaded.");
        ditexMainPage.login(username,password);
        Assert.assertEquals(ditexMainPage.nicknameIsLoaded(),username,"Login main page is not loaded.");
        DitexWalletsPage ditexWalletsPage = ditexMainPage.clickOnWalletsAndCardsButton();
        Assert.assertTrue(ditexWalletsPage.walletsPageIsLoaded(),"'Wallets and Cards' page is not loaded.");
        ditexWalletsPage.clickOnFilterCurrency();
        ditexWalletsPage.clickOnUSDTFilter();
        Assert.assertEquals(ditexWalletsPage.walletItemQuantityIsLoaded(),1,"USDT filter is not correct");
    }

    @Test
    public void checkFilterRUB() {
        Assert.assertTrue(ditexMainPage.ditexMainPageIsLoaded(),"Ditex main page is not loaded.");
        ditexMainPage.login(username,password);
        Assert.assertEquals(ditexMainPage.nicknameIsLoaded(),username,"Login main page is not loaded.");
        DitexWalletsPage ditexWalletsPage = ditexMainPage.clickOnWalletsAndCardsButton();
        Assert.assertTrue(ditexWalletsPage.walletsPageIsLoaded(),"'Wallets and Cards' page is not loaded.");
        DitexCardsPage ditexCardsPage = ditexWalletsPage.clickOnCardsTab();
        Assert.assertTrue(ditexCardsPage.cardsPageIsLoaded(),"Cards page is not loaded.");
        ditexCardsPage.clickOnFilterCurrency();
        ditexCardsPage.clickOnRUBFilter();
        Assert.assertEquals(ditexCardsPage.cardItemQuantityIsLoaded(),1,"USDT filter is not correct");
    }

    @Test
    public void checkFilterEUR() {
        Assert.assertTrue(ditexMainPage.ditexMainPageIsLoaded(),"Ditex main page is not loaded.");
        ditexMainPage.login(username,password);
        Assert.assertEquals(ditexMainPage.nicknameIsLoaded(),username,"Login main page is not loaded.");
        DitexWalletsPage ditexWalletsPage = ditexMainPage.clickOnWalletsAndCardsButton();
        Assert.assertTrue(ditexWalletsPage.walletsPageIsLoaded(),"'Wallets and Cards' page is not loaded.");
        DitexCardsPage ditexCardsPage = ditexWalletsPage.clickOnCardsTab();
        Assert.assertTrue(ditexCardsPage.cardsPageIsLoaded(),"Cards page is not loaded.");
        ditexCardsPage.clickOnFilterCurrency();
        ditexCardsPage.clickOnRUBFilter();
        Assert.assertEquals(ditexCardsPage.cardItemQuantityIsLoaded(),1,"USDT filter is not correct");
    }

    @Test
    public void openCardsPage() {
        Assert.assertTrue(ditexMainPage.ditexMainPageIsLoaded(),"Ditex main page is not loaded.");
        ditexMainPage.login(usernameWithoutKYC,password);
        Assert.assertEquals(ditexMainPage.nicknameIsLoaded(),usernameWithoutKYC,"Login main page is not loaded.");
        DitexWalletsPage ditexWalletsPage = ditexMainPage.clickOnWalletsAndCardsButton();
        Assert.assertTrue(ditexWalletsPage.walletsPageIsLoaded(),"'Wallets and Cards' page is not loaded.");
        DitexCardsPage ditexCardsPage = ditexWalletsPage.clickOnCardsTab();
        Assert.assertTrue(ditexCardsPage.cardsPageIsLoaded(),"Cards page is not loaded.");
    }

    @Test
    public void createNewRUBFiatCard() {
        Assert.assertTrue(ditexMainPage.ditexMainPageIsLoaded(),"Ditex main page is not loaded.");
        ditexMainPage.login(usernameWithoutKYC,password);
        Assert.assertEquals(ditexMainPage.nicknameIsLoaded(),usernameWithoutKYC,"Login main page is not loaded.");
        DitexWalletsPage ditexWalletsPage = ditexMainPage.clickOnWalletsAndCardsButton();
        Assert.assertTrue(ditexWalletsPage.walletsPageIsLoaded(),"'Wallets and Cards' page is not loaded.");
        DitexCardsPage ditexCardsPage = ditexWalletsPage.clickOnCardsTab();
        Assert.assertTrue(ditexCardsPage.cardsPageIsLoaded(),"Cards page is not loaded.");
        ditexCardsPage.clickOnAddCardButton();
        Assert.assertTrue(ditexCardsPage.windowIsLoaded(),"Window is not loaded.");
        ditexCardsPage.chooseRUBCurrency();
        ditexCardsPage.createNewCard(RUB,walletRUB,"John Smith");
        Assert.assertTrue(ditexCardsPage.cardItemIsLoaded(),"Card item is not loaded.");
    }

    @Test
    public void createNewEURFiatCard() {
        Assert.assertTrue(ditexMainPage.ditexMainPageIsLoaded(),"Ditex main page is not loaded.");
        ditexMainPage.login(usernameWithoutKYC,password);
        Assert.assertEquals(ditexMainPage.nicknameIsLoaded(),usernameWithoutKYC,"Login main page is not loaded.");
        DitexWalletsPage ditexWalletsPage = ditexMainPage.clickOnWalletsAndCardsButton();
        Assert.assertTrue(ditexWalletsPage.walletsPageIsLoaded(),"'Wallets and Cards' page is not loaded.");
        DitexCardsPage ditexCardsPage = ditexWalletsPage.clickOnCardsTab();
        Assert.assertTrue(ditexCardsPage.cardsPageIsLoaded(),"Cards page is not loaded.");
        ditexCardsPage.clickOnAddCardButton();
        Assert.assertTrue(ditexCardsPage.windowIsLoaded(),"Window is not loaded.");
        ditexCardsPage.chooseEURCurrency();
        ditexCardsPage.createNewCard(EUR,walletEUR,"John Black");
        Assert.assertTrue(ditexCardsPage.cardItemIsLoaded(),"Card item is not loaded.");
    }

    @Test
    public void createNewRUBFiatCardWithoutNames() {
        Assert.assertTrue(ditexMainPage.ditexMainPageIsLoaded(),"Ditex main page is not loaded.");
        ditexMainPage.login(usernameWithoutKYC,password);
        Assert.assertEquals(ditexMainPage.nicknameIsLoaded(),usernameWithoutKYC,"Login main page is not loaded.");
        DitexWalletsPage ditexWalletsPage = ditexMainPage.clickOnWalletsAndCardsButton();
        Assert.assertTrue(ditexWalletsPage.walletsPageIsLoaded(),"'Wallets and Cards' page is not loaded.");
        DitexCardsPage ditexCardsPage = ditexWalletsPage.clickOnCardsTab();
        Assert.assertTrue(ditexCardsPage.cardsPageIsLoaded(),"Cards page is not loaded.");
        ditexCardsPage.clickOnAddCardButton();
        Assert.assertTrue(ditexCardsPage.windowIsLoaded(),"Window is not loaded.");
        ditexCardsPage.chooseRUBCurrency();
        ditexCardsPage.createNewCard("",walletRUB,"");
        Assert.assertTrue(ditexCardsPage.cardItemIsLoaded(),"Card item is not loaded.");
    }

    @Test
    public void deleteCard() {
        Assert.assertTrue(ditexMainPage.ditexMainPageIsLoaded(),"Ditex main page is not loaded.");
        ditexMainPage.login(usernameWithoutKYC,password);
        Assert.assertEquals(ditexMainPage.nicknameIsLoaded(),usernameWithoutKYC,"Login main page is not loaded.");
        DitexWalletsPage ditexWalletsPage = ditexMainPage.clickOnWalletsAndCardsButton();
        Assert.assertTrue(ditexWalletsPage.walletsPageIsLoaded(),"'Wallets and Cards' page is not loaded.");
        DitexCardsPage ditexCardsPage = ditexWalletsPage.clickOnCardsTab();
        Assert.assertTrue(ditexCardsPage.cardsPageIsLoaded(),"Cards page is not loaded.");
        ditexCardsPage.clickOnAddCardButton();
        Assert.assertTrue(ditexCardsPage.windowIsLoaded(),"Window is not loaded.");
        ditexCardsPage.chooseRUBCurrency();
        ditexCardsPage.createNewCard("",walletRUB,"");
        Assert.assertTrue(ditexCardsPage.cardItemIsLoaded(),"Card item is not loaded.");
        DitexCardsDetailsPage ditexCardsDetailsPage = ditexCardsPage.clickOnCardItem();
        Assert.assertTrue(ditexCardsDetailsPage.cardDetailsIsLoaded(),"Card details is not loaded.");
        ditexCardsDetailsPage.clickOnDeleteCardButton();
        Assert.assertTrue(ditexCardsDetailsPage.windowIsLoaded(),"Window is not loaded.");
        ditexCardsDetailsPage.clickOnOkButton();
        Assert.assertTrue(ditexCardsPage.cardsPageIsLoaded(),"Cards page is not loaded.");
        Assert.assertTrue(ditexCardsPage.cardItemEmptyIsLoaded(),"Card is not deleted.");
    }

    @Test
    public void changeCardData() {
        Assert.assertTrue(ditexMainPage.ditexMainPageIsLoaded(),"Ditex main page is not loaded.");
        ditexMainPage.login(usernameWithoutKYC,password);
        Assert.assertEquals(ditexMainPage.nicknameIsLoaded(),usernameWithoutKYC,"Login main page is not loaded.");
        DitexWalletsPage ditexWalletsPage = ditexMainPage.clickOnWalletsAndCardsButton();
        Assert.assertTrue(ditexWalletsPage.walletsPageIsLoaded(),"'Wallets and Cards' page is not loaded.");
        DitexCardsPage ditexCardsPage = ditexWalletsPage.clickOnCardsTab();
        Assert.assertTrue(ditexCardsPage.cardsPageIsLoaded(),"Cards page is not loaded.");
        ditexCardsPage.clickOnAddCardButton();
        Assert.assertTrue(ditexCardsPage.windowIsLoaded(),"Window is not loaded.");
        ditexCardsPage.chooseRUBCurrency();
        ditexCardsPage.createNewCard("",walletRUB,"");
        Assert.assertTrue(ditexCardsPage.cardItemIsLoaded(),"Card item is not loaded.");
        DitexCardsDetailsPage ditexCardsDetailsPage = ditexCardsPage.clickOnCardItem();
        Assert.assertTrue(ditexCardsDetailsPage.cardDetailsIsLoaded(),"Card details is not loaded.");
        ditexCardsDetailsPage.clickOnChangeDataButton();
        Assert.assertTrue(ditexCardsDetailsPage.windowIsLoaded(),"Window is not loaded.");
        ditexCardsDetailsPage.changeCard("AutoText",walletRUB,"Auto Change");
        Assert.assertEquals(ditexCardsDetailsPage.cardNameText(),"AutoText","Wallet name is not correct.");
        Assert.assertEquals(ditexCardsDetailsPage.cardNumberText(),walletEUR,"Wallet number is not correct.");
        Assert.assertEquals(ditexCardsDetailsPage.currencyText(),EUR,"Currency text is not correct.");
        Assert.assertEquals(ditexCardsDetailsPage.cardHolder(),"Auto Change","Cardholder is not correct.");
        Assert.assertEquals(ditexCardsDetailsPage.monthText(),"04","Month is not correct.");
        Assert.assertEquals(ditexCardsDetailsPage.yearText(),"21","Year is not correct.");
    }

    /**
     * ТС21
     */
    @Test
    public void clickOnInstagramLink() {
        DitexInstagramPage ditexInstagramPage = ditexMainPage.clickOnInstagramLink();
        Assert.assertTrue(ditexInstagramPage.instagramPageIsLoaded(),"Instagram page is not loaded.");
    }

    /**
     * ТС19
     */
    @Test
    public void clickOnTwitterLink() {
        DitexTwitterPage ditexTwitterPage = ditexMainPage.clickOnTwitterLink();
        Assert.assertTrue(ditexTwitterPage.twitterPageIsLoaded(),"Twitter page is not loaded.");
    }

    /**
     * ТС20
     */
    @Test
    public void clickOnTelegramLink() {
        DitexTelegramPage ditexTelegramPage = ditexMainPage.clickOnTelegramLink();
        Assert.assertTrue(ditexTelegramPage.telegramPageIsLoaded(),"Telegram page is not loaded.");
    }

    /**
     * ТС17
     */
    @Test
    public void clickOnLogOutButton() {
        Assert.assertTrue(ditexMainPage.ditexMainPageIsLoaded(),"Ditex main page is not loaded.");
        ditexMainPage.login(username,password);
        Assert.assertEquals(ditexMainPage.nicknameIsLoaded(),username,"Login main page is not loaded.");
        DitexProfilePage ditexProfilePage = ditexMainPage.clickOnNickname();
        ditexProfilePage.clickOnLogOutButton();
        Assert.assertTrue(ditexMainPage.logOutWindowIsLoaded(),"'Log Out' window is not loaded.");
        ditexMainPage.clickOnOkButton();
        Assert.assertTrue(ditexMainPage.ditexMainPageIsLoaded(),"Ditex main page is not loaded.");
    }

    @Test
    public void clickOnResetKeyButton() {
        Assert.assertTrue(ditexMainPage.ditexMainPageIsLoaded(),"Ditex main page is not loaded.");
        ditexMainPage.login(username,password);
        Assert.assertEquals(ditexMainPage.nicknameIsLoaded(),username,"Login main page is not loaded.");
        DitexProfilePage ditexProfilePage = ditexMainPage.clickOnNickname();
        Assert.assertTrue(ditexProfilePage.profilePageIsLoaded(),"Profile page is not loaded.");
        Assert.assertTrue(ditexProfilePage.keyTextIsLoaded(),"Key text is not loaded.");
        String oldKey = ditexProfilePage.keyGetText();
        ditexProfilePage.clickOnResetKeyButton();
        Assert.assertNotEquals(ditexProfilePage.keyGetText(),oldKey,"'Reset' button for key is not working.");
    }

    /**
     * ТС36выборРус
     */
    @Test
    public void selectRussianLanguage() {
        ditexMainPage.clickOnLanguageButton();
        ditexMainPage.clickOnRussianLanguage();
        Assert.assertEquals(ditexMainPage.languageIsSelected(),"ru","Russian language is not selected.");
    }

    /**
     * ТС36выборEng
     */
    @Test
    public void selectEnglishLanguage() {
        ditexMainPage.clickOnLanguageButton();
        ditexMainPage.clickOnEnglishLanguage();
        Assert.assertEquals(ditexMainPage.languageIsSelected(),"en","English language is not selected.");
    }

    @Test
    public void checkPairs() {
        Assert.assertEquals(ditexMainPage.setPairsSum(),6,"Pairs is not loaded.");
    }
}