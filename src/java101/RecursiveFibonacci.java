package java101;

public class RecursiveFibonacci {


    static int f(int n) {
        int result = 0;
        if (n > 2) {
            for (int i = 2; i <= n; i++) {
                result = f(n - 1) + f(n - 2);
            }
        } else {
            return 1;
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.print(f(8));

    }
}
