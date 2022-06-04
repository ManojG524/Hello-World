package test_CaseFiles;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import page_objectFiles.Login_Page;
import utilite_files.XLUtils;

public class LoginWith_Valid_And_INValid_Data extends BaseClass_Files{

	@Test(dataProvider="Logindata")
	
	public void Valid_Invalid_LoginData(String name,String pass)
	{
		driver.get(URL);
		Login_Page lp=new Login_Page(driver);
		 String title= driver.getTitle();
		 
		  if(title.equals("Your store. Login"))
		  {
		  lp.Enteruseremail(name);
		  lp.EnterPassword(pass);
		  lp.clickonLogin();
		  }
		  else
		  {
			  System.out.println("it is not the correct website");
		  }
		 
		  String title2=driver.getTitle();
		  
		  if(title2.equals("Dashboard / nopCommerce administration"))
		  {
			  lp.Clicklogout();
			  System.out.println("Sucessfully Logedout");
		  }
		
		
		
	}
	@DataProvider(name="Logindata")
	public String[][] getdata() throws IOException
	{
		
		String path=System.getProperty("user.dir")+"/src/test/java/TestData_for_Testing/LoginData.xlsx";
		int rowcount=XLUtils.getRowCount(path, "Sheet1");
		int colcount=XLUtils.getCellCount(path, "Sheet1", 1);
		
		String logindata[][]=new String[rowcount][colcount];
		for(int r=1;r<=rowcount;r++)
		{
			for(int j=0;j<colcount;j++)
			{
				logindata[r-1][j]=XLUtils.getCellData(path, "Sheet1", r, j);
			}
		}
		
		return logindata;
		
	}
	
	
}
