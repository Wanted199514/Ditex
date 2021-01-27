package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class DitexAdminMobimoneyPage extends BasePage {
    @FindBy(xpath = "//a[@routerlink='/mobi/passports']")
    private WebElement passportsTab;

    @FindBy(xpath = "//a[@routerlink='/mobi/withdraw']")
    private WebElement withdrawMoneyTab;

    @FindBy(xpath = "//div[@class='filter-wrapper']/b[1]")
    private WebElement inCompletedTransactionsNumber;

    @FindBy(xpath = "//div[@class='filter-wrapper']/b[2]")
    private WebElement allTransactionsNumber;

    @FindBy(xpath = "//img[@class='calendar']")
    private WebElement chooseCalendarDatesRangeField;

    @FindBy(xpath = "//div[@class='md-drppicker drops-down-auto ltr shown double']/div[4]/div/button")
    private WebElement calendarApplyButton;

    @FindBy(xpath = "//div[1]/div/button/img[@class='btn-to-open']")
    private WebElement orderDetailsButton;

    @FindBy(xpath = "//button[@class='csv text-blue']")
    private WebElement downloadCSVButton;

    @FindBy(xpath = "//div/div/div/span")
    private WebElement backButton;

    @FindBy(xpath = "//div/p")
    private WebElement usernameField;

    @FindBy(xpath = "//div[contains(@class,'table-row row-with-id ')][1]")
    private WebElement mobimoneyOrder;

    @FindBy(xpath = "//div[contains(@class,'table-row row-with-id ')]")
    private WebElement orderList;

    @FindBy(xpath = "//div[contains(@class,'id')]/div[contains(@class,'cell-id')]")
    private WebElement orderIDText;

    @FindBy(xpath = "//div[contains(@class,'id')]/div[contains(@class,'cell')][3]")
    private WebElement accountText;

    @FindBy(xpath = "//div[contains(@class,'id')]/div[contains(@class,'cell')][4]")
    private WebElement dateText;

    @FindBy(xpath = "//div[contains(@class,'id')]/div[contains(@class,'cell')][5]")
    private WebElement exchangeAmountText;

    @FindBy(xpath = "//div[contains(@class,'status-indicator')]")
    private WebElement statusIndicator;

    @FindBy(xpath = "//div[1]/div[@class='item'][1]/div[@class='item-value']")
    private WebElement orderIDField;

    @FindBy(xpath = "//div[1]/div[@class='item'][2]/div[@class='item-value']")
    private WebElement emailField;

    @FindBy(xpath = "//div[1]/div[@class='item'][4]/div[@class='item-value']")
    private WebElement depositWalletField;

    @FindBy(xpath = "//div[1]/div[@class='item'][5]/div[@class='item-value']")
    private WebElement pairField;

    @FindBy(xpath = "//div[2]/div[@class='item'][1]/div[@class='item-value']")
    private WebElement marketField;

    @FindBy(xpath = "//div[2]/div[@class='item'][2]/div[@class='item-value']")
    private WebElement exchangeAmountField;

    @FindBy(xpath = "//div[2]/div[@class='item'][3]/div[@class='item-value']")
    private WebElement totalFeeField;

    @FindBy(xpath = "//div[2]/div[@class='item'][4]/div[@class='item-value']")
    private WebElement exchangeRateField;

    @FindBy(xpath = "//div[2]/div[@class='item'][5]/div[@class='item-value']")
    private WebElement receiverField;

    @FindBy(xpath = "//div[2]/div[@class='item'][6]/div[@class='item-value']")
    private WebElement amountReceivedField;

    @FindBy(xpath = "//button[contains(@class,'add-passport')]")
    private WebElement addPassportButton;

    @FindBy(xpath = "//div[@class='balance'][1]/b")
    private WebElement availableNumber;

    @FindBy(xpath = "//div[@class='balance'][2]/b")
    private WebElement totalLimitNumber;

    @FindBy(xpath = "//div[contains(@class,'id')]/div[contains(@class,'cell')][1]")
    private WebElement nameField;

    @FindBy(xpath = "//div[contains(@class,'id')]/div[contains(@class,'cell')][2]")
    private WebElement passportNumberText;

    @FindBy(xpath = "//div[contains(@class,'id')]/div[contains(@class,'cell')][3]")
    private WebElement phoneNumberText;

    @FindBy(xpath = "//div[contains(@class,'id')]/div[contains(@class,'cell')][4]")
    private WebElement passportStatusIndicatorAllText;

    @FindBy(xpath = "//div[contains(@class,'id')]/div[contains(@class,'cell')][5]")
    private WebElement passportAvailableNumberText;

    @FindBy(xpath = "//span[contains(@class,'status-indicator')]")
    private WebElement passportStatusIndicatorText;

    @FindBy(xpath = "//input[@placeholder='Имя']")
    private WebElement passportNameText;

    @FindBy(xpath = "//input[@placeholder='Фамилия']")
    private WebElement passportSurnameText;

    @FindBy(xpath = "//input[@placeholder='Отчество']")
    private WebElement passportPatronymicText;

    @FindBy(xpath = "//input[@placeholder='Серия и номер паспорта ']")
    private WebElement passportSeriesAndPassportNumberText;

    @FindBy(xpath = "//input[@placeholder='Номер СНИЛС']")
    private WebElement passportSNILSNumberText;

    @FindBy(xpath = "//input[@placeholder='Телефон (Россия)']")
    private WebElement passportPhoneNumberText;

    @FindBy(xpath = "//button[contains(@class,'delete-btn')]")
    private WebElement deletePassportButton;

    @FindBy(xpath = "//div[@class='description']/b")
    private WebElement availableNumberText;

    @FindBy(xpath = "//input[@formcontrolname='firstName']")
    private WebElement passportNameField;

    @FindBy(xpath = "//input[@formcontrolname='lastName']")
    private WebElement passportLastnameField;

    @FindBy(xpath = "//input[@formcontrolname='middleName']")
    private WebElement passportMiddleNameField;

    @FindBy(xpath = "//input[@formcontrolname='phoneNumber']")
    private WebElement passportPhoneNumberField;

    @FindBy(xpath = "//input[@formcontrolname='docSer']")
    private WebElement passportSeriesField;

    @FindBy(xpath = "//input[@formcontrolname='docNumber']")
    private WebElement passportNumberField;

    @FindBy(xpath = "//input[@formcontrolname='snils']")
    private WebElement passportSnilsField;

    @FindBy(xpath = "//button[@class='btn btn-default mat-button']")
    private WebElement saveButton;

    @FindBy(xpath = "//div[contains(@class,'link')]/span")
    private WebElement withdrawMoneyBackButton;

    @FindBy(xpath = "//div[@class='text-blue total-sum']")
    private WebElement totalWithdrawnNumberText;

    @FindBy(xpath = "//div[@class='info']/span")
    private WebElement totalWithdrawnNumberTextInside;

    @FindBy(xpath = "//input[@placeholder='Введите или выберите карту']")
    private WebElement inputAndChooseCardField;

    @FindBy(xpath = "//div[@class='mat-checkbox-inner-container']")
    private WebElement saveCheckbox;

    @FindBy(xpath = "//input[@placeholder='Введите сумму']")
    private WebElement inputNumberField;

    @FindBy(xpath = "//input[@placeholder='Введите ID заявки']")
    private WebElement inputOrderID;

    @FindBy(xpath = "//textarea[@placeholder='Введите комментарий']")
    private WebElement inputTextField;

    @FindBy(xpath = "//span[@class='mat-button-wrapper']")
    private WebElement confirmButton;

    @FindBy(xpath = "//div[@class='withdraw-details']/div[1]")
    private WebElement withdrawDetailsCardText;

    @FindBy(xpath = "//div[@class='withdraw-details']/div[2]")
    private WebElement withdrawDetailsMoneyText;

    @FindBy(xpath = "//div[@class='withdraw-details']/div[3]")
    private WebElement withdrawDetailsOrderIDText;

    @FindBy(xpath = "//button[1]/span[@class='mat-button-wrapper']")
    private WebElement withdrawButton;

    @FindBy(xpath = "//button[2]/span[@class='mat-button-wrapper']")
    private WebElement cancelButton;

    public DitexAdminMobimoneyPage(WebDriver webDriver) {
        initializationWebElements(webDriver);
    }

    public boolean ditexAdminMobimoneyTransactionsIsLoaded() {
        return webDriver.getCurrentUrl().equals(admin + "/mobi/transactions");
    }

    public boolean ditexAdminMobimoneyPassportsIsLoaded() {
        return webDriver.getCurrentUrl().equals(admin + "/mobi/passports");
    }

    public boolean ditexAdminMobimoneyWithdrawMoneyIsLoaded() {
        return webDriver.getCurrentUrl().equals(admin + "/mobi/withdraw");
    }

    public boolean ordersIsLoaded() {
        waitUntilElementIsAppear(orderList);
        return orderList.isDisplayed();
    }

    public void clickOnOrderDetailsButton() {
        Actions actions = new Actions(webDriver);
        actions.moveToElement(mobimoneyOrder);
        actions.perform();
        waitUntilElementIsAppear(orderDetailsButton);
        orderDetailsButton.click();
    }

    public boolean orderDetailsIsLoaded() {
        waitUntilElementIsAppear(orderIDField);
        return orderIDField.isDisplayed();
    }
}
