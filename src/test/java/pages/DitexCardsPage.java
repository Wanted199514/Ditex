package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DitexCardsPage extends BasePage {
    @FindBy(xpath = "//div[@class='selector-wrapper']/mat-select[contains(@id,'mat-select')]")
    private WebElement filterCurrency;

    @FindBy(xpath = "//div[contains(@class,'add-wallet')]")
    private WebElement addCardButton;

    @FindBy(xpath = "//h2")
    private WebElement window;

    @FindBy(xpath = "//input[@formcontrolname='walletName']")
    private WebElement cardName;

    @FindBy(xpath = "//input[@formcontrolname='receiptAddress']")
    private WebElement cardNumber;

    @FindBy(xpath = "//input[@formcontrolname='fullName']")
    private WebElement fullNameField;

    @FindBy(xpath = "//button/span")
    private WebElement saveButton;

    @FindBy(xpath = "//label[contains(@class,'select-exchange')]")
    private WebElement currencySelector;

    @FindBy(xpath = "//div[contains(@class,'wallet-item--card')]")
    private WebElement cardItem;

    @FindBy(xpath = "//div[contains(@class,'wallet-item--card')]")
    private List<WebElement> cardItemQuality;

    @FindBy(xpath = "//div[contains(@class,'wallet-item--add')]")
    private WebElement addItemCard;

    @FindBy(xpath = "//span[text()='RUB']")
    private WebElement RUB;

    @FindBy(xpath = "//span[text()='EUR']")
    private WebElement EUR;

    @FindBy(xpath = "//div[contains(@class,'wallet-item--missing')]")
    private WebElement walletItemEmpty;

    @FindBy(xpath = "//mat-option/span[contains(text(),'RUB')]")
    private WebElement RUBFilter;

    @FindBy(xpath = "//mat-option/span[contains(text(),'EUR')]")
    private WebElement EURFilter;

    public DitexCardsPage(WebDriver webDriver) {
        initializationWebElements(webDriver);
    }

    public boolean cardsPageIsLoaded() {
        waitUntilElementIsAppear(filterCurrency);
        return webDriver.getCurrentUrl().equals(front + "/wallets-and-cards/cards-list");
    }

    public boolean windowIsLoaded() {
        sleep(1000);
        return window.isDisplayed();
    }

    public boolean cardItemIsLoaded() {
        waitUntilElementIsAppear(cardItem);
        return cardItem.isDisplayed();
    }

    public boolean cardItemEmptyIsLoaded() {
        sleep(1000);
        return walletItemEmpty.isDisplayed();
    }

    public void createNewCard(String name, String number, String fullName) {
        cardName.click();
        cardName.sendKeys(name);
        cardNumber.click();
        cardNumber.sendKeys(number);
        fullNameField.click();
        fullNameField.sendKeys(fullName);
        saveButton.click();
    }

    public void clickOnAddCardButton() {
        addCardButton.click();
    }

    public DitexCardsDetailsPage clickOnCardItem() {
        cardItem.click();
        return new DitexCardsDetailsPage(webDriver);
    }

    public int cardItemQuantityIsLoaded() {
        return cardItemQuality.size();
    }

    public void chooseRUBCurrency() {
        currencySelector.click();
        RUB.click();
    }
    public void chooseEURCurrency() {
        currencySelector.click();
        EUR.click();
    }

    public void clickOnFilterCurrency() {
        waitUntilElementIsAppear(cardItem);
        filterCurrency.click();
    }

    public void clickOnRUBFilter() {
        waitUntilElementIsAppear(RUBFilter);
        RUBFilter.click();
    }

    public void clickOnEURFilter() {
        waitUntilElementIsAppear(EURFilter);
        EURFilter.click();
    }

    public void clickOnAddItemCard() {
        waitUntilElementIsAppear(cardItem);
        addItemCard.click();
    }
}
