package test_CaseFiles;

import org.testng.annotations.Test;

import page_objectFiles.Login_Page;

public class LoginWith_Valid_Data extends BaseClass_Files{
  @Test
  public void Login() {

	  
	  driver.get(URL);
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
		  LP.Clicklogout();
		  System.out.println("Sucessfully Logedout");
	  }
  }
}
