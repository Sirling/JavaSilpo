package Pages;

import Utilities.Driver;
import config.LocatorsDefaultPage;
import java.util.NoSuchElementException;


public class LoginPage extends BasePage {



    public static LoginPage enterBarcode(String barcode){

        Driver.getInstance().findElement(LocatorsDefaultPage.enterBarcode)
                .sendKeys(barcode);
        return new LoginPage();
    }

    public LoginPage enterPassword(String password){

        Driver.getInstance().findElement(LocatorsDefaultPage.enterPassword)
                .sendKeys(password);
        return this;
    }
    public HomePage submitForm(){

        Driver.getInstance().findElement(LocatorsDefaultPage.submitButton).click();
        return new HomePage();
    }

    public static HomePage login(){

        try {
            DefaultPage.authForm();
            LoginPage.enterBarcode(LocatorsDefaultPage.barcode)
                    .enterPassword(LocatorsDefaultPage.password)
                    .submitForm();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
        return new HomePage();
    }
}
