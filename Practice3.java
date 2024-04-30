package com.fifthweek;

public class Practice3 {
    public static void main( String[] args ){
        /*Practice 3
        Code the program to declare an array whose size is 20 and assign the first 20 odd numbers to each element of the array starting from 1. */

        int array[] = new int [20];

        for(int i=0; i<20; i++)
            array[i] = 2*i+1;
    }

}
