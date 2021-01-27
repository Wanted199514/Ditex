package pages;

import org.openqa.selenium.WebDriver;

public class DitexPrivacyPolicyPage extends BasePage {
    public DitexPrivacyPolicyPage(WebDriver webDriver) {
        initializationWebElements(webDriver);
    }

    public boolean privacyPolicyPageIsLoaded() {
        sleep(1000);
        return webDriver.getCurrentUrl().equals(front + "/policy");
    }
}