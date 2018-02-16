package Utilities;

import org.junit.AfterClass;
import org.junit.BeforeClass;

public class BasePage {



    @BeforeClass
    public void setup(){

        Driver.Initialize();
    }

    @AfterClass
    public void cleanup(){

        Driver.close();
    }

}
