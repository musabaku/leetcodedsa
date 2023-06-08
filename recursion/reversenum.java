
class HelloWorld {
    static int sum = 0;

    public static void main(String[] args) {

        fun(12345, sum);

        System.out.println(sum);
    }

    static void fun(int n, int sum) {
        if (n / 10 == n) {
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        fun(n / 10, sum);
    }
}