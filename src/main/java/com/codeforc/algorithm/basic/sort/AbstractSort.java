package com.codeforc.algorithm.basic.sort;

/**
 * Author: Ifan·Huang
 * Description: 实现swap
 **/
public abstract class AbstractSort implements Sortable {

    @Override
    public void swap(int[] nums, int i, int j) {
        nums[i] ^= nums[j];
        nums[j] ^= nums[i];
        nums[i] ^= nums[j];
    }

    public void sortConsume(int[] nums) {
        long before = System.currentTimeMillis();
        sort(nums);
        long after = System.currentTimeMillis();
        System.out.println(this.getClass() + "time consume: " + (after - before) + "");
    }

    @Override
    public void print(int[] nums) {
        String p = ",";
        for (int num : nums) System.out.print(num + p);
    }
}
