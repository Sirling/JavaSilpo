package Utilities;

import Pages.BasePage;
import org.testng.annotations.*;

public class BaseClass extends Driver{


    @BeforeMethod
    public static void setup(){

        BasePage.openHomePage();
    }

    @AfterMethod
    public static void cleanup() {

        Driver.close();
    }
}
