package TestSuites;

import Pages.DefaultPage;
import Pages.OffersPage;
import Utilities.BaseClass;
import config.configuration.url;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static config.CSSValues.introHeight;
import static config.CSSValues.orange;
import static config.LocatorsOffersPage.introBlock;


public class OffersPageTests extends BaseClass {

    @BeforeMethod
    public static void setup() {

        DefaultPage.openPage(url.offersPage);
    }

    @Test
    public static void introBlockBackgroundColor() {

        Assert.assertEquals(OffersPage.getBackgroundColor(introBlock), orange);

    }

    @Test
    public static void introBlockHeight() {

        Assert.assertEquals(OffersPage.getHeight(introBlock), introHeight);
    }

    @Test
    public static void introBlockCinaTizhnya() {


    }
}
