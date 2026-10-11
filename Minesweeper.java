package universitystudy;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Minesweeper {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = 0;
        while (true) {
            try {
                System.out.println("Rows (1-30)?");
                r = sc.nextInt();
                if (r > 0 && r <= 30) {
                    break;
                }
            } catch (InputMismatchException e) {
                // TODO: handle exception
                sc.nextLine();
            }
            System.out.println("error");
        }
        int c = 0;
        while (true) {
            try {
                System.out.println("Columns (1-30)?");
                c = sc.nextInt();
                if (c > 0 && c <= 30) {
                    break;
                }
            } catch (InputMismatchException e) {
                // TODO: handle exception
                sc.nextLine();
            }
            System.out.println("error");

        }
        sc.nextLine();
        int[][] arr = new int[r][c];
        while (true) {
            boolean a = true;
            for (int i = 1; i <= arr.length; i++) {
                System.out.println("Row " + i + " (" + c + "chars of 0/1):");
                while (true) {
                    String input = sc.nextLine();
                    if (input.length() != c || !input.matches("[01]+")) {
                        System.out.println("error");
                        continue;
                    }
                    for (int j = 0; j < arr[i - 1].length; j++) {
                        arr[i - 1][j] = input.charAt(j) - '0';
                    }
                    break;
                }

            }
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (arr[i][j] != 0 && arr[i][j] != 1) {
                        a = false;
                    }
                }
            }
            if (a) {
                break;
            }
        }
        String[][] arr1 = new String[r][c];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = String.valueOf(arr[i][j]);
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                int count = 0;
                if (arr[i][j] == 1) {
                    arr1[i][j] = "*";
                } else {
                    for (int k = -1; k <= 1; k++) {
                        for (int k2 = -1; k2 <= 1; k2++) {
                            int row = i + k;
                            int col = j + k2;
                            if (row >= 0 && col >= 0 && row <= r - 1 && col <= c - 1 && arr[row][col] == 1) {
                                count++;
                            }
                        }
                    }
                    arr1[i][j] = String.valueOf(count);
                }
            }
        }
        for (int j = 0; j < arr1.length; j++) {
            for (int j2 = 0; j2 < arr1[j].length; j2++) {
                System.out.print(arr1[j][j2]);
            }
            System.out.println();
        }
    }
}
