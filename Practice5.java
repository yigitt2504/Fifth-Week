package com.fifthweek;

public class Practice5 {
    public static void main( String[] args ){
        /*Practice 5
        Code the program that displays the negative integers of an array, and then positive integers. */

        int array[] = {1, -2, 3, -4, 5, -6, 7, -8, 9, -10};

        for(int i=0; i<10; i++)
            if(array[i]<0)
            System.out.printf("%d\n", array[i]);
        for(int i=0; i<10; i++)
            if(array[i]>0)
            System.out.printf("%d\n", array[i]);
    }

}
