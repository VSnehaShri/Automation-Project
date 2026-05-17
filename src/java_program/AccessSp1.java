package java_program;

public class AccessSp1 {

	public int a =10;
	private int b= 15;
	protected int c = 20;
	int d =25;
	
	public static void main(String[] args) {
		
		AccessSp1 obj = new AccessSp1();
		System.out.println(obj.a + obj.b+obj.c+obj.d);
		

	}

}
