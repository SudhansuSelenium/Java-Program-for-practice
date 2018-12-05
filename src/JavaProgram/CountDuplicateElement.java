package JavaProgram;

import java.util.HashSet;
import java.util.Set;

public class CountDuplicateElement {

	public static void main(String[] args) {
		// Count Duplicate Integer element
		Integer[] num = { 1, 9, 4, 1, 0, 2, 5, 0 };
		int count = 0;
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] == num[j]) {
					System.out.println(num[i]);
					count = count + 1;
				}
			}
		}
		System.out.println("Number of duplicate :" + count);
		System.out.println("******************************");
		// Using Set Interface
		Set<Integer> set = new HashSet<Integer>();
		int count1 = 0;
		for (Integer it : num) {
			if (set.add(it) == false) {
				System.out.println(it);
				count1 = count1 + 1;
			}
		}
		System.out.println("Number of duplicates :" + count1);
		System.out.println("******************************");
		String[] str = { "test", "test1", "test2", "test" };
		int count2 = 0;
		Set<String> se = new HashSet<String>();
		for (String s : str) {
			if (se.add(s) == false) {
				System.out.println(s);
				count2 = count2 + 1;
			}
		}
		System.out.println("Number of duplicates :" + count2);
	}
}
