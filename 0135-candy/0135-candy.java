import java.util.Arrays;

class Solution {
    /*
     * Finds the minimum candies needed so every child
     * satisfies both adjacent rating rules.
     */
    public int candy(int[] ratings) {
        int n = ratings.length;

        // Each child must receive at least one candy.
        int[] candies = new int[n];
        Arrays.fill(candies, 1);

        for (int i = 1; i < n; i++) {
            // If the current child has a higher rating
            // than the left child, they need more candies.
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        for (int i = n - 2; i >= 0; i--) {
            // If the current child has a higher rating
            // than the right child, the right-side rule
            // must also be satisfied.
            if (ratings[i] > ratings[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }

        // This stores the minimum total candies required.
        int totalCandies = 0;

        for (int candyCount : candies) {
            totalCandies += candyCount;
        }

        return totalCandies;
    }
}

