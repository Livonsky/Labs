package Lab_2;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(add(1, 4));
        System.out.println(mult(1.4, 4.6));
        System.out.println(div(1., 4.));
        System.out.println(sub(1, 4));
    }
    static int add(int number1, int number2) {
        int result = number1 + number2;
        return result;
    }

    static double add(double number1, double number2) {
        double result = number1 + number2;
        return result;
    }

    static long add(long number1, long number2) {
        long result = number1 + number2;
        return result;
    }

// add -- Сложение

    static int sub(int number1, int number2) {
        int result = number1 - number2;
        return result;
    }

    static double sub(double number1, double number2) {
        double result = number1 - number2;
        return result;
    }

    static long sub(long number1, long number2) {
        long result = number1 - number2;
        return result;
    }

    //sub -- Вычитание

    static int mult(int number1, int number2) {
        int result = number1 * number2;
        return result;
    }

    static double mult(double number1, double number2) {
        double result = number1 * number2;
        return result;
    }

    static long mult(long number1, long number2) {
        long result = number1 * number2;
        return result;
    }

    //mult -- Умножение

    static int div(int number1, int number2) {
        int result = number1 / number2;
        return result;
    }

    static double div(double number1, double number2) {
        double result = number1 / number2;
        return result;
    }

    static long div(long number1, long number2) {
        long result = number1 / number2;
        return result;
    }

    //div -- Деление
}
