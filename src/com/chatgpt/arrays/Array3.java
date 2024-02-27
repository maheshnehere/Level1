package com.chatgpt.arrays;

public class Array3 {
    int[] values;


    public void printValues() {
        for (int n : values) {
            System.out.println(n + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Array3 object = new Array3();
        object.values = new int[]{1, 2, 3, 4, 56};
        object.printValues();
    }
}
