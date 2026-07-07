/*
# Container With Most Water

Pattern:
Two Pointers

Approaches:
1. Brute Force – O(n²)
2. Two Pointers – O(n)

Key Idea:
Start from both ends.
Move the pointer having smaller height.

Learning:
- Area optimization.
- Greedy movement of pointers.
- Width vs Height tradeoff.

Complexity:
Time: O(n)
Space: O(1)
*/

Code:
class Solution {
    public int maxArea(int[] height) {

        int maxwater = 0;
        int lp = 0;
        int rp = height.length - 1;

        while (lp < rp) {

            int w = rp - lp;
            int ht = Math.min(height[lp], height[rp]);

            int currwater = w * ht;

            maxwater = Math.max(maxwater, currwater);

            if (height[lp] < height[rp]) {
                lp++;
            } else {
                rp--;
            }
        }

        return maxwater;
    }
}
