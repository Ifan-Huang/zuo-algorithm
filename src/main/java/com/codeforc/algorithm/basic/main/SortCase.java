package com.codeforc.algorithm.basic.main;

import com.codeforc.algorithm.basic.sort.SelectionSort;
import com.codeforc.algorithm.basic.sort.Sortable;

public class SortCase {

    public static void main(String[] args) {
        int[] arr = {3,1,2,1,5,7,-1};
        Sortable sortable = new SelectionSort();
        sortable.sort(arr);
    }
}
