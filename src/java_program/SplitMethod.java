package java_program;

public class SplitMethod {

	public static void main(String[] args) {
		
		String s = "Manas java and selenium classses";
		
	String[] arr  = s.split(" ");
	
	for(int i=0; i< arr.length; i++) {
		System.out.print(arr[i] +" ");
	}
		
	}

}
