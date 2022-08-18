package Arrays;

import java.util.Arrays;

public class Transpose {
    public static void main(String[] args) {

        int[][] arr = {{3, 2, 1, 7},
                {9, 11, 5, 4},
                {6, 0, 13, 17},
                {7, 21, 14, 15}};
        int[][] transpose = new int[4][4];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                transpose[j][i] = arr[i][j];
            }
        }
        System.out.println("Transpoze: ");
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[i].length; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
