class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int left = 0;
        int ans = 0;
       int count = Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
           ans += nums[i];
           
           
           while(ans >= target){
            count = Math.min(count, i-left +1);
            ans -= nums[left];
             
            left++;
           
           }
        
        }
        return count == Integer.MAX_VALUE? 0 : count;
    }
}