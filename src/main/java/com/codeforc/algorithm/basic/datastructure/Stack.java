package com.codeforc.algorithm.basic.datastructure;

/**
 * Author: Ifan·Huang
 * Description: 栈结构，动态循环栈 poll buffer 数组实现
 **/
public class Stack<T> {

    private int capacity;
    private int size = 0;
    private int pushIndex = 0;
    private int popIndex = 0;
    private Object[] values;

    public Stack() {
        capacity = 10;
        values = new Object[capacity];
    }

    public Stack(int capacity){
        if(capacity < 1) throw new IllegalArgumentException("param capacity illegal");
        values = new Object[capacity];
    }

    public void push(T value) {
        if(size == capacity) throw new IllegalArgumentException("full");
        values[pushIndex] = value;
        pushIndex = next(pushIndex);
        size++;
    }

    public T pop() {
        if(size == 0) throw new IllegalArgumentException("empty");

        T value = (T) values[popIndex];
        values[popIndex] = null;
        popIndex = next(popIndex);
        size--;
        return value;
    }

    private int next(int index) {
        return index < capacity - 1? ++index : 0;
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack();
        stack.push(3);
        stack.push(5);
        stack.push(4);
        stack.push(1);
        stack.push(2);
        stack.push(9);
        stack.push(9);
        stack.push(9);
        stack.push(9);
        stack.push(100);
        Integer pop = stack.pop();
        Integer pop1 = stack.pop();
        Integer pop2 = stack.pop();
        stack.push(321);
        stack.push(322);
        stack.push(323);
        stack.push(323);
        System.out.println(stack);
    }
}