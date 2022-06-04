package utilite_files;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readconfigproperties {
	
	
	Properties pro;
	
	public Readconfigproperties()
	{
		File src=new File("./Configuration/config.properties");
		try {
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
			
		}
		catch(Exception e)
		{
			System.out.println("Excetion is :"+ e.getMessage());;
		}
	}
	
	public String getApplicationURL()
	{
		String URL=pro.getProperty("baseURL");
		return URL;
		
	}
	public String getuseremail()
	{
		String username=pro.getProperty("useremail");
		return username;
	}
	public String getpassword()
	{
		String password=pro.getProperty("password");
		return password;
	}
	public String getchromepath()
	{
		String chromepath=pro.getProperty("chromepath");
		return chromepath;
	}

	public String getIEPath() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
