package demoJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromeDriver {

    public static WebDriver driver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ianoe\\JavaSDET-Training\\Drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        return driver;
    }
}
