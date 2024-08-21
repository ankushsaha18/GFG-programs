package GoodQuestions;

public class MinArrayJump {
    public static void main(String[] args) {
        int[] arr = {1, 3, 0, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.println(minJumps(arr,arr.length));
    }
    public static int minJumps(int[] arr, int n) {     // Greedy Algorithm
        if(n == 1){
            return 0;
        }
        int totalJump = 0;
        int coverage = 0;       // To know how much window will it cover for that distance
        int lastIndex = 0;      // Keep track of the last index of the window
        for(int i = 0 ; i < n ; i++){
            coverage = Math.max(coverage,i + arr[i]);   // To check all the elements of that window
            if(i == lastIndex){     // To check if pointer reached end if the window
                lastIndex = coverage;
                totalJump++;
                if(lastIndex >= n-1){
                    return totalJump;
                }
            }
        }
        return -1;
    }
}
