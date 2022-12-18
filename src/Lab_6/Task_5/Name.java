package Lab_6.Task_5;

import java.util.Scanner;

public class Name extends Parrent{

Scanner sc = new Scanner(System.in);
    public String getName() {
        name = sc.nextLine();
        System.out.println(name);
        return name;

    }
}
