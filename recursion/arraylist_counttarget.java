class HelloWorld {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,5,5,6};
        ArrayList<Integer> list = new ArrayList<>();
        
        System.out.println(count(arr,2,0,list));
    }
    static ArrayList<Integer> count(int[] arr,int t,int i,ArrayList<Integer> list){
        
    if(i==arr.length){
        return list;
    }
    if(t == arr[i]){
        list.add(i);
    }
    return count(arr,t,i+1,list);
    }
}

// return type void

class HelloWorld {
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,3,4,2,5,6};
        ArrayList<Integer> list = new ArrayList<>();
        count(arr,2,0,list);
        System.out.println(list);
    }
    static void count(int[] arr,int t,int i,ArrayList<Integer> list){
        
    if(i==arr.length){
        return;
    }
    if(t == arr[i]){
        list.add(i);
    }
    count(arr,t,i+1,list);
    }
}
