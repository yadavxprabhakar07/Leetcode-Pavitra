class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int left = 0;
        int sum =0;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            sum += nums[i];
            while(sum >=  target){
                min = Math.min(min, i - left + 1);
                sum -= nums[left];
                left++;
            }
        }
        return min==Integer.MAX_VALUE? 0 : min;
    }
}