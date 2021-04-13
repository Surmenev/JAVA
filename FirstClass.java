package Lesson2;

public class FirstClass {
    public static void main(String[] args) {
        summa();
        zero();
        truefalse();
        onemore();
    }

    // 001
    public static void summa() {
        int a = 5;
        int b = 16;
        if (((a + b) >= 10) && ((a + b) <= 20)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        System.out.println(" ");
    }

    // 002
    public static void zero() {
        int a = -1;

        if (a < 0) {
            System.out.println("Отрицательное");
        } else {
            System.out.println("Положительное");
        }
        System.out.println(" ");
    }

    // 003
    public static void truefalse() {
        int a = 1;

        if (a < 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        System.out.println(" ");
    }

    // 004
    public static void onemore() {
        int a = 5;
        String b = "Hello!";

            while (a > 0){
            System.out.println(b);
            a--;
        }
        System.out.println(" ");

    }
}
