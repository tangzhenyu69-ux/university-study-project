package universitystudy;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Gradereporter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        // 输入n个学生
        while (true) {
            try {
                System.out.println("请输入学生数量（0 - 100）");
                n = sc.nextInt();
                if (n <= 100 && n >= 1)
                    break;
            } catch (InputMismatchException e) {
                // TODO: handle exception
                sc.nextLine();
            }
            System.out.println("error");
        }
        // 记录课程数量
        String[] course;
        sc.nextLine();
        while (true) {
            try {
                System.out.println("请输入科目名称");
                course = sc.nextLine().trim().split("\\s+");
                m = course.length;
                if (m >= 1 && m <= 10) {
                    break;
                }
            } catch (InputMismatchException e) {
                // TODO: handle exception
                sc.nextLine();
            }
            System.out.println("error");
        }
        // 记录所有分数
        int[][] score = new int[n][m];
        for (int i = 0; i < score.length; i++) {
            System.out.println("请输入学生数据");
            String[] arr = sc.nextLine().trim().split("\\s+");
            for (int j = 0; j < score[i].length; j++) {
                score[i][j] = Integer.parseInt(arr[j + 1]);
            }
        }
        for (int i = 0; i < m; i++) {
            double ave;
            int high = score[0][i];
            int low = score[0][i];
            double sum = 0;
            for (int j = 0; j < n; j++) {
                sum += score[j][i] * 1.0;// 求每个科目分数之和
                // 求最大值
                for (int j2 = 0; j2 < n; j2++) {
                    if (high < score[j2][i]) {
                        high = score[j2][i];
                    }
                    // 求最小值
                    for (int j3 = 0; j3 < n; j3++) {
                        if (low > score[j3][i]) {
                            low = score[j3][i];
                        }
                    }
                }
            }
            ave = sum / n;
            System.out.printf("%s: avg=%.2f high=%d low=%d%n", course[i], ave, high, low);
        }
    }
}
