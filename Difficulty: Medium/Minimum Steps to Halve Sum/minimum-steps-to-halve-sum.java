import java.util.*;

class Solution {
    public int minOperations(int[] arr) {

        PriorityQueue<Double> pq = new PriorityQueue<>(Collections.reverseOrder());

        double sum = 0;

        // Step 1: Add elements to heap and calculate sum
        for (int x : arr) {
            pq.add((double) x);
            sum += x;
        }

        double target = sum / 2;
        int operations = 0;

        // Step 2: Reduce sum
        while (sum > target) {
            double largest = pq.poll();

            double half = largest / 2;

            sum -= half; // reduction in sum
            pq.add(half);

            operations++;
        }

        return operations;
    }
}
