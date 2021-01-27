package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DitexAdminLoginPage extends BasePage {
    @FindBy(xpath = "//input[@formcontrolname='username']")
    private WebElement usernameField;

    @FindBy(xpath = "//input[@formcontrolname='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//button")
    private WebElement loginButton;

    @FindBy(xpath = "//div[@class='error-text']")
    private WebElement errorText;

    public DitexAdminLoginPage(WebDriver webDriver) {
        initializationWebElements(webDriver);
    }

    public boolean ditexAdminLoginPageIsLoaded() {
        return webDriver.getCurrentUrl().equals(admin + "/login")
                && loginButton.isDisplayed();
    }

    public DitexAdminOrdersPage login(String username, String password) {
        usernameField.click();
        usernameField.sendKeys(username);
        passwordField.click();
        passwordField.sendKeys(password);
        loginButton.click();
        return new DitexAdminOrdersPage(webDriver);
    }

    public boolean errorTextIsLoaded() {
        waitUntilElementIsAppear(errorText);
        return errorText.isDisplayed();
    }

    public DitexMainPage openFrontSite() {
        webDriver.get(front + "/");
        return new DitexMainPage(webDriver);
    }

    public void openAdminSite() {
        webDriver.get(admin + "/");
    }
}
