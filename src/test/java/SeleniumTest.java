import demoJava.productList;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public void testcase1() throws InterruptedException {
        productList testHome = new productList();

        testHome.list("Android");
    }
}
