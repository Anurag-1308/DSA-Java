/*
Maximum Absolute Sum of Any Subarray (LC 1749)

Pattern:
Kadane's Algorithm — Maximum + Minimum Subarray

Template:
int maxending = 0;
int minending = 0;
int maxsum = 0;
int minsum = 0;

for (int i = 0; i < nums.length; i++) {
maxending = Math.max(nums[i], maxending + nums[i]);
maxsum = Math.max(maxsum, maxending);

minending = Math.min(nums[i], minending + nums[i]);
minsum = Math.min(minsum, minending);
}
return Math.max(maxsum, Math.abs(minsum));

Key Idea:

maxending stores the maximum subarray sum ending at the current index.
minending stores the minimum subarray sum ending at the current index.
At each element, choose:
Start a new subarray from the current element.
Extend the previous subarray.
maxsum tracks the largest positive subarray sum.
minsum tracks the smallest negative subarray sum.
The maximum absolute sum can come from either:
The maximum positive subarray sum.
The absolute value of the minimum negative subarray sum.
Initializing maxending, minending, maxsum, and minsum with 0 naturally handles the empty subarray.

Complexity:
Time: O(n)
Space: O(1)
*/
Code:

class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxending = 0;
        int minending = 0;
        int maxsum = 0;
        int minsum = 0;

        for(int i = 0; i < nums.length; i++){

            // Max subarray: naya start ya purana extend
            maxending = Math.max(nums[i], maxending + nums[i]);
            maxsum = Math.max(maxsum, maxending);

            // Min subarray: naya start ya purana extend
            minending = Math.min(nums[i], minending + nums[i]);
            minsum = Math.min(minsum, minending);
        }

        // Max positive sum ya min negative sum ka abs
        return Math.max(maxsum, Math.abs(minsum));
    }
}
