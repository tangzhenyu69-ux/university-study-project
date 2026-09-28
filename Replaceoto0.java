package universitystudy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOError;
import java.io.PrintWriter;
import java.nio.Buffer;

public class Replaceoto0 {
    public static void main(String[] args) {
        try (BufferedReader bf = new BufferedReader(new FileReader("universitystudy/input.txt"));
                PrintWriter pw = new PrintWriter(new FileWriter("universitystudy/output.txt"))) {
            String line;

            while ((line = bf.readLine()) != null) {
                pw.println(line.replace("o", "0").replace("O", "0"));
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("can't read the file");
        }
    }
}
