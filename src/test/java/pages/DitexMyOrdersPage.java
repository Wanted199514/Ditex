package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DitexMyOrdersPage extends BasePage {
    @FindBy(xpath = "//div[contains(@class,'table-row row-with-id')][1]")
    private WebElement newOrder;

    @FindBy(xpath = "//div[contains(@class,'table-row row-with-id')][1]/div[1]/span[2]")
    private WebElement newOrderStatus;

    @FindBy(xpath = "//div[contains(@class,'table-row row-with-id')][1]/div[2]")
    private WebElement newOrderID;

    @FindBy(xpath = "//div[contains(@class,'table-row row-with-id')][1]/div[3]")
    private WebElement newOrderDate;

    @FindBy(xpath = "//div[contains(@class,'table-row row-with-id')][1]/div[4]")
    private WebElement newOrderSumNumber;

    @FindBy(xpath = "//div[contains(@class,'table-row row-with-id')][1]/div[4]/span")
    private WebElement newOrderSumCurrency;

    @FindBy(xpath = "//div[contains(@class,'table-row row-with-id')][1]/div[6]")
    private WebElement newOrderReceiver;

    @FindBy(xpath = "//div[contains(@class,'table-row row-with-id')][1]/div[9]")
    private WebElement newOrderDetailsButton;

    @FindBy(xpath = "//div[contains(@class,'table-row row-with-id')][1]/div[8]")
    private WebElement newOrderRepeatOrderButton;

    @FindBy(xpath = "//div[contains(@class,'link')][2]/span")
    private WebElement repeatOrderDetailsButton;

    @FindBy(xpath = "//a[contains(@class,'link-default')][2]")
    private WebElement createNewOrderButton;

    @FindBy(xpath = "//div[2]/div[@class='item-value pointer']")
    private WebElement orderIDDetails;

    @FindBy(xpath = "//div[4]/div[@class='item-value pointer']")
    private WebElement depositWalletDetails;

    @FindBy(xpath = "//div[1]/div[@class='item-value']")
    private WebElement sumDetails;

    @FindBy(xpath = "//div[5]/div[@class='item-value']")
    private WebElement receiverDetails;

    @FindBy(xpath = "//app-processing-step-order")
    private WebElement infoForPay;

    public DitexMyOrdersPage(WebDriver webDriver) {
        initializationWebElements(webDriver);
    }

    public boolean myOrdersPageIsLoaded() {
        waitUntilElementIsAppear(newOrder);
        return webDriver.getCurrentUrl().equals(front + "/orders-list");
    }

    public boolean orderDetailsPageIsLoaded() {
        return webDriver.getCurrentUrl().contains(front + "/order-details");
    }

    public String newOrderStatus() {
        return newOrderStatus.getText();
    }

    public String newOrderID() {
        return newOrderID.getText();
    }

    public String newOrderDate() {
        return newOrderDate.getText();
    }

    public String newOrderSumNumber() {
        return newOrderSumNumber.getText();
    }

    public String newOrderSumCurrency() {
        return newOrderSumCurrency.getText();
    }

    public String newOrderReceiver() {
        return newOrderReceiver.getText();
    }

    public String orderIDDetails() {
        waitUntilElementIsAppear(orderIDDetails);
        return orderIDDetails.getText();
    }
    public String depositWalletDetails() {
        return depositWalletDetails.getText();
    }

    public String sumDetails() {
        return sumDetails.getText();
    }

    public String receiverDetails() {
        return receiverDetails.getText();
    }

    public boolean infoForPayIsLoaded() {
        return infoForPay.isDisplayed();
    }

    public void clickOnNewOrderDetailsButton() {
        newOrderDetailsButton.click();
    }

    public DitexExchangePage clickOnNewOrderRepeatOrderButton() {
        newOrderRepeatOrderButton.click();
        return new DitexExchangePage(webDriver);
    }

    public void clickOnRepeatOrderDetailsButton() {
        repeatOrderDetailsButton.click();
    }

    public DitexExchangePage clickOnCreateNewOrderButton() {
        createNewOrderButton.click();
        return new DitexExchangePage(webDriver);
    }
}
