package com.codeforc.algorithm.basic.sort;

/**
 * 该接口确定一个排序基础方法，所有排序实现类都需要实现该接口，重写sort方法
 */
public interface Sortable {

    /**
     * 将传入的nums按照从小到大的顺序排列
     */
    void sort(int[] nums);
}
