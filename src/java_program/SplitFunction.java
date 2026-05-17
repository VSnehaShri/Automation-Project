package java_program;

public class SplitFunction {

	public static void main(String[] args) {
		
String s = "Manas java and selenium classses GSIT xyz Bangalore";
		
		String[] arr = s.split(" ");
		
		for(int i=0; i<arr.length;i++) {
			
			if(!arr[i].contains("z")) {
				System.out.print(arr[i] +" ");
			}
		}
	}

}
