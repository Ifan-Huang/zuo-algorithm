package com.codeforc.algorithm.basic;

/**
 * Author: Ifan·Huang
 * Description: TODO
 **/
public class XOR {

    public static void main(String[] args) {
//        00000100; // 4
//        00001100; // 12
//        00001000; // 8
//        00000100  // 4
//        00001100  // 12
        int a = 4;
        int b = 12;
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println(a);
        System.out.println(b);
    }
}
