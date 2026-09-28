package universitystudy;

import java.util.Scanner;

public class Addtwonumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        while (true) {
            try {
                a = sc.nextInt();
                b = sc.nextInt();
                break;
            } catch (Exception e) {
                // TODO: handle exception
                sc.nextLine();
                System.out.println("请重新输入");
            }
        }
        System.out.println("a + b = " + (a + b));
    }
}
