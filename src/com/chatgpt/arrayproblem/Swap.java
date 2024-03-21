package com.chatgpt.arrayproblem;

public class Swap {
    //Java Program to Swap Two Numbers
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        int temp;
        System.out.println(num1+" num1 before swap");
        System.out.println(num2+" num2 before swap");

        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println(num1+" num1 after swap");
        System.out.println(num2+" num2 after swap");

    }
}
