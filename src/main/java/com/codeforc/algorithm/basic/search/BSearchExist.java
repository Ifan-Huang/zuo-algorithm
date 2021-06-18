package com.codeforc.algorithm.basic.search;

import com.codeforc.algorithm.basic.sort.InsertionSort;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Ifan·Huang
 * Description: 二分查找法，在一个有序或者可以通过有效逻辑排除掉另外一半样本的情况下进行的二分查找算法。
 * 时间复杂度为O(logn)
 **/
public class BSearchExist {

    /**
     * 返回位置小标，如果没有返回 -1
     * @param nums 数组
     * @return index
     */
    public boolean bs(int[] nums, int targetNum) {
        int left = 0;
        int mid;
        int right = nums.length - 1;
        while(left < right) {
            mid = left + ((right - left) >> 1);
            if(nums[mid] == targetNum) return true;
            else if(nums[mid] > targetNum) right = mid - 1;
            else left = mid + 1;
        }
        return nums[right] == targetNum;
    }

    public static void main(String[] args) {
        BSearchExist bSearchExist = new BSearchExist();
        int[] nums = {3, 1, 2, 5, 6, 9};
        new InsertionSort().sort(nums);

        System.out.println(bSearchExist.bs(nums, 1));
    }
}
