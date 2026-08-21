class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n=nums.length;
        int ans=nums[0], curMin=nums[0], curMax=nums[0];
        int maxSum=nums[0];
        int minSum=nums[0];
        int totalSum=nums[0];

        for(int i=1; i<n; i++){
            totalSum+=nums[i];

            curMax=Math.max(nums[i], curMax+nums[i]);
            maxSum=Math.max(maxSum, curMax);

            curMin=Math.min(nums[i], curMin+nums[i]);
            minSum=Math.min(minSum, curMin);
        }
        if(totalSum==minSum) return maxSum;
        else return Math.max(maxSum, totalSum-minSum);
    }
}