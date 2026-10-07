import java.util.Arrays;

class Solution {

    private int solve(int index, int[] nums, int[] memo) {
        int n = nums.length;

        if (index >= n - 1) {
            return 0;
        }

        if (memo[index] != -1) {
            return memo[index];
        }

        int minJumps = Integer.MAX_VALUE;
        int farthestJump = Math.min(n - 1, index + nums[index]);

        for (int nextIndex = index + 1; nextIndex <= farthestJump; nextIndex++) {
            int nextJumps = solve(nextIndex, nums, memo);

            if (nextJumps != Integer.MAX_VALUE) {
                minJumps = Math.min(minJumps, 1 + nextJumps);
            }
        }

        memo[index] = minJumps;
        return memo[index];
    }

    public int jump(int[] nums) {
        int[] memo = new int[nums.length];
        Arrays.fill(memo, -1);
        return solve(0, nums, memo);
    }
}