package selenium.Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task3 
{
	public static void main(String[]args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
		driver.manage().window().maximize();
		WebElement mail = driver.findElement(By.xpath("//*[@id=\"user_email\"]"));
		mail.sendKeys("garie.56@gmail.com");
		WebElement password = driver.findElement(By.xpath("//*[@id=\"user_pass\"]"));
		password.sendKeys("$51garie54$");
	}
}
