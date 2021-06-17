package com.codeforc.algorithm.basic.sort;

/**
 * Author: Ifan·Huang
 * Description: 实现swap
 **/
public abstract class AbstractSort implements Sortable {

    @Override
    public void swap(int[] nums, int i, int j) {
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }

    @Override
    public void print(int[] nums) {
        for (int num : nums) System.out.println(num);
    }
}
