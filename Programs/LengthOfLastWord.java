public class LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello"));
    }
    public static int lengthOfLastWord(final String A) {
        int ans = 0;
        boolean flag = false;
        for(int i = 0 ; i < A.length() ; i++){
            if(A.charAt(i) == ' '){
                flag = true;
            }else if(flag) {
                ans = 0;
                flag = false;
                ans++;
            }else{
                ans++;
            }
        }
        return ans;
    }
}
