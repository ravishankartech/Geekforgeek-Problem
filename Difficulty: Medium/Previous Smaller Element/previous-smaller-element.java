import java.util.*;

class Solution {
    public static ArrayList<Integer> prevSmaller(int[] arr) {
        
        ArrayList<Integer> result = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        
        for(int i = 0; i < arr.length; i++){
            
            // Remove all elements >= current
            while(!st.isEmpty() && st.peek() >= arr[i]){
                st.pop();
            }
            
            // If stack empty → no smaller element
            if(st.isEmpty()){
                result.add(-1);
            } else {
                result.add(st.peek());
            }
            
            // Push current element
            st.push(arr[i]);
        }
        
        return result;
    }
}