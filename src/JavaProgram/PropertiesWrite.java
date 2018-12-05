package JavaProgram;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesWrite {

	public static void main(String[] args) throws IOException {
		FileOutputStream fio = new FileOutputStream("D:\\Java2Practice\\Java-Program-for-practice\\Data.properties");
		Properties prop = new Properties();
		prop.setProperty("username", "SudhansuSelenium1");
		prop.store(fio, null);
		fio.close();
	}

}
