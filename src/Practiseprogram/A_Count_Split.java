package Practiseprogram;

public class A_Count_Split {

	public static void main(String[] args) {
 String s =" manas qa automation";
		
		int count =0;
		
		String arr[]=s.split("");
		
		for(int i =0; i<arr.length;i++) {
			if(arr[i].equals("a")) {
				count++;
			}
		}
		System.out.println("A count is :"+count);

	}

}
