package ControlFlowandCollectionsExercise;

import java.util.Scanner;

public class StringSplitHelper {
    public static void strSizeFive(String[] wordList) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the search length for words");
        int wordLength = input.nextInt();

        for (String item : wordList) {
            if (item.length() >= wordLength) {
                System.out.println(item);
            }
        }
    }
}
