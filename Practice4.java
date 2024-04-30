package com.fifthweek;

public class Practice4 {
    public static void main( String[] args ){
        /*Practice 4
        The user wants to calculate the average of numbers from 1 to 10. Code the program to calculate the average by using an array. */

        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double sum=0;
        int length=array.length;

        for(int i=0; i<10; i++)
            sum+=array[i];
        System.out.printf("The average is %.2f.", sum/length);
    }
}
