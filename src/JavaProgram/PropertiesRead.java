package JavaProgram;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesRead {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("D:\\Java2Practice\\Java-Program-for-practice\\Data.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String str = prop.getProperty("username");
		System.out.println(str);
		fis.close();
	}

}
