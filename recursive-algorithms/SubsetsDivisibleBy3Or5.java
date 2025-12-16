package WorkSheet_3;

public class SubsetsDivisibleBy3Or5 {

    private static void findSubsets(int[] arr, int n, int sum, int remaining, int[] subset, int[] count) {
        if (remaining == 0) {
            if (sum % 3 == 0 || sum % 5 == 0) {
                count[0]++;
                for (int i = 0; i < 3; i++) {
                    System.out.print(subset[i] + " ");
                }
                System.out.println();
            }
            return;
        }

        for (int i = n; i >= 0; i--) {
            subset[remaining - 1] = arr[i];
            findSubsets(arr, i - 1, sum + arr[i], remaining - 1, subset, count);
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1, 5};
        int n = arr.length;
        int[] subset = new int[3];
        int[] count = new int[1];
        
        System.out.println("Example Input:");
        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
        	System.out.print(arr[i] + " ");
        }
        
        System.out.println("\n");
        
        System.out.println("Example Output:");
    	findSubsets(arr, n - 1, 0, 3, subset, count);
        
        System.out.println("The total number of subsets divisible by 3 or 5 is: " + count[0]);
    }
}
