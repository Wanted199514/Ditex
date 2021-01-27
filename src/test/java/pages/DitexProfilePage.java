package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DitexProfilePage extends BasePage {

    @FindBy(xpath = "//div[@translate='profile_page.enter_info']")
    private WebElement profileTab;

    @FindBy(xpath = "//p[@translate='login.change_email.change_email']")
    private WebElement changeEmailButton;

    @FindBy(xpath = "//h2[@translate='login.change_email.new_email_header']")
    private WebElement changeEmailWindow;

    @FindBy(xpath = "//input[@formcontrolname='newEmail']")
    private WebElement newEmailField;

    @FindBy(xpath = "//p[@translate='login.change_pass.change_password']")
    private WebElement changePasswordButton;

    @FindBy(xpath = "//div[@translate='profile_page.two_step_auth']")
    private WebElement twoFATab;

    @FindBy(xpath = "//div[@translate='profile_page.verification']")
    private WebElement personVerificationTab;

    @FindBy(xpath = "//div[@translate='profile_page.finance']")
    private WebElement financeTab;

    @FindBy(xpath = "//div[@class='code-container']")
    private WebElement keyText;

    @FindBy(xpath = "//button[1]/span[@class='mat-button-wrapper']")
    private WebElement copyKeyButton;

    @FindBy(xpath = "//button[2]/span[@class='mat-button-wrapper']")
    private WebElement resetKeyButton;

    @FindBy(xpath = "//h2[@translate='login.change_pass.change_password']")
    private WebElement changePasswordWindow;

    @FindBy(xpath = "//input[@formcontrolname='oldPassword']")
    private WebElement yourCurrentPasswordField;

    @FindBy(xpath = "//input[@formcontrolname='newPassword']")
    private WebElement newPasswordField;

    @FindBy(xpath = "//button[contains(@class,'btn btn-default mat-button')]")
    private WebElement sendButton;

    @FindBy(xpath = "//pre[@translate][1]")
    private WebElement correctChangeMessage;

    @FindBy(xpath = "//div[@class='error-text'][1]")
    private WebElement errorMessage;

    @FindBy(xpath = "//img[@alt='Scan me!']")
    private WebElement qrCode;

    @FindBy(xpath = "//div[@class='logout']")
    private WebElement logOutButton;

    @FindBy(xpath = "//h2")
    private WebElement window;

    @FindBy(xpath = "//button[contains(@class,'btn')][1]")
    private WebElement okButton;

    @FindBy(xpath = "//button[contains(@class,'btn')][2]")
    private WebElement cancelButton;

    public DitexProfilePage(WebDriver webDriver) {
        initializationWebElements(webDriver);
    }

    public boolean profilePageIsLoaded() {
        waitUntilElementIsAppear(twoFATab);
        return webDriver.getCurrentUrl().contains(front + "/profile");
    }

    public boolean changeEmailIsLoaded() {
        waitUntilElementIsAppear(changeEmailButton);
        return changeEmailButton.isDisplayed();
    }

    public boolean changePasswordIsLoaded() {
        waitUntilElementIsAppear(changePasswordButton);
        return changePasswordButton.isDisplayed();
    }

    public boolean qrCodeIsLoaded() {
        waitUntilElementIsAppear(qrCode);
        return qrCode.isDisplayed();
    }

    public boolean copyKeyButtonIsLoaded() {
        waitUntilElementIsAppear(copyKeyButton);
        return copyKeyButton.isDisplayed();
    }

    public boolean resetKeyButtonIsLoaded() {
        waitUntilElementIsAppear(resetKeyButton);
        return resetKeyButton.isDisplayed();
    }

    public boolean keyTextIsLoaded() {
        waitUntilElementIsAppear(keyText);
        return keyText.isDisplayed();
    }

    public String keyGetText() {
        return keyText.getText();
    }

    public boolean changeEmailWindowIsLoaded() {
        waitUntilElementIsAppear(changeEmailWindow);
        return changeEmailWindow.isDisplayed()
                && newEmailField.isDisplayed();
    }

    public boolean windowIsLoaded() {
        sleep(1000);
        return window.isDisplayed();
    }

    public void chooseNewEmail(String email) {
        newEmailField.click();
        newEmailField.sendKeys(email);
        sendButton.click();
    }

    public boolean changePasswordWindowIsLoaded() {
        waitUntilElementIsAppear(changePasswordWindow);
        return changePasswordWindow.isDisplayed()
                && yourCurrentPasswordField.isDisplayed()
                && newPasswordField.isDisplayed()
                && sendButton.isDisplayed();
    }

    public void changePassword(String oldPassword,String newPassword) {
        yourCurrentPasswordField.click();
        yourCurrentPasswordField.sendKeys(oldPassword);
        newPasswordField.click();
        newPasswordField.sendKeys(newPassword);
        sendButton.click();
    }

    public void clickOnChangeEmailButton() {
        changeEmailButton.click();
    }

    public void clickOnChangePasswordButton() {
        changePasswordButton.click();
    }

    public void clickOnOkButton() {
        sleep(2000);
        okButton.click();
    }

    public DitexTwoFAPage clickOnTwoFATab() {
        twoFATab.click();
        return new DitexTwoFAPage(webDriver);
    }

    public DitexPersonVerificationPage clickOnPersonVerificationTab() {
        personVerificationTab.click();
        return new DitexPersonVerificationPage(webDriver);
    }

    public DitexFinancePage clickOnFinanceTab() {
        financeTab.click();
        return new DitexFinancePage(webDriver);
    }

    public void clickOnLogOutButton() {
        waitUntilElementIsAppear(logOutButton);
        logOutButton.click();
    }

    public void clickOnResetKeyButton() {
        resetKeyButton.click();
        sleep(1000);
    }
}