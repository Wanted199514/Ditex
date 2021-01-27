package pages;

import org.openqa.selenium.WebDriver;

public class DitexContactsPage extends BasePage {
    public DitexContactsPage(WebDriver webDriver) {
        initializationWebElements(webDriver);
    }

    public boolean contactsPageIsLoaded() {
        sleep(1000);
        return webDriver.getCurrentUrl().equals(front + "/contacts");
    }
}