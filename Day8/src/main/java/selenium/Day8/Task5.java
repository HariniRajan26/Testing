package selenium.Day8;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task5 
{
	public static void main(String[]args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		WebElement input1 = driver.findElement(By.name("q"));
		input1.sendKeys("Apple");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		String t1 = driver.getTitle();
		String id1 = driver.getWindowHandle();
		System.out.println(t1);
		System.err.println(id1);
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://google.com");
		driver.manage().window().maximize();
		WebElement input2 = driver.findElement(By.name("q"));
		input2.sendKeys("Selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		String t2 = driver.getTitle();
		String id2 = driver.getWindowHandle();
		System.out.println(t2);
		System.err.println(id2);
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://google.com");
		driver.manage().window().maximize();
		WebElement input3 = driver.findElement(By.name("q"));
		input3.sendKeys("Cucumber");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		String t3 = driver.getTitle();
		String id3 = driver.getWindowHandle();
		System.out.println(t3);
		System.err.println(id3);
//		driver.switchTo().newWindow(WindowType.TAB);
		
		Set <String> total = driver.getWindowHandles();
		System.out.println("Total Tabs "+total.size());
	}
}
