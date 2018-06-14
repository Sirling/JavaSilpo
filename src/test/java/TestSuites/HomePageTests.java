package TestSuites;

import Pages.BasePage;
import Pages.HomePage;
import Pages.LoginPage;
import Utilities.BaseClass;
import config.Locators;
import org.junit.Test;



public class HomePageTests extends BaseClass {

    @Test
    public void authentification() throws InterruptedException{

        BasePage.open();
        HomePage.authForm();
        LoginPage.enterBarcode()

        Thread.sleep(5000);

    }


}
