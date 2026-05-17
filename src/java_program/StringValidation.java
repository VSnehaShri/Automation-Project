package java_program;

public class StringValidation {

	public static void main(String[] args) {
		
		String s1 = "Sneha12345@#$%";
		String s2 ="QA";
		
		String s3 = "Janasneha";
		String s4= "Mom";
		String s5 = "janasneha";
		String s6 = "";
		
		// to find length of the string
		System.out.println(s1.length());
		System.out.println(s2.length());
		
		//another method
		
		
		
		int i = s3.length();
		System.out.println(i);
		
		int j = s4.length();
		System.out.println(j);
		
		// startsWith and endsWith
		System.out.println(s3.startsWith("J"));
		System.out.println(s3.startsWith("k"));
		System.out.println(s3.endsWith("a"));
		System.out.println(s3.endsWith("i"));
		
		// toLowerCase and toUpperCase
		System.out.println(s3.toLowerCase());
		System.out.println(s3.toUpperCase());
		
		// equals
		System.out.println(s3.equals(s4));
		System.out.println(s3.equals(s5));
		
		//equalsIgnoreCase
		System.out.println(s3.equalsIgnoreCase(s5));
		System.out.println(s3.equalsIgnoreCase(s4));
		
		//contains
		System.out.println(s3.contains("sh"));
		System.out.println(s3.contains("sn"));
		
		//empty
		System.out.println(s3.isEmpty());
		System.out.println(s6.isEmpty());
		
		
	}

}

