import java.util.*;

class Solution {
    public int maxPeople(int[] arr) {
        
        int n = arr.length;
        
        int[] left = new int[n];
        int[] right = new int[n];
        
        Stack<Integer> st = new Stack<>();
        
        // Left side
        for(int i = 0; i < n; i++){
            int count = 0;
            
            while(!st.isEmpty() && arr[st.peek()] < arr[i]){
                count += left[st.peek()] + 1;
                st.pop();
            }
            
            left[i] = count;
            st.push(i);
        }
        
        // Clear stack
        st.clear();
        
        // Right side
        for(int i = n - 1; i >= 0; i--){
            int count = 0;
            
            while(!st.isEmpty() && arr[st.peek()] < arr[i]){
                count += right[st.peek()] + 1;
                st.pop();
            }
            
            right[i] = count;
            st.push(i);
        }
        
        int max = 0;
        
        for(int i = 0; i < n; i++){
            max = Math.max(max, left[i] + right[i] + 1);
        }
        
        return max;
    }
}