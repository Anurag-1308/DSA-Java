/*
# Max Consecutive Ones III
Pattern:
Sliding Window

Window Type:
Variable Size Window

Template:

low = 0
zeros = 0
for(high = 0; high < n; high++){
    if(nums[high] == 0)
        zeros++;

    while(zeros > k){
        if(nums[low] == 0)
            zeros--;
        low++;
    }
    answer = max(answer, high - low + 1);
}

Key Idea:
Expand the window while counting zeros.
If the number of zeros exceeds k,
shrink the window until it contains
at most k zeros.
The longest valid window is the answer.

Complexity:
Time: O(n)
Space: O(1)
*/

Code:

class Solution {
    public int longestOnes(int[] nums, int k) {

        int low = 0;       // start of window
        int zeroCount = 0; // zeros in current window
        int maxLen = 0;    // best answer so far

        for (int high = 0; high < nums.length; high++) {

            // include current element
            if (nums[high] == 0) {
                zeroCount++;
            }

            // too many zeros? move left until valid
            while (zeroCount > k) {
                if (nums[low] == 0) {
                    zeroCount--;
                }
                low++;
            }

            // current window is valid
            maxLen = Math.max(maxLen, high - low + 1);
        }

        return maxLen;
    }
}
