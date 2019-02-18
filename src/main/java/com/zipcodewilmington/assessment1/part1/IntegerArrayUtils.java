package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerArrayUtils {
    public IntegerArrayUtils() {
    }

    /**
     * @param intArray an array of integers
     * @return the sum of `intArray`
     */
    public static Integer getSum(Integer[] intArray){



        int sum = 0;
        int i;

        for (i=0; i<intArray.length; i++)

            sum += intArray[i];



        return sum;
    }

    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public static Integer getProduct(Integer[] intArray) {

        int product = 0;

        int i =0;

        for (i=0; i<=intArray.length; i++)

            product = product * i;



        return product;
    }

    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public static Double getAverage(Integer[] intArray) {

        // add integers in array
        //determine length of array array.length
        //divide sum by array.length

        double sum= 0;

        int length = intArray.length;

        for(int i=0; i<+intArray.length; i++) {
                sum+= intArray[i];
    }
        return sum/length;
    }
}
