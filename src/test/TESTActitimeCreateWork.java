package test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pom.PomActiTimeLoginPage;
import pom.PomActitimeCreateWorkPage;

public class TESTActitimeCreateWork 
{
	@Test(groups="Regression")
	public void workCreate() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
		PomActiTimeLoginPage login=new PomActiTimeLoginPage(driver);
		login.loginMethod();
		
		PomActitimeCreateWorkPage work=new PomActitimeCreateWorkPage(driver);
		work.createWorkMethod();
	}
}
