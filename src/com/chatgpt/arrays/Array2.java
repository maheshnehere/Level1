package com.chatgpt.arrays;

public class Array2 {
    //array is declared at class level and initilaized in main method

    int[] digits;

    public void printArray() {
        for (int num : digits) {
            System.out.println(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Array2 object = new Array2();
        object.digits = new int[]{1, 2, 3, 4, 5, 6, 7};

        object.printArray();
    }
}
