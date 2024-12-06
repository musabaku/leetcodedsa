// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Stack;
class Main {
    public static void main(String[] args) {
        int[] heights = {1,2,3,4,2,1};
         int n = heights.length;
        int[] arr = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i =0;i<n;i++){
            while(!stack.isEmpty() && stack.peek() >= heights[i]){
                stack.pop();
              
            }
             if(stack.isEmpty()){
                arr[i] = -1;
                stack.push(heights[i]);
            }
            else{
                  arr[i] = stack.peek();
                stack.push(heights[i]);
            }
        }
        
  for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        }
}
