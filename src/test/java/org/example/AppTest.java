package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AppTest {
    ChromeDriver driver;


    @BeforeClass
    void setUp() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("http://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
        Thread.sleep(15000);


        driver.manage().window().maximize();
    }

    @Test
    void JavascriptAlerts() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"dropdowm-menu-1\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"dropdowm-menu-1\"]/option[4]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"dropdowm-menu-2\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"dropdowm-menu-2\"]/option[4]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"dropdowm-menu-3\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"dropdowm-menu-3\"]/option[4]")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//label[normalize-space()='Option 1']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//label[normalize-space()='Option 3']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value='purple']")).click();
        Thread.sleep(2000);

    }
    @AfterClass
    void close(){
        driver.close();
    }
}