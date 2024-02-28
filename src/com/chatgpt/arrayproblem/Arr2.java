package com.chatgpt.arrayproblem;

public class Arr2 {
    //Largest Element in Array in Java

    public static void main(String[] args) {

        int[] num1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
int max = num1[0];
        for (int i = 0; i < num1.length; i++) {
            if (num1[i]>max)
        {
            max = num1[i];
        }
            System.out.println();
        }
        System.out.println("The biggest element is :"+max);
    }
}