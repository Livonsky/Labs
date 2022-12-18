package Lab_5;

public class Task_4 {
    public static void main(String[] args){
        String text = "бяка Бяка бука Бабяка";
        String target = "бяка";
        System.out.println(count(text, target));
    }

    public static int count(String str, String target) {
        return (str.length() - str.replace(target, "").length()) / target.length();
    }
}
