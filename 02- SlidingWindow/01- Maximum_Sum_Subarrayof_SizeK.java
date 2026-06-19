/* # Maximum Sum Subarray of Size K
Pattern:
Sliding Window

Window Type:
Fixed Size Window

Template:

low = 0
sum = 0
for(high = 0; high < n; high++){
    sum += nums[high]
    if(high - low + 1 == k){
       answer = max(answer, sum)
       sum -= nums[low]
       low++
    }
}

Key Idea:
Maintain a window of size K.
Add incoming element and remove outgoing element.

Learning:
- Fixed Size Window
- Running Sum
- Window Size Check

Complexity:
Time: O(n)
Space: O(1)
*/

Code:

class Solution {
    public int maxSumSubarray(int[] nums, int k) {

        int low = 0;

        // Current window ka sum
        int sum = 0;

        // Ab tak ka maximum sum
        int maxSum = Integer.MIN_VALUE;

        // High pointer se window expand karte jao
        for (int high = 0; high < nums.length; high++) {

            // Naya element window me add karo
            sum += nums[high];

            // Jab window size k ho jaye
            if (high - low + 1 == k) {

                // Current window answer ke liye eligible hai
                maxSum = Math.max(maxSum, sum);

                // Window ko slide karne ke liye
                // leftmost element hata do
                sum -= nums[low];

                // Window ko ek step aage le jao
                low++;
            }
        }

        return maxSum;
    }
}
