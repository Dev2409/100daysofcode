public class candy_distribution {
    public static long minCandies(int n, int[] arr) {
        int [] candies = new int[n];

        // Initialize each child with 1 candy
        for (int i = 0; i < n; i++) {
            candies[i] = 1;
        }

        // Scan from left to right
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        // Scan from right to left and update if necessary
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > arr[i + 1] && candies[i] <= candies[i + 1]) {
                candies[i] = candies[i + 1] + 1;
            }
        }

        // Calculate the total number of candies needed
        long totalCandies = 0;
        for (int candy : candies) {
            totalCandies += candy;
        }

        return totalCandies;
    }

    public static void main(String[] args) {
        // Sample Input 0
        int n1 = 3;
        int[] arr1 = {1, 2, 2};
        long result1 = minCandies(n1, arr1);
        System.out.println(result1); // Output: 4

        // Sample Input 1
        int n2 = 10;
        int[] arr2 = {2, 4, 2, 6, 1, 7, 8, 9, 2, 1};
        long result2 = minCandies(n2, arr2);
        System.out.println(result2); // Output: 19
    }
}
