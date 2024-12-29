class Solution {
    public int reverse(int x) {
        int y = 0;
        int digit;

        while (x != 0) {
            digit = x % 10;
            if (y > Integer.MAX_VALUE / 10 || (y == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0; // Overflow for positive numbers
            }
            if (y < Integer.MIN_VALUE / 10 || (y == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0; // Overflow for negative numbers
            }
            y = y * 10 + digit;
            x /= 10;
        }

        return y;
    }
}