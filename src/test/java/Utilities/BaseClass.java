package Utilities;

import org.junit.AfterClass;
import org.junit.BeforeClass;

public class BaseClass extends Driver{



    @BeforeClass
    public static void setup(){

        Driver.Initialize();
    }

    @AfterClass
    public static void cleanup(){

        Driver.close();
    }

}
