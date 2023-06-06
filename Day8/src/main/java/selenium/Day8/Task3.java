package selenium.Day8;

import org.openqa.selenium.Alert;
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
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		WebElement input = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
		input.sendKeys("401");
		WebElement submit = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]"));
		submit.click();
		
		Alert a =driver.switchTo().alert();
		a.dismiss();
		
		
		input.clear();
		input.sendKeys("402");
		submit.click();
		a.accept();
		Alert b =driver.switchTo().alert();
		String text = b.getText();
		b.accept();
		System.out.println(text);
	}
}
