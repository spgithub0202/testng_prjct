package test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pom.PomActiTimeLoginPage;
import pom.PomActitimeCreateCustomer;

public class TESTActitimeCreateCustomer
{
	@Test(groups="Smoke")
	public void customerCreate()
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
		PomActiTimeLoginPage login=new PomActiTimeLoginPage(driver);
		login.loginMethod();
		
		PomActitimeCreateCustomer customer=new PomActitimeCreateCustomer(driver);
		customer.createCustomerMethod();
	}

}
