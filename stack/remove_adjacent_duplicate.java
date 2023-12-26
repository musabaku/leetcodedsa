class Solution {
    public String removeDuplicates(String s) {
     Stack<Character> stack = new Stack<>();
      if (s == null || s.isEmpty()) {
            return "";
        }
    if(s.length()==1){
        return s;
    }

        stack.push(s.charAt(0));

        for(int i=1;i<s.length();i++){
            char ch = s.charAt(i);
         if(!stack.isEmpty() && ch==stack.peek()){
             stack.pop();
         }
         else{
             stack.push(ch);
         }

        }
        StringBuilder result = new StringBuilder();
        for (char ch : stack) {
            result.append(ch);
        }

 return result.toString();

    }
}