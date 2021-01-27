package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DitexCardsDetailsPage extends BasePage {
    @FindBy(xpath = "//button[1]")
    private WebElement changeDataButton;

    @FindBy(xpath = "//button[2]")
    private WebElement deleteCardButton;

    @FindBy(xpath = "//h2")
    private WebElement window;

    @FindBy(xpath = "//button[@class='btn btn-default mat-button']")
    private WebElement okButton;

    @FindBy(xpath = "//button[@class='btn btn-default mat-button ng-star-inserted']")
    private WebElement cancelButton;

    @FindBy(xpath = "//input[@formcontrolname='walletName']")
    private WebElement cardName;

    @FindBy(xpath = "//input[@formcontrolname='receiptAddress']")
    private WebElement cardNumber;

    @FindBy(xpath = "//input[@formcontrolname='fullName']")
    private WebElement fullNameField;

    @FindBy(xpath = "//button[contains(@class,'btn')]")
    private WebElement saveButton;

    @FindBy(xpath = "//mat-select[contains(@class,'selected')]")
    private WebElement currencySelector;

    @FindBy(xpath = "//div[contains(@class,'wallet-item--card')]")
    private WebElement cardItem;

    @FindBy(xpath = "//div[contains(@class,'wallet-item--add')]")
    private WebElement addItem;

    @FindBy(xpath = "//span[text()='RUB']")
    private WebElement RUB;

    @FindBy(xpath = "//span[text()='EUR']")
    private WebElement EUR;

    @FindBy(xpath = "//span[text()='MM']")
    private  WebElement monthSelector;

    @FindBy(xpath = "//span[text()='YY']")
    private WebElement yearSelector;

    @FindBy(xpath = "//span[text()='04']")
    private WebElement zeroFourNumber;

    @FindBy(xpath = "//span[text()='21']")
    private WebElement twentyOneNumber;

    @FindBy(xpath = "//div[@class='top-title']")
    private WebElement cardNameText;

    @FindBy(xpath = "//div[@class='card-number']")
    private WebElement cardNumberText;

    @FindBy(xpath = "//div[@class='currency ng-star-inserted']")
    private WebElement currencyText;

    @FindBy(xpath = "//div[@class='cardholder gray-block']")
    private WebElement cardHolder;

    @FindBy(xpath = "//div[@class='expire month gray-block']")
    private WebElement monthText;

    @FindBy(xpath = "//div[@class='expire year gray-block']")
    private WebElement yearText;

    public DitexCardsDetailsPage(WebDriver webDriver) {
        initializationWebElements(webDriver);
    }

    public boolean cardDetailsIsLoaded() {
        return webDriver.getCurrentUrl().contains(front + "/wallets-and-cards/cards-list/RUB/");
    }

    public boolean windowIsLoaded() {
        sleep(1000);
        return window.isDisplayed();
    }

    public String cardNameText() {
        return cardNameText.getText();
    }

    public String cardNumberText() {
        return cardNumberText.getText();
    }

    public String currencyText() {
        return currencyText.getText();
    }

    public String cardHolder() {
        return cardHolder.getText();
    }

    public String monthText() {
        return monthText.getText();
    }

    public String yearText() {
        return yearText.getText();
    }

    public void clickOnChangeDataButton() {
        waitUntilElementIsAppear(changeDataButton);
        changeDataButton.click();
    }

    public void clickOnDeleteCardButton() {
        waitUntilElementIsAppear(deleteCardButton);
        deleteCardButton.click();
    }

    public void clickOnOkButton() {
        waitUntilElementIsAppear(okButton);
        okButton.click();
    }

    public void clickOnCancelButton() {
        waitUntilElementIsAppear(cancelButton);
        cancelButton.click();
    }

    public void changeCard(String name, String number, String fullName) {
        currencySelector.click();
        EUR.click();
        cardName.click();
        cardName.clear();
        cardName.sendKeys(name);
        cardNumber.click();
        cardNumber.clear();
        cardNumber.sendKeys(number);
        fullNameField.click();
        fullNameField.clear();
        fullNameField.sendKeys(fullName);
        monthSelector.click();
        zeroFourNumber.click();
        yearSelector.click();
        twentyOneNumber.click();
        saveButton.click();
        sleep(1000);
    }
}
