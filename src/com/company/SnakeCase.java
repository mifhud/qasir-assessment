package com.company;

import java.util.Scanner;

public class SnakeCase {
    static final Scanner sc = new Scanner(System.in);

    public static String sentenceToSnake(String str) {
        // Replace whitespaces to underscore
        String noSpaceStr = str.replaceAll("\\s", "_");

        // Convert to lower case
        String lowerCaseStr = noSpaceStr.toLowerCase();

        return lowerCaseStr;
    }

    public static void main(String[] args) {
        System.out.println("Input: ");

        System.out.print("N = ");
        int N = sc.nextInt();
        String s = "";

        boolean done = false;
        while (!done) {
            System.out.print("S = ");
            sc.nextLine();
            s = sc.nextLine();

            if(s.length() <= N) {
                done = true;
            } else {
                System.out.printf("Sentences should contain no more than %d words", N).println();
                done = false;
            }
        }

        String convSentToSnake = sentenceToSnake(s);
        System.out.println("Output: " + convSentToSnake);
    }
}
