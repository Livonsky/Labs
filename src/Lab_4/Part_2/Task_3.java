package Lab_4.Part_2;

import java.util.Arrays;

public class Task_3 {
    public static void main(String[] args){
        int nums1[] = {10, 13, 14, 51, 22};
        int nums2[] = {56, 76, 45, 23, 11};
        System.out.println(changeNums(nums1));
        System.out.println(changeNums(nums2));

    }

    static String changeNums (int [] array){
        int x = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = x;
        return Arrays.toString(array);
    }


}
