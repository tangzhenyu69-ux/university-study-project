package universitystudy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Morse {
    public static void main(String[] args) {
        try (BufferedReader bf = new BufferedReader(new FileReader(args[0]));
                PrintWriter pw = new PrintWriter(new FileWriter(args[1]))) {
            String line;
            while ((line = bf.readLine()) != null) {
                for (int i = 0; i < line.length(); i++) {
                    if (i != line.length() - 1) {
                        if (line.charAt(i) == '0') {
                            pw.print("----- ");
                        } else {
                            pw.print(".---- ");
                        }
                    } else {
                        if (line.charAt(i) == '0') {
                            pw.print("-----");
                        } else {
                            pw.print(".----");
                        }
                    }
                }
                pw.println();
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("error");
        }
    }
}
