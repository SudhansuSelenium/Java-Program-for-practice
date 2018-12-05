package JavaProgram;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteToTextFile {

	public static void main(String[] args) throws IOException {
		String str = "This is demo";
		File file = new File("D:\\SeleniumProjects\\JavaProgramPractice\\Text.txt");
		if (file.exists()) {
			System.out.println("File exists");
		} else {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try {
			FileOutputStream fio = new FileOutputStream(file);
			byte[] b = str.getBytes();
			fio.write(b);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
