/*
# Happy Number (LC 202)

Pattern:
Slow & Fast Pointer (Cycle Detection)

Template:

int slow = n;
int fast = n;
while (true) {
    slow = getNext(slow);
    fast = getNext(getNext(fast));

    if (slow == fast) {
        break;
    }
}
return slow == 1;
private int getNext(int num) {
    int sum = 0;

    while (num > 0) {
        int digit = num % 10;
        sum += digit * digit;
        num /= 10;
    }

    return sum;
}

Key Idea:
- Convert the number into the sum of the squares of its digits.
- Treat each new sum as the next node in a linked sequence.
- Use slow and fast pointers to detect a cycle.
- If both pointers meet at 1, the number is happy.
- If they meet at any other number, a cycle exists, so the number is not happy.

Complexity:
Time: O(log n)
Space: O(1)
*/

Code:

class Solution {

    // Converts a number into the sum of the squares of its digits
    public int findSquareSum(int n) {
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;      // Get the last digit
            sum += digit * digit;    // Add its square
            n /= 10;                 // Remove the last digit
        }

        return sum;
    }

    public boolean isHappy(int n) {

        // Start both pointers from the given number
        int slow = n;
        int fast = n;

        do {

            // Slow moves one step
            slow = findSquareSum(slow);

            // Fast moves two steps
            fast = findSquareSum(findSquareSum(fast));

            // If they meet, a cycle is found
        } while (slow != fast);

        // Meeting at 1 means the number is happy
        return slow == 1;
    }
}
