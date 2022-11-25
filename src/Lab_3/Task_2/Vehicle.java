package Lab_3.Task_2;

public class Vehicle {
    String name;
    Integer weight;
    Color color;

    public String outputData() {
        System.out.println(name + " " + weight + " " + color);
        return this.name + weight + color;
    }
    public Vehicle(String name, Integer weight, Color color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", color=" + color +
                '}';
    }

    public Vehicle(Color color) {
        this.color = color;
    }

    public Vehicle(Integer weight, Color color) {
        this.weight = weight;
        this.color = color;
    }

    public Vehicle() {
    }

}

class main{
       public static void main (String[] args) {
        Vehicle vehicle1 = new Vehicle("BWM", 1200, Color.White);
        Vehicle vehicle2 = new Vehicle("Lada", 1000, Color.Black);
        Vehicle vehicle3 = new Vehicle(Color.Black);
        Vehicle vehicle4 = new Vehicle(1200,  Color.White);
        Vehicle vehicle5 = new Vehicle();
        vehicle1.outputData();
        vehicle2.outputData();
        vehicle3.outputData();
        vehicle4.outputData();
        vehicle5.outputData();




        }

}



