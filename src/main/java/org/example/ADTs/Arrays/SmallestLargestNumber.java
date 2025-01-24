package org.example.ADTs.Arrays;

import java.util.Scanner;

public class SmallestLargestNumber {

    //Find the largest/smallest element in an array
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < n ; i++) {
            if (numbers[i]>largest) {
                largest = numbers[i];
            }

            if (numbers[i]<smallest) {
                smallest = numbers[i];
            }
        }

        System.out.println("Smallest is " + smallest);
        System.out.println("Largest is " + largest);
    }
}
