package com.chatgpt.arrayproblem;

import java.util.Scanner;

public class CaseIdentifier {
    public static void main(String[] args) {
        //Java Program to Check Whether a Given Alphabets are Uppercase or Lowercase or Digits

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the alphabet");
        char m = sc.next().charAt(0);

        if(m >= 97 && m <= 123)
        {
            System.out.println("Lower Case");
        }
        else if(m >= 65 && m <= 96)
        {
            System.out.println("Upper Case");
        }
        else if(m >= 48 && m <= 57)
        {
            System.out.println("Digit");
        }
    }
}
