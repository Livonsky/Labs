package Lab_4.Part_2;

public class Task_5 {
    public static void main(String[] args) {
        int [] nums = {59, 69, 77, 16, 14, 31, 66, 81, 13, 70, 62, 32, 10, 3, 30, 94, 83, 50, 18, 78, 2, 88, 90, 63, 85, 41, 34, 72, 65, 80, 58, 45, 22, 76, 6, 87, 61, 82,
                97, 44, 91, 4, 68, 37, 75, 99, 43, 48, 71, 92, 35, 36, 46, 29, 9, 33, 47, 54, 42, 73, 53, 89, 15, 5, 86, 60, 95, 24, 55, 84, 19, 56, 11, 21, 20, 38, 12,
                74, 96, 27, 39, 40, 79, 93, 52, 98, 67, 8, 28, 1, 7, 17, 49, 57, 25, 64, 26, 23, 100};
        mergeSort(nums);

        for(int i = 0; i < nums.length; i++)
            System.out.print(nums[i] + " ");
    }

    private static void mergeSort(int[] arr) {
        int n = arr.length;
        if (n == 1) return;
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++)
            l[i] = arr[i];
        for (int i = mid; i < n; i++)
            r[i - mid] = arr[i];

        mergeSort(l);
        mergeSort(r);
        merge(arr, l, r);
    }

    private static void merge(int[] arr, int[] l, int[] r) {
        int left = l.length;
        int right = r.length;
        int i = 0;
        int j = 0;
        int idx = 0;

        while (i < left && j < right) {
            if (l[i] < r[j]) {
                arr[idx] = l[i];
                i++;
                idx++;
            } else {
                arr[idx] = r[j];
                j++;
                idx++;
            }

        }

        for (int ll = i; ll < left; ll++)
            arr[idx++] = l[ll];

        for (int rr = j; rr < right; rr++)
            arr[idx++] = r[rr];
    }
}
