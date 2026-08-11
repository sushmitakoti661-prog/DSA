class Solution {
    public int trap(int[] h) {
        int i=0, j=h.length-1;
        int water=0, leftMax=0, rightMax=0;
        while(i<j){
            if(h[i]<h[j]){
            if(h[i]>leftMax){
                leftMax=h[i];
            }
            else{
                water+=leftMax-h[i];
                i++;
            }
        }
            else{
                if(h[j]>rightMax){
                    rightMax=h[j];
                }
                else{
                    water+=rightMax-h[j];
                    j--;
                }
            }
        }
        return water;
    }
}