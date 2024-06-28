public class MissingNumInArr {
    static int missingNumber(int array[], int n) {
        // Your Code Here
        int sum = n * (n + 1) / 2;
        int temp = 0;
        for (int j : array) {
            temp += j;
        }
        return sum - temp;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5 };
        int n = 5;
        System.out.println(missingNumber(arr, n));
    }
}
