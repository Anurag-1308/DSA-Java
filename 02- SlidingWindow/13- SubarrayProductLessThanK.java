/*
# Subarray Product Less Than K
Pattern:
Sliding Window

Window Type:
Variable Size Window

Template:

if(k <= 1)
    return 0;

low = 0
product = 1
count = 0
for(high = 0; high < n; high++){
    product *= nums[high];

    while(product >= k){
        product /= nums[low];
        low++;
    }

    count += (high - low + 1);
}

return count;

Key Idea:
Expand the window by multiplying the current element.
If the product becomes greater than or equal to k,
shrink the window from the left until the product
is less than k again.

For every valid window ending at 'high',
all subarrays ending at 'high' and starting
from 'low' to 'high' are valid.

Number of such subarrays:
(high - low + 1)

Complexity:
Time: O(n)
Space: O(1)
*/

Code:

class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {

        int low = 0;      // Window start
        int prod = 1;     // Window product
        int count = 0;    // Total valid subarrays

        // Edge case
        if (k <= 1) return 0;

        // Expand window
        for (int high = 0; high < nums.length; high++) {

            prod *= nums[high];

            // Shrink until valid
            while (prod >= k) {
                prod /= nums[low];
                low++;
            }

            // Count all valid subarrays ending at high
            count += (high - low + 1);
        }

        return count;
    }
}
