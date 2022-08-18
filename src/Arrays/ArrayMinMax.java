package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMinMax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = {15, 12, 788, 1, -1, -778, 2, 0};
        int min = arr[0], max = arr[0];
        System.out.print("bir deger girin: ");
        int n = scan.nextInt();

        Arrays.sort(arr);
        for (int i : arr) {
            if (i < n) {
                min = i;
            }

            if (i > n) {
                max = i;
                break;
            }
        }
        System.out.println(n + "e en yakın kücük deger: " + min);
        System.out.println(n + "e en yakın büyük deger: " + max);
    }
}


