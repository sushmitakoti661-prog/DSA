class Solution {
    public int pivotIndex(int[] nums) {
        int leftSum=0, rightSum=0;
        int pivot=0;
        for(int i=0; i<nums.length; i++) rightSum+=nums[i];

        while(pivot<nums.length){
        rightSum-=nums[pivot];
        if(leftSum==rightSum){
            return pivot;
        }
            leftSum+=nums[pivot];
            pivot++;
        }
        return -1;
    }
}