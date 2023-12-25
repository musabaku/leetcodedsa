class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        int count=0;
        if(s.isEmpty()){
            return count;
        }
        for(char ch:s.toCharArray()){
            if(ch=='('){
                stack.push(ch);
                count++;
            }
            else{
                if(stack.isEmpty() && ch==')'){
                    count++;
                }
                if(!stack.isEmpty() && ch==')'){
                    stack.pop();
                    count--;
                }
            }
            
        }
        return count;
    }
}

// https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/description/