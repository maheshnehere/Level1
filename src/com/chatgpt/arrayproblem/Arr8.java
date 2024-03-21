package com.chatgpt.arrayproblem;

import java.util.Scanner;

public class Arr8 {
    public static void main(String[] args) {
        //Java Program to Find the Largest Number Among Three Numbers
        int x, y, z;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number:");
        x = s.nextInt();
        System.out.print("Enter the second number:");
        y = s.nextInt();
        System.out.print("Enter the third number:");
        z = s.nextInt();

        if (x>y && x>z)
        {
            System.out.println(x+"greatest of all three number");
        } else if (y>z)
        {
            System.out.println(y+"greatest of all three number");
        }
        else {
            System.out.println(z+"greatest of all three number");
        }
    }
}
