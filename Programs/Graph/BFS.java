package Graph;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public ArrayList<Integer> bfsOfGraph(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        int[] visited = new int[adj.size()];
        visited[0] = 1;
        while (!q.isEmpty()){
            int f = q.poll();
            for(int i : adj.get(f)){
                if(visited[i] != 1){
                    q.add(i);
                    visited[i] = 1;
                }
            }
            ans.add(f);
        }
        return ans;
    }
}
