package Pages;

import Utilities.Driver;
import config.Locators;

import java.util.NoSuchElementException;

public class LoginPage extends BasePage {

    public static String barcode = "1087289826";
    public static String password = "5374";

    public static LoginPage enterBarcode(String barcode){

        Driver.getInstance().findElement(Locators.enterBarcode)
                .sendKeys(barcode);
        return new LoginPage();
    }

    public LoginPage enterPassword(String password){

        Driver.getInstance().findElement(Locators.enterPassword)
                .sendKeys(password);
        return this;
    }
    public HomePage submitForm(){

        Driver.getInstance().findElement(Locators.submitButton).click();
        return new HomePage();
    }

    public static HomePage login(){

        try {
            HomePage.authForm();
            LoginPage.enterBarcode(barcode)
                    .enterPassword(password)
                    .submitForm();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
        return new HomePage();
    }

}
