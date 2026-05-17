package package2;

import java_program.NonStaticVar1;

public class Variable2 {

	public static void main(String[] args) {
	
		NonStaticVar1 bus = new NonStaticVar1();
		
		System.out.println(bus.a);
		System.out.println(bus.b);
		System.out.println(bus.a+ bus.b);

	}

}
