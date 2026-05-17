package java_program;

public class StringValidation2 {

	public static void main(String[] args) {


		String s1= "manas  qa";
		String s2 = "QA";
		String s3 = " Snehajana ";
		
		System.out.println(s1.concat(s2));
		System.out.println(s1.charAt(0));

		System.out.println(s1.charAt(6));
		
		System.out.println(s1.charAt(7));
		
		System.out.println(s1.indexOf("a")); //indexof means first charecter it will take if it is repeating
		
		System.out.println(s1.indexOf("s"));
		
		System.out.println(s1.indexOf("n")+1);
		
		System.out.println(s1.lastIndexOf("a"));
		
		System.out.println(s3);
		
		System.out.println(s3.trim());
	}

}
