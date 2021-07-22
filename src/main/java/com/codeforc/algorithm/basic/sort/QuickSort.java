package com.codeforc.algorithm.basic.sort;

/**
 * Author: Ifan·Huang
 * Description:
 **/
public class QuickSort extends AbstractSort {

    @Override
    public void sort(int[] nums) {
        if(nums == null || nums.length < 2) return;
        process(nums, 0, nums.length - 1);
    }

    private void process(int[] nums, int left, int right) {
        if(left >= right) return;
        int[] equalsArray = netherlandsFlag(nums, left, right);
        process(nums, left, equalsArray[0] - 1);
        process(nums, equalsArray[1] + 1, right);
    }

    public int[] netherlandsFlag(int[] nums, int left, int right) {
        if(left > right) return new int[]{-1, -1};
        if(left == right) return new int[]{left, right};
        int less = left - 1;
        int more = right;
        int pointer = left;
        while(pointer < more) {
            if(nums[pointer] == nums[right]) {
                pointer++;
            } else if(nums[pointer] < nums[right]) {
                swap2(nums, pointer++, ++less);
            } else {
                swap2(nums, pointer, --more);
            }
        }
        swap2(nums, more, right);
        return new int[] {less + 1, more};
    }

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        ArrayCheckWare.checkArraySort(quickSort);
        int[] nums = {5, 3, 7, 2, 3, 4, 1, 9, 7, 5, 6};
        quickSort.sort(nums);
        quickSort.print(nums);
    }
}