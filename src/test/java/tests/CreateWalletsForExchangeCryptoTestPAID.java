package tests;

import org.testng.annotations.Test;

public class CreateWalletsForExchangeCryptoTestPAID extends BaseTest {


    /**
     * BTC - USDT
     */
    @Test
    public void checkExchangeWorkingBuyBTCUSDT() {
        authorization(username);
        ditexMainPage.chooseMyCryptoBTCForSell();
        ditexMainPage.chooseMyCryptoUSDTForBuy();
        afterChooseWalletForCryptoWithPAID(BTCQuality,walletUSDT,BTC,USDT);
    }

    /**
     * BTC - EUR
     */
    @Test
    public void checkExchangeWorkingBuyBTCEUR() {
        authorization(username);
        ditexMainPage.chooseMyCryptoBTCForSell();
        ditexMainPage.chooseMyEURForBuy();
        afterChooseWalletForCryptoWithPAID(BTCQuality,walletEUR,BTC,EUR);
    }

    /**
     * ETH - USDT
     */
    @Test
    public void checkExchangeWorkingBuyETHUSDT() {
        authorization(username);
        ditexMainPage.chooseMyCryptoETHForSell();
        ditexMainPage.chooseMyCryptoUSDTForBuy();
        afterChooseWalletForCryptoWithPAID(ETHQuality,walletUSDT,ETH,USDT);
    }

    /**
     * ETH - EUR
     */
    @Test
    public void checkExchangeWorkingBuyETHEUR() {
        authorization(username);
        ditexMainPage.chooseMyCryptoETHForSell();
        ditexMainPage.chooseMyEURForBuy();
        afterChooseWalletForCryptoWithPAID(ETHQuality,walletEUR,ETH,EUR);
    }

    /**
     * USDT - BTC
     */
    @Test
    public void checkExchangeWorkingBuyUSDTBTC() {
        authorization(username);
        ditexMainPage.chooseMyCryptoUSDTForSell();
        ditexMainPage.chooseMyCryptoBTCForBuy();
        afterChooseWalletForCryptoWithPAID(USDTQualityForBTC,walletBitcoin,USDT,BTC);
    }

    /**
     * USDT - ETH
     */
    @Test
    public void checkExchangeWorkingBuyUSDTETH() {
        authorization(username);
        ditexMainPage.chooseMyCryptoUSDTForSell();
        ditexMainPage.chooseMyCryptoETHForBuy();
        afterChooseWalletForCryptoWithPAID(USDTQualityForETH,walletEtherium,USDT,ETH);
    }

    /**
     * USDT - RUB
     */
    @Test
    public void checkExchangeWorkingBuyUSDTRUB() {
        authorization(username);
        ditexMainPage.chooseMyCryptoUSDTForSell();
        ditexMainPage.chooseMyCryptoRUBForBuy();
        afterChooseWalletForCryptoWithPAID(USDTQualityForRUB,walletRUB,USDT,RUB);
    }

    /**
     * BTC - ETH
     */
    @Test
    public void checkExchangeWorkingBuyBTCETH() {
        authorization(username);
        ditexMainPage.chooseMyCryptoBTCForSell();
        ditexMainPage.chooseMyCryptoETHForBuy();
        afterChooseWalletForCryptoWithPAID(BTCQuality,walletEtherium,BTC,ETH);
    }

    /**
     * ETH - BTC
     */
    @Test
    public void checkExchangeWorkingBuyETHBTC() {
        authorization(username);
        ditexMainPage.chooseMyCryptoETHForSell();
        ditexMainPage.chooseMyCryptoBTCForBuy();
        afterChooseWalletForCryptoWithPAID(ETHQuality,walletBitcoin,ETH,BTC);
    }

    /**
     * ETH - RUB
     */
    @Test
    public void checkExchangeWorkingBuyETHRUB() {
        authorization(username);
        ditexMainPage.chooseMyCryptoETHForSell();
        ditexMainPage.chooseMyCryptoRUBForBuy();
        afterChooseWalletForCryptoWithPAID(ETHQuality,walletRUB,ETH,RUB);
    }

    /**
     * BTC - RUB
     */
    @Test
    public void checkExchangeWorkingBuyBTCRUB() {
        authorization(username);
        ditexMainPage.chooseMyCryptoBTCForSell();
        ditexMainPage.chooseMyCryptoRUBForBuy();
        afterChooseWalletForCryptoWithPAID(BTCQuality,walletRUB,BTC,RUB);
    }

    /**
     * ETH - USDC
     */
    @Test
    public void checkExchangeWorkingBuyETHUSDC() {
        authorization(username);
        ditexMainPage.chooseMyCryptoETHForSell();
        ditexMainPage.chooseMyCryptoUSDCForBuy();
        afterChooseWalletForCryptoWithPAID(ETHQuality,walletUSDC,ETH,USDC);
    }

    /**
     * USDC - ETH
     */
    @Test
    public void checkExchangeWorkingBuyUSDCETH() {
        authorization(username);
        ditexMainPage.chooseMyCryptoUSDCForSell();
        ditexMainPage.chooseMyCryptoETHForBuy();
        afterChooseWalletForCryptoWithPAID(USDCQualityForETH,walletEtherium,USDC,ETH);
    }

    /**
     * USDC - BTC
     */
    @Test
    public void checkExchangeWorkingBuyUSDCBTC() {
        authorization(username);
        ditexMainPage.chooseMyCryptoUSDCForSell();
        ditexMainPage.chooseMyCryptoBTCForBuy();
        afterChooseWalletForCryptoWithPAID(USDCQualityForBTC,walletBitcoin,USDC,BTC);
    }

    /**
     * BTC - USDC
     */
   @Test
    public void checkExchangeWorkingBuyBTCUSDC() {
        authorization(username);
        ditexMainPage.chooseMyCryptoBTCForSell();
        ditexMainPage.chooseMyCryptoUSDCForBuy();
        afterChooseWalletForCryptoWithPAID(BTCQuality,walletUSDC,BTC,USDC);
    }

    /**
     * USDC - RUB
     */
    @Test
    public void checkExchangeWorkingBuyUSDCRUB() {
        authorization(username);
        ditexMainPage.chooseMyCryptoUSDCForSell();
        ditexMainPage.chooseMyCryptoRUBForBuy();
        afterChooseWalletForCryptoWithPAID(USDCQualityForRUB,walletRUB,USDC,RUB);
    }
}
