package test_CaseFiles;

import org.testng.annotations.Test;

import page_objectFiles.Adding_Products;
import page_objectFiles.Login_Page;

public class Testcase_for_Adding_Products extends BaseClass_Files{

	
	
	
@Test
public void addingproducts() throws InterruptedException
{
	driver.get(URL);
	driver.manage().window().maximize();
	 Login_Page LP=new Login_Page(driver);
	  
	 String title= driver.getTitle();
	 
	  if(title.equals("Your store. Login"))
	  {
	  LP.Enteruseremail(username);
	  LP.EnterPassword(password);
	  LP.clickonLogin();
	  }
	  else
	  {
		  System.out.println("it is not the correct website");
	  }
	  
	  String title2=driver.getTitle();
	  if(title2.equals("Dashboard / nopCommerce administration"))
	  {
		  Adding_Products adp=new Adding_Products(driver);
		  
		  adp.catalog_name();
		  adp.product_name();
		  adp.Adding_iteam();
		  adp.EnterProductName("Apple");
		  adp.Short_description(randomestring()+" "+randomestring());
		  Thread.sleep(5000);
		 // String generatedString = RandomStringUtils.randomAlphanumeric(500);
		  adp.FullDesc();
		  adp.SkuId(randomeNum());
		  
		  Thread.sleep(1000);
		  adp.selectcategorie("Apparel");
		  adp.manufactures("HP");
		  
	  }
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
