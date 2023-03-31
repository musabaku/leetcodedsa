class Solution {
    public int[] countBits(int n) {
        int[] arr1 = new int[n+1];
        int[] arr2 = new int[n+1];
        for(int i =0;i<n+1;i++){
            arr1[i]= i ;
        }

        for(int i =0;i<arr1.length;i++){
        int count = 0;
        while(arr1[i]!=0){
            if((arr1[i]&1)==1){
                count++;
            }
           arr1[i]=arr1[i]>>1;
        }
        arr2[i] = count;
        }
        return arr2;
    }
}