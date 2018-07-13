package Utilities;

import config.configuration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    private static WebDriver Instance = null;

    public static WebDriver getInstance() {
        if(Instance == null) {
            System.out.println("Initializing Utilities.Driver");
            if (configuration.Browser.browser.equalsIgnoreCase("ff")) {
                System.setProperty("webdriver.gecko.driver", "./src/main/resources/drivers/geckodriver.exe");
                Instance = new FirefoxDriver();
            }

            else if (configuration.Browser.browser.equalsIgnoreCase("op")) {
                System.setProperty("webdriver.opera.driver", "./src/main/resources/drivers/operadriver.exe");
                Instance = new OperaDriver();
            }
            else if (configuration.Browser.browser.equalsIgnoreCase("ch")) {
                System.setProperty("webdriver.chrome.driver", "./src/main/resources/drivers/chromedriver.exe");
                Instance = new ChromeDriver();
            }

            Instance.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            Instance.manage().window().maximize();
        }

        return Instance;
    }

    public static void close(){
        System.out.println("Closing browser");
        getInstance().close();
        Instance = null;
    }
    public static void quit() {
        System.out.println("Quiting browser");
        getInstance().close();
        Instance = null;
    }
}