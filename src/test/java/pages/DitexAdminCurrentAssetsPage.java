package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DitexAdminCurrentAssetsPage extends BasePage {
    @FindBy(xpath = "//div[contains(@class,'white-block')]")
    private WebElement balanceBlock;

    @FindBy(xpath = "//div[contains(@class,'white-block')]")
    private List<WebElement> balanceBlockList;

    @FindBy(xpath = "//a[@href='/markets/balances-limit']")
    private WebElement nominalBalanceTab;

    @FindBy(xpath = "//div[1]/div/div/input[@type='number']")
    private WebElement fieldForNominalBalanceForCrypto;

    @FindBy(xpath = "//div[2]/div/div/input[@type='number']")
    private WebElement fieldForNominalBalanceForFiat;

    @FindBy(xpath = "//a[@href='/markets/balances']")
    private WebElement balanceTab;

    @FindBy(xpath = "//div[1]/div/button")
    private WebElement checkMarkButtonForCrypto;

    @FindBy(xpath = "//div[2]/div/button")
    private WebElement checkMarkButtonForFiat;

    @FindBy(xpath = "//div[@class='modal-content popup']/div/button[1]")
    private WebElement okButton;

    @FindBy(xpath = "//div[@class='modal-content popup']/div/button[2]")
    private WebElement cancelButton;

    @FindBy(xpath = "//h2")
    private WebElement confirmWindow;

    public DitexAdminCurrentAssetsPage(WebDriver webDriver) {
        initializationWebElements(webDriver);
    }

    public boolean ditexAdminCurrentAssetsIsLoaded() {
        waitUntilElementIsAppearForAdmin(nominalBalanceTab);
        return webDriver.getCurrentUrl().equals(admin + "/markets");
    }

    public boolean balanceBlockIsLoaded() {
        waitUntilElementIsAppearForAdmin(balanceBlock);
        return balanceBlock.isEnabled();
    }

    public boolean nominalBalanceIsLoaded() {
        return webDriver.getCurrentUrl().equals(admin + "/markets/balances-limit");
    }

    public boolean confirmWindowIsLoaded() {
        waitUntilElementIsAppear(okButton);
        return confirmWindow.isDisplayed()
                && cancelButton.isDisplayed();
    }

    public boolean fieldForNominalBalanceIsSelected() {
        waitUntilElementIsAppearForAdmin(fieldForNominalBalanceForCrypto);
        sleep(2000);
        fieldForNominalBalanceForCrypto.click();
        return fieldForNominalBalanceForCrypto.isDisplayed();
    }

    public void clickOnCheckMarkButtonForCrypto() {
        checkMarkButtonForCrypto.click();
    }

    public void clickOnCheckMarkButtonForFiat() {
        scrollDown();
        checkMarkButtonForFiat.click();
    }

    public void clickOnOkButton() {
        okButton.click();
        sleep(1000);
    }

    public boolean balancesPageIsLoaded() {
        return webDriver.getCurrentUrl().equals(admin + "/markets/balances");
    }

    public void clickOnNominalBalanceTab() {
        nominalBalanceTab.click();
    }

    public void clickOnBalanceTab() {
        balanceTab.click();
    }

    public int sumBalanceBlockes() {
        sleep(15000);
        return balanceBlockList.size();
    }
}
