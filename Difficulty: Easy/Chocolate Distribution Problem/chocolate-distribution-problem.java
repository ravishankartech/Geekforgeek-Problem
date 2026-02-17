import java.util.*;

class Solution {
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        
        int n = arr.size();
        
        // Edge cases
        if (m == 0 || n == 0) return 0;
        if (n < m) return -1;
        
        // Step 1: Sort the ArrayList
        Collections.sort(arr);
        
        int minDiff = Integer.MAX_VALUE;
        
        // Step 2: Sliding window of size m
        for (int i = 0; i <= n - m; i++) {
            int diff = arr.get(i + m - 1) - arr.get(i);
            minDiff = Math.min(minDiff, diff);
        }
        
        return minDiff;
    }
}
