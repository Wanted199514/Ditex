package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DitexAdminOrdersPage extends BasePage {
    @FindBy(xpath = "//div[@class='table-body']")
    private WebElement table;

    @FindBy(xpath = "//a[@class='tab-title link-opacity'][1]")
    private WebElement activeTab;

    @FindBy(xpath = "//a[@class='tab-title link-opacity'][2]")
    private WebElement historyTab;

    @FindBy(xpath = "//a[@class='tab-title link-opacity'][3]")
    private WebElement declinedTab;

    @FindBy(xpath = "//a[@class='tab-title link-opacity'][4]")
    private WebElement hedgTab;

    @FindBy(xpath = "//a[@href='/mobi/transactions']/span")
    private WebElement mobimoneyButton;

    @FindBy(xpath = "//a[@href='/markets']/span")
    private WebElement currentAssetsButton;

    @FindBy(xpath = "//a[@href='/currencies']/span")
    private WebElement currenciesButton;

    @FindBy(xpath = "//a[@href='/accounts']/span")
    private WebElement accountsButton;

    @FindBy(xpath = "//a[@href='/roles']/span")
    private WebElement adminRolesButton;

    @FindBy(xpath = "//input[contains(@placeholder,'ID')]")
    private WebElement searchField;

    ////div[@class='search-wrapper']/input

    @FindBy(xpath = "//div[@class='mat-select-value']/span")
    private WebElement usernameButton;

    @FindBy(xpath = "//span[@class='mat-option-text']")
    private WebElement exitButton;

    @FindBy(xpath = "//h2")
    private WebElement window;

    @FindBy(xpath = "//button[@class='btn btn-default mat-button']")
    private WebElement okButton;

    public DitexAdminOrdersPage(WebDriver webDriver) {
        initializationWebElements(webDriver);
    }

    public boolean ditexAdminLoginPageIsLoaded() {
        waitUntilElementIsAppearForAdmin(searchField);
        return webDriver.getCurrentUrl().equals(admin + "/orders");
    }

    public boolean tableIsLoaded() {
        waitUntilElementIsAppearForAdmin(table);
        return table.isDisplayed();
    }

    public boolean windowIsLoaded() {
        return window.isDisplayed();
    }

    public void clickOnActiveTab() {
        activeTab.click();
    }

    public void clickOnHistoryTab() {
        historyTab.click();
    }

    public void clickOnDeclinedTab() {
        declinedTab.click();
    }

    public void clickOnHedgTab() {
        hedgTab.click();
    }

    public DitexAdminMobimoneyPage clickOnMobimoneyButton() {
        mobimoneyButton.click();
        return new DitexAdminMobimoneyPage(webDriver);
    }

    public DitexAdminCurrentAssetsPage clickOnCurrentAssetsButton() {
        currentAssetsButton.click();
        return new DitexAdminCurrentAssetsPage(webDriver);
    }

    public DitexAdminCurrenciesPage clickOnCurrenciesButton() {
        currenciesButton.click();
        return new DitexAdminCurrenciesPage(webDriver);
    }

    public DitexAdminAccountsPage clickOnAccountsButton() {
        accountsButton.click();
        return new DitexAdminAccountsPage(webDriver);
    }

    public DitexAdminRolesPage clickOnAdminRolesButton() {
        adminRolesButton.click();
        return new DitexAdminRolesPage(webDriver);
    }

    public void searchIDOrReceiver(String text) {
        searchField.click();
        searchField.sendKeys(text);
        searchField.sendKeys(Keys.ENTER);
    }

    public void clickOnUsernameButton() {
        usernameButton.click();
    }

    public void clickOnExitButton() {
        exitButton.click();
    }

    public void clickOnOkButton() {
        okButton.click();
    }
}
