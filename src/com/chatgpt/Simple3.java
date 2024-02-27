package com.chatgpt;

public class Simple3 {

    int num1, num2;

    public Simple3(int num1, int num2) {
        this.num1= num1;
        this.num2 = num2;
    }

    public void add(int num1,int num2)
    {
        int sum = num1+num2;
        System.out.println("Sum of 2 number is :"+sum);
    }

    public  void minus(int num1,int num2)
    {
        int sum = num1-num2;
        System.out.println("Result is: "+sum);
    }

    public static void main(String[] args) {
        Simple3 obj = new Simple3(22,44);
        obj.add(11,22);
        obj.minus(11,11);
    }

}
