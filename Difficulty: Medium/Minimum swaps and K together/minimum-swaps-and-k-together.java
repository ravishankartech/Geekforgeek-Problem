class Solution {
    public static int minSwap(int[] arr, int k) {
        
        int n = arr.length;
      
        int good = 0;
        for (int num : arr) {
            if (num <= k) good++;
        }
        
       
        int bad = 0;
        for (int i = 0; i < good; i++) {
            if (arr[i] > k) bad++;
        }
        
        int minSwaps = bad;
        
        
        for (int i = 0, j = good; j < n; i++, j++) {
            
           
            if (arr[i] > k) bad--;
            
            
            if (arr[j] > k) bad++;
            
            minSwaps = Math.min(minSwaps, bad);
        }
        
        return minSwaps;
    }
}
