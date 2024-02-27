package com.chatgpt;

public class SimpleCalculater2 {

    int num1,num2,result;

    public void addition() {
         num1 = 10;
         num2 = 20;

         result = num1 + num2;
        System.out.println("Sum of 2 numbers is: " + result);
    }

    public void subtract() {
         num1 = 20;
         num2 = 10;

         result = num1 - num2;
        System.out.println("The product of 2 number is :" + result);
    }

    public void multiply() {
         num1 = 10;
         num2 = 2;

         result = num1 * num2;
        System.out.println("The result of 2 number is:" + result);
    }

    public void Divison() {
         num1 = 44;
         num2 = 2;

         result = num1 / num2;
        System.out.println("The result is :" + result);
    }

    public static void main(String[] args) {
        SimpleCalculater2 obj3 = new SimpleCalculater2();
        obj3.addition();
        obj3.subtract();
        obj3.multiply();
        obj3.Divison();

        System.out.println("--------------------------------------------------------------------");
    }
}
