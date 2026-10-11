package universitystudy;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        while (true) {
            try {
                a = sc.nextInt();
                break;
            } catch (Exception e) {
                // TODO: handle exception
                sc.nextLine();
                System.out.println("not a int");
            }
        }
        int count = 0;
        for (int i = 1; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                count++;
            }
        }
        if (count == 1 && a != 1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

}