# Kadane's Algorithm Pattern (Maximum / Minimum Subarray)

# Description
Kadane's Algorithm is used to find the maximum or minimum sum of a contiguous subarray
in a single traversal. It maintains a running sum and decides whether to extend the
current subarray or start a new one.

This pattern is also extended to solve circular arrays, absolute sums, and subarrays
with one deletion.

# Common Use Cases
- Maximum Subarray Sum
- Minimum Subarray Sum
- Maximum Absolute Subarray Sum
- Circular Subarray Sum
- Maximum Sum with One Deletion
- Maximum Product Subarray
- Dynamic Programming Optimization

# Questions Solved:
- [x] Maximum Subarray                                             (LC 53)
- [x] Maximum Absolute Sum of Any Subarray                         (LC 1749)
- [x] Maximum Sum Circular Subarray                                (LC 918)
- [x] Maximum Subarray Sum with One Deletion                       (LC 1186)
- [x] Maximum Product Subarray                                     (LC 152)

# Complexity
Most Kadane's Algorithm problems traverse the array only once.

Typical Complexity:
- Time: O(n)
- Space: O(1)

# Key Learnings

- Kadane's Algorithm
- Running Sum Technique
- Restart vs Extend Decision
- Maximum & Minimum Kadane
- Circular Array Trick
- Prefix & Suffix Combination
- Dynamic Programming Optimization
- Edge Case Handling (All Negative Arrays)

# Kadane's Algorithm Framework

1. Initialize
   - current = nums[0]
   - answer = nums[0]

2. Traverse array
   - current = max(nums[i], current + nums[i])

3. Update answer
   - answer = max(answer, current)

4. Modify according to problem
   - Minimum Sum
   - Circular Array
   - One Deletion
   - Product Variant

# Status
✅ Pattern Completed

Questions Solved: 5/5
