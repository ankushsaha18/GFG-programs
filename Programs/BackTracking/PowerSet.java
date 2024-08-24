package BackTracking;
import java.util.ArrayList;
import java.util.Arrays;

public class PowerSet {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3));
        System.out.println(subsets(nums));
    }
    public static ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> a) {
        // code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        backtracking(ans,temp,a,0);
        // For this case we have to sort the list
        // This is tough in Java, so we have done it using C++
        // The answer is perfect just not sorted
        return ans;
    }
    public static void backtracking(ArrayList<ArrayList<Integer>> ans,ArrayList<Integer> temp,ArrayList<Integer> nums,int index){
        if(index == nums.size()){
            // add new arraylist as adding directly will cause change in all elements and all will be similar
            ans.add(new ArrayList<>(temp));
            return;
        }
        backtracking(ans,temp,nums,index+1); // skip the current index and move to next
        temp.add(nums.get(index)); // add the value of current index and move to next
        backtracking(ans,temp,nums,index+1);
        temp.remove(temp.size() - 1);  // remove the last added value to clear the temp list
    }
}
