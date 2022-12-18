package Lab_4.Part_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task_2 {
    public static void main(String[] args) {
        int i = 1;
        List<Integer> list3 = new ArrayList();
        List<Integer> list5 = new ArrayList();
        List<Integer> list3_5 = new ArrayList();
        while (i < 100) {
            if (i % 3 == 0 && i % 5 == 0) {
                list3_5.add(i);
            } else if (i % 3 == 0 && i % 5 != 0) {
                list3.add(i);
            } else if (i % 3 != 0 && i % 5 == 0) {
                list5.add(i);
            } else {
                i++;
            }
            i++;
        }
        System.out.println("Делится на 3:" + list3);
        System.out.println("Делится на 5:" + list5);
        System.out.println("Делится на 3 и 5:" + list3_5);

    }
}

