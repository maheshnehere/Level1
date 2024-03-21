package com.chatgpt.arrayproblem;

import java.util.Scanner;

public class Height {
    public static void main(String[] args) {
        //Java Program to Accept the Height of a Person & Categorize as Taller, Dwarf & Average

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height");
        int height = sc.nextInt();

        if (height >= 2 && height <=4)
        {
            System.out.println("person is dwarf");
        } else if (height >= 5 && height <=6) {
            System.out.println("person is average");
        }
        else
        {
            System.out.println("person is taller");
        }
    }
}
