package java_program;

public class logicaloperator {

	public static void main(String[] args) {
		int a =10;
		int b =20;
		int c = 5;
		
		
		System.out.println(b>c && a<c);
		System.out.println(b>c || a<c);
		System.out.println((b>c && a<c) || (a!=c && b==c));// false || false
		

	}

}
