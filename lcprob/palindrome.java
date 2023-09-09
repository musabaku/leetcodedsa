class Solution {
    public boolean isPalindrome(int x) {
        int digit;
        int temp = x;
        int reversed = 0;
        if(x<0 || (x % 10 == 0 && x != 0)){
            return false;
        }

        while (x>0){
            digit = x%10;
         reversed = reversed * 10 + digit;
            x /=10;
        }
        return (reversed == temp);


    }
}