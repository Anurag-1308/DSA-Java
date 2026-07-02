/*
# Linked List Cycle (LC 141)

Pattern:
Slow & Fast Pointer

Template:

ListNode slow = head;
ListNode fast = head;
while(fast != null && fast.next != null){

    slow = slow.next;
    fast = fast.next.next;

    if(slow == fast){
        return true;
    }
}
return false;

Key Idea:
- Slow → 1 step
- Fast → 2 steps
- If they meet → Cycle exists
- If fast reaches null → No cycle

Complexity:
Time: O(n)
Space: O(1)
*/

Code:

public class Solution {
    public boolean hasCycle(ListNode head) {

        // start both from head
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;       // +1 step
            fast = fast.next.next;  // +2 steps

            // meeting point => cycle
            if (slow == fast) {
                return true;
            }
        }

        // reached end
        return false;
    }
}
