class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];

        }
        int left=0;
        int right=n-1;
        for(int j=n-1;j>=0;j--){
            if(nums[right]>nums[left]){
                arr[j]=nums[right];
                right--;
            }else{
                arr[j]=nums[left];
                left++;
            }
        }
        return arr;
        
    }
}