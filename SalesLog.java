package universitystudy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class SalesLog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 获取输入文档
        String input;
        String output;
        int count = 0;
        while (true) {
            try {
                input = sc.nextLine();
                try (BufferedReader bf = new BufferedReader(new FileReader("universitystudy/" + input + ".txt"))) {
                    while (true) {
                        if (bf.readLine() != null) {
                            count++;
                        } else
                            break;
                    }
                } catch (Exception e) {
                    // TODO: handle exception
                }
                if (new File(input).isFile()) {
                    break;
                }
            } catch (Exception e) {
                // TODO: handle exception
            }
            System.out.println("can not find the file");
        }
        // 将数据写入数组中
        String[] days = new String[count];
        String[] cats = new String[count];
        double[] amount = new double[count];
        try (BufferedReader bf = new BufferedReader(new FileReader("universitystudy/" + input + ".txt"))) {
            for (int i = 0; i < count; i++) {
                String[] line = bf.readLine().split(", ");
                days[i] = line[0];
                cats[i] = line[1];
                amount[i] = Double.parseDouble(line[2]);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        /*
         * test input
         * for (int i = 0; i < amount.length; i++) {
         * System.out.print(days[i]);
         * System.out.print(cats[i]);
         * System.out.print(amount[i]);
         * System.out.println();
         * }
         */
        // create output file
        double[] sum = new double[7];
        double totalsum = 0.00;
        while (true) {
            output = sc.nextLine();
            try (PrintWriter pw = new PrintWriter(new File("universitystudy/" + output + ".txt"))) {
                String[] Days = { "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun" };
                // 求每天收入
                for (int i = 0; i < Days.length; i++) {
                    for (int j = 0; j < count; j++) {
                        if (days[j].equals(Days[i])) {
                            sum[i] += amount[j];
                        }
                    }
                }
                // 求总收入
                for (int i = 0; i < Days.length; i++) {
                    totalsum += sum[i];
                }
                // find top day
                String topday = Days[0];
                double topdayamount = sum[0];
                for (int i = 0; i < 7; i++) {
                    if (sum[i] > sum[0]) {
                        topday = Days[i];
                        topdayamount = sum[i];
                    }
                }
                // find top category
                String[] Cats = { "snacks", "drinks", "meals" };
                String topcat = Cats[0];
                double[] Catamount = new double[3];
                for (int i = 0; i < count; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (cats[i].equals(Cats[j])) {
                            Catamount[j] += amount[i];
                        }
                    }
                }
                double topcatamount = Catamount[0];
                for (int i = 0; i < 3; i++) {
                    if (Catamount[i] > Catamount[0]) {
                        topcat = Cats[i];
                        topcatamount = Catamount[i];
                    }
                }
                // output
                pw.println("Day totals:");
                for (int i = 0; i < 7; i++) {
                    pw.printf("%s: %.2f%n", Days[i], sum[i]);
                }
                pw.printf("Top day: %s (%.2f)%n", topday, topdayamount);
                pw.printf("Top category: %s (%.2f)%n", topcat, topcatamount);
                pw.printf("Grand total: %.2f%n", totalsum);
                pw.close();
                break;
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}
