package page_objectFiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	
	
	public WebDriver ldriver;
	
	public  Login_Page(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//We can write locators in two ways in page object model
	
	@FindBy(xpath="//input[@id='Email']")
	WebElement uname;
	
	@FindBy(xpath="//input[@id='Password']")
	WebElement passcode;
	
	@FindBy(xpath="//button[normalize-space()='Log in']")
	WebElement lbtn;
	
	@FindBy(xpath="//a[normalize-space()='Logout']")
	WebElement Logout;
	
	// When we are using page factory model we have follow this type of declaration
	public void Enteruseremail(String name)
	{
		uname.clear();
		uname.sendKeys(name);
	}
	
	// without using page factory model we have follow this type of declaration
	public void EnterPassword(String pass)
	{
		passcode.clear();
		passcode.sendKeys(pass);
	}
	
	public void clickonLogin()
	{
		lbtn.click();
	}
	public void Clicklogout()
	{
		Logout.click();
	}

}
