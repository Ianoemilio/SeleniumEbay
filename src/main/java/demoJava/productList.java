package demoJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class productList {

    public void list(String search) throws InterruptedException {
        WebDriver driver = chromeDriver.driver();


        driver.get("http://www.ebay.com");
        driver.findElement(By.id("gh-ac")).sendKeys(search);
        driver.findElement(By.id("gh-btn")).click();

        List<WebElement> name = driver.findElements(By.className(("s-item__link")));
        List<WebElement> price = driver.findElements(By.className(("s-item__price")));

        for(WebElement product:name) {
            System.out.println(product.getText() + "\n" + price.get(name.indexOf(product)).getText());
            System.out.println("\n *************************************");

        }

        Thread.sleep(20000);
        driver.quit();
    }
}
