package Pages;

import Utilities.Driver;
import config.configuration;

public class BasePage extends Driver {

    public BasePage() {
        Driver.Initialize();
    }

    public static BasePage open(){

        Driver.Instance.get(configuration.url.app_url);
        return new HomePage();
    }

}
