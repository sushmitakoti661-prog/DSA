class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i=0;
        int cnt=0, max=0;
        while(i<nums.length){
            if(nums[i]==1){
                cnt++;
                i++;
                if(cnt>max) max=cnt;
            }
            else{
                cnt=0;
                i++;
            }
        }
        return max;
    }
}