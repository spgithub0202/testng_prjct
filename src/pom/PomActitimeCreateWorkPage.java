package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomActitimeCreateWorkPage
{
	@FindBy(xpath="(//div[@class='menu_icon'])[2]")
	private WebElement menuIconLink;
	
	@FindBy(xpath="//a[.='Types of Work']")
	private WebElement typesOfWorkLink;
	
	@FindBy(id="ext-gen6")
	private WebElement createTypeOfWorkLink;
	
	@FindBy(id="name")
	private WebElement enterNameofWorkTextField;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement createTypeOfWorkSubmit;
	
	public PomActitimeCreateWorkPage(WebDriver driver)
    {
   	 PageFactory.initElements(driver, this);
    }
	
	public void createWorkMethod() throws InterruptedException
	{
		Thread.sleep(3000);
		menuIconLink.click();
		typesOfWorkLink.click();
		createTypeOfWorkLink.click();
		enterNameofWorkTextField.sendKeys("Testingg");
		createTypeOfWorkSubmit.click();
	}
}
