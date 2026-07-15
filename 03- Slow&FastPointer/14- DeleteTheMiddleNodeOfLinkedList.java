/*
# Delete the Middle Node of a Linked List (LC 2095)

Pattern:
Linked List + Slow & Fast Pointer

Template:
// Edge case
if (head == null || head.next == null)
    return null;

// Initialize pointers
ListNode slow = head;
ListNode fast = head;
ListNode prev = null;

// Find middle node
while (fast != null && fast.next != null) {
    prev = slow;
    slow = slow.next;
    fast = fast.next.next;
}

// Delete middle node
prev.next = slow.next;

return head;

Key Idea:
- We ARE given the head of the list.
- Use Slow & Fast pointers to find the middle.
- Fast moves 2 steps, Slow moves 1 step.
- Keep a 'prev' pointer to remember the node before Slow.
- When Fast reaches the end, Slow is at the middle.
- Delete the middle by:
    prev.next = slow.next;

Example:
Input:
1 → 3 → 4 → 7 → 1 → 2 → 6

Slow ends at:
        7

After deletion:
1 → 3 → 4 → 1 → 2 → 6

Edge Case:
Input:
1

Output:
null

Complexity:
Time: O(n)
Space: O(1)
*/

Code:

class Solution {
    public ListNode deleteMiddle(ListNode head) {

        // Agar 0 ya 1 node hai to middle delete hoke list empty ho jayegi
        if (head == null || head.next == null) return null;

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        // Slow = 1 step, Fast = 2 step
        // Jab fast end pe pahunchta hai, slow middle pe hota hai
        while (fast != null && fast.next != null) {
            prev = slow;          // Middle se pehle wala node save
            slow = slow.next;     // 1 step
            fast = fast.next.next;// 2 step
        }

        // Middle node ko skip karke delete
        prev.next = slow.next;

        return head;
    }
}
