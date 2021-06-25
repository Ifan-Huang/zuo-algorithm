package com.codeforc.algorithm.basic.datastructure;

import java.util.LinkedList;

/**
 * Author: Ifan·Huang
 * Description: 链表
 **/
public class Linked<T> {

    private Node head;

    private Integer size;

    public Linked() {
        head = new Node();
        size = 0;
    }

    public Integer size() {
        return size;
    }

    public void add(T value) {
        Node node = head();
        if(null == node.value) {
            node.value = value;
            node.next = new Node();
            size++;
        } else {
            while(hasNext(node)) {
                if(null == node.next.value) {
                    node = node.next;
                    node.value = value;
                    node.next = new Node();
                    size++;
                    return;
                } else {
                    node = node.next;
                }
            }
        }

    }

    public boolean hasNext(Node node) {
        return node.next != null;
    }

    public Node head() {
        return this.head;
    }

    class Node {

        T value;

        Node pre;

        Node next;

        Node() {

        }

        Node(T value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        Linked<Integer> linked = new Linked<>();
        linked.add(3);
        linked.add(4);
        linked.add(1);

        linked.add(8);
        linked.add(9);
        linked.add(15);

        linked.add(1);
        linked.add(6);
        linked.add(4);

        LinkedList<Integer> values = new LinkedList<>();
        values.add(3);
        values.add(2);
        values.add(34);
        values.add(521);
        values.add(123);
        values.add(33213);
        values.add(33213);
        values.add(3888);
        System.out.println(values);
        System.out.println(linked);
    }
}
