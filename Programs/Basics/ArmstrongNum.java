package Basics;

public class ArmstrongNum {
    public static void main(String[] args) {
        System.out.println(armstrongNumber(371));
    }
    public static String armstrongNumber(int n) {
        // code here
        int x = 0;
        int temp = n;
        while(temp > 0){
            x += Math.pow(temp%10,3);
            temp /= 10;
        }
        if(x == n){
            return "true";
        }
        return "false";
    }
}
