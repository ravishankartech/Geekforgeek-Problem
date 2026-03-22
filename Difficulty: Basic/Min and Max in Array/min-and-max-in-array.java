import java.util.*;

class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {

        int n = arr.length;
        int max = arr[0];
        int min = arr[0];

        for(int i = 0; i < n; i++) {

            if(arr[i] > max) {
                max = arr[i];
            }

            if(arr[i] < min) {
                min = arr[i];
            }
        }

        
         ArrayList<Integer> result = new ArrayList<>();
         result .add(min);
         result.add(max);

        return result;
    }
}

