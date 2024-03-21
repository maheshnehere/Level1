package com.chatgpt.arrayproblem;

import java.util.Scanner;

public class Vovel {
    public static void main(String[] args) {
        //Java Program to Check Whether a Character is a Vowel, Consonant or Digit
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character or digit");

        char character = sc.next().charAt(0);

        switch (character)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            {
                System.out.println("is a vovel");
            }
            break;
            default:
            {
                System.out.println("Entered character is constant ");
            }

        }
    }
}
