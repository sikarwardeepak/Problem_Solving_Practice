package org.example.ADTs.Strings;

import java.util.Arrays;

public class StringAnagrams {
    //Check if two strings are anagrams
    public static void main(String[] args) {
        String a = "abc";
        String b = "cba";
        boolean isAnagram = isAnagram(a, b);
        if (isAnagram) {
            System.out.println("Strings are anagrams.");
        } else { 
            System.out.println("Strings are not anagrams");
        }
    }

    public static boolean isAnagram(String str1, String str2) {
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        if (str1.length() != str2.length()) {
            return false;
        }

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }
}