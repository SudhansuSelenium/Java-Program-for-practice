package JavaProgram;

public class ArraysSorting {

	public static void main(String[] args) {
		// sort from smaller to bigger and also moving 0's to first
		Integer[] nos = { 1, 0, 2, 9, 1, 0, 7, 0 };
		int temp;
		for (int i = 0; i < nos.length; i++) {
			for (int j = i + 1; j < nos.length; j++) {
				if (nos[i] > nos[j]) {
					temp = nos[j];
					nos[j] = nos[i];
					nos[i] = temp;
				}
			}
			System.out.print(nos[i]);
		}
		System.out.println(" ");
		System.out.println("************************************");
		// sort from bigger to smaller and also moving 0's to last
		Integer[] num = { 1, 0, 2, 9, 1, 0, 7, 0 };
		int temp1;
		for (int ii = 0; ii < num.length; ii++) {
			for (int jj = ii + 1; jj < num.length; jj++) {
				if (num[ii] < num[jj]) {
					temp1 = num[jj];
					num[jj] = num[ii];
					num[ii] = temp1;
				}
			}
			System.out.print(num[ii]);
		}
	}

}
