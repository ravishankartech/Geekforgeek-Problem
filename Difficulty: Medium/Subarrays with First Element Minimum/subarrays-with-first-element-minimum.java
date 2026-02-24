import java.util.*;

class Solution {
    public int countSubarrays(int[] arr) {
        
        int n = arr.length;
        int count = 0;
        
        Stack<Integer> st = new Stack<>();
        
        for(int i = n - 1; i >= 0; i--){
            
            // Remove elements >= current
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            
            // If no smaller element on right
            if(st.isEmpty()){
                count += (n - i);
            } else {
                count += (st.peek() - i);
            }
            
            // Push current index
            st.push(i);
        }
        
        return count;
    }
}