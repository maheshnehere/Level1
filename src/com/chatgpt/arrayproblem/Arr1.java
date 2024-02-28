package com.chatgpt.arrayproblem;

public class Arr1 {
    //Java Program to Find the Number of Elements in an Array

    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 4, 5, 6, 7, 5};

        for (int i = 0; i < num.length; i++) {
            System.out.println(i); //total iteration
        }
        System.out.println("The total number of elements in Arr"+num.length); //direct length output
    }
}
