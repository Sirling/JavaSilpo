package Pages;

import Utilities.Driver;
import config.LocatorsDefaultPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import javax.imageio.ImageIO;
import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.StringTokenizer;

import static config.LocatorsGiftCertificatePage.basketIcon;
import static config.LocatorsGiftCertificatePage.firstAddButton;

public class BasePage extends Driver {

    public static void cookieSave() {

        // create file named Cookies to store Login Information
        File file = new File("Cookies.data");
        try {
            // Delete old file if exists
            file.delete();
            file.createNewFile();
            FileWriter fileWrite = new FileWriter(file);
            BufferedWriter Bwrite = new BufferedWriter(fileWrite);

            // loop for getting the cookie information
            for (Cookie ck : Driver.getInstance().manage().getCookies()) {
                Bwrite.write((ck.getName() + ";" + ck.getValue() + ";" + ck.getDomain() + ";" + ck.getPath() + ";" + ck.getExpiry() + ";" + ck.isSecure()));
                Bwrite.newLine();
            }
            Bwrite.close();
            fileWrite.close();

        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Can't save cookie");
        }
    }

    public static void cookieLoad() {

        try {

            File file = new File("Cookies.data");
            FileReader fileReader = new FileReader(file);
            BufferedReader Buffreader = new BufferedReader(fileReader);
            String strline;
            while ((strline = Buffreader.readLine()) != null) {
                StringTokenizer token = new StringTokenizer(strline, ";");
                while (token.hasMoreTokens()) {
                    String name = token.nextToken();
                    String value = token.nextToken();
                    String domain = token.nextToken();
                    String path = token.nextToken();
                    Date expiry = null;

                    String val;
                    if (!(val = token.nextToken()).equals("null")) {
                        expiry = new Date(val);
                    }
                    Boolean isSecure = Boolean.parseBoolean(token.nextToken());
                    Cookie ck = new Cookie(name, value, domain, path, expiry, isSecure);
                    System.out.println(ck);
                    Driver.getInstance().manage().addCookie(ck); // This will add the stored cookie to your current session
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static BasePage openPage(String url) {

        Driver.getInstance().get(url);
        return new BasePage();
    }

    public static void closePage() {

        Driver.getInstance().close();
    }

    public static String getBackgroundColor(By locator) {

        waitForVisibility(locator);
        return Driver.getInstance().findElement(locator).getCssValue("background-color");
    }

    private static WebDriverWait waitFor() {

        return new WebDriverWait(Driver.getInstance(), 5);
    }

    public static WebElement waitForVisibility(By locator) {

        waitFor().until(ExpectedConditions.visibilityOfElementLocated(locator));
        return Driver.getInstance().findElement(locator);
    }

    public static WebElement waitForElementIsClickable(By locator) {

        waitFor().until(ExpectedConditions.elementToBeClickable(locator));
        return Driver.getInstance().findElement(locator);
    }

    public static String getTitle() {

        return Driver.getInstance().getTitle();
    }

    public static String getUserShortName() {

        return Driver.getInstance().findElement(LocatorsDefaultPage.userShortName).getText();
    }

    public static void enterValue(By element, String value) {

        WebElement input = Driver.getInstance().findElement(element);
        input.clear();
        input.sendKeys(value);
    }

    public static int getHeight(By locator) {

        waitForVisibility(locator);
        WebElement element = Driver.getInstance().findElement(locator);
        return element.getSize().getHeight();
    }

    public static int getWidth(By locator) {

        waitForVisibility(locator);
        WebElement element = Driver.getInstance().findElement(locator);
        return element.getSize().getWidth();
    }

    public static int getFontSize(By locator) {

        WebElement element = Driver.getInstance().findElement(locator);
        return Integer.parseInt(element.getCssValue("font-size"));
    }

    public static String getFontColor(By locator) {
        WebElement element = Driver.getInstance().findElement(locator);
        return element.getCssValue("font-color");
    }

    public static void scrollToFooter() {

        WebElement element = Driver.getInstance().findElement(LocatorsDefaultPage.copyrights);
        ((JavascriptExecutor) Driver.getInstance()).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    //Addition to element presence check
    public static String getUrlFromCSS(By locator) {
        String basicUrl = Driver.getInstance().findElement(locator)
                .getCssValue("background-image");
        char[] parsedUrl = basicUrl.toCharArray();
        int firstCharsCount = 5;
        int lastIndex = parsedUrl.length - (firstCharsCount + 1);
        int preLastIndex = parsedUrl.length - (firstCharsCount + 2);
        ArrayList<String> cleanUrl = new ArrayList<>(parsedUrl.length);
        for (char c : parsedUrl) {
            cleanUrl.add(String.valueOf(c));
        }
        for (int i = 0; i < firstCharsCount; i++) {
            cleanUrl.remove(0);
        }
        cleanUrl.remove(lastIndex);
        cleanUrl.remove(preLastIndex);
        StringBuilder sb = new StringBuilder();
        for (String s : cleanUrl) {
            sb.append(s);
        }
        return sb.toString();
    }

    //Title image check
    public static boolean isTitleImage(By locator) {
        String url = getUrlFromCSS(locator);
        try {
            ImageIO.read(new URL(url));
        } catch (IOException e) {
            e.printStackTrace();
            Assert.fail();
        }
        return true;
    }

    //Check if image is present
    public static void isImage(By locator) {

        waitForVisibility(locator);
        String url = Driver.getInstance().findElement(locator).getCssValue("src");
        try {
            ImageIO.read(new URL(url));
        } catch (IOException e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    public static boolean ifUserIsLogged() {

        try {
            waitForVisibility(basketIcon);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void addButtonRedirectToAuthForm() {

        if (!ifUserIsLogged()) {
            Driver.getInstance().findElement(firstAddButton).click();
            waitForVisibility(firstAddButton);
        }
        else
            Assert.fail("User is authorized");
    }

}