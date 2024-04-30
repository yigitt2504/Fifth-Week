package com.fifthweek;

public class Practice8 {
    public static void main( String[] args ){
        /*Practice 8
        Code the program that finds the highest number of digits of the elements of an integer array. */

        int array[] = {5, 10, 200, 4000, -5};
        int length = array.length, nofdigits=1;

        int max = array[0], min = array[0];
        
        for(int i=0; i<length; i++)
            if(max<array[i])
            max = array[i];
            else if(min>array[i])
                min = array[i];

        if(-1*min>max)
            max=-1*min;
        
        while((max/=10)>0)
            nofdigits++;
            
        System.out.printf("The highest number of digits of the elements of the array is: %d", nofdigits);

    }
}
