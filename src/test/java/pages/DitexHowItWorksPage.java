package pages;

import org.openqa.selenium.WebDriver;

public class DitexHowItWorksPage extends BasePage {
    public DitexHowItWorksPage(WebDriver webDriver) {
        initializationWebElements(webDriver);
    }

    public boolean howItWorksPageIsLoaded() {
        sleep(1000);
        return webDriver.getCurrentUrl().equals(front + "/how");
    }
}
