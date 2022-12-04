package Lab_4.Part_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количство элементов массива:");
        int x = sc.nextInt() + 1;
        if (x < 3){
            System.err.println("Количество элементов должно быть больше либо равно 2");
            System. exit(0);
        }
        int i = 1;
        List<Integer> nums = new ArrayList();
        do{
            System.out.println("Введите элемент массива");
            int element = sc.nextInt();
            nums.add(element);
            i++;
        } while (i != x);


        if (nums.contains(1) || nums.contains(3)){
            System.out.println(nums);
            System.out.println("true");
        }
        else {
            System.out.println(nums);
            System.out.println("false");
        }
    }
}
