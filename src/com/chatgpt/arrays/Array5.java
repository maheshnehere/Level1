package com.chatgpt.arrays;

public class Array5 {

    private int[] numbers;

    public Array5(int[] numbers) {
        this.numbers = numbers;
    }

    public void printNumbers() {
        for (int n : numbers) {
            System.out.println(n + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        Array5 object1 = new Array5(numbers);
        object1.printNumbers();
    }
}
