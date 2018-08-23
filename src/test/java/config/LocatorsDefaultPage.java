package config;

import org.openqa.selenium.By;

public class LocatorsDefaultPage {

    public static String barcode = "1087289826";
    public static String password = "5374";

    //Side menu locators
    public static By offersSideMenuLink = By.cssSelector("");
    public static By aboutSideMenuLink = By.cssSelector(".menu__nav a:nth-child(2)");
    public static By storesSideMenuLink = By.cssSelector(".menu__nav a:nth-child(3)");
    public static By faqSideMenuLink = By.cssSelector(".menu__nav a:nth-child(4)");
    public static By workSideMenuLink = By.cssSelector(".menu__nav a:nth-child(5)");
    public static By contactsSideMenuLink = By.cssSelector(".menu__nav a:nth-child(6)");

    //Registration and authorization locators
    public static By authFormButton = By.className("btn-menu-login");
    public static By enterBarcode = By.name("barcode");
    public static By enterPassword = By.name("password");
    public static By submitButton = By.className("login-form__submit");

    //Authorized user elements on main page
    public static By userShortName = By.className("bar-text");
    public static String userShortNameText = "Раз Р.";

    //Footer main links
    public static By footerOffersLink = By.cssSelector(".dtcell:nth-of-type(1) a:nth-child(1)");
    public static By footerAboutLink = By.cssSelector(".dtcell:nth-of-type(2) a:nth-child(1)");
    public static By footerFaqLink = By.cssSelector(".dtcell:nth-of-type(3) h4:nth-child(1)");
    public static By footerStoresLink = By.cssSelector(".dtcell:nth-of-type(3) h4:nth-child(2) > a");
    public static By footerContactsLink = By.cssSelector(".dtcell:nth-of-type(3) h4:nth-of-type(3) > a");

    //Footer additional links.
    //First column
    public static By footerCinaTizhnya = By.cssSelector(".footer__site-map-links:nth-of-type(1) li:nth-child(1) > a");
    public static By footerAkciyiVlasnogoImportu = By.cssSelector(".footer__site-map-links:nth-of-type(1) li:nth-child(2)");
    public static By footerDityachiTizhni = By.cssSelector(".footer__site-map-links:nth-of-type(1) li:nth-child(3) > a");
    public static By footerNeobhidniLyudyamObekti = By.cssSelector(".footer__site-map-links:nth-of-type(1) li:nth-child(4)");
    public static By footerOtherOffers = By.cssSelector(".footer__site-map-links:nth-of-type(1) li:nth-child(5) > a");

    //Second column
    public static By footerOwnProduction = By.cssSelector(".dtcell:nth-of-type(2) li:nth-child(1) > a");
    public static By footerPersonalAccount = By.cssSelector(".dtcell:nth-of-type(2) li:nth-child(2) > a");
    public static By footerOurFriends = By.cssSelector(".dtcell:nth-of-type(2) li:nth-child(3) > a");
    public static By footerOurGuests = By.cssSelector(".dtcell:nth-of-type(2) li:nth-child(4) > a");
    public static By footerPressCenter = By.cssSelector(".dtcell:nth-of-type(2) li:nth-child(5) > a");
    public static By footerEvents = By.cssSelector(".dtcell:nth-of-type(2) li:nth-child(6) > a");

    //Below side menu
    static public By facebookLink = By.cssSelector(".facebook-link");

    public static By copyrights = By.cssSelector(".copyrights");

}
