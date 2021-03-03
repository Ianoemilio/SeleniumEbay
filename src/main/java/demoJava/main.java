package demoJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws InterruptedException {

        Scanner input = new Scanner(System.in);
        WebDriver driver = chromeDriver.driver();


        driver.get("http://www.ebay.com");
        driver.findElement(By.id("gh-ac")).sendKeys(input.nextLine());
        driver.findElement(By.id("gh-btn")).click();

        List<WebElement> name = driver.findElements(By.className(("s-item__link")));
        List<WebElement> price = driver.findElements(By.className(("s-item__price")));

        for(WebElement product:name) {
            System.out.println(product.getText());
            System.out.println(price.get(name.indexOf(product)).getText());
            System.out.println("\n *************************************");

        }

        Thread.sleep(20000);
        driver.quit();
    }
}

