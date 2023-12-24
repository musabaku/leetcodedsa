class MinStack {
    protected List<Integer> stack;
    int ptr=-1;
        public MinStack() {
            stack = new ArrayList<>();
        }
        
        public void push(int val) {
            ptr++;
    
            stack.add(val);
        }
        
        public void pop() {
            if(ptr>=0){
            stack.remove(ptr);
    
           ptr--;
            }
        }
        
        public int top() {
            if (ptr >= 0) {
                return stack.get(ptr);
            }
            return -1;  }
        
        public int getMin() {
                    if (ptr >= 0) {
                int min = stack.get(0);
                for (int i = 1; i <= ptr; i++) {
                    min = Math.min(min, stack.get(i));
                }
                return min;
            }
            return -1; 
        }
    }
    
    /**
     * Your MinStack object will be instantiated and called as such:
     * MinStack obj = new MinStack();
     * obj.push(val);
     * obj.pop();
     * int param_3 = obj.top();
     * int param_4 = obj.getMin();
     */

    //  https://leetcode.com/problems/min-stack/submissions/