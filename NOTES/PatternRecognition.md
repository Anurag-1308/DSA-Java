# 🧠 DSA Pattern Recognition Guide
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

```
sum < target  → left++
sum > target  → right--
sum == target → store answer
duplicate     → skip duplicate
```

### Complexity

Time : O(n) / O(n²)
Space: O(1)
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

# 2️⃣ Sliding Window
## 💡 Think of this pattern when...

- Subarray
- Substring
- Contiguous elements
- Longest / Shortest window
- At Most K
- Exactly K
- Frequency counting

### Common Keywords

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

### Window Logic
```
Expand →
Update Window →
Valid ?
Yes → Shrink
Update Answer
Repeat
```

### Complexity
Time : O(n)
Space: O(1) ~ O(k)

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

# 3️⃣ Slow & Fast Pointer
## 💡 Think of this pattern when...

- Linked List
- Cycle
- Middle node
- Palindrome
- Reorder
- Nth from end
- Reverse half

### Common Keywords

Cycle
Middle
Linked List
Loop
Circular
Nth Node
Palindrome

### Pointer Logic

```
slow += 1
fast += 2

meet → cycle

fast == null
or
fast.next == null

→ no cycle
```

### Complexity
Time : O(n)
Space: O(1)
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

# ⚡ Pattern Selection Cheat Sheet

| Problem Clue | Pattern |
|--------------|---------|
| Sorted Array | Two Pointers |
| Pair Sum | Two Pointers |
| 3Sum / 4Sum | Two Pointers |
| Remove Duplicates | Two Pointers |
| Subarray | Sliding Window |
| Substring | Sliding Window |
| Longest Window | Sliding Window |
| Minimum Window | Sliding Window |
| At Most K | Sliding Window |
| Frequency Map | Sliding Window |
| Linked List Cycle | Slow & Fast |
| Middle Node | Slow & Fast |
| Nth From End | Slow & Fast |
| Reorder List | Slow & Fast |
| Palindrome Linked List | Slow & Fast |

# 📊 Progress

| Pattern | Status | Progress |
|----------|--------|----------|
| ✅ Two Pointers | Completed | 13 Questions |
| ✅ Sliding Window | Completed | 14 Questions |
| 🚧 Slow & Fast Pointer | In Progress | 1 / 14 |
