package com.codeforc.algorithm.basic.sort;

/**
 * Author: Ifan·Huang
 * Description: 冒泡排序，遍历样本数据，两两对比，如果下标小的元素比小标大的元素大，则交换位置。
 **/
public class BubbleSort extends AbstractSort {

    /**
     * 遍历样本数组，两两对比，将大的数组
     * @param nums arr
     */
    @Override
    public void sort(int[] nums) {
        if(nums == null || nums.length < 2) return;
        for(int i = nums.length - 1; i >= 0; i--) {
            for(int j = 0; j < nums.length - 1; j++) {
                if(nums[j] > nums[j + 1]) swap(nums, j, j+1);
            }
        }
    }

    public static void main(String[] args) {
        ArrayCheckWare.checkArraySort(new BubbleSort());
    }

}
