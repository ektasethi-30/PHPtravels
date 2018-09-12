package common;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;


public class ReadFile {
	File file= new File("C:\\Users\\Ekta Sethi\\eclipse-workspace\\PHPTravelsAutomation\\dataFile.properties");
	public String readProperties(String name) throws Exception{
		FileInputStream fileInput=new FileInputStream(file);
		Properties prop=new Properties();
		prop.load(fileInput);
		String value=prop.getProperty(name);
		return value;
		
	}

}
