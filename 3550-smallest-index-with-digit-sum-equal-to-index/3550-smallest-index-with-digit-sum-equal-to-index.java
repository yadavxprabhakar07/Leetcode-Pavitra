class Solution {
    public int smallestIndex(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int n1 = nums[i];
            int sum = 0;

            while (n1 > 0) {
                sum += n1 % 10;
                n1 /= 10;
            }

            if (sum == i) {
                return i;
            }
        }

        return -1;
    }
}