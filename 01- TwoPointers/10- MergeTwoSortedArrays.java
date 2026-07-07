/*
Question:
Merge Sorted Array

LeetCode:
88

Pattern:
Two Pointers

Approach:
Start from the end of both arrays and place the larger
element at the last available position.

Time Complexity:
O(m + n)
Space Complexity:
O(1)

Key Observation:
Filling from the back avoids shifting elements repeatedly.

Status:
Solved
*/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i= m-1;
        int j= n-1;
        int k= m+n-1;
        while(i>=0 && j>=0){
            if(nums1[i]<=nums2[j]){
                nums1[k]=nums2[j];
                j--;
            }
            else{
                nums1[k]=nums1[i];
                i--;
            }
            k--;
        }
        while(j>=0){
            nums1[k]= nums2[j];
            j--;
            k--;
        }
    }
}
