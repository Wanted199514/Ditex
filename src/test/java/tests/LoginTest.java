package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    /**
     * ТС2
     */
    @Test
    public void correctLogin() {
        authorization(username);
    }

    /**
     * ТС3
     */
    @Test
    public void incorrectEmptyUsernameLoginPage() {
        Assert.assertTrue(ditexMainPage.ditexMainPageIsLoaded(),"Ditex main page is not loaded.");
        ditexMainPage.login("",password);
        Assert.assertEquals(ditexMainPage.errorTextIsLoaded(),"Поле не должно быть пустым","Error text is not loaded.");
    }

    /**
     * ТС4
     */
    @Test
    public void incorrectEmptyPasswordLoginPage() {
        Assert.assertTrue(ditexMainPage.ditexMainPageIsLoaded(),"Ditex main page is not loaded.");
        ditexMainPage.login(username,"");
        Assert.assertEquals(ditexMainPage.errorTextIsLoaded(),"Поле не должно быть пустым","Error text is not loaded.");
    }

    /**
     * ТС5
     */
    @Test
    public void incorrectUsernameLoginPage() {
        Assert.assertTrue(ditexMainPage.ditexMainPageIsLoaded(),"Ditex main page is not loaded.");
        ditexMainPage.login("adfasdf",password);
        Assert.assertEquals(ditexMainPage.errorTextIsLoaded(),"Email заполнен некорректно","Error text is not loaded.");
    }

    /**
     * ТС6
     */
    @Test
    public void incorrectPasswordLoginPage() {
        Assert.assertTrue(ditexMainPage.ditexMainPageIsLoaded(),"Ditex main page is not loaded.");
        ditexMainPage.login(username,"adfasdf");
        Assert.assertEquals(ditexMainPage.errorTextIsLoaded(),"Неверный пароль, неверное имя пользователя или пользователь заблокирован","Error text is not loaded.");
    }

    /**
     * ТС7
     */
    @Test
    public void incorrectCorrectUsernameLoginPage() {
        Assert.assertTrue(ditexMainPage.ditexMainPageIsLoaded(),"Ditex main page is not loaded.");
        ditexMainPage.login("adsfdsf@gmail.com",password);
        Assert.assertEquals(ditexMainPage.errorTextIsLoaded(),"Неверный пароль, неверное имя пользователя или пользователь заблокирован","Error text is not loaded.");
    }

    @Test
    public void restorePasswordWithKey() {
        Assert.assertTrue(ditexMainPage.ditexMainPageIsLoaded(),"Ditex main page is not loaded.");
        ditexMainPage.clickOnLoginButton();
        ditexMainPage.clickOnForgotPasswordButton();
        Assert.assertTrue(ditexMainPage.emailButtonIsLoaded(),"Ditex email button is not loaded.");
        Assert.assertTrue(ditexMainPage.keyButtonIsLoaded(),"Ditex key button is not loaded.");
        ditexMainPage.clickOnKeyButton();
        ditexMainPage.restorePasswordWithKey(uniqueKey);
        Assert.assertTrue(ditexMainPage.newPasswordIsLoaded(),"New Password is not loaded.");
        String newPassword = ditexMainPage.newPasswordGetText();
        ditexMainPage.clickOnLoginButtonForRestorePassword();
        ditexMainPage.loginForRestorePassword(usernameForUniqueKey,newPassword);
        Assert.assertEquals(ditexMainPage.nicknameIsLoaded(),usernameForUniqueKey,"Login main page is not loaded.");
    }

    /**
     * ТС2забылПароль
     */
    @Test
    public void forgotPassword() {
        Assert.assertTrue(ditexMainPage.ditexMainPageIsLoaded(),"Ditex main page is not loaded.");
        ditexMainPage.clickOnLoginButton();
        ditexMainPage.clickOnForgotPasswordButton();
        Assert.assertTrue(ditexMainPage.emailButtonIsLoaded(),"Ditex email button is not loaded.");
        Assert.assertTrue(ditexMainPage.keyButtonIsLoaded(),"Ditex key button is not loaded.");
        ditexMainPage.clickOnEmailButton();
        ditexMainPage.chooseEmailForResetPassword(username);
        ditexMainPage.clickOnSendButton();
        Assert.assertEquals(ditexMainPage.messageResetPasswordIsLoaded(),"Если у вас есть аккаунт, связанный с этим адресом электронной почты, мы отправим инструкции для сброса пароля","Message reset password is not loaded.");
    }
}
