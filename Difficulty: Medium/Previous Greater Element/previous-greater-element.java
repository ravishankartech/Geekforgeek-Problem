import java.util.*;

class Solution {
    static ArrayList<Integer> preGreaterEle(int[] arr) {
        
        ArrayList<Integer> result = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        
        for(int i = 0; i < arr.length; i++){
            
            // Remove elements <= current
            while(!st.isEmpty() && st.peek() <= arr[i]){
                st.pop();
            }
            
            // If stack empty → no greater element
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