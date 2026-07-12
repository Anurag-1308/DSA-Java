/*
# Remove Nth Node From End of List (LC 19)

Pattern:
Fast & Slow Pointer

Template:
// 1. Create a dummy node
ListNode dummy = new ListNode(0);
dummy.next = head;

// 2. Initialize two pointers
ListNode fast = dummy;
ListNode slow = dummy;

// 3. Move fast pointer n+1 steps ahead
for (int i = 0; i <= n; i++) {
    fast = fast.next;
}

// 4. Move both pointers together
while (fast != null) {
    fast = fast.next;
    slow = slow.next;
}

// 5. Remove the target node
slow.next = slow.next.next;

// 6. Return updated head
return dummy.next;

Key Idea:
- Keep a gap of n nodes between fast and slow.
- Move fast n+1 steps ahead first.
- Then move both pointers together.
- When fast reaches null, slow is just before the node to delete.
- Delete the node by changing the next pointer.

Example:
Input: 1 → 2 → 3 → 4 → 5, n = 2
Output: 1 → 2 → 3 → 5

Input: 1, n = 1
Output: null

Complexity:
Time: O(n)
Space: O(1)
*/

Code:
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        // Dummy node to handle edge cases
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Two pointers
        ListNode slow = dummy;
        ListNode fast = dummy;

        // Move fast n+1 steps ahead
        for (int i = 0; i < n + 1; i++) {
            fast = fast.next;
        }

        // Move both pointers together
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // Delete the target node
        slow.next = slow.next.next;

        // Return updated list
        return dummy.next;
    }
}
