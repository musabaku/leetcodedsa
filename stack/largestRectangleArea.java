class Solution {
        public int largestRectangleArea(int[] heights) {
        // heights[heights.length] = 0;
          int[] copy = new int[heights.length+1];

        for (int i = 0; i < heights.length; i++) {
            copy[i] = heights[i];
        }
        copy[copy.length-1] = 0;

       Stack<Integer> stack = new Stack<>();
    //    int pseVal = pse(heights,h) 
    //    int nseVal = 

       int max = heights[0];
       for(int i = 0;i<copy.length;i++){
        while(!stack.isEmpty() && copy[stack.peek()]>copy[i]){
           int h = copy[stack.pop()];
           if(!stack.isEmpty()){

           int l = stack.peek();
           max = Math.max(max,h*(i-l-1));

           }
           else if(stack.isEmpty()){
            int l = -1;
            max = Math.max(max,h*(i-l-1));

           }

        
           
       }

       stack.push(i);
       }
       
        return max;

    }

//     public int nse(int[] heights int index){
//         int n = heights.length;
//         int[] arr = new int[n];
//         Stack<Integer> stack = new Stack<>();
//        for(int i =n-1;i>=0;i--){
//             while(!stack.isEmpty() && stack.peek() >= heights[i]){
//                 stack.pop();
              
//             }
//              if(stack.isEmpty()){
//                 arr[i] = -1;
//                 stack.push(heights[i]);
//             }
//             else{
//                   arr[i] = stack.peek();
//                 stack.push(heights[i]);
//             }
//         }
//         return arr[index];
//     }
//   public int pse(int[] heights int index){
//         int n = heights.length;
//         int[] arr = new int[n];
//         Stack<Integer> stack = new Stack<>();
//        for(int i =0;i<n;i++){
//             while(!stack.isEmpty() && stack.peek() >= heights[i]){
//                 stack.pop();
              
//             }
//              if(stack.isEmpty()){
//                 arr[i] = -1;
//                 stack.push(heights[i]);
//             }
//             else{
//                   arr[i] = stack.peek();
//                 stack.push(heights[i]);
//             }
//         }
//         return arr[index];
//     }

}
