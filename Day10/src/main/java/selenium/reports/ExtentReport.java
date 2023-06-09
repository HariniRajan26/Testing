package selenium.reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {

	public static void main(String[]args)
	{
		ExtentSparkReporter spark = new ExtentSparkReporter("extentReport.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(spark);
		ExtentTest test1 = extent.createTest("Facebook","login for facebook");
		test1.log(Status.FAIL,"Sample test");
		extent.flush();
	}
}
