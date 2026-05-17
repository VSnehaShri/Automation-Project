package array_collection;

public class EvenOrOdd {

	public static void main(String[] args) {

		int[] arr = {60, 67, 29, 89, 44, 56, 92, 81};

		int evenCount =0;
		int oddCount =0;
		for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Count of Even Numbers: " + evenCount);
        
		}


	


	}


