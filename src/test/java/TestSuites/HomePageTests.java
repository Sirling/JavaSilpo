package TestSuites;

import Pages.BasePage;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.OffersPage;
import Utilities.BaseClass;
import config.Locators;
import org.testng.annotations.Test;


public class HomePageTests extends BaseClass {

    @Test
    public void authentication() {

            HomePage.authForm();
            LoginPage.enterBarcode(LoginPage.barcode)
                    .enterPassword(LoginPage.password)
                    .submitForm();
            assert (BasePage.getUserShortName().equals(Locators.userShortNameText));
    }



}
