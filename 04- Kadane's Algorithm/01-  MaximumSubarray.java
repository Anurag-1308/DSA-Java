/*
# Maximum Subarray (LC 53)

Pattern:
Kadane's Algorithm

Template:

int currentSum = nums[0];
int maxSum = nums[0];
for (int i = 1; i < nums.length; i++) {

    currentSum = Math.max(nums[i], currentSum + nums[i]);
    maxSum = Math.max(maxSum, currentSum);
}
return maxSum;

Key Idea:
- currentSum stores the maximum subarray ending at the current index.
- At each element, choose:
    1. Start a new subarray from the current element.
    2. Extend the previous subarray.
- Update maxSum whenever a larger subarray sum is found.
- Initializing with nums[0] correctly handles all-negative arrays.

Complexity:
Time: O(n)
Space: O(1)
*/

Code:

class Solution {
    public int maxSubArray(int[] nums) {

        // Starting se initialize (all negative case handle hoga)
        int currentSum = nums[0];
        int maxSum = nums[0];

        // Array traverse karo
        for (int i = 1; i < nums.length; i++) {

            // Naya subarray start kare ya purana continue?
            currentSum = Math.max(nums[i], currentSum + nums[i]);

            // Agar better answer mila to update karo
            maxSum = Math.max(maxSum, currentSum);
        }

        // Final maximum subarray sum
        return maxSum;
    }
}
