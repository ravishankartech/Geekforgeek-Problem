import java.util.Arrays;

class Solution {
    public int getMinDiff(int[] arr, int k) {

        int n = arr.length;
        Arrays.sort(arr);

        
        int diff = arr[n - 1] - arr[0];

        int smallest = arr[0] + k;
        int largest = arr[n - 1] - k;

        for (int i = 1; i < n; i++) {

            
            if (arr[i] - k < 0) continue;

            int minHeight = Math.min(smallest, arr[i] - k);
            int maxHeight = Math.max(largest, arr[i - 1] + k);

            diff = Math.min(diff, maxHeight - minHeight);
        }

        return diff;
    }
}

