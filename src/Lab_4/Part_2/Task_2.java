package Lab_4.Part_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количство элементов массива:");
        int x = sc.nextInt() + 1;
        int i = 1;
        List<Integer> nums = new ArrayList();
        System.out.println("Введите элемент массива");
        do {
            int element = sc.nextInt();
            nums.add(element);
            i++;
        } while (i != x);
        System.out.println(nums);

    }
}
