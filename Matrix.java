package universitystudy;

import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {
        int[][] a = { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] b = { { 7, 8 }, { 9, 10 }, { 11, 12 } };
        int[][] c = new int[2][2];
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                int sum = 0;
                for (int k = 0; k < a[i].length; k++) {
                    sum += a[i][k] * b[k][j];
                }
                c[i][j] = sum;
            }
        }
        System.out.println(Arrays.deepToString(c));
    }

}
