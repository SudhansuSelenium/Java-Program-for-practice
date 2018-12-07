package JavaProgram;

import java.util.HashSet;
import java.util.Set;

public class CountDuplicateElement {

	public static void main(String[] args) {
		// Count Duplicate Integer element Using comparison, Set inteface --> Integer,
		// String
		// Take 2 loops, one for loop to 1st element and another loop for 2nd element
		// i.e 1st+1
		// Compare 1st element with 2nd element
		// if both are equal, increase count by 1
		// print index of first element
		// outside loop print the count
		Integer[] num = { 1, 0, -1, 9, 0 };
		int count = 0;
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] == num[j]) {
					count = count + 1;
					System.out.println(num[i]);
				}
			}
		}
		System.out.println(count);
		//Take Set
		//Add the array to Integer
		//add the integer to set is not added i.e false
		//print integer
		Set<Integer> set = new HashSet<Integer>();
		for(Integer it : num) {
			if(set.add(it)==false) {
				System.out.println(it);
			}
		}
	}
}
