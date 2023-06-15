class HelloWorld {
    public static void main(String[] args) {
        int[] arr1 = {1,22,3,4};
        System.out.println(sorted(arr1,0));
    }
    static boolean sorted(int [] arr, int i){
        if(i==arr.length-1){
            return true;
        }
        return arr[i]<arr[i+1] && sorted(arr,i+1);
    }
}