#Time Complexity Notes

What is Time Complexity?
Time complexity describes how the execution time of an algorithm scales as the input size (n) increases.

#O(1) - Constant Time
Common Examples:

- Array element access by index
- HashMap lookup
- Stack push and pop operations

#O(log n) - Logarithmic Time
Common Examples:

- Binary Search
- Operations on balanced binary search trees

#O(n) - Linear Time
Common Examples:

- Linear Search
- Array or list traversal

#O(n log n) - Linearithmic Time
Common Examples:

- Merge Sort
- Heap Sort
- Quick Sort (average case)

#O(n²) - Quadratic Time
Common Examples:

- Bubble Sort
- Selection Sort
- Nested loop iterations over the same dataset

#O(n³) - Cubic Time
Common Examples:

- Triplet-based problems
- Basic matrix multiplication algorithms

#O(2ⁿ) - Exponential Time
Common Examples:

- Backtracking algorithms
- Subset generation

#O(n!) - Factorial Time
Common Examples:

- Generating all permutations

#Space Complexity:
Space complexity measures how memory usage grows with input size.

- O(1): In-place operations, two-pointer techniques
- O(n): HashMaps, queues, stacks, and auxiliary arrays

#Optimization Strategies

- O(n³) → O(n²): Apply two-pointer techniques, sorting, or hashing
- O(n²) → O(n): Use sliding window, hashing, or prefix sum approaches

#Common DSA Patterns

Pattern| Typical Complexity
Two Pointers| O(n)–O(n²)
Sliding Window| O(n)
Binary Search| O(log n)
Hashing| O(n)
BFS / DFS| O(V + E)
Merge Sort| O(n log n)

#Key Considerations:

When optimizing an algorithm, consider the following:

1. Can nested loops be reduced or eliminated?
2. Can sorting simplify the problem?
3. Can techniques such as HashMaps, Two Pointers, or Sliding Window improve efficiency?
