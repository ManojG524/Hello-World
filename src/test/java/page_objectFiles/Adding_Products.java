package page_objectFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adding_Products {

	
	
	WebDriver ldriver;
	
	public  Adding_Products(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	@FindBy(xpath="//li[@class='nav-item has-treeview'][1]")
	WebElement catalog;
	
	@FindBy(xpath="//a[@href='/Admin/Product/List']")
	WebElement product;
	
	@FindBy(xpath="//a[normalize-space()='Add new']")
	WebElement Additeam;
	
	@FindBy(xpath="//input[@id='Name']")
	WebElement productname;
	
	@FindBy(xpath="//textarea[@id='ShortDescription']")
	WebElement ShortDescription;
	
	@FindBy(xpath="//input[@id='Sku']")
	WebElement SKU_ID;
	
	
	
	public void catalog_name()
	{
		catalog.click();
	}
	public void product_name()
	{
		product.click();
	}
	public void Adding_iteam()
	{
		Additeam.click();
	}
	public void EnterProductName(String name)
	{
		productname.sendKeys(name);
	}
	public void Short_description(String Desc)
	{
		ShortDescription.sendKeys(Desc);	
	}
	public void SkuId(String number)
	{
		SKU_ID.sendKeys(number);
	}
	public void FullDesc()
	{
		
//		ldriver.findElement(By.xpath("//span[normalize-space()='File']")).click();
//		ldriver.findElement(By.xpath("//div[contains(text(),'New document')]")).click();
		WebElement ifr=ldriver.findElement(By.xpath("//*[@id=\"FullDescription_ifr\"]"));
		ldriver.switchTo().frame(ifr);	
		ldriver.findElement(By.xpath("//body[@class='mce-content-body ']")).sendKeys("hello brother");
		ldriver.switchTo().defaultContent();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
