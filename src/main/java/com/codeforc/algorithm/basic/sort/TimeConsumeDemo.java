package com.codeforc.algorithm.basic.sort;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Author: Ifan·Huang
 * Description: 排序算法效率
 **/
public class TimeConsumeDemo {

    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        SelectionSort selectionSort = new SelectionSort();
        BubbleSort bubbleSort = new BubbleSort();
        InsertionSort insertionSort = new InsertionSort();
        Collection<Sortable> sortables = new ArrayList<>();
        sortables.add(mergeSort);
        sortables.add(selectionSort);
        sortables.add(bubbleSort);
        sortables.add(insertionSort);
        ArrayCheckWare.checkArraySortTimeConsume(sortables);

    }
}
