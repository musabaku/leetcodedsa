class HelloWorld {
    public static void main(String[] args) {
        int[] arr1 = {1,22,3,4};
        System.out.println(search(arr1,33,0));
    }
    static boolean search(int [] arr,int t ,int i){
        if(i==arr.length){
            return false;
        }
        return arr[i]== t || search(arr,t,i+1);
    }
}