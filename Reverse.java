package universitystudy;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("请输入");
        for (int i = 0; i < a.length; i++) {
            int b = sc.nextInt();
            a[i] = b;
        }
        Arrays.sort(a);
        for (int i = a.length - 1; i > 0; i--) {
            System.out.print(a[i] + " ");
        }
        System.out.print(a[0]);
        System.out.println();
    }
}