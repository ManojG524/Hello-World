package test_CaseFiles;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import utilite_files.Readconfigproperties;

public class BaseClass_Files {
	
	
	public static WebDriver driver;	
	
	
	Readconfigproperties readconfig=new Readconfigproperties();
	
	public String  URL=readconfig.getApplicationURL();
	public String username=readconfig.getuseremail();
	public String password=readconfig.getpassword();
	
	
	@BeforeClass
	@Parameters("browser")
	public void browser(String br)
	{
		if(br.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",readconfig.getchromepath());
			driver=new ChromeDriver();
		}
		else if (br.equals("ie")) {
			// opens the browser
			System.setProperty("webdriver.ie.driver", readconfig.getIEPath());
			driver = new InternetExplorerDriver();
		}
	}
	
	/*@AfterClass
	public void tearDown()
	{		
		driver.quit();
	
	}*/
	public static String randomestring() {
		String generatedString1 = RandomStringUtils.randomAlphabetic(10);
		return (generatedString1);
	}
	
	public static String randomeNum() {
		String generatedString2 = RandomStringUtils.randomNumeric(4);
		return (generatedString2);
	}
	
	

}
