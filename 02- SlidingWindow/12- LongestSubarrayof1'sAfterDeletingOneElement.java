/*
# Longest Subarray of 1's After Deleting One Element (LC 1493)

Pattern:
Sliding Window

Window Type:
Variable Size Window

Template:

low = 0
zeros = 0
for(high = 0; high < n; high++) {

    if(nums[high] == 0)
        zeros++;

    while(zeros > 1) {
        if(nums[low] == 0)
            zeros--;
        low++;
    }
    // Delete one element from the current window
    answer = max(answer, high - low);
}

Key Idea:
Expand the window until it contains more than one zero.
If it becomes invalid (more than one zero),
shrink it until there is at most one zero.

Unlike LC 487 (Max Consecutive Ones II),
we MUST delete exactly one element.

Therefore:
Current valid length = Window Size - 1
= (high - low + 1) - 1
= high - low

This automatically handles:
• One zero inside the window → delete that zero.
• No zero inside the window → delete one 1.

Complexity:
Time: O(n)
Space: O(1)
*/

Code:

class Solution {
    public int longestSubarray(int[] nums) {

        int low = 0;          // Left pointer of the sliding window
        int zerocount = 0;    // Number of zeros in the current window
        int maxlen = 0;       // Stores the maximum valid length

        // Expand the window using the high pointer
        for (int high = 0; high < nums.length; high++) {

            // Include the current element in the window
            if (nums[high] == 0) {
                zerocount++;
            }

            // Window becomes invalid if it contains more than one zero
            // Shrink it until it becomes valid again
            while (zerocount > 1) {
                if (nums[low] == 0) {
                    zerocount--;
                }
                low++;
            }

            // Current valid window size
            int windowSize = high - low + 1;

            // We must delete exactly one element,
            // so answer = window size - 1
            maxlen = Math.max(maxlen, windowSize - 1);
        }

        return maxlen;
    }
}
