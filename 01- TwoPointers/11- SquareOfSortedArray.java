/*
Question:
Squares of a Sorted Array

LeetCode:
977

Pattern:
Two Pointers

Approach:
Compare absolute values from both ends.
Place the larger square at the end of the result array.

Time Complexity:
O(n)
Space Complexity:
O(n)

Key Observation:
The largest square can come from either the most negative
or the most positive element.

Status:
Solved
*/

class Solution {
    public int[] sortedSquares(int[] nums) {
       int [] ans= new int[nums.length];
       int i=0;
       int j= nums.length-1;
       int k= nums.length-1;
       while(i<=j){
        int leftsquare = nums[i]*nums[i];
        int rightsquare = nums[j]*nums[j];

        if(leftsquare < rightsquare){
            ans[k]= rightsquare;
            j--;
        }
        else{
            ans[k] =leftsquare;
            i++;
        }
        k--;
       }
       return ans;
    }
    
}
