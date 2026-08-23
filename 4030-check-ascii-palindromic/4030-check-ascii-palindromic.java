class Solution {
    public boolean isPalindromic(String s) {
        int n = s.length();
     //   int ascii = 0;
        String res = "";
        
        for(int i =0;i<n;i++){
           //char ch = s.charAt(i);
         int   ascii = (int) s.charAt(i);

         String  binary = Integer.toBinaryString(ascii);
           while(binary.length() < 8){
            binary  = "0" + binary;
           }
           res += binary;
                
                   }
        int n2 = res.length();
        int left = 0;
        int right = n2 - 1;
        while(left < right){

            if(res.charAt(left) != res.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}