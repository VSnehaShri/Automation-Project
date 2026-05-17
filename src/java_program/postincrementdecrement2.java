package java_program;

public class postincrementdecrement2 {

	public static void main(String[] args) {


		int a = 10;
		int b =20;
		int c = 5;
		int i = 10;
		
		System.out.println(i++ + i++ + c++ + a++ + 6);//10+11+5+10+6
		System.out.println(i-- + i++ + b-- + c-- + a++ + i-- + c++ + a--); //12+11+20+6+11+12 +5+12
		System.out.println(b++ + i++ + a++ + c++ + 6 + i++ + c++ + i++);//19+11+11+6+6+12+7+13
		System.out.println(i+a+b+c);//14+12+20+8
	}

}
