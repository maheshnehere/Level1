package com.chatgpt.arrayproblem;

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        //Java Program to Find the Number of Integers Divisible by 5

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int num = sc.nextInt();


            if (num % 5 == 0)
            {
                System.out.println(num+" Is divisible by 5");
            }
            else {
                System.out.println(num+" Not divisble by 5");
            }
        }
    }

