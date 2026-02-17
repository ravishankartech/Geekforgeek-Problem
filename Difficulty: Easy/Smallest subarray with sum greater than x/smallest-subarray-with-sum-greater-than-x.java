class Solution {
    public static int smallestSubWithSum(int x, int[] arr) {
        
        int n = arr.length;
        int minLen = Integer.MAX_VALUE;
        
        int start = 0, sum = 0;
        
        for (int end = 0; end < n; end++) {
            
            
            sum += arr[end];
            
            
            while (sum > x) {
                minLen = Math.min(minLen, end - start + 1);
                sum -= arr[start];
                start++;
            }
        }
        
       
        return (minLen == Integer.MAX_VALUE) ? 0 : minLen;
    }
}
