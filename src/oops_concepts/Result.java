package oops_concepts;

public class Result {
	
	public void openResult(int rollNum){
		System.out.println("Result opened successfully with Student Rollnum: " + rollNum);
			
	}
public void openResult(String sName) {
	System.out.println("Result opened successfully with Student Name: " +sName);
}

public void openResult(String fName, String Dob) {
	System.out.println("Result opened successfully with Student Name " + fName +  " and DOB :" +Dob);
			
}
	public static void main(String[] args) {
		Result r = new Result();
		r.openResult(106);
		r.openResult(208);
		r.openResult("Sneha shri");
		r.openResult("Jana", "5th june 2017");
				
		
		
	}
		

	}


