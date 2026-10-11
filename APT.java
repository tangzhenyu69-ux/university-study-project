package universitystudy;

import java.util.Scanner;

public class APT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String aptdetector = sc.nextLine();
        for (int i = 0; i < aptdetector.length() - 3; i++) {
            char a = aptdetector.charAt(i);
            char b = aptdetector.charAt(i + 1);
            char c = aptdetector.charAt(i + 2);
            if (Character.toLowerCase(a) == 'a' && Character.toLowerCase(b) == 'p' && Character.toLowerCase(c) == 't') {
                System.out.println("yes,at position" + i);
                return;
            }
        }
        System.out.println("not match");
    }
}
