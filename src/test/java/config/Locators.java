package config;

import org.openqa.selenium.By;

public class Locators {

    //Side menu locators
    public static By offersSideMenuLink = By.cssSelector(".menu__nav a:nth-child(1)");
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
    public static By footerFaqLink = By.cssSelector(".dtcell:nth-of-type(3) a:nth-child(1)");
    public static By footerStoresLink = By.cssSelector(".dtcell:nth-of-type(3) a:nth-child(2)");
    public static By footerContactsLink = By.cssSelector(".dtcell:nth-of-type(3) a:nth-child(3)");

    //Footer additional links
    public static By footerCinaTizhnya = By.cssSelector(".footer__site-map-links:nth-of-type(1) li:nth-child(1)");
    public static By footerAkciyiVlasnogoImportu = By.cssSelector(".footer__site-map-links:nth-of-type(1) li:nth-child(2)");
    public static By footerDityachiTizhni = By.cssSelector(".footer__site-map-links:nth-of-type(1) li:nth-child(2)");
    public static By footerNeobhidniLyudyamObekti = By.cssSelector(".footer__site-map-links:nth-of-type(1) li:nth-child(2)");
    public static By footerOtherOffers = By.cssSelector(".footer__site-map-links:nth-of-type(1) li:nth-child(2)");


}
