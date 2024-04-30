package com.fifthweek;

public class Practice10 {
    public static void main( String[] args ){
        /*Practice 10
        Code the program that finds the common values of two different arrays and display them with their sequence number in their own arrays. */

        int array1[] = {4, 1, 6, 43, -21, 9}, array2[] = {9, 3, 8, 7, 5, 6};
        int length1 = array1.length, length2 = array2.length;

        for(int i=0; i<length1; i++)
            for(int j=0; j<length2; j++)
                if(array1[i] == array2[j])
                    System.out.printf("%d\t%d\t%d\n", array1[i], 1+i, j+1);
                    
    }
}
