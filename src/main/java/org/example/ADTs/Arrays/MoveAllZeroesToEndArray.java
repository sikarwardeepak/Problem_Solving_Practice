package org.example.ADTs.Arrays;

public class MoveAllZeroesToEndArray {
    //Move all zeros to the end of the array
    public static void main(String[] args) {
        int[] array = {1,0,1,2,3,0,0,4};
        int NonZeroIndex = 0;
        for (int i=0;i<array.length;i++) {
            if (array[i]!=0) {
                int temp = array[i];
                array[i] = array[NonZeroIndex];
                array[NonZeroIndex++] = temp;
            }
        }

        for (int i=0;i<array.length;i++) {
            System.out.println(array[i]);
        }
    }
}
