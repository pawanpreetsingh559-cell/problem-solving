class Solution {
    public int removeDuplicates(int[] nums) {
        int insertpos=1;
        int i=0;
        int j=i+1;
        while(i<nums.length && j<nums.length){
            if(nums[i]==nums[j]){
                j++;
                
            }
            else{
                nums[insertpos]=nums[j];
                insertpos++;
                i++;
            }
        }
        return insertpos;
    }
}