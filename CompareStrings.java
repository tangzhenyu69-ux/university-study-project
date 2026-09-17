package universitystudy;

import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两句话");
        String s2 = sc.next();
        String s1 = sc.next();
        boolean equal = true;
        if (s1.length() != s2.length()) {
            equal = false;
        } else {
            for (int i = 0; i < args.length; i++) {
                char a = s1.charAt(i);
                char b = s2.charAt(i);
                if (a != b)
                    equal = false;
            }
        }
        if (equal)
            System.out.println("EQUAL");
        else
            System.out.println("NOT EQUAL");
    }
}
