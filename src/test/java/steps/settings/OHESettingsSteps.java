//package steps.settings;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.openqa.selenium.WebDriver;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.openqa.selenium.WebDriver;
//import org.testng.Assert;
//import pages.BasePage;
//import pages.settings.OhSettingsPage;
//
//
//public class OhSettingsSteps extends BasePage {
//
//    private OhSettingsPage _page;
//
//    public OhSettingsSteps() {
//
//        this._page = new OhSettingsPage();
//
//    }
//    @Given("I login and go to dashboard page")
//    public void iLoginAndGoToDashboardPage(){
//        _page.setHomePage();
//        _page.goToLoginPage();
//        _page.login();
//        _page.goToDashboard();
//    }
//
//    @When("I select My Settings")
//    public void iSelectMySettings() {
//        _page.selectMySettings();
//    }
//
//    @Then("I validate the profile information")
//    public void iValidateTheProfileInformation() {
//        Assert.assertEquals(_page.settingsConfirm(),"Personal information");
//    }
//
//    @And("I select social section")
//    public void iSelectSocialSection() {
//        _page.selectSocial();
//    }
//
//    @Then("I see the social information")
//    public void iSeeTheSocialInformation() {
//        Assert.assertEquals(_page.socialConfirm(), "Enter Your Social Profile URLs");
//    }
//
//    @And("I select payment section")
//    public void iSelectPaymentSection() {
//        _page.selectPayment();
//    }
//
//    @Then("I see the payment information")
//    public void iSeeThePaymentInformation() {
//        Assert.assertEquals(_page.paymentConfirm(), true);
//    }
//
//    @And("I select CashOut section")
//    public void iSelectCashOutSection() {
//        _page.selectCashOut();
//    }
//
//    @Then("I see the cashout information")
//    public void iSeeTheCashoutInformation() {
//        Assert.assertEquals(_page.cashOutConfirm(), "Funding details");
//    }
//
//    @And("I select password section")
//    public void iSelectSecuritySection() {
//        _page.selectSecurity();
//    }
//
//    @Then("I see the password information")
//    public void iSeeTheSecurityInformation() {
//        Assert.assertEquals(_page.securityConfirm(), "Change Password");
//    }
//
//    @And("I select Addresses section")
//    public void iSelectExperienceSection() {
//        _page.settingsReload();
//        _page.selectAddresses();
//    }
//
////    @Then("I see the Addresses information")
////    public void iSeeTheAddressesInformation() {
////        Assert.assertEquals(_page.addressesConfirm(), "Add new Address");
////    }
//
//
////    @And("I select Notifications section")
////    public void iSelectNotificationsSection() {
////        _page.settingsReload();
////        _page.notificationsTab();
////    }
////
////    @Then("I see the Notifications information")
////    public void iSeeTheNotificationsInformation() {
////        Assert.assertEquals(_page.notificationsConfirm(), "Email Notifications");
//    }
