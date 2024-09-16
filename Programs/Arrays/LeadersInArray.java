package Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 3, 1, 2};
        System.out.println(leaders(nums.length,nums));
    }
    public static ArrayList<Integer> leaders(int n, int[] arr) {
        ArrayList<Integer> lst = new ArrayList<>();
        lst.add(arr[n-1]);
        int max = arr[n-1];
        for(int i = n-2 ; i >= 0 ; i--){
            if(arr[i] >= max){
                lst.add(arr[i]);
                max = arr[i];
            }
        }
        Collections.sort(lst, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        return lst;
    }
}
