package pages;

import org.openqa.selenium.WebDriver;

public class DitexFAQPage extends BasePage {
    public DitexFAQPage(WebDriver webDriver) {
        initializationWebElements(webDriver);
    }

    public boolean fAQPageIsLoaded() {
        sleep(2000);
        return webDriver.getCurrentUrl().equals(front + "/faq");
    }
}
