package Utilities;

import config.configuration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    public static WebDriver Instance = null;

    public static void Initialize() {
        if(Instance == null) {
            System.out.println("Initializing Utilities.Driver");
            if (configuration.Browser.browser.equalsIgnoreCase("ff"))
                Instance = new FirefoxDriver();

            else if (configuration.Browser.browser.equalsIgnoreCase("op")) {
                System.setProperty("webdriver.opera.driver", "./src/main/resources/drivers/operadriver.exe");
                Instance = new OperaDriver();
            }
            else if (configuration.Browser.browser.equalsIgnoreCase("ch")) {
                System.setProperty("webdriver.chrome.driver", "./src/main/resources/drivers/chromedriver.exe");
                Instance = new ChromeDriver();
            }
        }

        Instance.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Instance.manage().window().maximize();
    }

    public static void close(){
        System.out.println("Closing browser");
        Instance.close();
        Instance = null;
    }
    public static void quit() {
        System.out.println("Quiting browser");
        Instance.close();
        Instance = null;
    }
}