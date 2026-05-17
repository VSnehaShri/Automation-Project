package java_program;

public class Stringpractice4 {

	public static void main(String[] args) {
		String a = "abcdef";
		String b = "xyz1234";
		String c = "abcxy";
		
		if(a.contains("cd") && !a.contains("xy")) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}

}
