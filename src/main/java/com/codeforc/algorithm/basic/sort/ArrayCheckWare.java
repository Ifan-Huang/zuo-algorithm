package com.codeforc.algorithm.basic.sort;

import java.util.Arrays;
import java.util.Collection;

/**
 * Author: Ifan·Huang
 * Description: 对数器，默认测试五十万组数组
 **/
public class ArrayCheckWare {

    public static int[] generateArray(int maxSize, int maxValue) {
        int[] arr = new int[(int) ((maxSize + 1) * Math.random())];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((maxValue + 1) * Math.random()) - (int) (maxValue * Math.random());
        }
        return arr;
    }

    public static int[] copyArray(int[] arr) {
        if(arr == null)
            return null;
        int[] res = new int[arr.length];
        System.arraycopy(arr, 0, res, 0, arr.length);
        return res;
    }

    public static boolean checkArraySort(Sortable sortable) {
        int testTime = 500000;
        int maxSize = 100;
        int maxValue = 100;
        boolean success = true;
        for (int i = 0; i < testTime; i++) {
            int[] testArray = ArrayCheckWare.generateArray(maxSize, maxValue);
            int[] copyArray = ArrayCheckWare.copyArray(testArray);
            sortable.sort(testArray);
            Arrays.sort(copyArray);
            if(!isEquals(testArray, copyArray)) {
                success = false;
                break;
            }
        }
        System.out.println(success);
        return success;
    }

    public static void checkArraySortTimeConsume(Collection<Sortable> sortables) {
        for (Sortable sortable : sortables) {
            checkArraySortTimeConsume(sortable);
        }
    }

    public static void checkArraySortTimeConsume(Sortable sortables) {
        int testTime = 100;
        int maxSize = 100;
        int maxValue = 100;
        boolean success = true;
        for (int i = 0; i < testTime; i++) {
            int[] testArray = ArrayCheckWare.generateArray(maxSize, maxValue);
            int[] copyArray = ArrayCheckWare.copyArray(testArray);
            sortables.sortConsume(testArray);
            Arrays.sort(copyArray);
            if(!isEquals(testArray, copyArray)) {
                success = false;
                break;
            }
        }
    }


    private static boolean isEquals(int[] testArray, int[] copyArray) {
        if((testArray == null && copyArray != null) || (testArray != null && copyArray == null)) return false;
        if(testArray == null && copyArray == null) return true;
        if(testArray.length != copyArray.length) return false;
        for(int i = 0; i < testArray.length; i++) {
            if(testArray[i] != copyArray[i]) return false;
        }
        return true;
    }
}
