/*
Question:
Move Zeroes

LeetCode:
283
Pattern:
Two Pointers

Time Complexity:
O(n)

Space Complexity:
O(1)

Status:
Solved
*/

class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int j = 0;

        while (i < nums.length) {
            if (nums[i] != 0) {
                int temp = nums[i];    
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
            i++;
        }
    }
}
