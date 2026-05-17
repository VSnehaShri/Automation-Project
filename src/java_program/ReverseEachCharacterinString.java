package java_program;

public class ReverseEachCharacterinString {

	public static void main(String[] args) {
		
		String s = "Oracle India"; //aidnI elcarO
		String[] arr = s.split("");
		
		for(int i= arr.length-1; i>=0;i-- ) {
			System.out.print(arr[i]);
		}
	}

}
