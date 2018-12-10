package JavaProgram;

public class MaxMinElement {

	public static void main(String[] args) {
		//Find the min value of the integer array as reference for min value
		//Take variable and assign first index of array as minimum value
		//using for loop calculate the length of the array
		//now condition if array of index is less than min variable
		//assign the array index value to min variable
		//print min
		
		Integer[] a = {1,6,2,0,3,0};
		int min = a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]< min) {
				min = a[i];
			}
		}
		System.out.println(min);
		//Find the max value of the integer array as reference for max value
		//Take variable and assign first index of array as minimum value
		//using for loop calculate the length of the array
		//now condition if array of index is greater than min variable
		//assign the array index value to max variable
		//print max
		Integer[] b = {6,1,0,2,5,0};
		Integer max = b[0];
		for(int j=0; j<b.length;j++) {
			if(b[j]>max) {
				max=b[j];
			}
		}
		System.out.println(max);
	}
}
