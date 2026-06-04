/*
Question:
Remove Duplicates from Sorted Array

Pattern:
Two Pointers

Time Complexity:
O(n)

Space Complexity:
O(1)

Key Observation:
Since array is sorted, duplicates appear together.
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
