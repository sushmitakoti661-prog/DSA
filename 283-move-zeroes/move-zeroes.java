class Solution {
    public void moveZeroes(int[] a) {
        // int j=0, temp, i;
        // for(i=0;i<a.length;i++){
        //     if(a[i]!=0 && a[j]==0){
        //         temp=a[i];
        //         a[i]=a[j];
        //         a[j]=temp;
        //     }
        //     if(a[j]!=0){
        //         j++;
        //     }       
        // }

        /*int j=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=0){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                j++;
            }
        }*/

        int i=0, j=i+1;
        while(j<a.length){
            if(a[i]==0 && a[j]!=0){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;
                j++;
            }
            else if(a[i]==0 && a[j]==0) j++;
            else{
                i++;
                j++;
            }
        }
    }
}