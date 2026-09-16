package universitystudy;

import java.util.Scanner;

public class WeekdayorWeekend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        while (true) {
            if (a <= 0 || a > 7) {
                System.out.println("请输入数字");
                a = sc.nextInt();
            } else
                break;
        }
        if (a == 1 || a == 2 || a == 3 || a == 4 || a == 5)
            System.out.println("It is weekday");
        else if (a == 6 || a == 7)
            System.out.println("It is weekend");

    }

}
