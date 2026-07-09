/*
# Reorder List (LC 143)

Pattern:
Fast & Slow Pointer + Reverse Second Half + Merge

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
ListNode curr = slow.next;
slow.next = null;
while (curr != null) {
    ListNode next = curr.next;

    curr.next = prev;
    prev = curr;
    curr = next;
}

// 3. Merge both halves alternately
ListNode first = head;
ListNode second = prev;
while (second != null) {
    ListNode next1 = first.next;
    ListNode next2 = second.next;

    first.next = second;
    second.next = next1;

    first = next1;
    second = next2;
}

Key Idea:
- Use Fast & Slow pointers to find the middle.
- Split the list into two halves.
- Reverse the second half.
- Merge the first and reversed second halves alternately.
- Final order becomes:
  L0 → Ln → L1 → Ln-1 → L2 → Ln-2 ...

Complexity:
Time: O(n)
Space: O(1)
*/

Code:
class Solution {
    public void reorderList(ListNode head) {

        //MIDDLE OFLINKED LIST
        ListNode slow = head;
        ListNode fast= head;
        while(fast!= null && fast.next!= null){
            slow = slow.next;
            fast= fast.next.next;
        }

        // REVERSE 2nd HALF OF LL
        ListNode prev = null;
        ListNode curr = slow.next;
        slow.next = null;
        while(curr!= null){
            ListNode next = curr.next;
            curr.next= prev;
            prev= curr;
            curr= next;
        }

        //MERGE BOTH HALVES
        ListNode left = head;
        ListNode right = prev;
        while(right!= null){
            ListNode nextleft= left.next;
            ListNode nextright= right.next;
            left.next= right;
            right.next= nextleft;
            left= nextleft;
            right = nextright;
        }
    }
}
