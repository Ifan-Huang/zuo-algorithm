package com.codeforc.algorithm.basic.sort;

/**
 * 选择排序 O(n^2)
 * 遍历数据，找到最小的数，从而和下标最小的元素交换位置。然后每次下标递增1，重复上诉过程。完成排序工作。
 */
public class SelectionSort extends AbstractSort {

    @Override
    public void sort(int[] nums) {
        if(nums == null || nums.length < 2) return;

        for(int i = 0; i < nums.length; i++) {
            int minIndex = i;
            for(int j = i+1; j < nums.length; j++) {
                minIndex = nums[j] < nums[minIndex] ? j : minIndex;
            }
            swap(nums, i, minIndex);
        }
        System.out.println(nums);
    }

}
