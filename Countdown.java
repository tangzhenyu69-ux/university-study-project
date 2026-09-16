package universitystudy;

import java.util.Random;
import java.util.Scanner;

public class Countdown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        Random random = new Random();
        while (true) {
            if (a <= 0) {
                a = random.nextInt(100);
            } else
                break;
        }
        while (a > 0) {
            System.out.println(a);
            a--;
        }
        System.out.println("we are done");
    }

}
