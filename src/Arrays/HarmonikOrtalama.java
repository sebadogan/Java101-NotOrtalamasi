package Arrays;
import java.util.Arrays;

public class HarmonikOrtalama {
    public static void main(String[] args) {


        int[] arr={1,2,3,4,5};
        double sum=0;

        for(double i:arr) {
            sum+=1/i;
        }
        double harmonikSort=arr.length/sum;
        System.out.println(harmonikSort);
    }
}
