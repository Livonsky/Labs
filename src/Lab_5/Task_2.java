package Lab_5;

public class Task_2 {
    public static String reverse(String str) {
        return  new StringBuilder(str).reverse().toString();
    }


    public static void main(String[] args){
        String str = "Hello World!";
        String buffer = reverse(str);
        System.out.println("Is " + str +" polyndrome? --> " + (str == buffer));

    }




}
