package com.chatgpt.arrayproblem;

public class Arr3 {
    public static void main(String[] args) {
        int[]num1 = {1,2,2,3,4,3,5,7,4,5,8,9};

        System.out.println("For even numbers");

        for (int n : num1)
        {
            if (n%2==0)
                System.out.println(n+" ");
        }

        System.out.println("For odd numbers");

        for (int n : num1)
        {
            if (n%2!=0)
            {
                System.out.println(n+" ");
            }
        }
    }
}
