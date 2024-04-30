package com.fifthweek;

public class Practice2 {
    public static void main( String[] args ){
        /*Practice 2
        Code the program to declare an array whose size is 20 and assign the first 20 even numbers to each element of the array starting from 2. */
        
        int array[] = new int [20];

        for(int i=0; i<20; i++)
            array[i] = 2*(1+i);
    }

}
