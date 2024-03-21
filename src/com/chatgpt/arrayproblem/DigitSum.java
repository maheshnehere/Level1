package com.chatgpt.arrayproblem;

import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        ///Java Program to Find Sum of Digits of a Number

        int n;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");

        int num = sc.nextInt();

        while (num > 0)
        {
            n = num % 10;
            sum = sum + n;
            num = num / 10;
        }

        System.out.println("Sum of digits "+sum);
    }
}
