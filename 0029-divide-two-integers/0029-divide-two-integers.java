class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        boolean positive = (dividend < 0) == (divisor < 0);

        long n = Math.abs((long) dividend);
        long d = Math.abs((long) divisor);

        long quotient = 0;

        while (n >= d) {
            long value = d;
            long count = 1;

            while (n >= value + value) {
                value += value;
                count += count;
            }

            n -= value;
            quotient += count;
        }

        if (!positive) {
            quotient = -quotient;
        }

        if (quotient > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }

        if (quotient < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        return (int) quotient;
    }
}