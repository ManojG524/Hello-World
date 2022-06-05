package page_objectFiles;

import java.util.List;

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
	
	@FindBy(xpath="//input[@class='k-input k-readonly'][1]")
	WebElement categories;
	
	@FindBy(xpath="//*[@id=\"product-info\"]/div[2]/div[3]/div[2]/div/div/input")
	WebElement Manufatures;

	
	
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
	
	public void selectcategorie(String cname)
	{
		
		categories.sendKeys(cname);
		
		
		List <WebElement> list=ldriver.findElements(By.xpath("//ul[@id='SelectedCategoryIds_listbox']//li"));	
		
		for(int i=0;i<list.size();i++)
		{
			String allnames=list.get(i).getText();
			
			if(allnames.contains(cname))
			{
				list.get(i).click();
				break;
			}
		}
		
	}
	
	public void manufactures(String Mname)
	{
		Manufatures.sendKeys(Mname);
		List <WebElement> list=ldriver.findElements(By.xpath("//ul[@id='SelectedManufacturerIds_listbox']//li"));	
		
		for(int i=0;i<list.size();i++)
		{
			String allnames=list.get(i).getText();
			
			if(allnames.contains(Mname))
			{
				list.get(i).click();
				break;
			}
		}
		
	}
	
	
	

	
}
	