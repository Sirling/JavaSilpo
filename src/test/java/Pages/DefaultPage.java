package Pages;

import Utilities.Driver;
import config.Locators;

public class DefaultPage extends BasePage {

    public static LoginPage authForm(){

        Driver.getInstance().findElement(Locators.authFormButton).click();
        return new LoginPage();
    }

    //Side menu links
    public static BasePage sideMenuOffersPageLinkClick(){

        try {
            BasePage.waitForElementIsClickable(Locators.offersSideMenuLink).click();
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new OffersPage();
    }

    public static BasePage sideMenuAboutPageLinkClick(){

        try {
            BasePage.waitForElementIsClickable(Locators.aboutSideMenuLink).click();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new AboutPage();
    }

    public static BasePage sideMenuStoresPageLinkClick(){

        try {
            BasePage.waitForElementIsClickable(Locators.storesSideMenuLink).click();
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new StoresPage();
    }

    public static BasePage sideMenuFaqPageLinkClick(){

        try {
            BasePage.waitForElementIsClickable(Locators.faqSideMenuLink).click();
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new FaqPage();
    }

    public static BasePage sideMenuWorkPageLinkClick(){

        try {
            BasePage.waitForElementIsClickable(Locators.workSideMenuLink).click();
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new WorkPage();
    }

    public static BasePage sideMenuContactsPageLinkClick(){

        try {
            BasePage.waitForElementIsClickable(Locators.contactsSideMenuLink).click();
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new ContactsPage();
    }

    //Footer main links

    public static BasePage footerOffersLinkClick() {

        try {
            scrollToFooter();
            BasePage.waitForElementIsClickable(Locators.footerOffersLink).click();
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new OffersPage();
    }

    public static BasePage footerAboutLinkClick() {

        try {
            scrollToFooter();
            BasePage.waitForElementIsClickable(Locators.footerAboutLink).click();
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new AboutPage();
    }

    public static BasePage footerFAQLinkClick() {

        try {
            scrollToFooter();
            BasePage.waitForElementIsClickable(Locators.footerFaqLink).click();
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new FaqPage();
    }

    public static BasePage footerStoresLinkClick() {

        try {
            scrollToFooter();
            BasePage.waitForElementIsClickable(Locators.footerStoresLink).click();
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new StoresPage();
    }
    public static BasePage footerContactsLinkClick() {

        try {
            scrollToFooter();
            BasePage.waitForElementIsClickable(Locators.footerContactsLink).click();
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new ContactsPage();
    }

    //Footer additional links

    public static BasePage footerCinaTizhnyaLinkClick() {

        try {
            scrollToFooter();
            BasePage.waitForElementIsClickable(Locators.footerCinaTizhnya).click();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new OfferPage();
    }

    public static BasePage footerAkciyiVlasnogoImportuLinkClick() {

        try {
            scrollToFooter();
            BasePage.waitForElementIsClickable(Locators.footerAkciyiVlasnogoImportu).click();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new OfferPage();
    }

    public static BasePage footerDityachiTizhniLinkClick() {

        try {
            scrollToFooter();
            BasePage.waitForElementIsClickable(Locators.footerDityachiTizhni).click();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new OfferPage();
    }
    public static BasePage footerNeobhidniLyudyamObektiLinkClick() {

        try {
            scrollToFooter();
            BasePage.waitForElementIsClickable(Locators.footerNeobhidniLyudyamObekti).click();
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new OfferPage();
    }
    public static BasePage footerOtherOffersLinkClick() {

        try {
            scrollToFooter();
            BasePage.waitForElementIsClickable(Locators.footerOtherOffers).click();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new OfferPage();
    }

    public static BasePage footerOwnProductionLinkClick() {

        try {
            scrollToFooter();
            BasePage.waitForElementIsClickable(Locators.footerOwnProduction).click();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new OwnProductionPage();
    }
    public static BasePage footerPersonalAccountLinkClick() {

        try {
            scrollToFooter();
            BasePage.waitForElementIsClickable(Locators.footerPersonalAccount).click();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new PersonalAccountPage();
    }
    public static BasePage footerOurFriendsLinkClick() {

        try {
            scrollToFooter();
            BasePage.waitForElementIsClickable(Locators.footerOurFriends).click();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new OurFriendsPage();
    }
    public static BasePage footerOurGuestsLinkClick() {

        try {
            scrollToFooter();
            BasePage.waitForElementIsClickable(Locators.footerOurGuests).click();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new OurGuestsPage();
    }
    public static BasePage footerPressCenterLinkClick() {

        try {
            scrollToFooter();
            BasePage.waitForElementIsClickable(Locators.footerPressCenter).click();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new PressCenterPage();
    }
    public static BasePage footerEventsLinkClick() {

        try {
            scrollToFooter();
            BasePage.waitForElementIsClickable(Locators.footerEvents).click();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new EventsPage();
    }
}
