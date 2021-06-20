package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomActiTimeLoginPage
{
     @FindBy(id="username")
     private WebElement usernameTextField;
     
     @FindBy(xpath="//input[@name='pwd']")
     private WebElement passwordTextField;
     
     @FindBy(id="keepLoggedInLabel")
     private WebElement keepLoggedInCheckbox;
     
     @FindBy(id="loginButton")
     private WebElement loginsubmitButton;
     
     @FindBy(xpath="//a[.='Forgot your password?'] ")
     private WebElement forgotyourPasswordLink;
     
     @FindBy(xpath="//a[.='actiTIME Inc.'] ")
     private WebElement actitimeIncLink;
     
     public PomActiTimeLoginPage(WebDriver driver)
     {
    	 PageFactory.initElements(driver, this);
     }
     public void loginMethod()
     {
    	 usernameTextField.sendKeys("admin");
    	 passwordTextField.sendKeys("manager");
    	 keepLoggedInCheckbox.click();
    	 loginsubmitButton.click();
     }
     
     public void forgotyourpasswordMethod()
     {
    	 forgotyourPasswordLink.click();
     }
     
     public void actitimeIncMethod()
     {
    	 actitimeIncLink.click();
     }
     
}
