package in.akhilesh;

public class second_largestnumber {
	public class SecondLargestNumber {
	    public static int findSecondLargest(int[] numbers) {
	        int largest = Integer.MIN_VALUE;
	        int secondLargest = Integer.MIN_VALUE;

	        for (int num : numbers) {
	            if (num > largest) {
	                secondLargest = largest;
	                largest = num;
	            } else if (num > secondLargest && num < largest) {
	                secondLargest = num;
	            }
	        }

	        return secondLargest;
	    }

	    public static void main(String[] args) {
	        int[] numbers = { 5, 10, 3, 8, 15 };
	        int secondLargest = findSecondLargest(numbers);
	        System.out.println("The second largest number is: " + secondLargest);
	    }
	}


}
