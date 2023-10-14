package ru.otus.homework1;

import java.util.Random;
import java.util.Scanner;

public class ApplicationHomework {
    public static void main(String[] args) {
        System.out.println("1 задание:");
        greetings();

        System.out.println("2 задание:");
        checkSign(3, -3, 6);
        checkSign(3, -3, -6);

        System.out.println("3 задание:");
        selectColor();

        System.out.println("4 задание:");
        compareNumbers();

        System.out.println("5 задание:");
        addOrSubtractAndPrint(6, 5, true);
        addOrSubtractAndPrint(4, 5, true);

        System.out.println("Задание со звездочкой:");
        Scanner scanner = new Scanner(System.in);
        int randomNumberOfMethodFromUser = scanner.nextInt();
        if (randomNumberOfMethodFromUser == 1) {
            greetings();
        }
        // генерация случайных значений аргументов в заданном диапазоне
        if (randomNumberOfMethodFromUser == 2) {
            randomMethodOfCheckSign();
        }
        if (randomNumberOfMethodFromUser == 3) {
            selectColor();
        }
        if (randomNumberOfMethodFromUser == 4) {
            compareNumbers();
        }
        // генерация случайных значений аргументов в заданном диапазоне
        if (randomNumberOfMethodFromUser == 5) {
            randomMethodOfAddOrSubtractAndPrint();
        }

    }

    public static void greetings() {
        System.out.println("Hello\nWord\nfrom\nJava");
    }

    public static void checkSign(int a, int b, int c) {
        int sum = a + b + c;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else
            System.out.println("Сумма отрицательная");

    }

    public static void selectColor() {
        int data = 15;
        if (data <= 10) {
            System.out.println("Красный");
        } else if (data > 10 && data <= 20) {
            System.out.println("Желтый");
        } else
            System.out.println("Зеленый");
    }

    public static void compareNumbers() {
        int a = 5;
        int b = 2;
        if (a >= b) {
            System.out.println("a >= b");
        } else
            System.out.println("a < b");
    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if ((initValue >= delta) == increment) {
            System.out.println(initValue += delta);

        } else
            System.out.println(initValue -= delta);

    }

    //    Методы добавлены для того, чтобы сгенерировать рандомные значения аргументов
    public static void randomMethodOfCheckSign() {

        Random rnd = new Random();
        int max = 100;
        int min = -100;
        int rn1 = rnd.nextInt(10);
        int rn2 = rnd.nextInt(100);
        int rn3 = rnd.nextInt((max - min + 1) + min);

        checkSign(rn1, rn2, rn3);

    }

    public static void randomMethodOfAddOrSubtractAndPrint() {

        Random rnd = new Random();
        int rn1 = rnd.nextInt(10);
        int rn2 = rnd.nextInt(10);
        boolean rn3 = rnd.nextBoolean();

        addOrSubtractAndPrint(rn1, rn2, rn3);

    }
}
