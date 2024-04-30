package com.fifthweek;

public class Practice9 {
    public static void main( String[] args ){
        /*Practice 9
        Code the program that finds the number of odd and even numbers in an array. */

        int array[] = {2, 7, 8, 11, 15, 19, 25, 1, 3, 18};
        int length = array.length;
        int even=0, odd=0;

        for(int i=0; i<length; i++)
            if(array[i]%2==0)
            even++;

            else if(array[i]%2!=0)
            odd++;

        System.out.printf("There are %d even numbers and %d odd numbers in this array.", even, odd);
        
    }
}
