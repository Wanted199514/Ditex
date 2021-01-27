package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DitexWalletsPage extends BasePage {
    @FindBy(xpath = "//div[@class='selector-wrapper']/mat-select[contains(@id,'mat-select')]")
    private WebElement filterCurrency;

    @FindBy(xpath = "//div[contains(@class,'add-wallet')]")
    private WebElement addWalletButton;

    @FindBy(xpath = "//h2")
    private WebElement window;

    @FindBy(xpath = "//input[@formcontrolname='walletName']")
    private WebElement walletName;

    @FindBy(xpath = "//input[@formcontrolname='receiptAddress']")
    private WebElement walletNumber;

    @FindBy(xpath = "//button/span")
    private WebElement saveButton;

    @FindBy(xpath = "//label[contains(@class,'select-exchange')]")
    private WebElement currencySelector;

    @FindBy(xpath = "//div[contains(@class,'wallet-item--card')]")
    private WebElement walletItem;

    @FindBy(xpath = "//div[1]/div[contains(@class,'wallet-item--card')]/div/div/div/div/span")
    private WebElement financeCurrency;

    @FindBy(xpath = "//div[contains(@class,'wallet-item--card')]")
    private List<WebElement> walletItemQuality;

    @FindBy(xpath = "//div[contains(@class,'wallet-item--card')]/div/div/div[text()='USDT']")
    private WebElement walletItemUSDT;

    @FindBy(xpath = "//div[contains(@class,'wallet-item--card')]/div/div/div[text()='ETH']")
    private WebElement walletItemETH;

    @FindBy(xpath = "//div[contains(@class,'wallet-item--add')]")
    private WebElement addItemWallet;

    @FindBy(xpath = "//span[text()='BTC']")
    private WebElement BTC;

    @FindBy(xpath = "//span[text()='ETH']")
    private WebElement ETH;

    @FindBy(xpath = "//span[text()='USDC']")
    private WebElement USDC;

    @FindBy(xpath = "//span[text()='USDT']")
    private WebElement USDT;

    @FindBy(xpath = "//div[@translate='profile_page.my_cards']")
    private WebElement cardsTab;

    @FindBy(xpath = "//div[contains(@class,'wallet-item--missing')]")
    private WebElement walletItemEmpty;

    @FindBy(xpath = "//mat-option/span[contains(text(),'BTC')]")
    private WebElement BTCFilter;

    @FindBy(xpath = "//mat-option/span[contains(text(),'ETH')]")
    private WebElement ETHFilter;

    @FindBy(xpath = "//mat-option/span[contains(text(),'USDC')]")
    private WebElement USDCFilter;

    @FindBy(xpath = "//mat-option/span[contains(text(),'USDT')]")
    private WebElement USDTFilter;

    public DitexWalletsPage(WebDriver webDriver) {
        initializationWebElements(webDriver);
    }

    public boolean walletsPageIsLoaded() {
        waitUntilElementIsAppear(filterCurrency);
        return webDriver.getCurrentUrl().equals(front + "/wallets-and-cards/wallets-list");
    }

    public boolean windowIsLoaded() {
        sleep(3000);
        return window.isDisplayed();
    }

    public boolean walletItemIsLoaded() {
        waitUntilElementIsAppear(walletItem);
        return walletItem.isDisplayed();
    }

    public boolean walletItemEmptyIsLoaded() {
        sleep(1000);
        return walletItemEmpty.isDisplayed();
    }

    public String financeCurrencyGetText() {
        sleep(1000);
        return financeCurrency.getText();
    }

    public int walletItemQuantityIsLoaded() {
        return walletItemQuality.size();
    }

    public void clickOnAddWalletButton() {
         addWalletButton.click();
    }

    public DitexCardsPage clickOnCardsTab() {
        cardsTab.click();
        return new DitexCardsPage(webDriver);
    }

    public void clickOnAddItemWallet() {
        waitUntilElementIsAppear(walletItem);
        addItemWallet.click();
    }

    public DitexWalletDetailsPage clickOnWalletItem() {
        walletItem.click();
        return new DitexWalletDetailsPage(webDriver);
    }

    public DitexWalletDetailsPage clickOnWalletItemUSDT() {
        waitUntilElementIsAppear(walletItemUSDT);
        walletItemUSDT.click();
        return new DitexWalletDetailsPage(webDriver);
    }

    public DitexWalletDetailsPage clickOnWalletItemETH() {
        waitUntilElementIsAppear(walletItemETH);
        walletItemETH.click();
        return new DitexWalletDetailsPage(webDriver);
    }

    public void createNewWallet(String name, String number) {
        walletName.click();
        walletName.sendKeys(name);
        walletNumber.click();
        walletNumber.sendKeys(number);
        saveButton.click();
    }

    private void beforeChoose() {
        waitUntilElementIsAppear(currencySelector);
        currencySelector.click();
    }

    public void chooseBTCCurrency() {
        beforeChoose();
        BTC.click();
    }

    public void chooseETHCurrency() {
        beforeChoose();
        ETH.click();
    }

    public void chooseUSDCCurrency() {
        beforeChoose();
        USDC.click();
    }

    public void chooseUSDTCurrency() {
        beforeChoose();
        USDT.click();
    }

    public void clickOnFilterCurrency() {
        waitUntilElementIsAppear(walletItem);
        filterCurrency.click();
    }

    public void clickOnBTCFilter() {
        waitUntilElementIsAppear(BTCFilter);
        BTCFilter.click();
    }

    public void clickOnETHFilter() {
        waitUntilElementIsAppear(ETHFilter);
        ETHFilter.click();
    }

    public void clickOnUSDCFilter() {
        waitUntilElementIsAppear(USDCFilter);
        USDCFilter.click();
    }

    public void clickOnUSDTFilter() {
        waitUntilElementIsAppear(USDTFilter);
        USDTFilter.click();
    }
}