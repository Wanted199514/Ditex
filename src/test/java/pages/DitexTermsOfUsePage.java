package pages;

import org.openqa.selenium.WebDriver;

public class DitexTermsOfUsePage extends BasePage {
    public DitexTermsOfUsePage(WebDriver webDriver) {
        initializationWebElements(webDriver);
    }

    public boolean termsOfUsePageIsLoaded() {
        sleep(1000);
        return webDriver.getCurrentUrl().equals(front + "/terms");
    }
}
