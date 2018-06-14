package Pages;

import Utilities.Driver;
import config.Locators;

public class LoginPage extends BasePage {

    public static String barcode = "1087289826";
    public static String password = "5374";

    public static LoginPage enterBarcode(String barcode){

        Driver.Instance.findElement(Locators.enterBarcode)
                .sendKeys(barcode);
        return new LoginPage();
    }

    public LoginPage enterPassword(String password){

        Driver.Instance.findElement(Locators.enterPassword)
                .sendKeys(password);
        return this;
    }
    public LoginPage submitForm(){

        Driver.Instance.findElement(Locators.submitButton).click();
        return this;
    }

    public static HomePage login(){
        HomePage.authForm();
        LoginPage.enterBarcode(barcode)
                .enterPassword(password)
                .submitForm();
        return new HomePage();
    }

}
