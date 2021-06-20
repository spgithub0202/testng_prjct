package pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomActitimeCreateCustomer
{
	public WebDriver driver;
	@FindBy(xpath="//div[.='Tasks']")
	private WebElement tasksLink;
	
	@FindBy(xpath="//div[.='Add New']")
	private WebElement addNewLink;
	
	@FindBy(xpath="//div[.='+ New Customer']")
	private WebElement newCustomerLink;
	
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement enterCustomerName;
	
	@FindBy(xpath="//div[.='Create Customer']")
	private WebElement createCustomerLink;
	
	@FindBy(xpath="(//div[.='Cancel'])[27]")
	private WebElement cancelCustomer;
	
	public PomActitimeCreateCustomer(WebDriver driver)
    {
	 this.driver=driver;        
   	 PageFactory.initElements(driver, this);
    }
	
	public void createCustomerMethod()
	{
		tasksLink.click();
		addNewLink.click();
		newCustomerLink.click();
		enterCustomerName.sendKeys("mrunal");
		createCustomerLink.click();
	}
	
	public void cancelCustomerMethod()
	{
		cancelCustomer.click();
		Alert alt=driver.switchTo().alert();
		alt.accept();
	}
}
