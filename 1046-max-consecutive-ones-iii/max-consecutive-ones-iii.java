class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxLength=0;

        for(int i=0;i<nums.length;i++){
            int zeroCnt=0;
            for(int j=i;j<nums.length;j++){
                if(nums[j]==0) zeroCnt++;
                if(zeroCnt>k) break;

                maxLength=Math.max(maxLength, j-i+1);
            }
        }
        return maxLength;
    }
}