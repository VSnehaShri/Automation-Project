package oops_concepts;

class parent{
	public void lands() {
		System.out.println("Lands");
	}
}

public class Child extends parent{
	public void gold() {
		System.out.println("Gold");
	}

	public static void main(String[] args) {
		
Child c = new Child();
c.lands();
c.gold();

parent p = new parent();
p.lands();

	}

}
