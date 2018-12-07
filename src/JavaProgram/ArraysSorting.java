package JavaProgram;

public class ArraysSorting {

	public static void main(String[] args) {
		// Sort with zero's at first (smaller to bigger)
		// Take an array integer
		// Take 2 loops one counter for starting form first element and another loop for
		// starting 2nd element to compare
		// Compare first element with next element
		// if first element is greater the second element store 2nd element in temp
		// assign 2nd element position value to position in 1st element
		// store the temp element in the 1st element position
		// print 1st poistion element
		Integer[] a = { 5, 3, 0 };
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
			System.out.print(a[i] + ",");
		}
		System.out.println();
		// Sort with zero's at last (bigger to smaller)
		// Take an array integer
		// Take 2 loops one counter for starting form first element and another loop for
		// starting 2nd element to compare
		// Compare first element with next element
		// if first element is smaller the second element store 2nd element in temp
		// assign 2nd element position value to position in 1st element
		// store the temp element in the 1st element position
		// print 1st poistion element
		Integer[] b = { 5, 3, 0 };
		int temp1 = 0;
		for (int ii = 0; ii < b.length; ii++) {
			for (int jj = ii + 1; jj < b.length; jj++) {
				if (b[ii] < b[jj]) {
					temp1 = b[jj];
					b[jj] = b[ii];
					b[ii] = temp1;
				}
			}
			System.out.print(b[ii] + ",");
		}
	}
}
