package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DitexAdminAccountsPage extends BasePage {
    @FindBy(xpath = "//div[contains(@class,'table-row')]")
    private WebElement tableAccounts;

    @FindBy(xpath = "//div[contains(@class,'ng-star-inserted')]/div[@class='table-cell'][1]")
    private WebElement emailAccounts;

    @FindBy(xpath = "//div[contains(@class,'ng-star-inserted')]/div[@class='table-cell'][1]")
    private List<WebElement> emailAccountsQuantity;

    @FindBy(xpath = "//div[contains(@class,'ng-star-inserted')]/div[@class='table-cell'][2]")
    private WebElement historyOrdersButton;

    @FindBy(xpath = "//input[contains(@class,'search-input')]")
    private WebElement searchField;

    @FindBy(xpath = "//div[@class='table-wrap ng-star-inserted']")
    private WebElement historyOrdersTable;

    @FindBy(xpath = "//h3[text()='Заявка пользователя']")
    private WebElement orderDelailsWindow;

    @FindBy(xpath = "//div[2]/div/button/img[@class='btn-to-open']")
    private WebElement orderDetailsButton;

    public DitexAdminAccountsPage(WebDriver webDriver) {
        initializationWebElements(webDriver);
    }

    public boolean ditexAdminAccountsPageIsLoaded() {
        return webDriver.getCurrentUrl().equals(admin + "/accounts");
    }

    public boolean tableAccountsIsLoaded() {
        waitUntilElementIsAppearForAdmin(tableAccounts);
        return tableAccounts.isDisplayed();
    }

    public int emailAccountsSum() {
        return emailAccountsQuantity.size();
    }

    public String emailAccountsGetText() {
        return emailAccounts.getText();
    }

    public boolean historyOrdersTableIsLoaded() {
        return historyOrdersTable.isDisplayed();
    }

    public boolean orderDetailWindowIsLoaded() {
        sleep(2000);
        return orderDelailsWindow.isDisplayed();
    }

    public void searchEmail(String email) {
        searchField.click();
        searchField.sendKeys(email);
        searchField.sendKeys(Keys.ENTER);
        waitUntilElementIsAppear(emailAccounts);
    }

    public void clickOnHistoryOrdersButton() {
        historyOrdersButton.click();
        sleep(1000);
    }

    public void clickOnOrderDetailsButton() {
        orderDetailsButton.click();
    }
}