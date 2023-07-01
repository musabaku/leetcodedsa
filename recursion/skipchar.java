
class HelloWorld {
    public static void main(String[] args) {
        skipChar("","abccdccpppacv");
    }
    static void skipChar(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch=='c'){
            skipChar(p,up.substring(1));
        }
        else{
            skipChar(p+ch,up.substring(1));
        }
        
    }
}

class HelloWorld {
    public static void main(String[] args) {
        skipChar("", "abccd", 'c');
    }

    static void skipChar(String prefix, String remaining, char skipChar) {
        if (remaining.isEmpty()) {
            System.out.println(prefix);
            return;
        }

        char currentChar = remaining.charAt(0);

        if (currentChar == skipChar) {
            skipChar(prefix, remaining.substring(1), skipChar);
        } else {
            skipChar(prefix + currentChar, remaining.substring(1), skipChar);
        }
    }
}
