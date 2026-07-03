/*
# Linked List Cycle II (LC 142)

Pattern:
Slow & Fast Pointer

Template:

ListNode slow = head;
ListNode fast = head;
while(fast != null && fast.next != null){

    slow = slow.next;
    fast = fast.next.next;

    if(slow == fast){
        slow = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
return null;

Key Idea:
- First, detect the cycle using slow & fast pointers.
- After they meet, move slow back to head.
- Move both one step at a time.
- Where they meet again is the start of the cycle.

Complexity:
Time: O(n)
Space: O(1)
*/

Code:

public class Solution {
    public ListNode detectCycle(ListNode head) {

        // Both pointers start from head
        ListNode slow = head;
        ListNode fast = head;

        // First, check if a cycle exists
        while (fast != null && fast.next != null) {

            slow = slow.next;          // 1 step
            fast = fast.next.next;     // 2 steps

            // Cycle detected
            if (slow == fast) {

                // Move slow back to head
                slow = head;

                // Move both one step at a time
                // They will meet at the starting node of the cycle
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }

                // Start of the cycle
                return slow;
            }
        }

        // No cycle found
        return null;
    }
}
