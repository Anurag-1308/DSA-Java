/*
# Palindrome Linked List (LC 234)

Pattern:
Fast & Slow Pointer + Reverse Second Half

Template:

// 1. Find the middle of the linked list
ListNode slow = head;
ListNode fast = head;
while (fast != null && fast.next != null) {
    slow = slow.next;
    fast = fast.next.next;
}

// 2. Reverse the second half
ListNode prev = null;
ListNode curr = slow;
while (curr != null) {
    ListNode next = curr.next;

    curr.next = prev;
    prev = curr;
    curr = next;
}

// 3. Compare both halves
ListNode first = head;
ListNode second = prev;
while (second != null) {
    if (first.val != second.val)
        return false;

    first = first.next;
    second = second.next;
}

return true;

Key Idea:
- Use Fast & Slow pointers to find the middle.
- Reverse the second half of the linked list.
- Compare the first half with the reversed second half.
- If all corresponding values match, the list is a palindrome.
- Otherwise, return false.

Complexity:
Time: O(n)
Space: O(1)
*/

Code:
class Solution {
    public boolean isPalindrome(ListNode head) {

        // Middle find (Slow-Fast)
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 2nd half reverse
        ListNode prev = null;
        while (slow != null) {
            ListNode next = slow.next; // next save
            slow.next = prev;          // reverse
            prev = slow;               // prev aage
            slow = next;               // slow aage
        }

        // Dono half compare
        ListNode left = head;
        ListNode right = prev;

        while (right != null) {
            if (left.val != right.val)
                return false;

            left = left.next;
            right = right.next;
        }

        return true;
    }
}
