package com.chatgpt.nonparameterized;

public class SimpleCalculater1 { //creating object and calling methods
    public void addition() {
        int num1 = 10;
        int num2 = 20;

        int result = num1 + num2;
        System.out.println("Sum of 2 numbers is: " + result);
    }

    public void subtract() {
        int num1 = 20;
        int num2 = 10;

        int result = num1 - num2;
        System.out.println("The product of 2 number is :" + result);
    }

    public void multiply() {
        int num1 = 10;
        int num2 = 2;

        int result = num1 * num2;
        System.out.println("The result of 2 number is:" + result);
    }

    public void Divison() {
        int num1 = 44;
        int num2 = 2;

        int result = num1 / num2;
        System.out.println("The result is :" + result);
    }

    public static void main(String[] args) {
        SimpleCalculater1 obj = new SimpleCalculater1();
        obj.addition();
        obj.subtract();
        obj.multiply();
        obj.Divison();

        System.out.println("--------------------------------------------------------------------");

        SimpleCalculater1 obj1 = new SimpleCalculater1();
        obj1.addition();
        obj.subtract();
        obj.multiply();
        obj.Divison();

    }
}
