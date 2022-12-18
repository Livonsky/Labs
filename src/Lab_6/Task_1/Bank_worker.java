package Lab_6.Task_1;

public class Bank_worker extends Human {
    String Bank_name;

    public Bank_worker(String name, String surname) {
        super(name, surname);
    }

    @Override
    public void print() {
        System.out.println(Name + " " + Surname + " " + Bank_name);
        }

    public Bank_worker(String name, String surname, String bank_name) {
        super(name, surname);
        Bank_name = bank_name;
    }
}
