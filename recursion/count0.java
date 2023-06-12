
class HelloWorld {
    public static void main(String[] args) {
        System.out.println(count(120000,0));
    }
    
    
    static int count(int n , int c){
        if(n==0){
             if(c == 0){
                return 1; // If n is 0 and c is 0, it means we have one zero in the number
            } else {
                return c;
            }
        }
        int rem = n%10;
        if(rem==0){
           return count(n/10,c+1);
        }
       return count(n/10,c);
        
    
    }
}