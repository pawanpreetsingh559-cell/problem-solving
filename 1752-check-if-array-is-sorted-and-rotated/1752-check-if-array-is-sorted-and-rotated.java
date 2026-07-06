class Solution {
    public boolean check(int[] nums) {
        int i = 0;
        int j = 1;
        int count = 0;

        while (j < nums.length) {
            if (nums[i] > nums[j]) {
                count++;
            }

            i++;
            j++;
        }

        
        if (nums[nums.length - 1] > nums[0]) {
            count++;
        }

        return count <= 1;
    }
}