package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DitexOTCTradingPage extends BasePage {
    @FindBy(xpath = "//input[@formcontrolname='name']")
    private WebElement nameField;

    @FindBy(xpath = "//input[@formcontrolname='phone']")
    private WebElement phoneNumberField;

    @FindBy(xpath = "//input[@formcontrolname='email']")
    private WebElement emailField;

    @FindBy(xpath = "//h2")
    private WebElement window;

    @FindBy(xpath = "//button")
    private WebElement sendButton;

    @FindBy(xpath = "//input[@formcontrolname='amountFrom']")
    private WebElement sumField;

    @FindBy(xpath = "//div[@class='error-text']")
    private WebElement errorText;

    public DitexOTCTradingPage(WebDriver webDriver) {
        initializationWebElements(webDriver);
    }

    public boolean otcTradingPageIsLoaded() {
        sleep(2000);
        return webDriver.getCurrentUrl().equals(front + "/otc-trading");
    }

    public boolean windowIsLoaded() {
        sleep(1000);
        return window.isDisplayed();
    }

    public boolean errorTextIsLoaded() {
        return  errorText.isDisplayed();
    }

    public void yourDataForConnection(String nameAndLastName, String phoneNumber, String email,String sum) {
        nameField.click();
        nameField.sendKeys(nameAndLastName);
        phoneNumberField.click();
        phoneNumberField.sendKeys(phoneNumber);
        emailField.click();
        emailField.sendKeys(email);
        sumField.click();
        sumField.sendKeys(sum);
        sendButton.click();
    }

    public void yourDataForConnectionWithoutPLUSInPhoneField(String nameAndLastName, String phoneNumber, String email,String sum) {
        nameField.click();
        nameField.sendKeys(nameAndLastName);
        phoneNumberField.click();
        phoneNumberField.sendKeys(Keys.BACK_SPACE + phoneNumber);
        emailField.click();
        emailField.sendKeys(email);
        sumField.click();
        sumField.sendKeys(sum);
        sendButton.click();
    }
}
