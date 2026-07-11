/*
# Intersection of Two Linked Lists (LC 160)

Pattern:
Two Pointer

Template:
// 1. Initialize two pointers
ListNode p1 = headA;
ListNode p2 = headB;

// 2. Traverse both lists
while (p1 != p2) {
    p1 = (p1 == null) ? headB : p1.next;
    p2 = (p2 == null) ? headA : p2.next;
}

// 3. Return the intersection node (or null)
return p1;

Key Idea:
- Traverse both linked lists with two pointers.
- When a pointer reaches the end, switch it to the other list.
- Both pointers travel the same total distance.
- If an intersection exists, they meet there.
- Otherwise, both become null at the same time.

Example:
List A: 4 → 1 → 8 → 4 → 5
               ↑
List B:    5 → 6 → 1
               ↓
Output: 8

No Intersection:
List A: 1 → 2 → 3
List B: 4 → 5
Output: null

Complexity:
Time: O(m + n)
Space: O(1)
*/

Code:
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        // pointers for both lists
        ListNode a = headA;
        ListNode b = headB;

        // move until they meet
        while (a != b) {

            // if end reached, switch to other list
            if (a == null) {
                a = headB;
            } else {
                a = a.next;
            }

            if (b == null) {
                b = headA;
            } else {
                b = b.next;
            }
        }

        return a; // intersection node or null
    }
}
