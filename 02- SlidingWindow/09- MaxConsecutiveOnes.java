/*
# Max Consecutive Ones (LC 485)

Pattern:
Array / Counting / Sliding Window (Implicit)

Window Type:
Variable (conceptual streak tracking)

Template:
maxCount = 0
count = 0
for each element in array:
    if element == 1:
        count++
    else:
        count = 0

    maxCount = max(maxCount, count)

Key Idea:
We are not actually using a window with pointers,
but tracking a continuous streak of 1s.
Whenever we see 0, streak breaks.

Complexity:
Time: O(n)
Space: O(1)
*/

Code:

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int count = 0;      // current streak of consecutive 1s
        int max_count = 0;  // best (maximum) streak found so far

        for (int i = 0; i < nums.length; i++) {

            // if we see 1, increase current streak
            if (nums[i] == 1) {
                count++;
            }
            // if we see 0, reset streak because it breaks continuity
            else {
                count = 0;
            }

            // update max answer after each step
            max_count = Math.max(max_count, count);
        }

        return max_count;
    }
}
