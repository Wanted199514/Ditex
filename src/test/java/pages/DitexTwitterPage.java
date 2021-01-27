package pages;

import org.openqa.selenium.WebDriver;

public class DitexTwitterPage extends BasePage {
    public DitexTwitterPage(WebDriver webDriver) {
        initializationWebElements(webDriver);
    }

    public boolean twitterPageIsLoaded() {
        return webDriver.getCurrentUrl().equals("https://twitter.com/digi4exchanger");
    }
}
