/*
#Minimum Size Subarray Sum
Pattern:
Sliding Window

Window Type:
Variable Size Window

Template:

low = 0
sum = 0
for(high = 0; high < n; high++){
    sum += nums[high]
    while(sum >= target){
        answer = min(answer, high - low + 1)
        sum -= nums[low]
        low++
    }
}

Key Idea:
Expand until valid.
Shrink while valid.

Learning:
- Variable Size Window
- Expand and Shrink
- Minimum Valid Window

Complexity:
Time: O(n)
Space: O(1)
*/

Code:

class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int low = 0;

        // Current window sum
        int windowSum = 0;

        // Minimum valid window length found so far
        int minLength = Integer.MAX_VALUE;

        // Expand the window
        for (int high = 0; high < nums.length; high++) {

            // Add current element
            windowSum += nums[high];

            // Window is valid (sum >= target)
            while (windowSum >= target) {

                // Update answer
                minLength = Math.min(minLength, high - low + 1);

                // Shrink the window to find a smaller valid window
                windowSum -= nums[low];
                low++;
            }
        }

        // No valid window found
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
