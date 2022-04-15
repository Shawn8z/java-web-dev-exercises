package org.launchcode.java.studios.CountingCharactersB;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharactersB {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a long string for testing");
        String originalStr = input.nextLine().toLowerCase();
        String newStr = originalStr.replaceAll("[\\W]", "");

        HashMap<Character, Integer> charCount = new HashMap<>();
        char[] charArray = newStr.toCharArray();
        Arrays.sort(charArray);

        for (char item : charArray) {
            Integer count = 0;

            for (char i : charArray) {
                if (i == item) {
                    count++;
                }
            }

            charCount.put(item, count);
        }

        for (Map.Entry<Character, Integer> item : charCount.entrySet()) {
            System.out.println(item);
        }
    }

    // missing last bonus mission

}
