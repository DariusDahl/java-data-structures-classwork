package EasyRecursion;

public class Generate_Subsets {
	// Element i
	// How many numbers (n)
	// Counter needed (count) (how many elements in array)
	// Array A[]
	public static void Generate_Subsets(int i, int n, int count, int[] A) {
		// Base case
		if (i == n + 1) {
			if (count > 0) {
				System.out.print("{");
			for (int j = 0; j < count - 1; j++) {
				System.out.print(A[j] + ", ");
			}
			for (int k = count - 1; k < count; k++) {
				System.out.print(A[k]);
			}
			System.out.println("}");
			} else {
				System.out.println("{ }");
			}
			return;
		}
		
		// Recurrence
		// Not taking
		Generate_Subsets(i + 1, n, count, A);
		
		// Taking
		A[count] = i;
		Generate_Subsets(i + 1, n, count + 1, A);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int n = 4;
		int count = 0;
		int[] A = new int[n];
		Generate_Subsets(i, n, count, A);
	}
}
