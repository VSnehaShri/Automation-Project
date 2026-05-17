package oops_concepts;

class Jan{
	public void roi() {
		System.out.println("8.20%");
	}
}

class Feb extends Jan{
	public void roi() {
		System.out.println("8.42%");
	}
}

class March extends Feb{
	public void roi() {
		System.out.println("8.6%");
	}
}
public class CurrentMonth extends March{
	
	public void roi() {
		System.out.println("8.76%");
	}

	public static void main(String[] args) {
		CurrentMonth obj = new CurrentMonth();
		obj.roi();

		March m = new March();
		m.roi();
	}

}
