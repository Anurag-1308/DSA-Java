/*
# Find the Duplicate Number (LC 287)

Pattern:
Floyd's Cycle Detection (Tortoise & Hare)

// Phase 1: Find meeting point
int slow = nums[0];
int fast = nums[0];
do {
    slow = nums[slow];
    fast = nums[nums[fast]];
} while (slow != fast);

// Phase 2: Find duplicate
slow = nums[0];
while (slow != fast) {
    slow = nums[slow];
    fast = nums[fast];
}
return slow;

Key Idea:
- Treat array as a linked list: index -> nums[index].
- Duplicate creates a cycle.
- Slow moves 1 step, fast moves 2 steps.
- After they meet, reset slow to start.
- Move both one step at a time.
- Their next meeting point is the duplicate.

Complexity:
Time: O(n)
Space: O(1)
*/ 

Code:
class Solution {
    public int findDuplicate(int[] nums) {

        // Dono pointers start se
        int slow = 0;
        int fast = 0;

        // Phase 1: Cycle ke andar meeting point find karo
        while (true) {
            slow = nums[slow];          // 1 step
            fast = nums[nums[fast]];    // 2 steps

            // Agar dono mil gaye to cycle confirm
            if (slow == fast) {
                break;
            }
        }

        // Phase 2: Slow ko fir se start par le jao
        slow = 0;

        // Ab dono 1-1 step chalenge
        // Jahan dubara milenge wahi duplicate number hai
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        // Duplicate return
        return slow;
    }
}
