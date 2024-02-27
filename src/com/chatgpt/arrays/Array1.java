package com.chatgpt.arrays;

public class Array1 {

    int[] num = {1, 2, 3, 4, 5};

    String[] cars = {"abc", "ddf", "dde"};
//    int [] num1;

    int[] num1 = new int[4];

    public static void main(String[] args) {
        Array1 obj = new Array1();
        Array1 obj2 = new Array1();
        for (int n : obj.num) {
            System.out.println(n + " ");
        }
        System.out.println();
        System.out.println(obj2.cars[0]);

        for (String n : obj2.cars) {
            System.out.println(n + " ");
        }
        System.out.println();


    }
}
