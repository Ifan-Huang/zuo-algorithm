package com.codeforc.algorithm.basic.sort;

/**
 * Author: Ifan·Huang
 * Description: 插入排序，类似于扑克牌，将样本中的数据，对比，每次都是对比之前的数据，如果比当前的数据大的数据，则左移一位
 * 再与之前的数据进行比较直到排到了合适位置为止 时间复杂度，O(n^2)当样本顺序已经排好的时候，可以达到O(n)的复杂度。
 **/
public class InsertionSort extends AbstractSort {

    @Override
    public void sort(int[] nums) {
        for(int i = 0; i < nums.length;i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[j] < nums[i]) swap(nums, i, j);
            }
        }
    }

    public static void main(String[] args) {
        ArrayCheckWare.checkArraySort(new InsertionSort());
    }

}