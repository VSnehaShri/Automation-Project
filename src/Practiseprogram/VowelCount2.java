package Practiseprogram;

public class VowelCount2 {

	public static void main(String[] args) {


		String s = "gsit bangalore";
		int vowel=0;
		int consonent =0;
		String s2 ="aeiou";
		
		String []arr =s.split("");
		
		for(int i =0; i<arr.length;i++) {
			if(s2.contains(arr[i])) {
				vowel++;
			}
			else {
				consonent++;
			}
		}
System.out.println(" Vowel count is : "+vowel);
System.out.println("Consonent count is : "+consonent);
	}

}
