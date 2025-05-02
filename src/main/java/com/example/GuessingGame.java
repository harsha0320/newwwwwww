package com.example;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        int guess = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100:");

        while (guess != numberToGuess) {
            guess = scanner.nextInt();

            if (guess < numberToGuess) {
                System.out.println("Too low, try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Too high, try again.");
            } else {
                System.out.println("Congratulations! You guessed it.");
            }
        }

        scanner.close();
    }
}
