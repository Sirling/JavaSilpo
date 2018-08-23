package TestSuites;

import Pages.DefaultPage;
import Pages.GiftCertificatesPage;
import Utilities.BaseClass;
import Utilities.RetryListener;
import Utilities.TestListener;
import config.configuration;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static Pages.BasePage.*;
import static config.CSSValues.*;
import static config.LocatorsGiftCertificatePage.*;
import static org.testng.Assert.assertEquals;

@Listeners({RetryListener.class, TestListener.class})

public class GiftCertificatesPageTests extends BaseClass {


    @BeforeMethod
    public static void setup() {

        DefaultPage.openPage(configuration.url.giftCertificatesPage);
    }

    @Test()
    public static void introImagePresence() {

        GiftCertificatesPage.isTitleImage(introBlock);

    }

    @Test
    public static void introBackgroundColor() {

        assertEquals(getBackgroundColor(introBlock), olive);
    }

    @Test
    public static void introTitleFontSize() {

        assertEquals(getFontSize(introTitle), introTitleFontSize);
    }

    @Test
    public static void introFontColor() {

        assertEquals(getFontColor(introTitle), white);
    }

    @Test
    public static void introHrColor() {

        assertEquals(getFontColor(introHr), white);
    }

    @Test
    public static void introTextFontSize() {

        assertEquals(getFontSize(introText), introTextFontSize);
    }

    @Test
    public static void introTextFontColor() {

        assertEquals(getFontColor(introText), white);
    }

    @Test
    public static void firstCBImagePresence() {
        isImage(firstCBImage);
    }

    @Test
    public static void firstCBTitleFontSize() {
        assertEquals(getFontSize(firstCBTitle), CBTitleFontSize);
    }

    @Test
    public static void firstCBTitleFontColor() {
        assertEquals(getFontColor(firstCBTitle), black);
    }

    @Test
    public static void firstCBAddButton() {


    }
}
