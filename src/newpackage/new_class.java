package newpackage;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class new_class {

    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/");
        WebElement element=driver.findElement(By.xpath("//input[@name='emailid']"));
        element.sendKeys("abcderfgh@gmail.com");

        WebElement button=driver.findElement(By.xpath("//input[@name='btnLogin']"));

        button.click();

        driver.close();
    }


}
