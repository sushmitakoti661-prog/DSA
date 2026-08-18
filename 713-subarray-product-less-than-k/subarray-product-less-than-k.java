class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int l=0, r=0;
        int cnt=0, pro=1;

        if(k<=1) return 0;

        for(r=0; r<nums.length; r++){
            pro*=nums[r];

            while(pro>=k){
                pro= pro/nums[l];
                l++;
            }
            cnt+=r-l+1;
        }
        return cnt;
    }
}