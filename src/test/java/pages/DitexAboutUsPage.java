package pages;

import org.openqa.selenium.WebDriver;

public class DitexAboutUsPage extends BasePage {
    public DitexAboutUsPage(WebDriver webDriver) {
        initializationWebElements(webDriver);
    }

    public boolean aboutUsPageIsLoaded() {
        sleep(2000);
        return webDriver.getCurrentUrl().equals(front + "/about");
    }
}