package ru.geekbrains.lesson01;

public class FirstClass {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
        System.out.println(" ");}

    public static void checkSumSign() {
        int a = 2;
        int b = -2;
        if ((a + b) >= 0) {
            System.out.println("Положительное");}
        else {
            System.out.println("Отрицательное"); }
        System.out.println(" ");}

    public static void printColor() {
        int value = 101;
               if (value <= 0) {
            System.out.println("Красный");}
        else if (value <= 100) {
            System.out.println("Жёлтый");}
            else {
            System.out.println("Зелёный");}
        }

    public static void  compareNumbers() {
        int a = 3;
        int b = 2;
        if (a >= b) {
            System.out.println("a >= b");}
        else {
            System.out.println("a < b");}
    }
    }



