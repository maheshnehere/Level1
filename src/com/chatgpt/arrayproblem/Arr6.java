package com.chatgpt.arrayproblem;

import java.util.Scanner;

public class Arr6 {
    public static void main(String[] args) {
        int sum0=0;
       int  sum1 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in array");
       int num = sc.nextInt();

       int [] Arr = new int[num];
        System.out.println("Enter the elements of array");

        for (int i = 0;i<num;i++)
        {
            Arr[i] = sc.nextInt();
        }
        for (int i = 0;i<num;i++)
        {
            if (Arr[i] % 2 == 0)
            {
                sum0 = sum0 +Arr[i];
            }
            else {
                sum1 = sum1 + Arr[i];
            }
        }
        System.out.println("The sum of even number"+sum0);
        System.out.println("The sum of odd number"+sum1);

    }
}
