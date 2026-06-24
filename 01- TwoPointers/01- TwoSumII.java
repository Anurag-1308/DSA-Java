/*
Question:
Two Sum II

LeetCode:
167

Pattern:
Two Pointers

Logic:
Keep one pointer at start and one at end.
Move pointers according to sum.

Time Complexity:
O(n)

Space Complexity:
O(1)
*/

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left =0;
        int right= numbers.length-1;
        while(left<right){
            int sum= numbers[left]+numbers[right];
            if(sum==target){
                return new int[] {left+1, right+1};
            }
            else if (sum>target){
                right--;
            }
            else
            left++;
        }
        return new int[]{};
    } 
}
