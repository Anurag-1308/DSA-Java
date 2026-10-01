/*
Maximum Sum Circular Subarray (LC 918)

Pattern:
Kadane's Algorithm — Maximum + Minimum

Template:
int total = 0;
int maxending = 0;
int minending = 0;
int maxsum = Integer.MIN_VALUE;
int minsum = Integer.MAX_VALUE;

for (int num : nums) {

    // Normal maximum subarray
    maxending = Math.max(num, maxending + num);
    maxsum = Math.max(maxsum, maxending);

    // Normal minimum subarray
    minending = Math.min(num, minending + num);
    minsum = Math.min(minsum, minending);

    total += num;
}

if (maxsum < 0)
    return maxsum;

return Math.max(maxsum, total - minsum);

Key Idea:
maxsum -> normal maximum subarray sum.
minsum -> minimum subarray sum.
total - minsum -> circular subarray sum.
Reason:
- Circular answer = total array sum - middle minimum subarray.

At each element:
1. Normal max subarray -> Kadane.
2. Normal min subarray -> Kadane.
3. Circular max = total - minsum.

Important:
- Agar saare elements negative hain, total - minsum = 0
  aa jayega, jo invalid hai.
- Isliye maxsum < 0 hone par maxsum return karo.

Complexity:
Time: O(n)
Space: O(1)
*/

Code:

class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total = 0;
        int curMax = 0;
        int max = nums[0];
        int curMin = 0;
        int min = nums[0];

        for (int i = 0; i < nums.length; i++) {

            total += nums[i];

            // Normal max subarray
            curMax = Math.max(nums[i], curMax + nums[i]);
            max = Math.max(max, curMax);

            // Minimum subarray for circular case
            curMin = Math.min(nums[i], curMin + nums[i]);
            min = Math.min(min, curMin);
        }

        // Saare elements negative hain
        if (max < 0) {
            return max;
        }

        // Circular sum = total - minimum subarray
        return Math.max(max, total - min);
    }
}
