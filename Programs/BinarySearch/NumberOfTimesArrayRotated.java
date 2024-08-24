package BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberOfTimesArrayRotated {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(4,5,6,0,1,2,3));
        System.out.println(findKRotation(nums));
    }
    public static int findKRotation(List<Integer> arr) {
        int ans = 0;
        int min = Integer.MAX_VALUE;
        int left = 0 , right = arr.size()-1;
        while (left <= right){
            int mid = left + (right - left)/2;
            if(arr.get(left) <= arr.get(mid)){
                if(arr.get(left) < min){
                    min = arr.get(left);
                    ans = left;
                }
                left = mid + 1;
            }else{
                if(arr.get(mid) < min){
                    min = arr.get(mid);
                    ans = mid;
                }
                right = mid - 1;
            }
        }
        return ans;
    }
}
