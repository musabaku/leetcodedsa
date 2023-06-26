
import java.util.ArrayList;

class HelloWorld {
    public static void main(String[] args) {
        int[] arr = {1,2,5,3,4,5,6,7,5};
        
         
        System.out.println(func(arr,0,5));
    }
    
    static ArrayList<Integer> func(int[] arr,int index,int t){
         ArrayList<Integer> list = new  ArrayList<>();
         if(index == arr.length){
             return list;
         }
         if(arr[index]==t){
             list.add(index);
         }
         ArrayList<Integer> ansFromBelow = func(arr,index+1,t);
        list.addAll(ansFromBelow);
        return list;
    }
}