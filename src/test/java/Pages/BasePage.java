package Pages;

import Utilities.Driver;
import config.Locators;
import config.configuration;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage extends Driver {

    public static BasePage openHomePage(){

        Driver.getInstance().get(configuration.url.app_url);
        return new HomePage();
    }

    public static WebElement waitForVisibility(By locator) {

        try {
            new WebDriverWait(Driver.getInstance(), 5)
                    .until(ExpectedConditions.visibilityOfElementLocated(locator));
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
        catch (TimeoutException t){
            t.printStackTrace();
        }
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

        WebElement element = waitForVisibility(locator);
        return element.getSize().getHeight();
    }

    public static int widthOfElement(By locator) {

        WebElement element = waitForVisibility(locator);
        return element.getSize().getWidth();
    }
}