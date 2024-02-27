package com.chatgpt.arrays;

public class Array6 {

    int [] num;

    public void initializeNum(int[] number)
    {
        num = number;
    }

    public void printNumbers()
    {
        for (int n : num)
        {
            System.out.println(n+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Array6 obj6 = new Array6();
        int[]number ={1,2,3,4,5};
        obj6.initializeNum(number);

        obj6.printNumbers();

    }
}
