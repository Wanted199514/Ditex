package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DitexPersonVerificationPage extends BasePage {
    @FindBy(xpath = "//button")
    private WebElement startButton;

    @FindBy(xpath = "//span[@class='country-name']")
    private WebElement conuntryChooseButton;

    public DitexPersonVerificationPage(WebDriver webDriver) {
        initializationWebElements(webDriver);
    }

    public boolean personVerificationIsLoaded() {
        return webDriver.getCurrentUrl().equals(front + "/profile/verification");
    }

    public boolean startButtonIsLoaded() {
        return startButton.isDisplayed();
    }

    public void clickOnStartButton() {
        startButton.click();
    }

    public boolean verificationSiteIsLoaded() {
        waitUntilElementIsAppear(conuntryChooseButton);
        return webDriver.getCurrentUrl().contains("https://shuftipro.com/process/verification/");
    }
}