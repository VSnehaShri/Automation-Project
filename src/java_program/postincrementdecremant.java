package java_program;

public class postincrementdecremant {

	public static void main(String[] args) {
		
		int a = 10;
		int b =20;
		int c = 5;
		int i = 10;
		System.out.println(i++ + i);//10 +11
		System.out.println(i++ + a++ - b-- + c++ + i++ + b++ + a++ + i--);//11+10-20+5+12+19+11+13
		System.out.println(i+b*a+c);//12+20*12+6
		
		
		

	}

}
