package JavaProgram;

import java.util.Arrays;

public class ReverseEachWord {

	public static void main(String[] args) {
		// Take a string
		//Split the string into array
		//Using for loop and taking split length and reduce the size
		//print the reverse
		String str = "THIS IS DEMO";
		String[] split = str.split(" ");
		for(int i= split.length-1;i>=0;i--) {
			System.out.print(split[i] +" ");
		}

	}

}
