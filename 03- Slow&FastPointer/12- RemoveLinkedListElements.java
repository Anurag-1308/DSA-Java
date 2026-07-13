/*
# Remove Linked List Elements (LC 203)

Pattern:
Linked List Traversal + Dummy Node

Template:
ListNode dummy = new ListNode(0);
dummy.next = head;

ListNode curr = dummy;

while (curr.next != null) {
    if (curr.next.val == val) {
        curr.next = curr.next.next;
    } else {
        curr = curr.next;
    }
}
return dummy.next;

Key Idea:
- Create a dummy node before the head.
- Traverse the list using curr.
- If the next node has the target value, skip it.
- Otherwise, move curr forward.
- Dummy node handles deletion of the head node easily.

Complexity:
Time: O(n)
Space: O(1)
*/

Code:

class Solution {
    public ListNode removeElements(ListNode head, int val) {

        // Dummy node to handle head deletion
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Start from dummy
        ListNode curr = dummy;

        // Traverse the list
        while (curr != null && curr.next != null) {

            // Remove matching node
            if (curr.next.val == val) {
                curr.next = curr.next.next;
            } else {
                // Move forward
                curr = curr.next;
            }
        }

        // Return updated head
        return dummy.next;
    }
}
