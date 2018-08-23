package TestSuites;

import Pages.*;
import Utilities.BaseClass;
import Utilities.RetryListener;
import Utilities.TestListener;
import config.configuration.url;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static Pages.BasePage.getTitle;

@Listeners ({RetryListener.class, TestListener.class})
public class DefaultPageTests extends BaseClass {

    @BeforeMethod
    public static void setup() {

        DefaultPage.openPage(url.homePage);
    }

    //Side menu links
    @Test
    public static void sideMenuLinkOffers() {

        DefaultPage.sideMenuOffersPageLinkClick();
        Assert.assertEquals(getTitle(), "Акції");
    }

    @Test
    public static void sideMenuLinkAbout() {

        DefaultPage.sideMenuAboutPageLinkClick();
        Assert.assertEquals(getTitle(),"За що нас люблять");
    }

    @Test
    public static void sideMenuLinkStores() {

        DefaultPage.sideMenuStoresPageLinkClick();
        Assert.assertEquals(getTitle(), "Супермаркети");
    }

    @Test
    public static void sideMenuLinkFAQ() {

        DefaultPage.sideMenuFaqPageLinkClick();
        Assert.assertEquals(getTitle(), "Питання та відповіді");
    }

    @Test
    public static void sideMenuLinkWork() {

        DefaultPage.sideMenuWorkPageLinkClick();
        Assert.assertEquals(getTitle(),"Робота в «Сільпо»");
    }

    @Test
    public static void sideMenuLinkContacts() {

        DefaultPage.sideMenuContactsPageLinkClick();
        Assert.assertEquals(getTitle(), "Контакти");
    }

    @Test
    public static void sideMenuFacebookLink() {

        DefaultPage.facebookLink();
        Assert.assertEquals(getTitle(), "Сільпо - Главная | Facebook");
    }

    //Footer main links check
    //doesn't depend on admin panel configuration

    @Test
    public static void footerOffersLink() {

        DefaultPage.footerOffersLinkClick();
        Assert.assertEquals(getTitle(),"Акції");
    }

    @Test
    public static void footerAboutLink() {

        DefaultPage.footerAboutLinkClick();
        Assert.assertEquals(getTitle(),"За що нас люблять");
    }

    @Test
    public static void footerFAQLink() {

        DefaultPage.footerFAQLinkClick();
        Assert.assertEquals(getTitle(),"Питання та відповіді");
    }

    @Test
    public static void footerStoresLink() {

        DefaultPage.footerStoresLinkClick();
        Assert.assertEquals(getTitle(),"Супермаркети");
    }

    @Test
    public static void footerContactsLink() {

        DefaultPage.footerContactsLinkClick();
        Assert.assertEquals(getTitle(),"Контакти");
    }

    //Additional footer links

    @Test
    public static void footerCinaTizhnya() {

        DefaultPage.footerCinaTizhnyaLinkClick();
        Assert.assertEquals(getTitle(),"Ціна тижня");
    }

    @Test
    public static void footerAkciyiVlasnogoImportu() {

        DefaultPage.footerAkciyiVlasnogoImportuLinkClick();
        Assert.assertEquals(getTitle(),"Акції власного імпорту");
    }

    @Test
    public static void footerDityachiTizhni() {

        DefaultPage.footerDityachiTizhniLinkClick();
        Assert.assertEquals(getTitle(),"Дитячі тижні");
    }

    @Test
    public static void footerNeobhidniLyudyamObekti() {

        DefaultPage.footerNeobhidniLyudyamObektiLinkClick();
        Assert.assertEquals(getTitle(),"Необхідні людям об'єкти");
    }

    @Test
    public static void footerOtherOffers() {

        DefaultPage.footerOtherOffersLinkClick();
        Assert.assertEquals(getTitle(), ("Інші акції"));
    }

    @Test
    public static void footerOwnProduction() {

        DefaultPage.footerOwnProductionLinkClick();
        Assert.assertEquals(getTitle(), "Власне виробництво");
    }

    @Test
    public static void footerPersonalAccount() {

        DefaultPage.footerPersonalAccountLinkClick();
        Assert.assertEquals(getTitle(), "Про «Власний Рахунок»");
    }

    @Test
    public static void footerOurFriends() {

        DefaultPage.footerOurFriendsLinkClick();
        Assert.assertEquals(getTitle(), "Друзі «Сільпо»");
    }

    @Test
    public static void footerOurGuests(){

        DefaultPage.footerOurGuestsLinkClick();
        Assert.assertEquals(getTitle(), "Гостям");
    }

    @Test
    public static void footerPressCenter() {

        DefaultPage.footerPressCenterLinkClick();
        Assert.assertEquals(getTitle(), "Прес-центр");
    }

    @Test
    public static void footerEvents() {

        DefaultPage.footerEventsLinkClick();
        Assert.assertEquals(getTitle(), "Події");
    }

}
