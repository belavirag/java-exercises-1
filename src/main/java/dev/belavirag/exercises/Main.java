package dev.belavirag.exercises;

import java.time.Duration;
import java.time.Year;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ex8();
    }

    private static void ex1() {
        System.out.println("Hello");
        System.out.println("Bela");
    }

    private static void ex2() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter year");
        int year = scan.nextInt();
        if (Year.isLeap(year)) {
            System.out.println("It's a leap year!");
        }
    }

    private static void ex3() {
        System.out.println("45 + 11 = " + (45 + 11));
        System.out.println("12 * 4 = " + 12 * 4);
        System.out.println("24 / 6 = " + 24 / 6);
        System.out.println("55 - 12 = " + (55 - 12));
    }

    private static void ex4() {
        int numberOne = 32;
        int numberTwo = 23;
        int numberThree = 12;

        System.out.println((numberOne + numberTwo + numberThree) / 3d);
    }

    private static void ex5() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please type your name");
        System.out.println("Hello " + scan.nextLine());
    }

    private static void ex6() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter number one");
        int firstNumber = scan.nextInt();

        System.out.println("Please enter number two");
        int secondNumber = scan.nextInt();

        System.out.printf("%d + %d = %d%n", firstNumber, secondNumber, firstNumber + secondNumber);
        System.out.printf("%d - %d = %d%n", firstNumber, secondNumber, firstNumber - secondNumber);
        System.out.printf("%d / %d = %d%n", firstNumber, secondNumber, firstNumber / secondNumber);
        System.out.printf("%d * %d = %d%n", firstNumber, secondNumber, firstNumber * secondNumber);
    }

    private static void ex7() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter seconds");
        int number = scan.nextInt();

        var duration = Duration.ofSeconds(number);
        System.out.printf("%d:%d:%d%n", duration.toHoursPart(), duration.toMinutesPart(), duration.toSecondsPart());
    }

    private static void ex8() {
        Scanner scan = new Scanner(System.in);

        int min = 1;
        int max = 500;
        int number = new Random().nextInt((max - min) + 1) + min;
        int guessCount = 0;

        System.out.println("Guess the random number between 1-500");
        while (true) {
            int guessedNumber = scan.nextInt();
            ++guessCount;

            if (guessedNumber == number) {
                break;
            }

            if (guessedNumber > number) {
                System.out.println("Your guess was too big");
            }

            if (guessedNumber < number) {
                System.out.println("Your guess was too small");
            }
        }
        System.out.println("That's correct, it took " + guessCount + " attempt(s), number was " + number);
    }
}