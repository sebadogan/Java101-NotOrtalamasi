package java101;


public class Palindrom {

    static boolean isPalindrom(int n) {
        int temp=n, reverseNumber=0, lastNumber;
        while(temp!=0) {
            lastNumber =temp%10;
            reverseNumber= reverseNumber *10 +lastNumber;
            temp/=10;
        }
        if (n==reverseNumber) {
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {

        System.out.println(isPalindrom(5));


    }
}
