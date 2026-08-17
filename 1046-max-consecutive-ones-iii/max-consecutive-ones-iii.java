class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0, r=0;
        int maxLength=0;
        int zeroCnt=0;
        for(r=0;r<nums.length;r++){
            if(nums[r]==0) zeroCnt++;

            while(zeroCnt>k){
                if(nums[l]==0) zeroCnt--;
                l++;
            }
            maxLength=Math.max(maxLength, r-l+1);
        }
        return maxLength;
    }
}