class Solution {
    public int findNthDigit(int n) {
        int digitLength = 1;       // Number of digits in current group (1-digit, 2-digit, etc.)
        long count = 9;            // Count of numbers in this group
        int start = 1;             // Starting number in this group

        // Step 1: Find the digit length group where n lies
        while (n > digitLength * count) {
            n -= digitLength * count;
            digitLength++;
            count *= 10;
            start *= 10;
        }

        // Step 2: Find the actual number that contains the nth digit
        start += (n - 1) / digitLength;

        // Step 3: Find the digit in the number
        String numberStr = Integer.toString(start);
        return numberStr.charAt((n - 1) % digitLength) - '0';
    }
}
