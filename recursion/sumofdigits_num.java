class HelloWorld {
    public static void main(String[] args) {
        System.out.println(fun(6621));
    }
     
    static int fun(int n){
        if(n==0){
            return n;
        }
        int rem = n%10;
         n = n/10;
        return fun(n) + (rem);
    }
}

