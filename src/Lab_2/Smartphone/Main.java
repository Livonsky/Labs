package Lab_2.Smartphone;

public class Main {
    public static void main(String[] args) {
        Smartphone Sumsung = new Smartphone("Sumsung", "S22 +", 4500, Color.GREEN, 65000);
        System.out.println(Sumsung);

        Smartphone Iphone = new Smartphone();

        Iphone.setBrand("Iphone");
        Iphone.setColor(Color.WHITE);
        Iphone.setBatt_cap(3800);
        Iphone.setModel("XR");
        Iphone.setPrice(100000);

        System.out.println(Iphone);
    }
}

