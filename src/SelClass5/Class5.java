package SelClass5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Class5 {
    public static String url = "https://syntaxprojects.com/basic-select-dropdown-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement daysDD=driver.findElement(By.id("select-demo"));
        Select select=new Select(daysDD);
        select.selectByIndex(3);

        Thread.sleep(3000);

        select.selectByVisibleText("Thursday");
        Thread.sleep(3000);
        select.selectByValue("Sunday");
    }
}
