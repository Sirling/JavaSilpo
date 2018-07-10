package Pages;

import config.Locators;

public class DefaultPage {

    //Side menu links
    public static BasePage sideMenuOffersPageLink(){

        BasePage.waitForVisibility(Locators.offersSideMenuLink).click();
        return new OffersPage();
    }

    public static BasePage sideMenuAboutPageLink(){

        BasePage.waitForVisibility(Locators.aboutSideMenuLink).click();
        return new AboutPage();
    }

    public static BasePage sideMenuStoresPageLink(){

        BasePage.waitForVisibility(Locators.storesSideMenuLink).click();
        return new StoresPage();
    }

    public static BasePage sideMenuFaqPageLink(){

        BasePage.waitForVisibility(Locators.faqSideMenuLink).click();
        return new FaqPage();
    }

    public static BasePage sideMenuWorkPageLink(){

        BasePage.waitForVisibility(Locators.workSideMenuLink).click();
        return new WorkPage();
    }

    public static BasePage sideMenuContactsPageLink(){

        BasePage.waitForVisibility(Locators.contactsSideMenuLink).click();
        return new ContactsPage();
    }

    //Footer links

    public static BasePage footerOffersLink() {

        BasePage.waitForVisibility(Locators.footerOffersLink);
        return new OffersPage();
    }
}
