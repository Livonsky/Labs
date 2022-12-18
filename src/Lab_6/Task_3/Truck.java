package Lab_6.Task_3;

import java.util.Scanner;

public class Truck extends Car {
      int Wheels;
      int maxWeight;

    public Truck(int w, String m, char c, float s, int wheels, int maxWeight) {
        super(w, m, c, s);
        Wheels = wheels;
        this.maxWeight = maxWeight;
    }

      public int newWheels(){
        Scanner sc = new Scanner(System.in);
        Wheels = sc.nextInt();
        System.out.println("Количество колес - " + Wheels);
        return Wheels;
      }


}
