class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> ls = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        ls.add(nums[0]);
        list.add(nums[1]);

        int n = nums.length;

        for (int i = 2; i < n; i++) {
            if (ls.getLast() > list.getLast()) {
                ls.add(nums[i]);
            } else {
                list.add(nums[i]);
            }
        }

        int[] arr = new int[n];
        int index = 0;

        for (int x : ls) {
            arr[index++] = x;
        }

        for (int x : list) {
            arr[index++] = x;
        }

        return arr;
    }
}
