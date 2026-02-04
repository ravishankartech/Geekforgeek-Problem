class Solution {
    public void reverseArray(int arr[]) {
         int n = arr.length;
        int[] temp = new int[n];

       
        for (int i = 0; i < n; i++) {
            temp[i] = arr[n - 1 - i];
        }

        
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }
}
        
        

