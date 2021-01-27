package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DitexFinancePage extends BasePage {
    @FindBy(xpath = "//label/div[text()='EUR']")
    private WebElement EUR;

    @FindBy(xpath = "//label/div[text()='RUB']")
    private WebElement RUB;

    @FindBy(xpath = "//label/div[text()='USD']")
    private WebElement USD;

    @FindBy(xpath = "//button")
    private WebElement resetButton;

    public DitexFinancePage(WebDriver webDriver) {
        initializationWebElements(webDriver);
    }

    public boolean financePageIsLoaded() {
        return webDriver.getCurrentUrl().equals(front + "/profile/settings");
    }

    public boolean currenciesIsLoaded() {
        waitUntilElementIsAppear(EUR);
        return EUR.isDisplayed()
                && RUB.isDisplayed()
                && USD.isDisplayed();
    }

    public void clickOnEUR() {
        EUR.click();
    }

    public void clickOnRUB() {
        RUB.click();
    }

    public void clickOnUSD() {
        USD.click();
    }

    public void clickOnResetButton() {
        resetButton.click();
    }

}
