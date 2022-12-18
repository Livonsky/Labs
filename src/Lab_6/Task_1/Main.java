package Lab_6.Task_1;

public class Main {

    public static void main(String[] args){
        Bank_worker sbol = new Bank_worker("Nick", "Livonsky", "SBOL");
        Client client = new Client("Sasha", "Pant", "SBOL");
        client.print();
        sbol.print();
    }
}
