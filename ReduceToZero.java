package universitystudy;

import java.util.Scanner;

public class ReduceToZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 0;
        while (a != 0) {
            if (a % 2 == 0)
                a = a / 2;
            else
                a = a - 1;
            count++;
        }
        System.out.println(count);
    }
}
