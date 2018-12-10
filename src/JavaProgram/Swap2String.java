package JavaProgram;

public class Swap2String {

	public static void main(String[] args) {
		String s1 = "test";
		String s2 ="demo";
		s1 = s1+s2;
		s2= s1.replace(s2, "");
		s1=s1.replace(s2, "");
		System.out.println("S1 :"+s1);
		System.out.println("S2 :"+s2);

	}

}
