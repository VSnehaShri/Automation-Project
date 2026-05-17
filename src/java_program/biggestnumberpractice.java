package java_program;

public class biggestnumberpractice {

	public static void main(String[] args) {
		int a =10;
		int b = 20;
		int c =30;
		int d =40;
		
		if(a>b && a>c && a>d)
		{
			System.out.println("A is greater");
		}
		else if (b>c && b>d) {
			System.out.println("B is greater");
		}
		else if(c>d) {
			System.out.println("C is greater");
		}
			
		else {
			System.out.println("D is greater");
		}
	
	}

}
