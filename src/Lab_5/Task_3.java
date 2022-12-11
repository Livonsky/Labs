package Lab_5;

public class Task_3 {
    public static void main(String[] args) {
        String s = "бяка Бяка Бука бабяка";
        s = s.replaceAll("(?i)бяка", "[вырезано цензурой]");
        System.out.println(s);
    }
}
