// class Solution {
//     public int[] singleNumber(int[] nums) {
//         int n = nums.length;
//         HashMap<Integer, Integer> map = new HashMap<>();

//         for(int i=0;i<n;i++){
//             map.put(nums[i], map.getOrDefault(nums[i], 0 ) + 1);
//         }
//         int[] arr = new int[2];
//         int i=0;
//         for(Map.Entry<Integer, Integer> entry : map.entrySet()){
//             if(entry.getValue() == 1){
//              arr[i]= entry.getKey();
//              i++;
//             }
//         }
//         return arr;
//     }
// }


class Solution {
    public int[] singleNumber(int[] nums) {
        int n = nums.length;
        
        long XOR = 0;
        
        for(int i=0; i < n; i++) {
            XOR = XOR ^ nums[i];
        }
        
        int rightmost = (int)(XOR & (XOR - 1)) ^ (int)XOR;
        
        int XOR1 = 0, XOR2 = 0;
        
        for(int i=0; i < n; i++) {
            if((nums[i] & rightmost) != 0) {
                XOR1 = XOR1 ^ nums[i];
            }
            else {
                XOR2 = XOR2 ^ nums[i];
            }
        }
        
        if(XOR1 < XOR2) return new int[]{XOR1, XOR2};
        return new int[]{XOR2, XOR1};
    }
}
    