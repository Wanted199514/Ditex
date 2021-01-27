package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DitexWalletDetailsPage extends BasePage {
    @FindBy(xpath = "//button[1]")
    private WebElement changeDataButton;

    @FindBy(xpath = "//button[2]")
    private WebElement deleteWalletButton;

    @FindBy(xpath = "//h2")
    private WebElement window;

    @FindBy(xpath = "//button[@class='btn btn-default mat-button']")
    private WebElement okButton;

    @FindBy(xpath = "//button[@class='btn btn-default mat-button ng-star-inserted']")
    private WebElement cancelButton;

    @FindBy(xpath = "//input[@formcontrolname='walletName']")
    private WebElement walletName;

    @FindBy(xpath = "//input[@formcontrolname='receiptAddress']")
    private WebElement walletNumber;

    @FindBy(xpath = "//button[contains(@class,'btn')]")
    private WebElement saveButton;

    @FindBy(xpath = "//mat-select[contains(@class,'selected')]")
    private WebElement currencySelector;

    @FindBy(xpath = "//span[text()='BTC']")
    private WebElement BTC;

    @FindBy(xpath = "//span[text()='ETH']")
    private WebElement ETH;

    @FindBy(xpath = "//span[text()='USDC']")
    private WebElement USDC;

    @FindBy(xpath = "//span[text()='USDT']")
    private WebElement USDT;

    @FindBy(xpath = "//div[@class='top-title']")
    private WebElement walletNameText;

    @FindBy(xpath = "//div[@class='wallet-number']")
    private WebElement walletNumberText;

    @FindBy(xpath = "//div[@class='currency ng-star-inserted']")
    private WebElement currencyText;

    @FindBy(xpath = "//div[contains(@class,'table-row')]/div[@class='row-cell'][1]")
    private WebElement transactionHistory;

    @FindBy(xpath = "//div[contains(@class,'table-row')][1]/div[contains(@class,'row-cell')][2]")
    private WebElement transactionHistoryID;

    @FindBy(xpath = "//div[@class='details-row']")
    private List<WebElement> transactionDetails;

    @FindBy(xpath = "//div[@class='balance active']")
    private WebElement fiatCurrency;

    @FindBy(xpath = "//div[contains(@class,'balance ')]")
    private WebElement cryptoCurrency;

    public DitexWalletDetailsPage(WebDriver webDriver) {
        initializationWebElements(webDriver);
    }

    public boolean walletDetailsIsLoaded() {
        return webDriver.getCurrentUrl().contains(front + "/wallets-and-cards/wallets-list/USDC");
    }

    public boolean windowIsLoaded() {
        return window.isDisplayed();
    }

    public String walletNameText() {
        return walletNameText.getText();
    }

    public String walletNumberText() {
        return walletNameText.getText();
    }

    public String currencyText() {
        return currencyText.getText();
    }

    public boolean transactionHistoryIsLoaded() {
        waitUntilElementIsAppear(transactionHistory);
        return transactionHistory.isDisplayed();
    }

    public int transactionDetailsIsLoaded() {
        return transactionDetails.size();
    }

    public String fiatCurrencyGetText() {
        return  fiatCurrency.getText();
    }

    public void clickOnChangeDataButton() {
        waitUntilElementIsAppear(changeDataButton);
        changeDataButton.click();
    }

    public void clickOnDeleteWalletButton() {
        waitUntilElementIsAppear(deleteWalletButton);
        deleteWalletButton.click();
    }

    public void clickOnOkButton() {
        okButton.click();
    }

    public void clickOnCancelButton() {
        cancelButton.click();
    }

    public void clickOnTransactionHistoryID() {
        transactionHistoryID.click();
    }

    public void clickOnCryptoCurrency() {
        waitUntilElementIsAppear(cryptoCurrency);
        cryptoCurrency.click();
    }

    public void changeWallet(String number) {
        currencySelector.click();
        BTC.click();
        walletName.click();
        walletName.clear();
        walletName.sendKeys("AutoText");
        walletNumber.click();
        walletNumber.clear();
        walletNumber.sendKeys(number);
        saveButton.click();
        sleep(1000);
    }
}
