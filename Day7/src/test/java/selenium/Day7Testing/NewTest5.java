package selenium.Day7Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest5 
{
	WebDriver driver;
	
	  @Test
	  public void goDaddy() {
		  
		  WebDriverManager.edgedriver().setup();
		  driver=new EdgeDriver();
		  driver.navigate().to("https://www.godaddy.com/en-in");
		  driver.manage().window().maximize();
		  String title=driver.getTitle();
		  Assert.assertEquals(title,driver.getTitle());
		  String url=driver.getCurrentUrl();
		  Assert.assertEquals(url,driver.getCurrentUrl());
		  
	  }
	  
	  @Test
	  public void goDaddy2() throws InterruptedException
	  {
		  WebDriverManager.edgedriver().setup();
		  driver=new EdgeDriver();
		  driver.navigate().to("https://www.godaddy.com/en-in");
		  Thread.sleep(5000);
		  driver.manage().window().maximize();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//button[@aria-label=\"Open Menu\"]")).click();
		  Thread.sleep(4000);
		  driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/button")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/div/div[2]/div[1]/ul[1]/li[2]/div/span/div/span/a")).click();
		  
	  }
}
