package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DitexAdminRolesPage extends BasePage {
    @FindBy(xpath = "//div[@class='table-cell']")
    private WebElement tableAdmins;

    @FindBy(xpath = "//button")
    private WebElement createAdminButton;

    @FindBy(xpath = "//div/form/button")
    private WebElement createAdminButtonInWindow;

    @FindBy(xpath = "//div/form/button[contains(@class,'disabled')]")
    private WebElement createAdminDisabledButton;

    @FindBy(xpath = "//h3[text()='Создание нового пользователя']")
    private WebElement createAdminWindow;

    @FindBy(xpath = "//input[@type='email']")
    private WebElement emailField;

    @FindBy(xpath = "//input[@type='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//mat-select[@placeholder='Роль']")
    private WebElement roleField;

    @FindBy(xpath = "//mat-option[@id='mat-option-1']")
    private WebElement administrationRole;

    @FindBy(xpath = "//mat-option[@id='mat-option-2']")
    private WebElement managerRole;

    @FindBy(xpath = "//mat-option[@id='mat-option-3']")
    private WebElement userRole;

    @FindBy(xpath = "//input[@formcontrolname='firstName']")
    private WebElement firstNameField;

    @FindBy(xpath = "//input[@formcontrolname='lastName']")
    private WebElement lastNameField;

    @FindBy(xpath = "//div[text()='auto@auto.auto']")
    private WebElement newAdminAccount;

    @FindBy(xpath = "//div[contains(@class,'cdk-overlay-backdrop')][2]")
    private WebElement voidButton;

    public DitexAdminRolesPage(WebDriver webDriver) {
        initializationWebElements(webDriver);
    }

    public boolean ditexAdminRolesPageIsLoaded() {
        waitUntilElementIsAppearForAdmin(tableAdmins);
        return webDriver.getCurrentUrl().equals(admin + "/roles");
    }

    public boolean tableAdmins() {
        waitUntilElementIsAppearForAdmin(tableAdmins);
        return tableAdmins.isDisplayed();
    }

    public boolean createAdminWindowIsLoaded() {
        return createAdminWindow.isDisplayed();
    }

    public boolean createAdminButtonIsDisabled() {
        return createAdminDisabledButton.isDisplayed();
    }

    public boolean newAdminAccountIsLoaded() {
        waitUntilElementIsAppear(newAdminAccount);
        return newAdminAccount.isDisplayed();
    }

    public void clickOnCreateAdminButton() {
        createAdminButton.click();
    }

    public void clickOnCreateAdminButtonInWindow() {
        createAdminButtonInWindow.click();
    }

    private void chooseAdministratorRole() {
        roleField.click();
        administrationRole.click();
        voidButton.click();
    }

    private void chooseManagerRole() {
        roleField.click();
        managerRole.click();
        voidButton.click();
    }

    private void chooseUserRole() {
        roleField.click();
        userRole.click();
        voidButton.click();
    }

    public void createAdminUser(String email, String password, String firstName, String lastName) {
        emailField.click();
        emailField.sendKeys(email);
        passwordField.click();
        passwordField.sendKeys(password);
        firstNameField.click();
        firstNameField.sendKeys(firstName);
        lastNameField.click();
        lastNameField.sendKeys(lastName);
    }

    public void createAdminWithAdminRole(String email, String password, String firstName, String lastName) {
        chooseAdministratorRole();
        createAdminUser(email,password,firstName,lastName);
    }

    public void createAdminWithManagerRole(String email, String password, String firstName, String lastName) {
        chooseManagerRole();
        createAdminUser(email,password,firstName,lastName);
    }

    public void createAdminWithUserRole(String email, String password, String firstName, String lastName) {
        chooseUserRole();
        createAdminUser(email,password,firstName,lastName);
    }
}
