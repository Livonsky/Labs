package Lab_6.Task_1;

public abstract class Human {
    String Name;
    String Surname;

    public String getName() {
        return Name;
    }

    public String getSurname() {
        return Surname;
    }

    public abstract void print();

    public Human(String name, String surname) {
        Name = name;
        Surname = surname;
    }

}
