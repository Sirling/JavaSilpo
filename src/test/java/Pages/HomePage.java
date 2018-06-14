package Pages;

import Utilities.Driver;
import config.Locators;
import config.configuration;

public class HomePage extends BasePage {

    public static HomePage open(){

        Driver.Instance.get(configuration.url.app_url);
        return new HomePage();
    }

    public static LoginPage authForm(){

        Driver.Instance.findElement(Locators.authFormButton).click();
        return new LoginPage();
    }

}
