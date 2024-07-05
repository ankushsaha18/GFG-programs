package Basics;

import java.util.Arrays;

public class Lcm_HCF_logN_TC {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(lcmAndGcd(5L,10L)));
    }
    public static Long[] lcmAndGcd(Long A , Long B) {
        return new Long[]{LCM(A,B),HCF(A,B)};
    }
    public static Long LCM(Long A,Long B) {
        return A*B/(HCF(A,B));
    }
    public static Long HCF(Long A,Long B){
        if(A%B == 0){
            return B;
        }
        return HCF(B,A%B);
    }
}
