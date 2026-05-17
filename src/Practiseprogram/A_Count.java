package Practiseprogram;

public class A_Count {
	
	public static void main(String[] args) {
		
		String s =" manas qa automation";
		
		int count =0;
		
		for(int i =0; i <s.length();i++){
			
			if(s.charAt(i)=='a') {
				count++;
			}
			
		}
		System.out.println("A count is:"+ count);
	}
}

