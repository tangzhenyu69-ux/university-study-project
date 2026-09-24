package universitystudy;

import java.util.Random;

public class Max2D {
    public static void main(String[] args) {
        double[][] arr = new double[3][2];
        Random rd = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                Double a = rd.nextDouble(20.0) - 10.0;
                arr[i][j] = a;
            }
        }
        double max = arr[0][0];
        int bestrow = 0;
        int bestcol = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                    bestrow = i;
                    bestcol = j;
                }
            }
        }
        System.out.println(max + " " + "best row is" + " " + bestrow + " " + "best col is" + " " + bestcol);
    }
}
