package com.company;

import java.util.Arrays;

public class Main extends Input {

    public static void main(String[] args) {
        input();
    }


    public static void input() {
        System.out.println(Arrays.toString(words));
        checkSquare();
    }

    public static void checkSquare() {
        int square = words.length;
        System.out.println(square);

        if (square == number*number) {
            System.out.println("Proceed");;
        } else {
            System.out.println("Words do not add up to a square!");
        }

    }
}