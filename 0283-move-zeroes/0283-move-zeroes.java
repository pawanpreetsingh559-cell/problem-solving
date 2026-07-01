class Solution {
    public void moveZeroes(int[] nums) {
        
        int insertpos=0;
        int i=0;
        while(i<nums.length){
            if(nums[i]==0){
                i++;
            }
            else{
                int temp=nums[insertpos];
                nums[insertpos]=nums[i];
                nums[i]=temp;
                insertpos++;
                i++;
            }
        }
        return;
        
    }
}