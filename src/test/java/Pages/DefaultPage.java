package Pages;

import Utilities.Driver;
import config.LocatorsDefaultPage;

import java.util.ArrayList;

public class DefaultPage extends BasePage {

    public static LoginPage authForm(){

        Driver.getInstance().findElement(LocatorsDefaultPage.authFormButton).click();
        return new LoginPage();
    }

    //Side menu links
    public static BasePage sideMenuOffersPageLinkClick(){

        try {
            BasePage.waitForElementIsClickable(LocatorsDefaultPage.offersSideMenuLink).click();
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new OffersPage();
    }

    public static BasePage sideMenuAboutPageLinkClick(){

        try {
            BasePage.waitForElementIsClickable(LocatorsDefaultPage.aboutSideMenuLink).click();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new AboutPage();
    }

    public static BasePage sideMenuStoresPageLinkClick(){

        try {
            BasePage.waitForElementIsClickable(LocatorsDefaultPage.storesSideMenuLink).click();
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new StoresPage();
    }

    public static BasePage sideMenuFaqPageLinkClick(){

        try {
            BasePage.waitForElementIsClickable(LocatorsDefaultPage.faqSideMenuLink).click();
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new FaqPage();
    }

    public static BasePage sideMenuWorkPageLinkClick(){

        try {
            BasePage.waitForElementIsClickable(LocatorsDefaultPage.workSideMenuLink).click();
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new WorkPage();
    }

    public static BasePage sideMenuContactsPageLinkClick(){

        try {
            BasePage.waitForElementIsClickable(LocatorsDefaultPage.contactsSideMenuLink).click();
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
            BasePage.waitForElementIsClickable(LocatorsDefaultPage.footerOffersLink).click();
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new OffersPage();
    }

    public static BasePage footerAboutLinkClick() {

        try {
            scrollToFooter();
            BasePage.waitForElementIsClickable(LocatorsDefaultPage.footerAboutLink).click();
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new AboutPage();
    }

    public static BasePage footerFAQLinkClick() {

        try {
            scrollToFooter();
            BasePage.waitForElementIsClickable(LocatorsDefaultPage.footerFaqLink).click();
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new FaqPage();
    }

    public static BasePage footerStoresLinkClick() {

        try {
            scrollToFooter();
            BasePage.waitForElementIsClickable(LocatorsDefaultPage.footerStoresLink).click();
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new StoresPage();
    }
    public static BasePage footerContactsLinkClick() {

        try {
            scrollToFooter();
            BasePage.waitForElementIsClickable(LocatorsDefaultPage.footerContactsLink).click();
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
            BasePage.waitForElementIsClickable(LocatorsDefaultPage.footerCinaTizhnya).click();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new OfferPage();
    }

    public static BasePage footerAkciyiVlasnogoImportuLinkClick() {

        try {
            scrollToFooter();
            BasePage.waitForElementIsClickable(LocatorsDefaultPage.footerAkciyiVlasnogoImportu).click();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new OfferPage();
    }

    public static BasePage footerDityachiTizhniLinkClick() {

        try {
            scrollToFooter();
            BasePage.waitForElementIsClickable(LocatorsDefaultPage.footerDityachiTizhni).click();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new OfferPage();
    }
    public static BasePage footerNeobhidniLyudyamObektiLinkClick() {

        try {
            scrollToFooter();
            BasePage.waitForElementIsClickable(LocatorsDefaultPage.footerNeobhidniLyudyamObekti).click();
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new OfferPage();
    }
    public static BasePage footerOtherOffersLinkClick() {

        try {
            scrollToFooter();
            BasePage.waitForElementIsClickable(LocatorsDefaultPage.footerOtherOffers).click();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new OfferPage();
    }

    public static BasePage footerOwnProductionLinkClick() {

        try {
            scrollToFooter();
            BasePage.waitForElementIsClickable(LocatorsDefaultPage.footerOwnProduction).click();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new OwnProductionPage();
    }
    public static BasePage footerPersonalAccountLinkClick() {

        try {
            scrollToFooter();
            BasePage.waitForElementIsClickable(LocatorsDefaultPage.footerPersonalAccount).click();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new PersonalAccountPage();
    }
    public static BasePage footerOurFriendsLinkClick() {

        try {
            scrollToFooter();
            BasePage.waitForElementIsClickable(LocatorsDefaultPage.footerOurFriends).click();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new OurFriendsPage();
    }
    public static BasePage footerOurGuestsLinkClick() {

        try {
            scrollToFooter();
            BasePage.waitForElementIsClickable(LocatorsDefaultPage.footerOurGuests).click();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new OurGuestsPage();
    }
    public static BasePage footerPressCenterLinkClick() {

        try {
            scrollToFooter();
            BasePage.waitForElementIsClickable(LocatorsDefaultPage.footerPressCenter).click();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new PressCenterPage();
    }
    public static BasePage footerEventsLinkClick() {

        try {
            scrollToFooter();
            BasePage.waitForElementIsClickable(LocatorsDefaultPage.footerEvents).click();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new EventsPage();
    }

    public static void facebookLink() {

        try {
            Driver.getInstance().findElement(LocatorsDefaultPage.facebookLink).click();
            Thread.sleep(3000);
            ArrayList<String> windows = new ArrayList<>(Driver.getInstance().getWindowHandles());
//            Driver.getInstance().close();
            Driver.getInstance().switchTo().window(windows.get(1));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
