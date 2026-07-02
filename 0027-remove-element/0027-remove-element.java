class Solution {
    public int removeElement(int[] nums, int val) {
        int insertpos=0;
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                n--;
            }else{
                nums[insertpos]=nums[i];
                insertpos++;
            }
            
        }
        return n;
    }
}