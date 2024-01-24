public class CountRotationArray {
    public static void main(String[] args) {
        int arr[] = { 7, 0, 2, 3, 4, 5 };
        System.out.println(countRotation(arr));
    }

    public static int countRotation(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return i + 1;
            }
        }
        return 0;
    }
}
