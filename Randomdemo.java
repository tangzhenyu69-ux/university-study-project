package universitystudy;

import java.util.Random;

public class Randomdemo {
    public static void main(String[] args) {
        Random rd = new java.util.Random();
        int[] arr = new int[100];
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        int c4 = 0;
        int c5 = 0;
        int c6 = 0;

        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(6) + 1;
        }
        for (int i = 0; i < 100; i++) {
            if (arr[i] == 1) {
                c1++;
            } else if (arr[i] == 2) {
                c2++;
            } else if (arr[i] == 3) {
                c3++;
            } else if (arr[i] == 4) {
                c4++;
            } else if (arr[i] == 5) {
                c5++;
            } else if (arr[i] == 6) {
                c6++;
            }
        }
        System.out.println("1: " + c1);
        System.out.println("2: " + c2);
        System.out.println("3: " + c3);
        System.out.println("4: " + c4);
        System.out.println("5: " + c5);
        System.out.println("6: " + c6);
    }
}
