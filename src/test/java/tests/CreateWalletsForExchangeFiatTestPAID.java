package tests;

import org.testng.annotations.Test;

public class CreateWalletsForExchangeFiatTestPAID extends BaseTest {


    @Test
    public void checkExchangeWorkingBuyEURETH() {
        authorization(username);
        ditexMainPage.chooseMyEURForSell();
        ditexMainPage.chooseMyCryptoETHForBuy();
        afterChooseWalletForFiatAndCheckCryptoNumbers(EURQuality,walletEtherium);
    }

    @Test
    public void checkExchangeWorkingBuyEURBTC() {
        authorization(username);
        ditexMainPage.chooseMyEURForSell();
        ditexMainPage.chooseMyCryptoBTCForBuy();
        afterChooseWalletForFiatAndCheckCryptoNumbers(EURQuality,walletBitcoin);
    }

    @Test
    public void checkExchangeWorkingBuyEURBTCWithoutKYCSmallNumber() {
        authorization(usernameWithoutKYC);
        ditexMainPage.chooseMyEURForSell();
        ditexMainPage.chooseMyCryptoBTCForBuy();
        afterChooseWalletForFiatAndCheckCryptoNumbers(EURQuality,walletBitcoin);
    }

    @Test
    public void checkExchangeWorkingBuyEURBTCWithoutKYCBigNumber() {
        authorization(usernameWithoutKYC);
        ditexMainPage.chooseMyEURForSell();
        ditexMainPage.chooseMyCryptoBTCForBuy();
        afterChooseWalletForFiatAndCheckCryptoNumbers(EURQualityBigNumber,walletBitcoin);
    }

    @Test
    public void checkExchangeWorkingBuyEURUSDT() {
        authorization(username);
        ditexMainPage.chooseMyEURForSell();
        ditexMainPage.chooseMyCryptoUSDTForBuy();
        afterChooseWalletForFiatAndCheckCryptoNumbers(EURQuality,walletUSDT);
    }

    @Test
    public void checkExchangeWorkingBuyRUBUSDT() {
        authorization(username);
        ditexMainPage.chooseMyRUBForSell();
        ditexMainPage.chooseMyCryptoUSDTForBuy();
        afterChooseWalletForFiatAndCheckCryptoNumbers(RUBQuality,walletUSDT);
    }

    @Test
    public void checkExchangeWorkingBuyRUBBTC() {
        authorization(username);
        ditexMainPage.chooseMyRUBForSell();
        ditexMainPage.chooseMyCryptoBTCForBuy();
        afterChooseWalletForFiatAndCheckCryptoNumbers(RUBQualityForBTC,walletBitcoin);
    }

    @Test
    public void checkExchangeWorkingBuyRUBETH() {
        authorization(username);
        ditexMainPage.chooseMyRUBForSell();
        ditexMainPage.chooseMyCryptoETHForBuy();
        afterChooseWalletForFiatAndCheckCryptoNumbers(RUBQualityForETH,walletEtherium);
    }
}
