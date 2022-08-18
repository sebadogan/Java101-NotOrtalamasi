package Arrays;

import java.util.Arrays;

public class TekrarEdenSayilar {


    public static void main(String[] args) {

        int[] list = {2, 3, 4, 5, 3, 6, 9, 7, 5, 2, 5, 7, 8, 6, 5, 4};
        Arrays.sort(list);

        for (int i = 0; i < list.length; i++) {
            if (list[i] % 2 == 0) {
                for (int j = 0; j < list.length; j++) {
                    if ((i != j) && (list[i] == list[j])) {
                        System.out.print(list[i] + " ");
                        break;
                    }
                }
            }
        }
    }
}
