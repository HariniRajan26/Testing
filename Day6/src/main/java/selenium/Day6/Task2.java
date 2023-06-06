package selenium.Day6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task2 
{
	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[]args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
		driver.manage().window().maximize();
		WebElement name = driver.findElement(By.xpath("//*[@id=\"first_name\"]"));
		name.sendKeys("Garie");
		WebElement mail = driver.findElement(By.xpath("//*[@id=\"user_email\"]"));
		mail.sendKeys("garie.56@gmail.com");
		WebElement password = driver.findElement(By.xpath("//*[@id=\"user_pass\"]"));
		password.sendKeys("$51garie54$");
		driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys("Wood");
		driver.findElement(By.xpath("//*[@id=\"radio_1665627729_Female\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"date_box_1665628538_field\"]/span/input[1]")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div/select")).click();
		WebElement month = driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div/select/option[10]"));
		month.click();
		WebElement year = driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div/div/input"));
		year.click();
		year.sendKeys("2004");
		WebElement date = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div[2]/div/span[17]"));
		date.click();
		driver.findElement(By.xpath("//*[@id=\"input_box_1665629217\"]")).sendKeys("Indian");
//		Thread.sleep(3000);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,1000)", "");
//		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"country_1665629257\"]")).sendKeys("India");
		WebElement no = driver.findElement(By.xpath("//*[@id=\"phone_1665627880\"]"));
//		no.click();
		no.sendKeys("3345566781");
		driver.findElement(By.xpath("//*[@id=\"phone_1665627865\"]")).sendKeys("7679097787");
		driver.findElement(By.xpath("//*[@id=\"number_box_1665629930\"]")).sendKeys("2");
		driver.findElement(By.xpath("//*[@id=\"input_box_1665630010\"]")).sendKeys("41 and 1");
		driver.findElement(By.xpath("//*[@id=\"textarea_1665630078\"]")).sendKeys("Manager and Coimbatore");
		driver.findElement(By.xpath("//*[@id=\"radio_1665627931_Yes\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"radio_1665627997_Single Room\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"radio_1665628131_None\"]")).click();
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(2000);
		WebElement checkBox = driver.findElement(By.xpath("//*[@id=\"privacy_policy_1665633140\"]"));
		checkBox.click();
		Thread.sleep(2000);
		WebElement submit = driver.findElement(By.xpath("//*[@id=\"user-registration-form-771\"]/form/div[4]/button"));
		submit.click();
		
		
		
		
		
		
		
//		if(name.isDisplayed()==true && mail.isDisplayed()==true)
//		{
//			System.out.println("Displayed");
//		}
//		else
//		{
//			System.out.println("Failed");
//		}
//		
//		Alert a =driver.switchTo().alert();
//		String h= a.getText();
//		String success = "User successfully registered.";
//		WebElement check = driver.findElement(By.name("Submit"));
//		String h = submit.getText();
//		String exist = "Email already exist";
//		WebElement check1 = driver.findElement(By.xpath("//*[@id=\"ur-submit-message-node\"]/ul/li"));
//		System.out.println(h);
//		if(check.isDisplayed()==true)
//		if(success.equals(h))
//		{
//			System.out.println(success);
//		}
//		else if(exist.equals(h))
//		{
//			System.out.println(exist);
//		}
//		else
//		{
//			System.out.println("Need to Register");
//		}
	}
}
