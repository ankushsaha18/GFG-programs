package GoodQuestions;

public class SumOfDivisors {
    public static void main(String[] args) {
        System.out.println(sumOfDivFrom1(4));
    }
    public static long sumOfDivFrom1(int N){
        long ans = 0;
        for (int i = 1 ; i <= N ; ++i){
            ans += (long) (N / i) *i;
        }
        return ans;
    }
}
