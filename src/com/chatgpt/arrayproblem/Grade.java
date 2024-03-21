package com.chatgpt.arrayproblem;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Grade");
        char grade = sc.next().charAt(0);

        switch (grade)
        {
            case 'A':
            {
                System.out.println("90 percent");
            }
            break;
            case 'B':
            {
                System.out.println("75 percent");
            }
            break;
            case 'C':
            {
                System.out.println("55 percent");
            }
            break;
            default:{
                System.out.println("not a valid grade");
            }
        }

    }
}
