package java_program;

public class NonStaticVar1 {
	 public int a = 10;
	public int b=20;

	public static void main(String[] args) {
		
		NonStaticVar1 obj = new NonStaticVar1();
		System.out.println(obj.a+ obj.b);
		
		
		

	}

}
