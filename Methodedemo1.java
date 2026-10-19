package universitystudy;

import java.util.Scanner;

public class Methodedemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入华氏温度");
        double c = fToC(sc.nextDouble());
        System.out.println(c);
        System.out.println("请输入摄氏温度");
        double f = cToF(sc.nextDouble());
        System.out.println(f);
    }

    public static double fToC(double f) {
        double c = (f - 32) * 5 / 9;
        return c;
    }

    public static double cToF(double c) {
        double f = c * 9 / 5 + 32;
        return f;
    }
}
