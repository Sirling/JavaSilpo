package config;

import org.openqa.selenium.By;

public class LocatorsGiftCertificatePage {

    //"My Orders" top menu icons
    public static By myOrdersIcon = By.cssSelector(".cart-buttons-block__cell-buttons a:nth-of-type(1)");
    public static By basketIcon = By.cssSelector(".cart-buttons-block__cell-buttons a:nth-of-type(2)");
    public static By exitIcon = By.cssSelector(".cart-buttons-block__cell-buttons a:nth-of-type(3)");
    //

    //Intro block
    public static By introTitle = By.className("intro-title");
    public static By introBlock = By.className("gift-certificates-intro");
    public static By introHr = By.className("intro-hr");
    public static By introText = By.className("intro-text");
    // First certificate block - CB
    public static By firstCB = By.cssSelector(".certificates-block-wrapper-middle div:nth-child(1)");
    public static By firstCBTitle = By.cssSelector(".certificate-block__title > h3");
    public static By firstCBImage = By.cssSelector(".certificate-block__image-middle > img");
    public static By firstAddButton = By.cssSelector(".certificate-block__button > button");
    // Second certificate block - CB
    public static By secondCB = By.cssSelector("");
}
