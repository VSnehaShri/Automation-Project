package java_program;

public class stringsplit {

	public static void main(String[] args) {
		String s = "Manas Java and Selenium Classes"; //Classes Selenium and Java Manas

		 

		String[] arr = s.split("");

		for (int i=arr.length-1; i>=0; i--) {

		System.out.print(arr[i]+ "");

		}

	}

}
