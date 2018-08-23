package Utilities;

import Pages.DefaultPage;
import config.configuration.url;
import org.testng.annotations.*;

public class BaseClass extends Driver{

//    @BeforeMethod
//    public static void setup(){
//
//        DefaultPage.openPage(url.homePage);
//    }

    @AfterMethod
    public static void cleanup() {

        Driver.quit();
    }
}
