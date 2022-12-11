package Lab_5;

import java.util.Arrays;
import java.util.Comparator;

public class Task_1 {
    public static void main(String[] args) {
        String s = "Значимость этих проблем настолько очевидна, что реализация намеченного плана развития " +
                "требует от нас системного анализа соответствующих условий активизации!";
        String longest = Arrays.stream(s.split(" "))
                .max(Comparator.comparingInt(String::length))
                .orElse(null);
        System.out.println(longest);
            }
}
