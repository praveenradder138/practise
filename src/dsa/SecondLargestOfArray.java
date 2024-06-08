package dsa;

public class SecondLargestOfArray {

	
	public static void main(String[] args) {
		
		int[] arr = new int[]{1,3,6,23,4,3,9,8,23};
		
		int secondLargest = getSecondLargest(arr);
		
		System.out.println(secondLargest);
	}

	private static int getSecondLargest(int[] arr) {
		//1,3,6,23,4,3,9,8
		Integer largest = Integer.MIN_VALUE;
		Integer secondLargest = Integer.MIN_VALUE;
		
		for(int i=0 ; i<arr.length ;i++) {
			
			if(arr[i] > largest) {
				secondLargest = largest ;
				largest = arr[i];
			}
			else if(arr[i] > secondLargest && arr[i]!=largest) {
				secondLargest=arr[i];
			}
			
		}
		
		
		return secondLargest;
	}
}
