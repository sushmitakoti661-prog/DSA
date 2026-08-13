class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0, j;
        int sum=0, cnt=Integer.MAX_VALUE;
        for(j=0;j<nums.length;j++){
            sum+=nums[j];

                while(sum>=target){
                    if((j-i+1)<cnt) cnt=j-i+1;
                    sum=sum-nums[i];
                    i++;
                }
        }
        if(cnt==Integer.MAX_VALUE) return 0;
        else return cnt;
    }
}