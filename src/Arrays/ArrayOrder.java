package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayOrder {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        System.out.print("dizinin boyutunu giriniz: ");
        int n=inp.nextInt();
        int [] arr=new int[n];

        for(int i=0;i<n;i++) {
            System.out.print((i+1) + ". elemanı giriniz: ");
            arr[i]=inp.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Sıralama: "+ Arrays.toString(arr));
    }
}
