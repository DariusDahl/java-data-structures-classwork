package EasyRecursion;

public class EasyRecursion {
	// Recursive sum
	// Array indexes are from 0 to n-1
	public static int sum(int n, int[] A) {
		// Consider the base case
		// Every recursion should have a base case
		if (n == 1) {
			System.out.println("Base case: element at n = 1 is " + A[n - 1]);
			return A[n - 1];
		}
		
		// Sum
		int result = A[n - 1] + sum(n - 1, A);
		System.out.println("Sum(" + (n) + ") = " + result);		
		
		return result;
	}
	
	public static void main(String[] args) {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
		// Array of size 5
		int[] A = {2, 3, 5, 1, 2, 4};
		int length = A.length;
		
		int result = sum(length, A);
		System.out.println("Sum of A is: " + result);
	}
}
