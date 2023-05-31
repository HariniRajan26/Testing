package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App2 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"input-to-name\"]")).sendKeys("Mridula");
        driver.findElement(By.xpath("//*[@id=\"input-to-email\"]")).sendKeys("mridu@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"input-from-name\"]")).sendKeys("Harini");
        driver.findElement(By.xpath("//*[@id=\"input-from-email\"]")).sendKeys("Harini@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"input-theme-7\"]")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1500)", "");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/button")).click();
        Thread.sleep(4000);
        driver.quit();
	}

}
