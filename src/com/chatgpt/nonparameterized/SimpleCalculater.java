package com.chatgpt.nonparameterized;


public class SimpleCalculater {             // static keyword used accesed with class

    public static void addition()
    {
        int num1 =10;
        int num2 = 20;

        int result = num1+num2;
        System.out.println("Sum of 2 numbers is: "+result);
    }

    public static void subtract()
    {
        int num1 = 20;
        int num2 = 10;

        int result = num1-num2;
        System.out.println("The product of 2 number is :"+result);
    }

    public static void multiply()
    {
        int num1 = 10;
        int num2 = 2;

        int result = num1*num2;
        System.out.println("The result of 2 number is:"+result);
    }

    public static void Divison()
    {
        int num1 = 44;
        int num2 = 2;

        int result = num1 / num2;
        System.out.println("The result is :"+result);
    }




    public static void main(String[] args) {
        SimpleCalculater.addition();  //first this executed
        SimpleCalculater.subtract();
        SimpleCalculater.multiply();
        SimpleCalculater.Divison();

    }
}
