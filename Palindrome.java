package universitystudy;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int n = Integer.parseInt(a);
        boolean d = true;
        if (n <= 0)
            System.out.println("false");
        else {
            for (int i = 0; i < a.length(); i++) {
                char b = a.charAt(i);
                char c = a.charAt(a.length() - (i + 1));
                if (b != c)
                    d = false;
            }
            System.out.println(d);
        }

    }
}