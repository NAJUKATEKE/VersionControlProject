package resourcess;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String propertiesPath ="C:\\Users\\Mtronics Computers\\Documents\\auto program\\E2EFrramework\\src\\main\\java\\resourcess\\PropertiesExample.java";
		FileInputStream fis = new FileInputStream(propertiesPath);
		Properties prop = new Properties();
		prop.load(fis);
String browserName=prop.getProperty("browser");
String URL=prop.getProperty("url");
String username=prop.getProperty("username");
System.out.println("username="+username);
String password=prop.getProperty("password");

	}

}
