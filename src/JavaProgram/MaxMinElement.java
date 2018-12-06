package JavaProgram;

public class MaxMinElement {

	public static void main(String[] args) {
		// Check for minimum value
		Integer[] num = { 1, 3, 5, 2, 8 };
		int min = num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i] < min) {
				min = num[i];
			}
		}
		System.out.println("Minimum value :" + min);
		// Check for maximum value
		Integer[] num1 = { 1, 3, 5, 2, 8 };
		int max = num1[0];
		for (int j = 0; j < num1.length; j++) {
			if (num1[j] > max) {
				max = num1[j];
			}
		}
		System.out.println("Maximum value :" + max);
	}
}
