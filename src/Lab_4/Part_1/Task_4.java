package Lab_4.Part_1;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int x = sc.nextInt();
        System.out.println("Введите второе число: ");
        int y = sc.nextInt();
        System.out.println("Введите третье число: ");
        int z = sc.nextInt();

        if (x < y && y < z) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
