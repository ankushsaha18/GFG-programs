package BinarySearch;

public class FindNthRoot {
    public static void main(String[] args) {
        int n = 4;
        int m = 81;
        System.out.println(NthRoot(n,m));
    }
    public static int NthRoot(int n, int m) {
        int left  = 0 , right = m;
        while (left <= right){
            int mid = left + (right - left)/2;
            int range = (int)Math.pow(mid,n);
            if(range == m){
                return mid;
            }
            else if(range > m){ // this means we have exceeded the value
                right = mid - 1;
            }else{               // this means we are less than the value
                left = mid + 1;
            }
        }
        return -1;
    }
}
