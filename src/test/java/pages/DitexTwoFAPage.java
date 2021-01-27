package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DitexTwoFAPage extends BasePage {

    @FindBy(xpath = "//div[@class='mat-slide-toggle-thumb']")
    private WebElement twoFASwitcher;

    @FindBy(xpath = "//a[contains(@href,'play.google.com')]/button")
    private WebElement googlePlayButton;

    @FindBy(xpath = "//a[contains(@href,'apps.apple.com')]/button")
    private WebElement appStoreButton;

    @FindBy(xpath = "//h2")
    private WebElement windowIsLoaded;

    @FindBy(xpath = "//button[contains(@class,'btn')][1]")
    private WebElement okButton;

    @FindBy(xpath = "//button[contains(@class,'btn')][2]")
    private WebElement cancelButton;

    @FindBy(xpath = "//img[@alt='qr-code']")
    private WebElement qrCode;

    @FindBy(xpath = "//input[@formcontrolname='googleCode']")
    private WebElement enterCodeField;

    @FindBy(xpath = "//button[contains(@class,'btn')]")
    private WebElement saveButton;

    @FindBy(xpath = "//div[@class='error-text']")
    private WebElement errorMessage;

    public DitexTwoFAPage(WebDriver webDriver) {
        initializationWebElements(webDriver);
    }

    public boolean twoFAPageIsLoaded() {
        return webDriver.getCurrentUrl().equals(front + "/profile/google-2fa");
    }

    public boolean twoFASwitcherIsLoaded() {
        return twoFASwitcher.isDisplayed();
    }

    public boolean googlePlayButtonIsLoaded() {
        return googlePlayButton.isDisplayed();
    }

    public boolean appStoreButtonIsLoaded() {
        return appStoreButton.isDisplayed();
    }

    public boolean twoFAWindowIsLoaded() {
        return windowIsLoaded.isDisplayed()
                && okButton.isDisplayed()
                && cancelButton.isDisplayed();
    }

    public boolean qrCodeIsLoaded() {
        waitUntilElementIsAppear(qrCode);
        return qrCode.isDisplayed();
    }

    public boolean enterCodeFieldIsLoaded() {
        return enterCodeField.isDisplayed();
    }

    public boolean saveButtonIsLoaded() {
        return saveButton.isDisplayed();
    }

    public String errorMessageIsLoaded() {
        sleep(500);
        return errorMessage.getText();
    }

    public void clickOnTwoFASwitcher() {
        twoFASwitcher.click();
    }

    public void clickOnOkButton() {
        okButton.click();
    }

    public void clickOnSaveButton(String code) {
        enterCodeField.click();
        enterCodeField.sendKeys(code);
        saveButton.click();
    }
}
