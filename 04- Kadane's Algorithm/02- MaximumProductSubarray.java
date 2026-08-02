/*
# Maximum Product Subarray (LC 152)

Pattern:
Kadane's Algorithm (Product Variant)

Template:

int maxProduct = nums[0];
int minProduct = nums[0];
int answer = nums[0];
for (int i = 1; i < nums.length; i++) {

    if (nums[i] < 0) {
        int temp = maxProduct;
        maxProduct = minProduct;
        minProduct = temp;
    }
    maxProduct = Math.max(nums[i], maxProduct * nums[i]);
    minProduct = Math.min(nums[i], minProduct * nums[i]);
    answer = Math.max(answer, maxProduct);
}
return answer;

Key Idea:
- maxProduct stores the maximum product ending at the current index.
- minProduct stores the minimum product ending at the current index.
- We track minProduct because multiplying a negative minimum by another
  negative can become the maximum product.
- If the current number is negative, swap maxProduct and minProduct
  before updating.
- At each element, choose:
    1. Start a new subarray from the current element.
    2. Extend the previous maximum product.
    3. Extend the previous minimum product.
- Update answer whenever a larger product is found.

Complexity:
Time: O(n)
Space: O(1)
*/

Code:

class Solution {
    public int maxProduct(int[] nums) {

        // current index tak max aur min product
        int maxending = nums[0];
        int minending = nums[0];
        int ans = nums[0];

        for (int i = 1; i < nums.length; i++) {

            // negative aaya to max aur min swap
            if (nums[i] < 0) {
                int temp = maxending;
                maxending = minending;
                minending = temp;
            }

            // naya start karo ya previous max ko extend
            maxending = Math.max(nums[i], maxending * nums[i]);

            // naya start karo ya previous min ko extend
            minending = Math.min(nums[i], minending * nums[i]);

            // final answer update
            ans = Math.max(ans, maxending);
        }

        return ans;
    }
}
