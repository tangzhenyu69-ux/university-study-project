package universitystudy;

import java.util.Scanner;

public class TreasureIsland {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入三个数字");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a < b) {
            a = b;
        }
        if (a < c)
            System.out.println(c);
        else
            System.out.println(a);
    }

}