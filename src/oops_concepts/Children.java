package oops_concepts;

class GrandParents {
	public void Lands() {
		System.out.println("Lands");
	}
}

class Parents extends GrandParents{
	public void Golds() {
		System.out.println("Golds");
	}
}

public class Children extends Parents {
	
public void Silver() {
	System.out.println("Silver");
}

	public static void main(String[] args) {
		
		Children c = new Children();
		c.Lands();
		c.Golds();
		c.Silver();
		
		Parents p = new Parents();
		p.Lands();
		p.Golds();
		
	}

}
