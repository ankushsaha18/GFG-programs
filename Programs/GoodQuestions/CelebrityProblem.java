package GoodQuestions;

import java.util.Stack;

public class CelebrityProblem {
    public static void main(String[] args) {
        int[][] M = {{0,0,0}, {0,0,0}, {0,0,0}};
        System.out.println(celebrity(M,3));
    }
    public static int celebrity(int M[][], int n) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0 ; i < n ; i++){
            st.push(i);
        }
        while (st.size() > 1){
            int v1 = st.pop();
            int v2 = st.pop();
            if(M[v1][v2] == 0){
                st.push(v1);
            } else if (M[v2][v1] == 0) {
                st.push(v2);
            }
        }
        if(st.isEmpty()){ return -1; }
        int a = st.pop();
        for(int i = 0 ; i < n ; i++){
            if(M[a][i] == 1){
                return -1;
            }
        }
        for(int j = 0 ; j < n ; j++){
            if(j!=a && M[j][a] == 0){
                return -1;
            }
        }
        return a;
    }
}
