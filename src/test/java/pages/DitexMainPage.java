package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DitexMainPage extends BasePage {
    @FindBy(xpath = "//div[contains(@class,'d-none')]/a[contains(@href,'login/auth')]")
    private WebElement loginButton;

    @FindBy(xpath = "//app-success-message/div/button[contains(@class,'btn btn-default mat-button')]")
    private WebElement loginButtonForRestorePassword;

    @FindBy(xpath = "//input[@formcontrolname='email']")
    private WebElement emailField;

    @FindBy(xpath = "//app-restore-by-email/div/form/div/input[@formcontrolname='email']")
    private WebElement emailFieldForRestorePassword;

    @FindBy(xpath = "//input[@formcontrolname='username']")
    private WebElement usernameField;

    @FindBy(xpath = "//form/div/input[@formcontrolname='userpassword']")
    private WebElement passwordField;

    @FindBy(xpath = "//input[@formcontrolname='code']")
    private WebElement keyField;

    @FindBy(xpath = "//div[@class='form-group']/button[contains(@class,'btn btn-default mat-button')]/span")
    private WebElement signInButton;

    @FindBy(xpath = "//a[@href='/profile']")
    private WebElement nickname;

    @FindBy(xpath = "//div/form/div/div[@class='error-text']")
    private WebElement errorText;

    @FindBy(xpath = "//div[@class='new-password']")
    private WebElement newPasswordText;

    @FindBy(xpath = "//a[contains(@class,'btn btn-ghost btn-uppercase')]")
    private WebElement exchangeButton;

    @FindBy(xpath = "//div/a[contains(@href,'about')]")
    private WebElement aboutUsButton;

    @FindBy(xpath = "//div/a[contains(@href,'how')]")
    private WebElement howItWorksButton;

    @FindBy(xpath = "//div/a[contains(@href,'policy')]")
    private WebElement privacyPolicyButton;

    @FindBy(xpath = "//div/a[contains(@href,'terms')]")
    private WebElement termsOfUseButton;

    @FindBy(xpath = "//div/a[contains(@href,'faq')]")
    private WebElement fAQButton;

    @FindBy(xpath = "//div/a[contains(@href,'contacts')]")
    private WebElement contactsButton;

    @FindBy(xpath = "//div/a[contains(@href,'otc-trading')]")
    private WebElement otcTradingButton;

    @FindBy(xpath = "//mat-icon")
    private WebElement sidebar;

    @FindBy(xpath = "//li[1]/a[@class='nav-menu-itm-link header-link']")
    private WebElement aboutUsSidebarButton;

    @FindBy(xpath = "//li[2]/a[@class='nav-menu-itm-link header-link']")
    private WebElement howItWorksSidebarButton;

    @FindBy(xpath = "//li[3]/a[@class='nav-menu-itm-link header-link']")
    private WebElement privacyPolicySidebarButton;

    @FindBy(xpath = "//li[4]/a[@class='nav-menu-itm-link header-link']")
    private WebElement termsOfUseSidebarButton;

    @FindBy(xpath = "//li[5]/a[@class='nav-menu-itm-link header-link']")
    private WebElement fAQSidebarButton;

    @FindBy(xpath = "//li[6]/a[@class='nav-menu-itm-link header-link']")
    private WebElement contactsSidebarButton;

    @FindBy(xpath = "//a[@class='social-link'][@href][1]")
    private WebElement instagramLink;

    @FindBy(xpath = "//a[@class='social-link'][@href][2]")
    private WebElement twitterLink;

    @FindBy(xpath = "//a[@class='social-link'][@href][3]")
    private WebElement telegramLink;

    @FindBy(xpath = "//h2")
    private WebElement logOutWindow;

    @FindBy(xpath = "//h2")
    private WebElement window;

    @FindBy(xpath = "//div/div/button[contains(@class,'btn btn-default mat-button')]")
    private WebElement okButton;

    @FindBy(xpath = "//mat-select[contains(@class,'mat-select-primary')]")
    private WebElement languageButton;

    @FindBy(xpath = "//mat-option[1]/span[@class='mat-option-text']")
    private WebElement englishLanguage;

    @FindBy(xpath = "//mat-option[2]/span[@class='mat-option-text']")
    private WebElement russianLanguage;

    @FindBy(xpath = "//a[@class='link-default d-inline-block w-50']")
    private WebElement forgotPasswordButton;

    @FindBy(xpath = "//div[contains(@translate,'choose-method.email')]")
    private WebElement emailButton;

    @FindBy(xpath = "//div[contains(@translate,'choose-method.key')]")
    private WebElement keyButton;

    @FindBy(xpath = "//div[@translate='login.restore_pass.tips']")
    private WebElement messageResetPassword;

    @FindBy(xpath = "//*[@class='exchange-switcher']")
    private WebElement exchangeSwitcher;

    @FindBy(xpath = "//div[1]/label/label/span[contains(@class,'select-exchange-value')]")
    private WebElement chosenCryptoForSell;

    @FindBy(xpath = "//div[3]/label/label/span[contains(@class,'select-exchange-value')]")
    private WebElement chosenCryptoForBuy;

    @FindBy(xpath = "//input[@onlynumber]")
    private WebElement myCoins;

    @FindBy(xpath = "//div[1]/label/label/span[@class='select-exchange-value']")
    private WebElement chooseCryptoForSell;

    @FindBy(xpath = "//div[3]/label/label/span[@class='select-exchange-value']")
    private WebElement chooseCryptoForBuy;

    @FindBy(xpath = "//div[1]/app-exchange-currencies-list/ul/li/div/span[contains(text(),'BTC')]")
    private WebElement chooseBTCForSell;

    @FindBy(xpath = "//div[3]/app-exchange-currencies-list/ul/li/div/span[contains(text(),'BTC')]")
    private WebElement chooseBTCForBuy;

    @FindBy(xpath = "//div[1]/app-exchange-currencies-list/ul/li/div/span[contains(text(),'ETH')]")
    private WebElement chooseETHForSell;

    @FindBy(xpath = "//div[3]/app-exchange-currencies-list/ul/li/div/span[contains(text(),'ETH')]")
    private WebElement chooseETHForBuy;

    @FindBy(xpath = "//div[1]/app-exchange-currencies-list/ul/li/div/span[contains(text(),'RUB')]")
    private WebElement chooseRUBForSell;

    @FindBy(xpath = "//div[3]/app-exchange-currencies-list/ul/li/div/span[contains(text(),'RUB')]")
    private WebElement chooseRUBForBuy;

    @FindBy(xpath = "//div[1]/app-exchange-currencies-list/ul/li/div/span[contains(text(),'USDT')]")
    private WebElement chooseUSDTForSell;

    @FindBy(xpath = "//div[3]/app-exchange-currencies-list/ul/li/div/span[contains(text(),'USDT')]")
    private WebElement chooseUSDTForBuy;

    @FindBy(xpath = "//div[1]/app-exchange-currencies-list/ul/li/div/span[contains(text(),'EUR')]")
    private WebElement chooseEURForSell;

    @FindBy(xpath = "//div[3]/app-exchange-currencies-list/ul/li/div/span[contains(text(),'EUR')]")
    private WebElement chooseEURForBuy;

    @FindBy(xpath = "//div[1]/app-exchange-currencies-list/ul/li/div/span[contains(text(),'USDC')]")
    private WebElement chooseUSDCForSell;

    @FindBy(xpath = "//div[3]/app-exchange-currencies-list/ul/li/div/span[contains(text(),'USDC')]")
    private WebElement chooseUSDCForBuy;

    @FindBy(xpath = "//div[1]/app-exchange-currencies-list/ul/li/div/span[contains(text(),'JPY')]")
    private WebElement chooseJPYForSell;

    @FindBy(xpath = "//div[3]/app-exchange-currencies-list/ul/li/div/span[contains(text(),'JPY')]")
    private WebElement chooseJPYForBuy;

    @FindBy(xpath = "//div[1]/app-exchange-currencies-list/ul/li/div/span[text()='USD']")
    private WebElement chooseUSDForSell;

    @FindBy(xpath = "//div[3]/app-exchange-currencies-list/ul/li/div/span[text()='USD']")
    private WebElement chooseUSDForBuy;

    @FindBy(xpath = "//div[@class='currency-title']")
    private List<WebElement> pairsSum;

    @FindBy(xpath = "//a[@href='/wallets-and-cards']")
    private WebElement walletsAndCardsButton;

    @FindBy(xpath = "//div/a[@href='/orders-list']")
    private WebElement myOrdersButton;

    public DitexMainPage(WebDriver webDriver) {
        initializationWebElements(webDriver);
    }

    public boolean ditexMainPageIsLoaded() {
        waitUntilElementIsAppear(exchangeButton);
        return webDriver.getCurrentUrl().equals(front + "/")
                    && loginButton.isDisplayed();
    }

    public boolean loginWindowIsLoaded() {
        return loginButton.isDisplayed();
    }

    public boolean logOutWindowIsLoaded() {
        return logOutWindow.isDisplayed();
    }

    public boolean windowIsLoaded() {
        return window.isDisplayed();
    }

    public boolean newPasswordIsLoaded() {
        waitUntilElementIsAppear(newPasswordText);
        return newPasswordText.isDisplayed();
    }

    public String newPasswordGetText() {
        return newPasswordText.getText();
    }

    public void login(String username, String password) {
        loginButton.click();
        loginWithoutClickOnLoginButton(username,password);
    }

    public void loginWithoutClickOnLoginButton(String username, String password) {
        waitUntilElementIsAppear(usernameField);
        usernameField.click();
        usernameField.sendKeys(username);
        waitUntilElementIsAppear(passwordField);
        passwordField.click();
        passwordField.sendKeys(password);
        waitUntilElementIsAppear(signInButton);
        signInButton.click();
    }

    public void loginForRestorePassword(String username, String password) {
        waitUntilElementIsAppear(usernameField);
        usernameField.click();
        usernameField.sendKeys(username);
        waitUntilElementIsAppear(passwordField);
        passwordField.click();
        passwordField.sendKeys(password);
        waitUntilElementIsAppear(signInButton);
        signInButton.click();
    }

    public DitexExchangePage clickOnExchangeButton() {
        waitUntilElementIsAppear(exchangeButton);
        exchangeButton.click();
        sleep(500);
        return new DitexExchangePage(webDriver);
    }

    public DitexProfilePage clickOnNickname() {
        waitUntilElementIsAppear(nickname);
        nickname.click();
        return new DitexProfilePage(webDriver);
    }

    public String nicknameIsLoaded() {
        sleep(3000);
        waitUntilElementIsAppear(nickname);
        return nickname.getText();
    }

    public void mainStep(String coins) {
        firstStepWithoutClickContinueButton(coins);
        waitUntilElementIsAppear(exchangeButton);
    }

    public int setPairsSum() {
        return pairsSum.size();
    }

    public void firstStepWithoutClickContinueButton(String coins) {
        sleep(1000);
        waitUntilElementIsAppear(myCoins);
        myCoins.click();
        myCoins.sendKeys(Keys.BACK_SPACE);
        myCoins.sendKeys(coins);
        sleep(1000);
    }

    private void chooseMyWalletForSell() {
        waitUntilElementIsAppear(chooseCryptoForSell);
        chooseCryptoForSell.click();
    }

    public void chooseMyCryptoBTCForSell() {
        chooseMyWalletForSell();
        waitUntilElementIsAppear(chooseBTCForSell);
        chooseBTCForSell.click();
        sleep(1000);
    }

    public void chooseMyCryptoETHForSell() {
        chooseMyWalletForSell();
        waitUntilElementIsAppear(chooseETHForSell);
        chooseETHForSell.click();
        sleep(1000);
    }

    public void chooseMyCryptoUSDTForSell() {
        chooseMyWalletForSell();
        waitUntilElementIsAppear(chooseUSDTForSell);
        chooseUSDTForSell.click();
        sleep(1000);
    }

    public void chooseMyCryptoUSDCForSell() {
        chooseMyWalletForSell();
        waitUntilElementIsAppear(chooseUSDCForSell);
        chooseUSDCForSell.click();
        sleep(1000);
    }

    public void chooseMyEURForSell() {
        chooseMyWalletForSell();
        waitUntilElementIsAppear(chooseEURForSell);
        chooseEURForSell.click();
        sleep(1000);
    }

    public void chooseMyRUBForSell() {
        chooseMyWalletForSell();
        waitUntilElementIsAppear(chooseRUBForSell);
        chooseRUBForSell.click();
        sleep(1000);
    }

    public void chooseMyJPYForSell() {
        chooseMyWalletForSell();
        waitUntilElementIsAppear(chooseJPYForSell);
        chooseJPYForSell.click();
        sleep(1000);
    }

    public void chooseMyUSDForSell() {
        chooseMyWalletForSell();
        waitUntilElementIsAppear(chooseUSDForSell);
        chooseUSDForSell.click();
        sleep(1000);
    }

    private void chooseMyWalletForBuy() {
        sleep(2000);
        waitUntilElementIsAppear(chooseCryptoForBuy);
        chooseCryptoForBuy.click();
    }

    public void chooseMyCryptoBTCForBuy() {
        chooseMyWalletForBuy();
        waitUntilElementIsAppear(chooseBTCForBuy);
        chooseBTCForBuy.click();
        sleep(500);
    }

    public void chooseMyCryptoETHForBuy() {
        chooseMyWalletForBuy();
        waitUntilElementIsAppear(chooseETHForBuy);
        chooseETHForBuy.click();
        sleep(500);
    }

    public void chooseMyCryptoUSDTForBuy() {
        chooseMyWalletForBuy();
        waitUntilElementIsAppear(chooseUSDTForBuy);
        chooseUSDTForBuy.click();
        sleep(500);
    }

    public void chooseMyCryptoUSDCForBuy() {
        chooseMyWalletForBuy();
        waitUntilElementIsAppear(chooseUSDCForBuy);
        chooseUSDCForBuy.click();
        sleep(500);
    }

    public void chooseMyEURForBuy() {
        chooseMyWalletForBuy();
        waitUntilElementIsAppear(chooseEURForBuy);
        chooseEURForBuy.click();
        sleep(500);
    }

    public void chooseMyJPYForBuy() {
        chooseMyWalletForBuy();
        waitUntilElementIsAppear(chooseJPYForBuy);
        chooseJPYForBuy.click();
        sleep(500);
    }

    public void chooseMyUSDForBuy() {
        chooseMyWalletForBuy();
        waitUntilElementIsAppear(chooseUSDForBuy);
        chooseJPYForBuy.click();
        sleep(500);
    }

    public void chooseMyCryptoRUBForBuy() {
        chooseMyWalletForBuy();
        waitUntilElementIsAppear(chooseRUBForBuy);
        chooseRUBForBuy.click();
        sleep(500);
    }

    public String errorTextIsLoaded() {
        waitUntilElementIsAppear(errorText);
        return errorText.getText();
    }

    public DitexAboutUsPage clickOnAboutUsButton() {
        scrollDown();
        aboutUsButton.click();
        return new DitexAboutUsPage(webDriver);
    }

    public DitexHowItWorksPage clickOnHowItWorksButton() {
        scrollDown();
        howItWorksButton.click();
        return new DitexHowItWorksPage(webDriver);
    }

    public DitexPrivacyPolicyPage clickOnPrivacyPolicyButton() {
        scrollDown();
        privacyPolicyButton.click();
        return new DitexPrivacyPolicyPage(webDriver);
    }

    public DitexTermsOfUsePage clickOnTermsOfUseButton() {
        scrollDown();
        termsOfUseButton.click();
        return new DitexTermsOfUsePage(webDriver);
    }

    public DitexFAQPage clickOnFAQButton() {
        scrollDown();
        fAQButton.click();
        return new DitexFAQPage(webDriver);
    }

    public DitexContactsPage clickOnContactsButton() {
        scrollDown();
        contactsButton.click();
        return new DitexContactsPage(webDriver);
    }

    public DitexOTCTradingPage clickOnOTCTradingButton() {
        scrollDown();
        otcTradingButton.click();
        return new DitexOTCTradingPage(webDriver);
    }

    public DitexMyOrdersPage clickOnMyOrdersButton() {
        scrollUp();
        waitUntilElementIsAppear(myOrdersButton);
        myOrdersButton.click();
        return new DitexMyOrdersPage(webDriver);
    }

    public DitexInstagramPage clickOnInstagramLink() {
        instagramLink.click();
        return new DitexInstagramPage(webDriver);
    }

    public DitexTwitterPage clickOnTwitterLink() {
        twitterLink.click();
        return new DitexTwitterPage(webDriver);
    }

    public DitexTelegramPage clickOnTelegramLink() {
        telegramLink.click();
        return new DitexTelegramPage(webDriver);
    }

    /*public void clickOnLogOutButton() {
        waitUntilElementIsAppear(logOutButton);
        logOutButton.click();
    }*/

    public void clickOnOkButton() {
        okButton.click();
        sleep(1000);
    }

    public void clickOnLanguageButton() {
        languageButton.click();
    }

    public String languageIsSelected() {
        return languageButton.getText();
    }

    public void clickOnRussianLanguage() {
        russianLanguage.click();
    }

    public void clickOnEnglishLanguage() {
        englishLanguage.click();
    }

    public void clickOnForgotPasswordButton() {
        waitUntilElementIsAppear(forgotPasswordButton);
        forgotPasswordButton.click();
    }

    public boolean emailButtonIsLoaded() {
        return emailButton.isDisplayed();
    }

    public void chooseEmailForResetPassword(String email) {
        waitUntilElementIsAppear(emailFieldForRestorePassword);
        emailFieldForRestorePassword.sendKeys(email);
    }

    public void clickOnEmailButton() {
        emailButton.click();
    }

    public boolean keyButtonIsLoaded() {
        return keyButton.isDisplayed();
    }

    public void clickOnLoginButton() {
        waitUntilElementIsAppear(loginButton);
        loginButton.click();
        waitUntilElementIsAppear(usernameField);
    }

    public String messageResetPasswordIsLoaded() {
        waitUntilElementIsAppear(messageResetPassword);
        return messageResetPassword.getText();
    }

    public void clickOnSignInButton() {
        signInButton.click();
    }

    public void clickOnSendButton() {
        signInButton.click();
    }

    public void clickOnKeyButton() {
        keyButton.click();
    }

    public void restorePasswordWithKey(String uniqueKey) {
        keyField.click();
        keyField.sendKeys(uniqueKey);
        signInButton.click();
    }

    public void clickOnLoginButtonForRestorePassword() {
        loginButtonForRestorePassword.click();
    }

    public void clickOnExchangeSwitcher() {
        waitUntilElementIsAppear(exchangeSwitcher);
        exchangeSwitcher.click();
    }

    public DitexWalletsPage clickOnWalletsAndCardsButton() {
        walletsAndCardsButton.click();
        return new DitexWalletsPage(webDriver);
    }

    public String chosenCryptoForSellIsCorrect() {
        return chosenCryptoForSell.getText();
    }

    public String chosenCryptoForBuyIsCorrect() {
        return chosenCryptoForBuy.getText();
    }
}