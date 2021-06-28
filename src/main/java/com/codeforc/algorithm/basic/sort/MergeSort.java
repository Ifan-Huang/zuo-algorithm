package com.codeforc.algorithm.basic.sort;

/**
 * Author: Ifan·Huang
 * Description: 归并排序，递归思想
 **/
public class MergeSort extends AbstractSort {

    @Override
    public void sort(int[] nums) {
        process(nums, 0, nums.length - 1);
    }

    private void process(int[] nums, int left, int right) {
        if(left == right) return;
        int mid = left + ((right - left)>> 1);
        process(nums, left, mid);
        process(nums, mid + 1, right);
        merge(nums, left, mid, right);
    }

    private void merge(int[] nums, int left, int mid, int right) {
        int[] help = new int[right - left + 1];
        int i = 0;
        int p1 = left;
        int p2 = mid + 1;
        while(p1 <= mid && p2 <= right) {
            help[i++] = nums[p1] <= nums[p2] ? nums[p1++] : nums[p2++];
        }

        //可能p1越界，或者可能p2越界
        while(p1 <= mid) {
            help[i++] = nums[p1++];
        }
        while(p2 <= right) {
            help[i++] = nums[p2++];
        }
        for(i = 0; i < help.length; i++)
            nums[i + left] = help[i];
    }

    public static void main(String[] args) {
        int[] nums = {3,1 ,2 , 5, 1, 2, 0 , -3, 9, 8};
        MergeSort mergeSort = new MergeSort();
        mergeSort.sortConsume(nums);
        mergeSort.print(nums);

        int[] nums1 = {3,1 ,2 , 5, 1, 2, 0 , -3, 9, 8};
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sortConsume(nums1);
    }
}
