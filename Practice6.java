package com.fifthweek;

public class Practice6 {
    public static void main( String[] args ){
        /*Practice 6
        Code the program that creates and displays the reverse of an array with 15 elements as another array. */

        int array[] = {1, -2, 3, -4, 5, -6, 7, -8, 9, -10, 11, -12, 13, -14, 15};
        int array1[] = new int[15];

        for(int i=0; i<15; i++)
            array1[14-i] = array[i];

        for(int i=0; i<15; i++)
            System.out.printf("%d\n", array1[i]);

    }
}
