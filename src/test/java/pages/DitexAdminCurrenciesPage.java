package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DitexAdminCurrenciesPage extends BasePage {
    @FindBy(xpath = "//div[@class='exchanges-row ng-star-inserted']")
    private WebElement tablePairs;

    @FindBy(xpath = "//div[@class='table-row edited-row ng-star-inserted']")
    private WebElement tableComissions;

    @FindBy(xpath = "//a[@href='/currencies/fees']")
    private WebElement comissionsTab;

    @FindBy(xpath = "//form[contains(@class,'table-row')]")
    private WebElement tableLimits;

    @FindBy(xpath = "//a[@href='/currencies/limits']")
    private WebElement limitsTab;

    @FindBy(xpath = "//div[1]/div/input")
    private WebElement comissionField;

    @FindBy(xpath = "//div[1]/div/button[1]")
    private WebElement confirmComissionChangeButton;

    public DitexAdminCurrenciesPage(WebDriver webDriver) {
        initializationWebElements(webDriver);
    }

    public boolean ditexAdminCurrenciesPageIsLoaded() {
        waitUntilElementIsAppearForAdmin(limitsTab);
        return webDriver.getCurrentUrl().equals(admin + "/currencies");
    }

    public boolean tablePairsIsLoaded() {
        waitUntilElementIsAppearForAdmin(tablePairs);
        return tablePairs.isDisplayed();
    }

    public boolean comissionPageIsLoaded() {
        return webDriver.getCurrentUrl().equals(admin + "/currencies/fees");
    }

    public boolean tableComissionIsLoaded() {
        waitUntilElementIsAppearForAdmin(tableComissions);
        return tableComissions.isDisplayed();
    }

    public String comissionFieldIsCorrect() {
        return comissionField.getText();
    }

    public boolean limitsPageIsLoaded() {
        return webDriver.getCurrentUrl().equals(admin + "/currencies/limits");
    }

    public boolean tableLimitsIsLoaded() {
        waitUntilElementIsAppearForAdmin(tableLimits);
        return tableLimits.isDisplayed();
    }

    public void clickOnComissionsTab() {
        comissionsTab.click();
    }

    public void clickOnLimitsTab() {
        limitsTab.click();
    }

    public void changeComission(String number) {
        comissionField.click();
        comissionField.clear();
        comissionField.sendKeys(number);
        confirmComissionChangeButton.click();
        sleep(3000);
    }
}
