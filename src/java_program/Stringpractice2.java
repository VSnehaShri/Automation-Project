package java_program;

public class Stringpractice2 {

	public static void main(String[] args) {
		String a = "abcdef";
		String b = "xyz1234";
		String c = "abcxy";
		
		if(!a.equalsIgnoreCase(b)  && !a.equalsIgnoreCase(c)) {
			System.out.println("true");
		}
		else {
			System.out.println("False");
		}
	}

}
