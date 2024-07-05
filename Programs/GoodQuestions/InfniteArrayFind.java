package GoodQuestions;

public class InfniteArrayFind {
    // Amazon Question
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 };
        int target = 10;
        System.out.println(positionInInfiniteArray(arr, target));
    }

    public static int positionInInfiniteArray(int arr[], int target) {
        int start = 0;
        int end = 1;
        while (target > arr[end]) {
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarySearch(arr, start, end, target);
    }

    public static int binarySearch(int arr[], int start, int end, int target) {
        while (start < end) {
            int m = (start + end) / 2;
            if (target > arr[m]) {
                start = m + 1;
            } else {
                end = m;
            }
        }
        return start;
    }
}
