/*
Question:
Remove Duplicates from Sorted Array

LeetCode:
26

Pattern:
Two Pointers

Approach:
Keep one pointer for unique elements and another for traversal.

Time Complexity:
O(n)
Space Complexity:
O(1)

Key Observation:
Since the array is sorted, duplicates appear together.
We can overwrite duplicates by placing unique elements at the correct position.

Status:
Solved
*/
class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        for(int j=i+1;j<nums.length;j++){
            if(nums[i] != nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
}        
