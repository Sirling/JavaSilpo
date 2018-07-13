package Pages;

import Utilities.Driver;
import config.Locators;
import config.configuration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage extends Driver {

    public static BasePage openHomePage(){

        Driver.getInstance().get(configuration.url.app_url);
        return new HomePage();
    }

    private static WebDriverWait waitFor() {

        return new WebDriverWait(Driver.getInstance(), 5);
    }

    public static WebElement waitForVisibility(By locator) {

        waitFor().until(ExpectedConditions.visibilityOfElementLocated(locator));
        return Driver.getInstance().findElement(locator);
    }

    public static WebElement waitForElementIsClickable(By locator){

        waitFor().until(ExpectedConditions.elementToBeClickable(locator));
        return Driver.getInstance().findElement(locator);
    }

    public static String getTitle(){

       return Driver.getInstance().getTitle();
    }

    public static String getUserShortName(){

        return Driver.getInstance().findElement(Locators.userShortName).getText();
    }

    public static void enterValue(By element, String value) {

        WebElement input = Driver.getInstance().findElement(element);
        input.clear();
        input.sendKeys(value);
    }

    public static int heightOfElement (By locator){

        waitForVisibility(locator);
        WebElement element = Driver.getInstance().findElement(locator);
        return element.getSize().getHeight();
    }

    public static int widthOfElement(By locator) {

        waitForVisibility(locator);
        WebElement element = Driver.getInstance().findElement(locator);
        return element.getSize().getWidth();
    }

    public static void scrollToFooter() {

        WebElement element = Driver.getInstance().findElement(Locators.copyrights);
        ((JavascriptExecutor) Driver.getInstance()).executeScript("arguments[0].scrollIntoView(true);", element);
    }
}
