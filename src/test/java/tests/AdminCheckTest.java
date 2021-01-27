package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class AdminCheckTest extends AdminBaseTest {
    @Test
    public void logOut() {
        Assert.assertTrue(ditexAdminLoginPage.ditexAdminLoginPageIsLoaded(),"Admin page is not loaded.");
        DitexAdminOrdersPage ditexAdminOrdersPage = ditexAdminLoginPage.login(username,password);
        Assert.assertTrue(ditexAdminOrdersPage.ditexAdminLoginPageIsLoaded(),"All orders page is not loaded.");
        ditexAdminOrdersPage.clickOnUsernameButton();
        ditexAdminOrdersPage.clickOnExitButton();
        Assert.assertTrue(ditexAdminOrdersPage.windowIsLoaded(),"Window 'Exit' is not loaded.");
        ditexAdminOrdersPage.clickOnOkButton();
        Assert.assertTrue(ditexAdminLoginPage.ditexAdminLoginPageIsLoaded(),"Admin page is not loaded.");
    }

    @Test
    public void incorrectLoginEmptyEmailField() {
        Assert.assertTrue(ditexAdminLoginPage.ditexAdminLoginPageIsLoaded(),"Admin page is not loaded.");
        ditexAdminLoginPage.login("",password);
        Assert.assertTrue(ditexAdminLoginPage.ditexAdminLoginPageIsLoaded(),"Admin page is not loaded.");
    }

    @Test
    public void incorrectLoginEmptyPasswordField() {
        Assert.assertTrue(ditexAdminLoginPage.ditexAdminLoginPageIsLoaded(),"Admin page is not loaded.");
        ditexAdminLoginPage.login(username,"");
        Assert.assertTrue(ditexAdminLoginPage.ditexAdminLoginPageIsLoaded(),"Admin page is not loaded.");
    }

    @Test
    public void incorrectLoginWrongEmail() {
        Assert.assertTrue(ditexAdminLoginPage.ditexAdminLoginPageIsLoaded(),"Admin page is not loaded.");
        ditexAdminLoginPage.login("wrong@wrong.com",password);
        Assert.assertTrue(ditexAdminLoginPage.errorTextIsLoaded(),"Error text is not loaded.");
    }

    @Test
    public void incorrectLoginWrongPassword() {
        Assert.assertTrue(ditexAdminLoginPage.ditexAdminLoginPageIsLoaded(),"Admin page is not loaded.");
        ditexAdminLoginPage.login(username,"1234567");
        Assert.assertTrue(ditexAdminLoginPage.errorTextIsLoaded(),"Error text is not loaded.");
    }

    @Test
    public void checkActiveOrders() {
        createOrder("0.1","14y1MPsqTTuiAz487CeRibcwqdhLUJm3Bb");
        Assert.assertTrue(ditexAdminLoginPage.ditexAdminLoginPageIsLoaded(),"Admin page is not loaded.");
        DitexAdminOrdersPage ditexAdminOrdersPage = ditexAdminLoginPage.login(username,password);
        Assert.assertTrue(ditexAdminOrdersPage.ditexAdminLoginPageIsLoaded(),"All orders page is not loaded.");
        ditexAdminOrdersPage.clickOnActiveTab();
        Assert.assertTrue(ditexAdminOrdersPage.tableIsLoaded(),"Active order page is not loaded.");
    }

    @Test
    public void checkAllOrders() {
        Assert.assertTrue(ditexAdminLoginPage.ditexAdminLoginPageIsLoaded(),"Admin page is not loaded.");
        DitexAdminOrdersPage ditexAdminOrdersPage = ditexAdminLoginPage.login(username,password);
        Assert.assertTrue(ditexAdminOrdersPage.ditexAdminLoginPageIsLoaded(),"All orders page is not loaded.");
        Assert.assertTrue(ditexAdminOrdersPage.tableIsLoaded(),"All orders is not loaded.");
    }

    @Test
    public void checkSearchOrderIDInAllOrders() {
        Assert.assertTrue(ditexAdminLoginPage.ditexAdminLoginPageIsLoaded(),"Admin page is not loaded.");
        DitexAdminOrdersPage ditexAdminOrdersPage = ditexAdminLoginPage.login(username,password);
        Assert.assertTrue(ditexAdminOrdersPage.ditexAdminLoginPageIsLoaded(),"All orders page is not loaded.");
        Assert.assertTrue(ditexAdminOrdersPage.tableIsLoaded(),"All orders is not loaded.");
        ditexAdminOrdersPage.searchIDOrReceiver(orderID);
        Assert.assertTrue(ditexAdminOrdersPage.tableIsLoaded(),"Search is not working");
    }
    @Test
    public void checkSearchReceiverInAllOrders() {
        Assert.assertTrue(ditexAdminLoginPage.ditexAdminLoginPageIsLoaded(),"Admin page is not loaded.");
        DitexAdminOrdersPage ditexAdminOrdersPage = ditexAdminLoginPage.login(username,password);
        Assert.assertTrue(ditexAdminOrdersPage.ditexAdminLoginPageIsLoaded(),"All orders page is not loaded.");
        Assert.assertTrue(ditexAdminOrdersPage.tableIsLoaded(),"All orders is not loaded.");
        ditexAdminOrdersPage.searchIDOrReceiver(walletBitcoin);
        Assert.assertTrue(ditexAdminOrdersPage.tableIsLoaded(),"Search is not working");
    }


    @Test
    public void checkDeclinedOrders() {
        Assert.assertTrue(ditexAdminLoginPage.ditexAdminLoginPageIsLoaded(),"Admin page is not loaded.");
        DitexAdminOrdersPage ditexAdminOrdersPage = ditexAdminLoginPage.login(username,password);
        Assert.assertTrue(ditexAdminOrdersPage.ditexAdminLoginPageIsLoaded(),"All orders page is not loaded.");
        ditexAdminOrdersPage.clickOnDeclinedTab();
        Assert.assertTrue(ditexAdminOrdersPage.ditexAdminLoginPageIsLoaded(),"Declined orders page is not loaded.");
        Assert.assertTrue(ditexAdminOrdersPage.tableIsLoaded(),"Declined orders is not loaded.");
    }

    @Test
    public void checkHistoryOrders() {
        Assert.assertTrue(ditexAdminLoginPage.ditexAdminLoginPageIsLoaded(),"Admin page is not loaded.");
        DitexAdminOrdersPage ditexAdminOrdersPage = ditexAdminLoginPage.login(username,password);
        Assert.assertTrue(ditexAdminOrdersPage.ditexAdminLoginPageIsLoaded(),"All orders is not loaded.");
        ditexAdminOrdersPage.clickOnHistoryTab();
        Assert.assertTrue(ditexAdminOrdersPage.ditexAdminLoginPageIsLoaded(),"History orders page is not loaded.");
        Assert.assertTrue(ditexAdminOrdersPage.tableIsLoaded(),"History orders is not loaded.");
    }

    @Test
    public void checkControl() {
        Assert.assertTrue(ditexAdminLoginPage.ditexAdminLoginPageIsLoaded(),"Admin page is not loaded.");
        DitexAdminOrdersPage ditexAdminOrdersPage = ditexAdminLoginPage.login(username,password);
        Assert.assertTrue(ditexAdminOrdersPage.ditexAdminLoginPageIsLoaded(),"All orders is not loaded.");
        DitexAdminCurrentAssetsPage ditexAdminCurrentAssetsPage = ditexAdminOrdersPage.clickOnCurrentAssetsButton();
        Assert.assertTrue(ditexAdminCurrentAssetsPage.ditexAdminCurrentAssetsIsLoaded(),"Control page is not loaded.");
        Assert.assertTrue(ditexAdminCurrentAssetsPage.balanceBlockIsLoaded(),"Balance block is not loaded.");
    }

    @Test
    public void checkNominalBalanceFieldsAndButtons() {
        Assert.assertTrue(ditexAdminLoginPage.ditexAdminLoginPageIsLoaded(),"Admin page is not loaded.");
        DitexAdminOrdersPage ditexAdminOrdersPage = ditexAdminLoginPage.login(username,password);
        Assert.assertTrue(ditexAdminOrdersPage.ditexAdminLoginPageIsLoaded(),"All orders is not loaded.");
        DitexAdminCurrentAssetsPage ditexAdminCurrentAssetsPage = ditexAdminOrdersPage.clickOnCurrentAssetsButton();
        Assert.assertTrue(ditexAdminCurrentAssetsPage.ditexAdminCurrentAssetsIsLoaded(),"Control blocks is not loaded.");
        ditexAdminCurrentAssetsPage.clickOnNominalBalanceTab();
        Assert.assertTrue(ditexAdminCurrentAssetsPage.nominalBalanceIsLoaded(),"Nominal balance page is not loaded.");
        Assert.assertTrue(ditexAdminCurrentAssetsPage.fieldForNominalBalanceIsSelected(),"Nominal balance blocks is not loaded.");
        ditexAdminCurrentAssetsPage.clickOnCheckMarkButtonForCrypto();
        Assert.assertTrue(ditexAdminCurrentAssetsPage.confirmWindowIsLoaded(),"Confirm window is not loaded.");
        ditexAdminCurrentAssetsPage.clickOnOkButton();
        Assert.assertTrue(ditexAdminCurrentAssetsPage.fieldForNominalBalanceIsSelected(),"Nominal balance blocks is not loaded.");
        ditexAdminCurrentAssetsPage.clickOnCheckMarkButtonForFiat();
        Assert.assertTrue(ditexAdminCurrentAssetsPage.confirmWindowIsLoaded(),"Confirm window is not loaded.");
        ditexAdminCurrentAssetsPage.clickOnOkButton();
        Assert.assertTrue(ditexAdminCurrentAssetsPage.fieldForNominalBalanceIsSelected(),"Nominal balance blocks is not loaded.");
    }

    @Test
    public void checkBalance() {
        Assert.assertTrue(ditexAdminLoginPage.ditexAdminLoginPageIsLoaded(),"Admin page is not loaded.");
        DitexAdminOrdersPage ditexAdminOrdersPage = ditexAdminLoginPage.login(username,password);
        Assert.assertTrue(ditexAdminOrdersPage.ditexAdminLoginPageIsLoaded(),"All orders is not loaded.");
        DitexAdminCurrentAssetsPage ditexAdminCurrentAssetsPage = ditexAdminOrdersPage.clickOnCurrentAssetsButton();
        Assert.assertTrue(ditexAdminCurrentAssetsPage.ditexAdminCurrentAssetsIsLoaded(),"Control blocks is not loaded.");
        ditexAdminCurrentAssetsPage.clickOnBalanceTab();
        Assert.assertTrue(ditexAdminCurrentAssetsPage.balancesPageIsLoaded(),"Balance page is not loaded.");
        Assert.assertEquals(ditexAdminCurrentAssetsPage.sumBalanceBlockes(),10,"All balance blocks is not loaded.");
    }

    @Test
    public void checkCurrencies() {
        Assert.assertTrue(ditexAdminLoginPage.ditexAdminLoginPageIsLoaded(),"Admin page is not loaded.");
        DitexAdminOrdersPage ditexAdminOrdersPage = ditexAdminLoginPage.login(username,password);
        Assert.assertTrue(ditexAdminOrdersPage.ditexAdminLoginPageIsLoaded(),"All orders is not loaded.");
        DitexAdminCurrenciesPage ditexAdminCurrenciesPage = ditexAdminOrdersPage.clickOnCurrenciesButton();
        Assert.assertTrue(ditexAdminCurrenciesPage.ditexAdminCurrenciesPageIsLoaded(),"Currencies page is not loaded.");
        Assert.assertTrue(ditexAdminCurrenciesPage.tablePairsIsLoaded(),"Table pairs is not loaded.");
    }

    @Test
    public void checkComissions() {
        Assert.assertTrue(ditexAdminLoginPage.ditexAdminLoginPageIsLoaded(),"Admin page is not loaded.");
        DitexAdminOrdersPage ditexAdminOrdersPage = ditexAdminLoginPage.login(username,password);
        Assert.assertTrue(ditexAdminOrdersPage.ditexAdminLoginPageIsLoaded(),"All orders is not loaded.");
        DitexAdminCurrenciesPage ditexAdminCurrenciesPage = ditexAdminOrdersPage.clickOnCurrenciesButton();
        Assert.assertTrue(ditexAdminCurrenciesPage.ditexAdminCurrenciesPageIsLoaded(),"Table pairs is not loaded.");
        ditexAdminCurrenciesPage.clickOnComissionsTab();
        Assert.assertTrue(ditexAdminCurrenciesPage.comissionPageIsLoaded(),"Comissions page is not loaded.");
        Assert.assertTrue(ditexAdminCurrenciesPage.tableComissionIsLoaded(),"Table comission is not loaded.");
    }

    @Test
    public void changeComission() {
        Assert.assertTrue(ditexAdminLoginPage.ditexAdminLoginPageIsLoaded(),"Admin page is not loaded.");
        DitexAdminOrdersPage ditexAdminOrdersPage = ditexAdminLoginPage.login(username,password);
        Assert.assertTrue(ditexAdminOrdersPage.ditexAdminLoginPageIsLoaded(),"All orders is not loaded.");
        DitexAdminCurrenciesPage ditexAdminCurrenciesPage = ditexAdminOrdersPage.clickOnCurrenciesButton();
        Assert.assertTrue(ditexAdminCurrenciesPage.ditexAdminCurrenciesPageIsLoaded(),"Table pairs is not loaded.");
        ditexAdminCurrenciesPage.clickOnComissionsTab();
        Assert.assertTrue(ditexAdminCurrenciesPage.comissionPageIsLoaded(),"Comissions page is not loaded.");
        Assert.assertTrue(ditexAdminCurrenciesPage.tableComissionIsLoaded(),"Table comission is not loaded.");
        ditexAdminCurrenciesPage.changeComission(comissonPercent);
    }

    @Test
    public void checkLimits() {
        Assert.assertTrue(ditexAdminLoginPage.ditexAdminLoginPageIsLoaded(),"Admin page is not loaded.");
        DitexAdminOrdersPage ditexAdminOrdersPage = ditexAdminLoginPage.login(username,password);
        Assert.assertTrue(ditexAdminOrdersPage.ditexAdminLoginPageIsLoaded(),"All orders is not loaded.");
        DitexAdminCurrenciesPage ditexAdminCurrenciesPage = ditexAdminOrdersPage.clickOnCurrenciesButton();
        Assert.assertTrue(ditexAdminCurrenciesPage.ditexAdminCurrenciesPageIsLoaded(),"Table pairs is not loaded.");
        ditexAdminCurrenciesPage.clickOnLimitsTab();
        Assert.assertTrue(ditexAdminCurrenciesPage.limitsPageIsLoaded(),"Limits page is not loaded.");
        Assert.assertTrue(ditexAdminCurrenciesPage.tableLimitsIsLoaded(),"Table limits is not loaded.");
    }

    @Test
    public void checkAccounts() {
        Assert.assertTrue(ditexAdminLoginPage.ditexAdminLoginPageIsLoaded(),"Admin page is not loaded.");
        DitexAdminOrdersPage ditexAdminOrdersPage = ditexAdminLoginPage.login(username,password);
        Assert.assertTrue(ditexAdminOrdersPage.ditexAdminLoginPageIsLoaded(),"All orders is not loaded.");
        DitexAdminAccountsPage ditexAdminAccountsPage = ditexAdminOrdersPage.clickOnAccountsButton();
        Assert.assertTrue(ditexAdminAccountsPage.ditexAdminAccountsPageIsLoaded(),"Accounts page is not loaded.");
        Assert.assertTrue(ditexAdminAccountsPage.tableAccountsIsLoaded(),"Accounts table is not loaded.");
    }

    @Test
    public void checkSearchField() {
        Assert.assertTrue(ditexAdminLoginPage.ditexAdminLoginPageIsLoaded(),"Admin page is not loaded.");
        DitexAdminOrdersPage ditexAdminOrdersPage = ditexAdminLoginPage.login(username,password);
        Assert.assertTrue(ditexAdminOrdersPage.ditexAdminLoginPageIsLoaded(),"All orders is not loaded.");
        DitexAdminAccountsPage ditexAdminAccountsPage = ditexAdminOrdersPage.clickOnAccountsButton();
        Assert.assertTrue(ditexAdminAccountsPage.ditexAdminAccountsPageIsLoaded(),"Accounts page is not loaded.");
        Assert.assertTrue(ditexAdminAccountsPage.tableAccountsIsLoaded(),"Accounts table is not loaded.");
        ditexAdminAccountsPage.searchEmail("gdd0070@gmail.com");
        Assert.assertEquals(ditexAdminAccountsPage.emailAccountsSum(),1,"Search filtration is not correct.");
        Assert.assertEquals(ditexAdminAccountsPage.emailAccountsGetText(),"gdd0070@gmail.com","Search email user is not correct.");
    }

    @Test
    public void checkHistoryOrdersButton() {
        Assert.assertTrue(ditexAdminLoginPage.ditexAdminLoginPageIsLoaded(),"Admin page is not loaded.");
        DitexAdminOrdersPage ditexAdminOrdersPage = ditexAdminLoginPage.login(username,password);
        Assert.assertTrue(ditexAdminOrdersPage.ditexAdminLoginPageIsLoaded(),"All orders is not loaded.");
        DitexAdminAccountsPage ditexAdminAccountsPage = ditexAdminOrdersPage.clickOnAccountsButton();
        Assert.assertTrue(ditexAdminAccountsPage.ditexAdminAccountsPageIsLoaded(),"Accounts page is not loaded.");
        Assert.assertTrue(ditexAdminAccountsPage.tableAccountsIsLoaded(),"Accounts table is not loaded.");
        ditexAdminAccountsPage.searchEmail("gdd0070@gmail.com");
        Assert.assertEquals(ditexAdminAccountsPage.emailAccountsSum(),1,"Search filtration is not correct.");
        ditexAdminAccountsPage.clickOnHistoryOrdersButton();
        Assert.assertTrue(ditexAdminAccountsPage.historyOrdersTableIsLoaded(),"History orders table is not loaded.");
    }

    @Test
    public void checkOrderDetails() {
        Assert.assertTrue(ditexAdminLoginPage.ditexAdminLoginPageIsLoaded(),"Admin page is not loaded.");
        DitexAdminOrdersPage ditexAdminOrdersPage = ditexAdminLoginPage.login(username,password);
        Assert.assertTrue(ditexAdminOrdersPage.ditexAdminLoginPageIsLoaded(),"All orders is not loaded.");
        DitexAdminAccountsPage ditexAdminAccountsPage = ditexAdminOrdersPage.clickOnAccountsButton();
        Assert.assertTrue(ditexAdminAccountsPage.ditexAdminAccountsPageIsLoaded(),"Accounts page is not loaded.");
        Assert.assertTrue(ditexAdminAccountsPage.tableAccountsIsLoaded(),"Accounts table is not loaded.");
        ditexAdminAccountsPage.searchEmail("gdd0070@gmail.com");
        Assert.assertEquals(ditexAdminAccountsPage.emailAccountsSum(),1,"Search filtration is not correct.");
        ditexAdminAccountsPage.clickOnHistoryOrdersButton();
        Assert.assertTrue(ditexAdminAccountsPage.historyOrdersTableIsLoaded(),"History orders table is not loaded.");
        ditexAdminAccountsPage.clickOnOrderDetailsButton();
        Assert.assertTrue(ditexAdminAccountsPage.orderDetailWindowIsLoaded(),"Order details is not loaded.");
    }

    @Test
    public void checkAdminRoles() {
        Assert.assertTrue(ditexAdminLoginPage.ditexAdminLoginPageIsLoaded(),"Admin page is not loaded.");
        DitexAdminOrdersPage ditexAdminOrdersPage = ditexAdminLoginPage.login(username,password);
        Assert.assertTrue(ditexAdminOrdersPage.ditexAdminLoginPageIsLoaded(),"All orders is not loaded.");
        DitexAdminRolesPage ditexAdminRolesPage = ditexAdminOrdersPage.clickOnAdminRolesButton();
        Assert.assertTrue(ditexAdminRolesPage.ditexAdminRolesPageIsLoaded(),"Admin accounts page is not loaded.");
        Assert.assertTrue(ditexAdminRolesPage.tableAdmins(),"Table admins is not loaded.");
    }

    @Test
    public void clickOnCreateAdminButton() {
        Assert.assertTrue(ditexAdminLoginPage.ditexAdminLoginPageIsLoaded(),"Admin page is not loaded.");
        DitexAdminOrdersPage ditexAdminOrdersPage = ditexAdminLoginPage.login(username,password);
        Assert.assertTrue(ditexAdminOrdersPage.ditexAdminLoginPageIsLoaded(),"All orders is not loaded.");
        DitexAdminRolesPage ditexAdminRolesPage = ditexAdminOrdersPage.clickOnAdminRolesButton();
        Assert.assertTrue(ditexAdminRolesPage.ditexAdminRolesPageIsLoaded(),"Admin accounts page is not loaded.");
        ditexAdminRolesPage.clickOnCreateAdminButton();
        Assert.assertTrue(ditexAdminRolesPage.createAdminWindowIsLoaded(),"Create admin window is not loaded.");
    }

    @Test
    public void incorrectCreateAdminWithEmptyEmail() {
        Assert.assertTrue(ditexAdminLoginPage.ditexAdminLoginPageIsLoaded(),"Admin page is not loaded.");
        DitexAdminOrdersPage ditexAdminOrdersPage = ditexAdminLoginPage.login(username,password);
        Assert.assertTrue(ditexAdminOrdersPage.ditexAdminLoginPageIsLoaded(),"All orders is not loaded.");
        DitexAdminRolesPage ditexAdminRolesPage = ditexAdminOrdersPage.clickOnAdminRolesButton();
        Assert.assertTrue(ditexAdminRolesPage.ditexAdminRolesPageIsLoaded(),"Admin accounts page is not loaded.");
        ditexAdminRolesPage.clickOnCreateAdminButton();
        Assert.assertTrue(ditexAdminRolesPage.createAdminWindowIsLoaded(),"Create admin window is not loaded.");
        ditexAdminRolesPage.createAdminWithAdminRole("","123456","Auto","Auto");
        Assert.assertTrue(ditexAdminRolesPage.createAdminButtonIsDisabled(),"Create admin button is enabled.");
    }

    @Test
    public void incorrectCreateAdminWithEmptyPassword() {
        Assert.assertTrue(ditexAdminLoginPage.ditexAdminLoginPageIsLoaded(),"Admin page is not loaded.");
        DitexAdminOrdersPage ditexAdminOrdersPage = ditexAdminLoginPage.login(username,password);
        Assert.assertTrue(ditexAdminOrdersPage.ditexAdminLoginPageIsLoaded(),"All orders is not loaded.");
        DitexAdminRolesPage ditexAdminRolesPage = ditexAdminOrdersPage.clickOnAdminRolesButton();
        Assert.assertTrue(ditexAdminRolesPage.ditexAdminRolesPageIsLoaded(),"Admin accounts page is not loaded.");
        ditexAdminRolesPage.clickOnCreateAdminButton();
        Assert.assertTrue(ditexAdminRolesPage.createAdminWindowIsLoaded(),"Create admin window is not loaded.");
        ditexAdminRolesPage.createAdminWithAdminRole("auto@auto.auto","","Auto","Auto");
        Assert.assertTrue(ditexAdminRolesPage.createAdminButtonIsDisabled(),"Create admin button is enabled.");
    }

    @Test
    public void correctCreateAdmin() {
        Assert.assertTrue(ditexAdminLoginPage.ditexAdminLoginPageIsLoaded(),"Admin page is not loaded.");
        DitexAdminOrdersPage ditexAdminOrdersPage = ditexAdminLoginPage.login(username,password);
        Assert.assertTrue(ditexAdminOrdersPage.ditexAdminLoginPageIsLoaded(),"All orders is not loaded.");
        DitexAdminRolesPage ditexAdminRolesPage = ditexAdminOrdersPage.clickOnAdminRolesButton();
        Assert.assertTrue(ditexAdminRolesPage.ditexAdminRolesPageIsLoaded(),"Admin accounts page is not loaded.");
        ditexAdminRolesPage.clickOnCreateAdminButton();
        Assert.assertTrue(ditexAdminRolesPage.createAdminWindowIsLoaded(),"Create admin window is not loaded.");
        ditexAdminRolesPage.createAdminWithAdminRole("auto@auto.auto","123456","Auto","Auto");
        ditexAdminRolesPage.clickOnCreateAdminButtonInWindow();
        Assert.assertTrue(ditexAdminRolesPage.newAdminAccountIsLoaded(),"Admin account is not created.");
    }

    @Test
    public void checkMobimoney() {
        Assert.assertTrue(ditexAdminLoginPage.ditexAdminLoginPageIsLoaded(),"Admin page is not loaded.");
        DitexAdminOrdersPage ditexAdminOrdersPage = ditexAdminLoginPage.login(username,password);
        Assert.assertTrue(ditexAdminOrdersPage.ditexAdminLoginPageIsLoaded(),"All orders is not loaded.");
        DitexAdminMobimoneyPage ditexAdminMobimoneyPage = ditexAdminOrdersPage.clickOnMobimoneyButton();
        Assert.assertTrue(ditexAdminMobimoneyPage.ditexAdminMobimoneyTransactionsIsLoaded(),"'Mobimoney' page is not loaded.");
    }

    @Test
    public void checkMobimoneyOrderList() {
        Assert.assertTrue(ditexAdminLoginPage.ditexAdminLoginPageIsLoaded(),"Admin page is not loaded.");
        DitexAdminOrdersPage ditexAdminOrdersPage = ditexAdminLoginPage.login(username,password);
        Assert.assertTrue(ditexAdminOrdersPage.ditexAdminLoginPageIsLoaded(),"All orders is not loaded.");
        DitexAdminMobimoneyPage ditexAdminMobimoneyPage = ditexAdminOrdersPage.clickOnMobimoneyButton();
        Assert.assertTrue(ditexAdminMobimoneyPage.ditexAdminMobimoneyTransactionsIsLoaded(),"'Mobimoney' page is not loaded.");
        Assert.assertTrue(ditexAdminMobimoneyPage.ordersIsLoaded(),"Order list is not loaded.");
    }

    @Test
    public void openMobimoneyDetails() {
        Assert.assertTrue(ditexAdminLoginPage.ditexAdminLoginPageIsLoaded(),"Admin page is not loaded.");
        DitexAdminOrdersPage ditexAdminOrdersPage = ditexAdminLoginPage.login(username,password);
        Assert.assertTrue(ditexAdminOrdersPage.ditexAdminLoginPageIsLoaded(),"All orders is not loaded.");
        DitexAdminMobimoneyPage ditexAdminMobimoneyPage = ditexAdminOrdersPage.clickOnMobimoneyButton();
        Assert.assertTrue(ditexAdminMobimoneyPage.ditexAdminMobimoneyTransactionsIsLoaded(),"'Mobimoney' page is not loaded.");
        Assert.assertTrue(ditexAdminMobimoneyPage.ordersIsLoaded(),"Order list is not loaded.");
        ditexAdminMobimoneyPage.clickOnOrderDetailsButton();
        Assert.assertTrue(ditexAdminMobimoneyPage.orderDetailsIsLoaded(),"Order details is not loaded.");
    }
}