package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    //String admin = "http://100.64.0.201:8887"; //PROD
    //String admin = "http://100.64.0.211:8887";  //DEV
    String admin = "http://100.64.0.231:8887";  //TEST

    //String front = "https://ditex.app"; //PROD
    //String front = "https://dev.ditex.io"; //DEV
    String front = "https://test.ditex.io"; //TEST

    protected WebDriver webDriver;

    /**
     * Initialize web elements for different pages.
     * @param webDriver - WebDriver with Google Chrome
     */
    public void initializationWebElements(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(this.webDriver,this);
    }

    /**
     * waiting for a request for a certain period of time
     * @param webElement - WebElement with different web elements
     */
    protected void waitUntilElementIsAppear(WebElement webElement) {
        WebDriverWait wait = new WebDriverWait(webDriver,10);
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }

    protected void waitUntilElementIsAppearForAdmin(WebElement webElement) {
        WebDriverWait wait = new WebDriverWait(webDriver,15);
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }

    protected void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    protected void scrollDown() {
        ((JavascriptExecutor)webDriver).executeScript("scroll(0,10000)");
    }

    protected void scrollUp() {
        ((JavascriptExecutor)webDriver).executeScript("scroll(0,0)");
    }
}
