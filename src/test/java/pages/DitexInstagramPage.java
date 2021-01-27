package pages;

import org.openqa.selenium.WebDriver;

public class DitexInstagramPage extends BasePage {
    public DitexInstagramPage(WebDriver webDriver) {
        initializationWebElements(webDriver);
    }

    public boolean instagramPageIsLoaded() {
        return webDriver.getCurrentUrl().equals("https://www.instagram.com/digi4ex/");
    }
}
