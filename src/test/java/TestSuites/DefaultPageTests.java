package TestSuites;

import Pages.*;
import Utilities.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DefaultPageTests extends BaseClass {


    @Test (groups = "sidemenu", priority = 1)
    public static void sideMenuLinkOffers() {

        DefaultPage.sideMenuOffersPageLinkClick();
        Assert.assertEquals(OffersPage.getTitle(), "Акці");
    }

    @Test
    public static void sideMenuLinkAbout() {

        DefaultPage.sideMenuAboutPageLinkClick();
        Assert.assertEquals(AboutPage.getTitle(),"За що нас люблять");
    }

    @Test
    public static void sideMenuLinkStores() {

        DefaultPage.sideMenuStoresPageLinkClick();
        Assert.assertEquals(StoresPage.getTitle(), "Супермаркети");
    }

    @Test
    public static void sideMenuLinkFAQ() {

        DefaultPage.sideMenuFaqPageLinkClick();
        Assert.assertEquals(FaqPage.getTitle(), "Питання та відповіді");
    }

    @Test
    public static void sideMenuLinkWork() {

        DefaultPage.sideMenuWorkPageLinkClick();
        Assert.assertEquals(WorkPage.getTitle(),"Робота в «Сільпо»");
    }

    @Test
    public static void sideMenuLinkContacts() {

        DefaultPage.sideMenuContactsPageLinkClick();
        Assert.assertEquals(ContactsPage.getTitle(), "Контакти");
    }

    //Footer main links check
    //doesn't depend on admin panel configuration

    @Test
    public static void footerOffersLink() {

        DefaultPage.footerOffersLinkClick();
        Assert.assertEquals(OfferPage.getTitle(),"Акції");
    }

    @Test
    public static void footerAboutLink() {

        DefaultPage.footerAboutLinkClick();
        Assert.assertEquals(OfferPage.getTitle(),"За що нас люблять");
    }

    @Test
    public static void footerFAQLink() {

        DefaultPage.footerFAQLinkClick();
        Assert.assertEquals(OfferPage.getTitle(),"Питання та відповіді");
    }

    @Test
    public static void footerStoresLink() {

        DefaultPage.footerStoresLinkClick();
        Assert.assertEquals(OfferPage.getTitle(),"Супермаркети");
    }

    @Test
    public static void footerContactsLink() {

        DefaultPage.footerContactsLinkClick();
        Assert.assertEquals(OfferPage.getTitle(),"Контакти");
    }

    //Additional footer links

    @Test
    public static void footerCinaTizhnya() {

        DefaultPage.footerCinaTizhnyaLinkClick();
        Assert.assertEquals(OfferPage.getTitle(),"Ціна тижня");
    }

    @Test
    public static void footerAkciyiVlasnogoImportu() {

        DefaultPage.footerAkciyiVlasnogoImportuLinkClick();
        Assert.assertEquals(OfferPage.getTitle(),"Акції власного імпорту");
    }

    @Test
    public static void footerDityachiTizhni() {

        DefaultPage.footerDityachiTizhniLinkClick();
        Assert.assertEquals(OfferPage.getTitle(),"Дитячі тижні");
    }

    @Test
    public static void footerNeobhidniLyudyamObekti() {

        DefaultPage.footerNeobhidniLyudyamObektiLinkClick();
        Assert.assertEquals(OfferPage.getTitle(),"Необхідні людям об'єкти");
    }

    @Test
    public static void footerOtherOffers() {

        DefaultPage.footerOtherOffersLinkClick();
        Assert.assertEquals(OfferPage.getTitle(), ("Інші акції"));
    }

    @Test
    public static void footerOwnProduction() {

        DefaultPage.footerOwnProductionLinkClick();
        Assert.assertEquals(PersonalAccountPage.getTitle(), "Власне виробництво");
    }

    @Test
    public static void footerPersonalAccount() {

        DefaultPage.footerPersonalAccountLinkClick();
        Assert.assertEquals(PersonalAccountPage.getTitle(), "Про «Власний Рахунок»");
    }

    @Test
    public static void footerOurFriends() {

        DefaultPage.footerOurFriendsLinkClick();
        Assert.assertEquals(OurFriendsPage.getTitle(), "Друзі «Сільпо»");
    }

    @Test
    public static void footerOurGuests(){

        DefaultPage.footerOurGuestsLinkClick();
        Assert.assertEquals(OurGuestsPage.getTitle(), "Гостям");
    }

    @Test
    public static void footerPressCenter() {

        DefaultPage.footerPressCenterLinkClick();
        Assert.assertEquals(PressCenterPage.getTitle(), "Прес-центр");
    }

    @Test
    public static void footerEvents() {

        DefaultPage.footerEventsLinkClick();
        Assert.assertEquals(EventsPage.getTitle(), "Події");
    }
}
