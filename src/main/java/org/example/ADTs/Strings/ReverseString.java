package org.example.ADTs.Strings;

public class ReverseString {
    //Reverse a string
    public static void main(String[] args) {
        String str = "Hello World";
        String reversedString = reverseString(str);
        System.out.println(reversedString);
    }

    public static String reverseString(String string){
        StringBuilder reversedString = new StringBuilder("");
        int stringLength = string.length();
        for (int i = stringLength-1;i>=0;i--) {
            reversedString.append(string.charAt(i));
        }
        return reversedString.toString();
    }
}
