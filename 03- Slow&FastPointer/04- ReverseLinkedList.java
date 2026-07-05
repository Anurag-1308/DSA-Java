/*
# Reverse Linked List (LC 206)

Pattern:
Linked List Reversal (Three Pointer Technique)

Template:
ListNode prev = null;
ListNode curr = head;
while (curr != null) {
    ListNode next = curr.next;

    curr.next = prev;
    prev = curr;
    curr = next;
}
return prev;

Key Idea:
- Keep track of three pointers:
  - prev → previous node
  - curr → current node
  - next → stores the next node before changing links
- Reverse the current node's pointer.
- Move all pointers one step forward.
- Continue until the current node becomes null.
- At the end, prev becomes the new head of the reversed list.

Complexity:
Time: O(n)
Space: O(1)
*/

Code:

class Solution {
    public ListNode reverseList(ListNode head) {

        // Starting me previous node nahi hai
        ListNode prev = null;

        // Current ko head se start karte hain
        ListNode curr = head;

        // Jab tak list khatam na ho jaye
        while (curr != null) {

            // Next node ka address pehle save kar lo,
            // warna reverse karte hi baaki list ka access chala jayega
            ListNode next = curr.next;

            // Current node ka pointer ulta kar do
            curr.next = prev;

            // Prev ko current par le aao
            // (Ye reversed list ka naya head ban jayega)
            prev = curr;

            // Current ko original next node par move kara do
            curr = next;
        }

        // Loop ke end me prev hi reversed linked list ka head hoga
        return prev;
    }
}
