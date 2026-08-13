class Solution {
    public int sumSubstrings(String s) {

        int sum = 0;
        int current = 0;

        for (int i = 0; i < s.length(); i++) {

            int digit = s.charAt(i) - '0';

            current = current * 10 + digit * (i + 1);

            sum = sum + current;
        }

        return sum;
    }
}