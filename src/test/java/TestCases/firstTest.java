package TestCases;

import Utilities.BasePage;
import Utilities.Driver;
import config.configuration;
import org.junit.Test;

public class firstTest extends BasePage {


    @Test
    public void test1() throws InterruptedException{

        Driver.Instance.navigate().to(configuration.url.app_url);
        Thread.sleep(5000);

    }


}
