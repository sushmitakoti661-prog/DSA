class Solution {
    public int removeDuplicates(int[] nums) {
    /*
        int i=0, j=1, res=1;
        while(j<nums.length){
            if(nums[j]==nums[j-1]){
                j++;
                continue;
            }
            nums[i+1]=nums[j];
            i++;
            res++;
            j++;
        }
        return res;
    */
        int i=0,j=1;
        while(j<nums.length){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
                j++;
            }else j++;
        }
        return i+1; 
    }
}