package Lab_6.Task_5;

import java.util.Scanner;

public abstract class Parrent {
    public static Lab_6.Task_5.Name Name;
    static String name;
    static Scanner sc = new Scanner(System.in);
    static int old;

    public static int getOld() {
        old = sc.nextInt();
        System.out.println(old);
        return old;
    }

    public abstract String getName();



}
