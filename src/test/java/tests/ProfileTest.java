package tests;

public class ProfileTest extends BaseTest {
    /**
     * ТС39
     */
    /*@Test
    public void clickOnChangeEmailButtonAndClickContinue() {
        Assert.assertTrue(ditexMainPage.ditexMainPageIsLoaded(),"Ditex main page is not loaded.");
        ditexMainPage.login(username,password);
        Assert.assertEquals(ditexMainPage.nicknameIsLoaded(),username,"Login main page is not loaded.");
        ditexMainPage.clickOnNickname();
        DitexSettingsPage ditexSettingsPage = ditexMainPage.clickOnMyOrdersButton();
        Assert.assertTrue(ditexSettingsPage.profilePageIsLoaded(),"'Profile' page is not loaded.");
        ditexSettingsPage.clickOnSettingsButton();
        Assert.assertTrue(ditexSettingsPage.changeEmailIsLoaded(),"'Settings' is not loaded.");
        ditexSettingsPage.clickOnChangeEmailButton();
        Assert.assertEquals(ditexSettingsPage.tabIsLoaded(),changeEmailText,"Change email window is not loaded.");
        ditexSettingsPage.clickOnContinueButton();
        Assert.assertTrue(ditexSettingsPage.okButtonIsLoaded(),"'OK' button is not loaded.");
        Assert.assertEquals(ditexSettingsPage.correctChangeMessageIsLoaded(),"Instructions for changing your email have been sent to your current email. Go to the mail and follow the instructions","Correct change email message is not loaded.");
    }

    *//**
     * ТС41
     *//*
    @Test
    public void changePasswordCorrect() {
        Assert.assertTrue(ditexMainPage.ditexMainPageIsLoaded(),"Ditex main page is not loaded.");
        ditexMainPage.login(username,password);
        Assert.assertEquals(ditexMainPage.nicknameIsLoaded(),username,"Login main page is not loaded.");
        ditexMainPage.clickOnNickname();
        DitexSettingsPage ditexSettingsPage = ditexMainPage.clickOnMyOrdersButton();
        Assert.assertTrue(ditexSettingsPage.profilePageIsLoaded(),"'Profile' page is not loaded.");
        ditexSettingsPage.clickOnSettingsButton();
        Assert.assertTrue(ditexSettingsPage.changeEmailIsLoaded(),"'Settings' is not loaded.");
        ditexSettingsPage.clickOnChangePasswordButton();
        Assert.assertEquals(ditexSettingsPage.tabIsLoaded(),changePasswordText,"Change email window is not loaded.");
        ditexSettingsPage.changePassword(password,password);
        ditexSettingsPage.clickOnSendButton();
        Assert.assertEquals(ditexSettingsPage.correctChangeMessageIsLoaded(),"Password changed successfully.","Correct change password message is not loaded.");
    }

    *//**
     * ТС42
     *//*
    @Test
    public void changePasswordEmptyYourCurrentPassword() {
        Assert.assertTrue(ditexMainPage.ditexMainPageIsLoaded(),"Ditex main page is not loaded.");
        ditexMainPage.login(username,password);
        Assert.assertEquals(ditexMainPage.nicknameIsLoaded(),username,"Login main page is not loaded.");
        ditexMainPage.clickOnNickname();
        DitexSettingsPage ditexSettingsPage = ditexMainPage.clickOnMyOrdersButton();
        Assert.assertTrue(ditexSettingsPage.profilePageIsLoaded(),"'Profile' page is not loaded.");
        ditexSettingsPage.clickOnSettingsButton();
        Assert.assertTrue(ditexSettingsPage.changeEmailIsLoaded(),"'Settings' is not loaded.");
        ditexSettingsPage.clickOnChangePasswordButton();
        Assert.assertEquals(ditexSettingsPage.tabIsLoaded(),changePasswordText,"Change email window is not loaded.");
        ditexSettingsPage.changePassword("",password);
        ditexSettingsPage.clickOnSendButton();
        Assert.assertEquals(ditexSettingsPage.errorMessageIsLoaded(),errorMessageEmpty,"Error message is not correct.");
    }

    *//**
     * ТС43
     *//*
    @Test
    public void changePasswordEmptyNewPassword() {
        Assert.assertTrue(ditexMainPage.ditexMainPageIsLoaded(),"Ditex main page is not loaded.");
        ditexMainPage.login(username,password);
        Assert.assertEquals(ditexMainPage.nicknameIsLoaded(),username,"Login main page is not loaded.");
        ditexMainPage.clickOnNickname();
        DitexSettingsPage ditexSettingsPage = ditexMainPage.clickOnMyOrdersButton();
        Assert.assertTrue(ditexSettingsPage.profilePageIsLoaded(),"'Profile' page is not loaded.");
        ditexSettingsPage.clickOnSettingsButton();
        Assert.assertTrue(ditexSettingsPage.changeEmailIsLoaded(),"'Settings' is not loaded.");
        ditexSettingsPage.clickOnChangePasswordButton();
        Assert.assertEquals(ditexSettingsPage.tabIsLoaded(),changePasswordText,"Change email window is not loaded.");
        ditexSettingsPage.changePassword(password,"");
        ditexSettingsPage.clickOnSendButton();
        Assert.assertEquals(ditexSettingsPage.errorMessageIsLoaded(),errorMessageEmpty,"Error message is not correct.");
    }

    *//**
     * ТС45
     *//*
    @Test
    public void changePasswordYourCurrentPasswordIncorrect() {
        Assert.assertTrue(ditexMainPage.ditexMainPageIsLoaded(),"Ditex main page is not loaded.");
        ditexMainPage.login(username,password);
        Assert.assertEquals(ditexMainPage.nicknameIsLoaded(),username,"Login main page is not loaded.");
        ditexMainPage.clickOnNickname();
        DitexSettingsPage ditexSettingsPage = ditexMainPage.clickOnMyOrdersButton();
        Assert.assertTrue(ditexSettingsPage.profilePageIsLoaded(),"'Profile' page is not loaded.");
        ditexSettingsPage.clickOnSettingsButton();
        Assert.assertTrue(ditexSettingsPage.changeEmailIsLoaded(),"'Settings' is not loaded.");
        ditexSettingsPage.clickOnChangePasswordButton();
        Assert.assertEquals(ditexSettingsPage.tabIsLoaded(),changePasswordText,"Change email window is not loaded.");
        ditexSettingsPage.changePassword("adfasdfdsf",password);
        ditexSettingsPage.clickOnSendButton();
        Assert.assertEquals(ditexSettingsPage.errorMessageIsLoaded(),incorrectYourCurrentPassword,"Error message is not correct.");
    }

    *//**
     * ТС47
     *//*
    @Test
    public void changePasswordNewPasswordSmall() {
        Assert.assertTrue(ditexMainPage.ditexMainPageIsLoaded(),"Ditex main page is not loaded.");
        ditexMainPage.login(username,password);
        Assert.assertEquals(ditexMainPage.nicknameIsLoaded(),username,"Login main page is not loaded.");
        ditexMainPage.clickOnNickname();
        DitexSettingsPage ditexSettingsPage = ditexMainPage.clickOnMyOrdersButton();
        Assert.assertTrue(ditexSettingsPage.profilePageIsLoaded(),"'Profile' page is not loaded.");
        ditexSettingsPage.clickOnSettingsButton();
        Assert.assertTrue(ditexSettingsPage.changeEmailIsLoaded(),"'Settings' is not loaded.");
        ditexSettingsPage.clickOnChangePasswordButton();
        Assert.assertEquals(ditexSettingsPage.tabIsLoaded(),changePasswordText,"Change email window is not loaded.");
        ditexSettingsPage.changePassword(password,"t12");
        ditexSettingsPage.clickOnSendButton();
        Assert.assertEquals(ditexSettingsPage.errorMessageIsLoaded(),incorrectNewPasswordSmall,"Error message is not correct.");
    }

    *//**
     * ТС48
     *//*
    @Test
    public void clickOnMakeNewOrder() {
        Assert.assertTrue(ditexMainPage.ditexMainPageIsLoaded(),"Ditex main page is not loaded.");
        ditexMainPage.login(username,password);
        Assert.assertEquals(ditexMainPage.nicknameIsLoaded(),username,"Login main page is not loaded.");
        ditexMainPage.clickOnNickname();
        DitexSettingsPage ditexSettingsPage = ditexMainPage.clickOnMyOrdersButton();
        DitexExchangePage ditexExchangePage = ditexSettingsPage.clickOnMakeNewOrderButton();
        Assert.assertTrue(ditexExchangePage.ditexExhangePageIsLoaded(),"Processing page is not loaded.");
    }*/
}