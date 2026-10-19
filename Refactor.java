package universitystudy;

import java.util.Scanner;

public class Refactor {

    public static int getscores() {
        Scanner input = new Scanner(System.in);
        System.out.print("How many scores? ");
        int count = input.nextInt();

        while (count <= 0) {
            System.out.print("Please enter a positive number: ");
            count = input.nextInt();
        }
        return count;
    }

    public static void score(int[] score) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < score.length; i++) {
            System.out.print("Enter score " + (i + 1) + ": ");
            score[i] = input.nextInt();
        }
    }

    public static double average(int[] scores) {
        int total = 0;

        for (int i = 0; i < scores.length; i++) {
            total += scores[i];
        }

        double average = (double) total / scores.length;
        return average;
    }

    public static int pass(int[] scores) {
        int passing = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= 60) {
                passing++;
            }
        }
        return passing;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Read scores.
        int count = getscores();

        int[] scores = new int[count];
        score(scores);

        // Calculate the average.
        double average = average(scores);

        // Count passing scores.
        int passing = pass(scores);

        // Print the report.
        System.out.println("----- Score Report -----");
        System.out.println("Number of scores: " + scores.length);
        System.out.println("Average: " + average);
        System.out.println("Passing: " + passing);
        System.out.println("Not passing: " + (scores.length - passing));

        input.close();
    }
}
