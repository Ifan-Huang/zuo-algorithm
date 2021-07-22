package com.codeforc.algorithm.basic.datastructure;

import java.util.PriorityQueue;

/**
 * Author: Ifan·Huang
 * Description: Heap
 **/
public class Heap {

    private int[] heap;

    private int heapSize;

    private final int limit;

    public Heap(int limit) {
        this.limit = limit;
        heap = new int[limit];
        heapSize = 0;
    }

    public boolean isEmpty() {
        return heapSize == 0;
    }

    public boolean isFull() {
        return heapSize == limit;
    }

    public void push(int value) {
        if(heapSize == limit) throw new RuntimeException("heap is full");
        heap[heapSize] = value;
        heapInsert(heap, heapSize++);
    }

    public void pop() {
        int ans = heap[0];
        swap(heap, 0, --heapSize);

    }

    public void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }


    private void heapInsert(int index) {
        while (heap[index] > heap[(index - 1) >> 1] ) {
            swap(index, (index - 1));
            index = (index - 1) >> 1;
        }
    }

    /**
     * 从index位置，不断往下看，不断下沉
     * 停：当前节点的子节点都不比本身大或者已经是叶子节点
     * @param index 下标
     */
    private void heapify(int index) {
        int left = index << 1 + 1;
        while(left < heapSize) {
            int largest = left + 1 < heapSize && heap[left + 1] > heap[left] ? left
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        heap.add(5);
        heap.add(7);
        heap.add(0);
        heap.add(2);
        heap.add(6);

        while(!heap.isEmpty())
            System.out.println(heap.poll());
    }
}
