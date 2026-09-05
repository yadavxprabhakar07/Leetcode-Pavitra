class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length; 
        int[] minarr = new int[n];
        minarr[n-1] = nums[n-1];
        for(int i = n-2; i >= 0; i--){
            minarr[i] = Math.min(nums[i], minarr[i+1]);
        }
        int maxpre = nums[0];
        for(int i = 0; i < n; i++){
            maxpre = Math.max(maxpre, nums[i]);
            int diff = maxpre - minarr[i];
            if(diff <= k) return i;
        }
        return -1;
    }
}