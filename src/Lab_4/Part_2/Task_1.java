package Lab_4.Part_2;

public class Task_1 {
    public static void main(String[] args) {
        int nums[] = {50, 20, 15, 40};
        int nums2[] = {10, 20, 30, 40};
        System.out.println(isSorted(nums));
        System.out.println(isSorted(nums2));
    }

    static String isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1])
                return "Please, try again";
            else {
                return "OK";
            }
        }
        return null;
    }
}