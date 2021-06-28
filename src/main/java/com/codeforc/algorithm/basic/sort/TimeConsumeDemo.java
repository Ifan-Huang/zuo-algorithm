package com.codeforc.algorithm.basic.sort;

import com.sun.org.apache.bcel.internal.generic.Select;

import javax.naming.PartialResultException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

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
