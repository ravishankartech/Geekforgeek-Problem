import java.util.ArrayList;
import java.util.Collections;

class Solution {
    static ArrayList<Integer> factorial(int n) {

        ArrayList<Integer> result = new ArrayList<>();
        result.add(1); // 1! = 1

        for (int i = 2; i <= n; i++) {
            multiply(i, result);
        }

        // Reverse to get correct order
        Collections.reverse(result);
        return result;
    }

    private static void multiply(int num, ArrayList<Integer> result) {
        int carry = 0;

        for (int i = 0; i < result.size(); i++) {
            int product = result.get(i) * num + carry;
            result.set(i, product % 10);
            carry = product / 10;
        }

        while (carry > 0) {
            result.add(carry % 10);
            carry /= 10;
        }
    }
}
