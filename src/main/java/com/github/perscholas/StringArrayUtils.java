package com.github.perscholas;

import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return null;
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return null;
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return null;
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return null;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        return null;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static Boolean isPalindromic(String[] array) {
        return null;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static Boolean isPangramic(String[] array) {
        return null;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        return 0;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        return null;
    }


    // Why is Array giving me an error here?
    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        String[] newArr = new String[array.length];
        int k = 0; // index for newArr
        /*for (int i = 1; i < array.length ; i++) {
            int j = i+1; // index for while loop.
            newArr[k] = array[i];
            while (j < array.length - 1 && array[i]==array[j] ) { // && to prevent out of bounds.
                j++;
                i = j - 1; // reset this to -1 since i will increment by 1. Move this in while loop to prevent infinite loop on last cycle.
            }
            k++;
        }*/
        // reverse method -- simpler
        int i = 0;
        newArr[i] = array[i];
        for (i = 1; i < array.length ; i++){
            if (array[i-1]!=array[i])
                newArr[i] = array[i];
        }

        return newArr;

    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence
     *         concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {

        // 0, 1, 2, 2, 2, 3, 4
        String[] newArr = new String[array.length];
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < array.length ; i++) {
            int k = 0; // index for newArr
            int j = i+1; // index for while loop

            newStr = newStr.append(array[i]);
            while (j < array.length - 1 && array[i]==array[j] ) {
                newStr = newStr.append(array[j]);
                j++;
                i = j - 1; // reset this to -1 since i will increment by 1.
            }

            newArr[k] = newStr.toString();
            k++;
        }

        return newArr;
    }

}
