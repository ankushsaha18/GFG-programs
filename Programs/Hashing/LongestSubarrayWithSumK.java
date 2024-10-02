package Hashing;

import java.util.HashMap;

public class LongestSubarrayWithSumK {
    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 7, 1, 9};
        System.out.println(lenOfLongSubarr(nums,nums.length,15));
    }
    public static int lenOfLongSubarr(int A[], int N, int K) {
        int length = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        for(int i = 0 ; i < N ; i++){
            sum += A[i];
            if(sum == K){
                // This means subarray starts from 0
                length = Math.max(i+1,length);
            }
            int rem = sum-K;
            // if that sum is in hashmap that means we already got that with index
            // calculate the length
            if(map.containsKey(rem)){
                int l = i-map.get(rem);
                length = Math.max(length,l);
            }
            // put current sum with index to know upto what index the sum is
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return length;
    }
}
