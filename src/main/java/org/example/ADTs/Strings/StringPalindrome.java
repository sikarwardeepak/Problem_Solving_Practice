package org.example.ADTs.Strings;

public class StringPalindrome {
    //Check if a string is a palindrome
    public static void main(String[] args) {
        String a = "malayalam";
        boolean isPalindrome = true;

        int start = 0, end = a.length()-1;
        while (start<end) {
            if (a.charAt(start)!=a.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        if (isPalindrome) {
            System.out.println("String is palindrome.");
        } else {
            System.out.println("String is not palindrome.");
        }
    }
}
