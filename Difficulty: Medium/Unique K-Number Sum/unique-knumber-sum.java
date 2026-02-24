import java.util.*;

class Solution {
    
    public ArrayList<ArrayList<Integer>> combinationSum(int n, int k) {
        
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> current = new ArrayList<>();
        
        solve(1, n, k, current, result);
        
        return result;
    }
    
    private void solve(int start, int target, int k, 
                       ArrayList<Integer> current, 
                       ArrayList<ArrayList<Integer>> result) {
        
        // Valid combination
        if(target == 0 && k == 0){
            result.add(new ArrayList<>(current));
            return;
        }
        
        // Invalid case
        if(target < 0 || k < 0){
            return;
        }
        
        // Try numbers from start to 9
        for(int i = start; i <= 9; i++){
            
            current.add(i); // choose
            
            solve(i + 1, target - i, k - 1, current, result);
            
            current.remove(current.size() - 1); // backtrack
        }
    }
}