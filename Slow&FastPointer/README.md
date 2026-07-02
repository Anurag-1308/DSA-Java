# Slow & Fast Pointer Pattern (Two Pointers on Linked List)

# Description
The Slow & Fast Pointer (Tortoise & Hare) pattern is used to solve Linked List problems by
moving two pointers at different speeds.It helps find the middle node, detect cycles, locate intersections, reorder lists, and
split linked lists efficiently in a single traversal.

# Common Use Cases
- Find Middle Node
- Detect Cycle
- Find Start of Cycle
- Find Nth Node from End
- Reorder Linked List
- Reverse Second Half
- Check Palindrome
- Delete Middle Node
- Find Twin Sum
- Find Intersection of Two Lists

# Questions Solved:
- [x] Linked List Cycle                                              (LC 141)

# Questions Remaining:
- [ ] Linked List Cycle II                                           (LC 142)
- [ ] Find the Duplicate Number                                      (LC 287)
- [ ] Happy Number                                                   (LC 202)
- [ ] Reverse Linked List                                            (LC 206)
- [ ] Reverse Linked List II                                         (LC 92)
- [ ] Palindrome Linked List                                         (LC 234)
- [ ] Reorder List                                                   (LC 143)
- [ ] Middle of the Linked List                                      (LC 876)
- [ ] Intersection of Two Linked Lists                               (LC 160)
- [ ] Remove Nth Node From End of List                               (LC 19)
- [ ] Remove Linked List Elements                                    (LC 203)
- [ ] Delete Node in a Linked List                                   (LC 237)
- [ ] Delete the Middle Node of a Linked List                        (LC 2095)

# Complexity
Most Slow & Fast Pointer problems traverse the linked list only once.

Typical Complexity:
- Time: O(n)
- Space: O(1)

# Key Learnings

- Slow & Fast Pointer Technique
- Finding the Middle Node
- Cycle Detection (Floyd's Algorithm)
- Finding Cycle Entry Point
- Two-Pass vs One-Pass Solutions
- Finding Nth Node from End
- Reversing Half of a Linked List
- Splitting Linked Lists
- Comparing Two Halves
- In-place Linked List Modification

# Slow & Fast Pointer Framework

1. Initialize two pointers
   - slow = head
   - fast = head

2. Move pointers
   - slow = slow.next
   - fast = fast.next.next

3. Stop when
   - fast == null
   - OR fast.next == null

4. Perform required operation
   - Find middle
   - Reverse second half
   - Detect cycle
   - Delete node
   - Compare halves
   - Reorder list

# Status
🚧 Pattern In Progress

Questions Solved: 1/14
Questions Remaining: 13
