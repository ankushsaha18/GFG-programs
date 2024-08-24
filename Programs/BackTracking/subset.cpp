#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

void backtracking(vector<vector<int>>& ans, vector<int>& temp, vector<int>& nums, int index) {
    if (index == nums.size()) {
        ans.push_back(temp);
        return;
    }
    backtracking(ans, temp, nums, index + 1); // skip the current index and move to next
    temp.push_back(nums[index]); // add the value of current index and move to next
    backtracking(ans, temp, nums, index + 1);
    temp.pop_back(); // remove the last added value to clear the temp list
}

vector<vector<int>> subsets(vector<int>& a) {
    vector<vector<int>> ans;
    vector<int> temp;
    backtracking(ans, temp, a, 0);
    sort(ans.begin(), ans.end());
    return ans;
}

int main() {
    vector<int> a = {1, 2, 3};
    vector<vector<int>> result = subsets(a);
    
    for (const auto& subset : result) {
        cout << "[ ";
        for (int num : subset) {
            cout << num << " ";
        }
        cout << "]" << endl;
    }

    return 0;
}
