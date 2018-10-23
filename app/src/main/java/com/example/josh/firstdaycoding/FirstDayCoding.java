package com.example.josh.firstdaycoding;

import java.util.HashMap;
import java.util.List;

public class FirstDayCoding {

    public static void main(String[] args) {
        
    }



    public static void findDuplicates(List<String> strings) {
        HashMap<String, Boolean> checkDuplicates = new HashMap<String, Boolean>();

        for (String i : strings) {
            if (!checkDuplicates.containsKey(i)) {
                checkDuplicates.put(i, false);
            } else if (!checkDuplicates.get(i)) {
                System.out.println(i);
                checkDuplicates.put(i, true);
            }
        }
    }

    public static void checkPalindrome(String word) {

        int low = 0, high = word.length() - 1;
        boolean palindrome = true;
        while (low < high) {
            if (word.charAt(low) != word.charAt(high)) {
                System.out.println("Not Palindrome");
                palindrome = false;
                break;
            }
            low++;
            high--;
        }
        if (palindrome)
            System.out.println("Is Palindrome");
    }

    public static void fizzBuzz(int count) {
        for (int i = 1; i <= count; i++) {
            boolean fizz = false, buzz = false;

            if (i % 3 == 0)
                fizz = true;
            if (i % 5 == 0)
                buzz = true;

            if (fizz)
                System.out.print("fizz");
            if (buzz)
                System.out.print("buzz");
            if (!fizz && !buzz)
                System.out.print(i);

            System.out.println();
        }
    }

    public static boolean findAnagrams(String word1, String word2) {
        HashMap<Character, Integer> checkAnagrams = new HashMap<Character, Integer>();

        for (int i = 0; i < word1.length(); i++) {
            if (checkAnagrams.containsKey(word1.charAt(i))) {
                checkAnagrams.put(word1.charAt(i), checkAnagrams.get(word1.charAt(i)) + 1);
            } else {
                checkAnagrams.put(word1.charAt(i), 1);
            }
        }

        for (int i = 0; i < word2.length(); i++) {
            if (checkAnagrams.containsKey(word2.charAt(i))) {
                if (checkAnagrams.get(word2.charAt(i)) < 1) {
                    return false;
                } else {
                    checkAnagrams.put(word2.charAt(i), checkAnagrams.get(word2.charAt(i)) - 1);
                }
            } else {
                return false;
            }
        }
        if (checkAnagrams.containsValue(1)) {
            return false;
        } else {
            return true;
        }
    }

    public static void printTables() {

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }

}
