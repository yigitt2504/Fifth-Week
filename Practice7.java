package com.fifthweek;

public class Practice7 {
    public static void main( String[] args ){
        /*Practice 7
        Code the program that finds the highest number among the elements of an array. */

        int array[] = {3, 1, 2, 5, 4};
        int highest = array[0];

        for(int i=0; i<5; i++)
            if(array[i]>highest)
            highest = array[i];

        System.out.printf("%d\t", highest);
    }
}
