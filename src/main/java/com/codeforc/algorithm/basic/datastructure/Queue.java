package com.codeforc.algorithm.basic.datastructure;

/**
 * Author: Ifan·Huang
 * Description: 队列
 * ring buffer
 **/
public class Queue<T> {

    private int capacity;

    private int size = 0;

    private int firstindex = 0;

    private int pollindex = 0;

    public Queue() {
        defaultCapacity();
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }

    private Object[] values;

    private void defaultCapacity() {
        this.capacity = 5;
        values = new Object[capacity];
    }

    public Queue(int capacity) {
        if(capacity < 1) throw new IllegalArgumentException("容量不合法");
        this.capacity = capacity;
    }

    public void add(T value) {
        if(size > capacity >> 1) {
            Object[] newValues = new Object[capacity<<1];
            for(int i = 0; i < values.length; i++)
                newValues[i] = values[i];
            values = newValues;
            capacity = capacity<<1;
        }
        values[size++] = value;
    }

    public T pop() {
        if(size == 0) return null;
        T val = (T)values[firstindex];
        values[firstindex++] = null;
        size--;
        return val;
    }


    public static void main(String[] args) {
        Queue<Integer> arrqueue = new Queue<>();
        arrqueue.add(3);
        arrqueue.add(5);
        arrqueue.add(1);
        arrqueue.add(2);
        arrqueue.add(9);
        arrqueue.add(9);
        arrqueue.add(9);
        arrqueue.add(9);
        arrqueue.add(9);

        Integer value = arrqueue.pop();
        System.out.println(value);
    }
}