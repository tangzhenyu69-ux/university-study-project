package universitystudy;

import java.util.Random;

public class Blindbox {
    public static void main(String[] args) {
        int[] arr = new int[12];
        boolean a = false;
        Random rd = new Random();
        while (true) {
            int b = rd.nextInt(12) + 1;
            for (int j = 0; j < arr.length; j++) {
                if (b == (j + 1)) {
                    arr[j]++;
                }
            }
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] != 0)
                    a = true;
                else {
                    a = false;
                    break;
                }
            }
            if (a) {
                break;
            }
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);

    }
}
