package EasyRecursion;

public class FibonacciRecursion {

	public static int Fibonacci(int n) {
		// Base case
		if (n <= 1) {
			return n;
		} else { // Fibonacci sequence = sum of previous two numbers in sequence
			return Fibonacci(n - 1) + Fibonacci(n - 2);
		}
	}

	public static void main(String[] args) {
		int n = 10;
		System.out.println("The Fibonacci number at positon " + n + " is " + Fibonacci(n));
	}
}

