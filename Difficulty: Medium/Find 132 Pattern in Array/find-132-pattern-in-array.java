import java.util.*;

class Solution {
    public boolean has132Pattern(int[] arr) {
        
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        
        int third = Integer.MIN_VALUE; // represents arr[k]
        
        for(int i = n - 1; i >= 0; i--){
            
            // If current element is less than 'third'
            if(arr[i] < third){
                return true;
            }
            
            // Update 'third' while popping smaller elements
            while(!st.isEmpty() && arr[i] > st.peek()){
                third = st.pop();
            }
            
            // Push current element
            st.push(arr[i]);
        }
        
        return false;
    }
}