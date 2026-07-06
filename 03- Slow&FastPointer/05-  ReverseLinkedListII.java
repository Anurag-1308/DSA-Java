/*
# Reverse Linked List II (LC 92)

Pattern:
Partial Linked List Reversal (Three Pointer Technique)

Template:

// 1. Reach the node before 'left'
ListNode dummy = new ListNode(0);
dummy.next = head;
ListNode prev = dummy;
for (int i = 1; i < left; i++) {
    prev = prev.next;
}

// 2. Start reversing
ListNode curr = prev.next;
for (int i = 0; i < right - left; i++) {
    ListNode next = curr.next;

    curr.next = next.next;
    next.next = prev.next;
    prev.next = next;
}
return dummy.next;

Key Idea:
- Create a dummy node to handle edge cases.
- Move 'prev' to the node just before 'left'.
- 'curr' points to the first node of the part to reverse.
- Repeatedly take the node after 'curr' and move it to the front of the reversed section.
- After all iterations, the sublist from 'left' to 'right' is reversed.
- Return dummy.next as the new head.

Complexity:
Time: O(n)
Space: O(1)
*/

Code:

class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {

        // Agar list empty hai ya sirf ek hi node reverse karni hai
        if (head == null || left == right) return head;

        // Dummy node edge case handle karega
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;

        // prev ko left se ek node pehle le jao
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        // Reverse yahin se start hoga
        ListNode curr = prev.next;

        // Sublist reverse karo
        for (int i = 0; i < right - left; i++) {

            // Agla node save karo
            ListNode next = curr.next;

            // next ko curr ke baad se hatao
            curr.next = next.next;

            // next ko reverse part ke front me lagao
            next.next = prev.next;
            prev.next = next;
        }

        // New head return
        return dummy.next;
    }
}
