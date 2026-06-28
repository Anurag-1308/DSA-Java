/*
# Max Consecutive Ones II
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

    while(zeros > 1){
        if(nums[low] == 0)
            zeros--;
        low++;
    }
    answer = max(answer, high - low + 1);
}

Key Idea:
Expand until the window becomes invalid
(more than one zero).
Shrink until the window becomes valid
(at most one zero).
Update the maximum valid window length.

Complexity:
Time: O(n)
Space: O(1)
*/

Code: 
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int low = 0;
        int zeros = 0;
        int maxLength = 0;

        // Expand the window
        for (int high = 0; high < nums.length; high++) {

            if (nums[high] == 0) {
                zeros++;
            }

            // Shrink until the window has at most one zero
            while (zeros > 1) {
                if (nums[low] == 0) {
                    zeros--;
                }
                low++;
            }

            // Update the longest valid window
            maxLength = Math.max(maxLength, high - low + 1);
        }

        return maxLength;
    }
}
