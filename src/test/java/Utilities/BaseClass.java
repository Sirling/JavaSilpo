package Utilities;

import Pages.BasePage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass extends Driver{



    @BeforeTest
    public static void setup(){

        BasePage.openHomePage();
    }

    @AfterTest
    public static void cleanup(){

        Driver.close();
    }

}
