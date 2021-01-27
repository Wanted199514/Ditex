package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PlatioPage extends BasePage {
    @FindBy(xpath = "//button[contains(@class,'btn')]")
    private WebElement payCardButton;

    public PlatioPage(WebDriver webDriver) {
        initializationWebElements(webDriver);
    }

    public boolean platioPageIsLoaded() {
        waitUntilElementIsAppear(payCardButton);
        return webDriver.getCurrentUrl().contains("https://3ds.platio");
    }
}
