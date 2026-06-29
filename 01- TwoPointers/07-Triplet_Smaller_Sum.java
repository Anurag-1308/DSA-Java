/*Pattern:
Two Pointers

Approach:
1. Sort the array
2. Fix first element
3. Use two pointers
4. If sum < target:
   count += (right - left)
5. Move pointers accordingly

Time Complexity:
O(n²)

Space Complexity:
O(1)

Key Learning:
- Counting triplets efficiently
- Two Pointer counting trick
- Observation based optimization
*/

import java.util.*;

class Solution {
    public int threeSumSmaller(int[] nums, int target) {

        Arrays.sort(nums);
        int count = 0;

        for (int i = 0; i < nums.length - 2; i++) {

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                if (sum < target) {
                    count += right - left;
                    left++;
                } else {
                    right--;
                }
            }
        }

        return count;
    }
}
