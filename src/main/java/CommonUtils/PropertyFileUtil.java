package CommonUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileUtil 
{
public String getDataFromPropertyFile(String keyname) throws IOException
{
		
		//Copy from Test1.java
		//FileInputStream fis = new FileInputStream("src\\test\\resources\\data.properties");
		FileInputStream fis = new FileInputStream("src\\test\\resources\\LoginCredentials.properties");
		Properties p = new Properties();
		p.load(fis);
		String value = p.getProperty(keyname);
		
		return value;
	}
}
