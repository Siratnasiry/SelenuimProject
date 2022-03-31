package SeleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium1 {

        public static void main(String[] args) {

            System.setProperty("Webdriver.chrome.driver","driver/chromedriver.exe");

            WebDriver driver = new ChromeDriver();

            driver.get("https://www.google.com/");

        }
    }
