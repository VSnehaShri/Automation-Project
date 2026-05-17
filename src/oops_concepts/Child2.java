package oops_concepts;

class Father {
	public void lands() {
		System.out.println("Lands");
	}
	public void gold() {
		System.out.println("Gold");
	}
	public void silver() {
		System.out.println("Silver");
	}
	
}
class Child1 extends Father{
	public void shares(){
		System.out.println("shares");
	}
}
public class Child2 extends Father{
	public void house() {
		System.out.println("House");
	}

	public static void main(String[] args) {
		Child1 c1 = new Child1();
		c1.shares();
		c1.gold();
		c1.lands();
		c1.silver();
		
		Child2 c2 = new Child2 ();
		c2.gold();
		c2.silver();
		c2.house();
		c2.lands();
		

	}

}
