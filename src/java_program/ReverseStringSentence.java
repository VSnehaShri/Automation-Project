package java_program;

public class ReverseStringSentence {

	public static void main(String[] args) {
		
		String s = "Manas java and selenium classses"; //op should be classses selenium and java Manas
		
		String[] arr = s.split(" ");
		
		for (int i = arr.length-1; i>=0; i--) {
			System.out.print(arr[i] +" ");
		}

	}

}
