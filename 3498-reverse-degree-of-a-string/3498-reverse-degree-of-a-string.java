class Solution {
    public int reverseDegree(String s) {
        int degree = 0;
        for(int i = 0; i < s.length(); i++){
            int curr = (s.charAt(i) - 123) * -1;
            int product = (i+1) * curr;
            degree += product;
        }
        return degree;
    }
}