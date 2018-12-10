package JavaProgram;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesWrite {

	public static void main(String[] args) throws IOException {
		//Use FileOutputStream to read the file 
		//Create Properties object 
		//use set properties object to set as key value pair
		//store to properties using store i.e <fio, null>
		//close the file
		FileOutputStream fio = new FileOutputStream("D:\\SeleniumProjects\\JavaProgramPractice\\Java-Program-for-practice\\Text.txt");
		Properties prop = new Properties();
		prop.setProperty("username", "SudhansuSelenium1");
		prop.store(fio, "String updated");
		fio.close();
	}

}
