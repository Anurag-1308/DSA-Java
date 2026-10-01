 🧠 DSA Pattern Recognition Guide

Use this file whenever you get stuck deciding **which pattern to apply**.

# 1️⃣ Two Pointers

## 💡 Think of this pattern when...

- Array is sorted
- Need a pair/triplet/quadruplet
- Compare from both ends
- Remove duplicates
- In-place modification

### Common Keywords

Sorted  
Pair  
Triplet  
Closest Sum  
Merge  
Duplicate  
Move Zeroes  
Container

### Pointer Logic

text
sum < target  → left++
sum > target  → right--
sum == target → store answer
duplicate     → skip duplicate

Complexity
Time : O(n) / O(n²)
Space: O(1)

2️⃣ Sliding Window
💡 Think of this pattern when...
Subarray

Substring

Contiguous elements

Longest / Shortest window

At Most K

Exactly K

Frequency counting

Common Keywords
Subarray
Substring
Continuous
Longest
Minimum
Maximum
Window
Consecutive
At Most K
Exactly K

Window Logic
Expand →
Update Window →
Valid ?
Yes → Shrink
Update Answer
Repeat

Complexity
Time : O(n)
Space: O(1) ~ O(k)

3️⃣ Slow & Fast Pointer
💡 Think of this pattern when...
Linked List

Cycle

Middle node

Palindrome

Reorder

Nth from end

Reverse half

Common Keywords
Cycle
Middle
Linked List
Loop
Circular
Nth Node
Palindrome

Pointer Logic
slow += 1
fast += 2

meet → cycle

fast == null
or
fast.next == null

→ no cycle

Complexity
Time : O(n)
Space: O(1)

4️⃣ Kadane's Algorithm
💡 Think of this pattern when...
Maximum / Minimum subarray sum

Contiguous subarray

Positive + negative numbers

Maximum sum in one traversal

Circular subarray

One deletion

Maximum product

Common Keywords
Maximum Subarray
Minimum Subarray
Maximum Sum
Contiguous
Circular
One Deletion
Absolute Sum
Maximum Product

Kadane Logic
current = max(nums[i], current + nums[i])
answer = max(answer, current)

Restart → nums[i]
Extend  → current + nums[i]

Variations
Minimum Sum     → Minimum Kadane
Circular Array  → total - minSum
Absolute Sum    → max(maxSum, abs(minSum))
One Deletion    → noDelete + oneDelete
Product         → Track max + min product

Complexity
Time : O(n)
Space: O(1)

⚡ Pattern Selection Cheat Sheet
Problem Clue	Pattern
Sorted Array	Two Pointers
Pair Sum	Two Pointers
3Sum / 4Sum	Two Pointers
Remove Duplicates	Two Pointers
Move Zeroes	Two Pointers
Container With Most Water	Two Pointers
Subarray	Sliding Window / Kadane
Substring	Sliding Window
Longest Window	Sliding Window
Minimum Window	Sliding Window
At Most K	Sliding Window
Exactly K	Sliding Window
Frequency Map	Sliding Window
Linked List Cycle	Slow & Fast
Middle Node	Slow & Fast
Nth From End	Slow & Fast
Reorder List	Slow & Fast
Palindrome Linked List	Slow & Fast
Maximum Subarray Sum	Kadane
Minimum Subarray Sum	Kadane
Maximum Absolute Sum	Kadane
Circular Subarray Sum	Kadane
One Deletion + Max Sum	Kadane
Maximum Product Subarray	Kadane

📊 Progress
Pattern	Status	Progress
✅ Two Pointers	Completed	13 / 13
✅ Sliding Window	Completed	14 / 14
✅ Slow & Fast Pointer	Completed	14 / 14
✅ Kadane's Algorithm	Completed	5 / 5
