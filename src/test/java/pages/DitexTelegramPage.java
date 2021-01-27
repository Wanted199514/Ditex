package pages;

import org.openqa.selenium.WebDriver;

public class DitexTelegramPage extends BasePage {
    public DitexTelegramPage(WebDriver webDriver) {
        initializationWebElements(webDriver);
    }

    public boolean telegramPageIsLoaded() {
        return webDriver.getCurrentUrl().equals("https://t.me/digi4ex");
    }
}
