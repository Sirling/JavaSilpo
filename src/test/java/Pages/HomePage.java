package Pages;

import Utilities.Driver;
import config.Locators;

public class HomePage extends BasePage {


    public static LoginPage authForm(){

        Driver.getInstance().findElement(Locators.authFormButton).click();
        return new LoginPage();
    }

}
