package Graph;
import java.util.ArrayList;
import java.util.List;

public class DFS {
    public ArrayList<Integer> dfsOfGraph(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> ans = new ArrayList<>();
        int[] visited = new int[adj.size()];
        function(ans,0,adj,visited);
        return ans;
    }
    public void function(List<Integer> ans, int i, ArrayList<ArrayList<Integer>> adj, int[] visited){
        visited[i] = 1;
        ans.add(i);
        for(int j : adj.get(i)){
            if(visited[j] != 1){
                function(ans,j,adj,visited);
            }
        }
    }
}
