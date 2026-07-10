/*
# Middle of the Linked List (LC 876)

Pattern:
Fast & Slow Pointer

Template:
// 1. Initialize two pointers
ListNode slow = head;
ListNode fast = head;

// 2. Move slow by 1 step and fast by 2 steps
while (fast != null && fast.next != null) {
    slow = slow.next;
    fast = fast.next.next;
}

// 3. slow will be at the middle node
return slow;

Key Idea:
- Slow pointer moves one step at a time.
- Fast pointer moves two steps at a time.
- When fast reaches the end, slow reaches the middle.
- If the list has an even number of nodes,
  return the second middle node (as required by LC 876).

Example:
Input: 1 → 2 → 3 → 4 → 5
Output: 3

Input: 1 → 2 → 3 → 4 → 5 → 6
Output: 4

Complexity:
Time: O(n)
Space: O(1)
*/

Code:

class Solution {
    public ListNode middleNode(ListNode head) {

        // Slow = 1 step, Fast = 2 steps
        ListNode slow = head;
        ListNode fast = head;

        // Move until fast reaches end
        while (fast != null && fast.next != null) {
            slow = slow.next;       // +1
            fast = fast.next.next;  // +2
        }

        // Slow points to middle (2nd middle if even)
        return slow;
    }
}
