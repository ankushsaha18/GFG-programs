import java.util.ArrayList;

public class SubArraySum {
    public static void main(String[] args) {
        int arr[] = { 0 };
        System.out.println(subarraySum(arr, 1, 0));
    }

    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        // Your code here
        ArrayList<Integer> ans = new ArrayList<>();
        int l = 0, r = 0;
        boolean cond = true;
        int sum = arr[0];
        if (s == 0) {
            for (int i : arr) {
                if (i == 0) {
                    cond = true;
                    break;
                }
                cond = false;
            }
        }
        while (r < n && cond) {
            if (sum == s) {
                ans.add(l + 1);
                ans.add(r + 1);
                return ans;
            } else if (sum < s) {
                r++;
                if (r < n)
                    sum += arr[r];
            } else {
                sum -= arr[l];
                l++;
            }
        }
        ans.add(-1);
        return ans;
    }
}
