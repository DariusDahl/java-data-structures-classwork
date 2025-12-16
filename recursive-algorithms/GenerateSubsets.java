package WorkSheet_3;

public class Generate_Subsets {

    private static void Generate_Subsets(int n, int sum, int remaining, int[] array, int[] subset, int[] count) {
        // Base Case
        if (remaining == 0) {
            if (sum % 3 == 0 || sum % 5 == 0) {
                // Increment count by 1 every time a subset is divisible by 3 or 5.
                count[0]++;
                for (int i = 0; i < 3; i++) {
                    System.out.print(subset[i] + " ");
                }
                System.out.println();
            }
            return;
        }

        // Recursion step
        for (int i = n; i >= 0; i--) {
            subset[remaining - 1] = array[i];
            // Decrement number of elements in array by 1, add sum of elements in array,
            // decrement remaining elements by 1, array, subset, count
            Generate_Subsets(i - 1, sum + array[i], remaining - 1, array, subset, count);
        }
    }

    public static void main(String[] args) {

        // Array of elements.
        int[] array = { 4, 3, 2, 1 };
        // Number of elements in array.
        int n = array.length;
        // Start sum at 0.
        int sum = 0;
        // Remaining = 3 to get subsets of length 3.
        int remaining = 3;
        // Create subset array.
        int[] subset = new int[n];
        // Create count array to incremenet the number of subsets divisible by 3 or 5.
        int[] count = new int[1];

        // Print out initial array (length and elements) to display to the user.
        System.out.println("Example Input:");
        System.out.println("Elements in array: " + array.length);
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }

        System.out.println("\n");

        // Print out how many subsets (of length 3) are divisible by 3 or 5 to the user.
        System.out.println("Example Output:");
        // Call Generate_Subsets method.
        // Print out the subsets that are divisible by 3 or 5.
        Generate_Subsets(n - 1, sum, remaining, array, subset, count);
        System.out.println("The total number of subsets divisible by 3 or 5 is: " + count[0]);
    }

}
