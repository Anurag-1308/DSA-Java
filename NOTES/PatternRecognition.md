Pattern Recognition - Two Pointers
Pattern Name:
#Two Pointers

#Description:
The Two Pointers pattern uses two indices to traverse an array or string efficiently. It is commonly used to reduce time complexity from O(n²) to O(n).

#When to Use:

- Sorted Arrays
- Pair Sum Problems
- Triplet Problems
- Quadruplet Problems
- Duplicate Removal
- In-place Array Modification
- Opposite End Comparisons
- Window Shrinking/Expanding Problems

#Common Clues:
If a question contains:

- Sorted Array
- Pair Sum
- Triplet Sum
- 4 Sum
- Remove Duplicates
- Move Elements
- Container/Maximum Area
- Closest Sum

Then Two Pointers may be a suitable approach.

#Pointer Movement Rules:

Case 1: Sum < Target

Move Left Pointer Forward

Case 2: Sum > Target

Move Right Pointer Backward

Case 3: Sum == Target

Store Answer and Move Pointers

Case 4: Duplicate Values

Skip Duplicate Elements

Case 5: Maximum Area Problems

Move Pointer Having Smaller Height

#Questions Solved:

Easy:

- Two Sum II
- Remove Duplicates from Sorted Array
- Remove Element
- Squares of Sorted Array
- Move Zeroes
- Merge Two Sorted Arrays

Medium:

- Remove Duplicates II
- 3Sum
- 3Sum Closest
- Triplet Smaller Sum
- Sort Colors (Dutch National Flag)

Hard:

- 4Sum
- Container With Most Water

#Complexity

Pair Problems:

Brute Force: O(n²)
Two Pointers: O(n)

Triplet Problems:

Brute Force: O(n³)
Two Pointers: O(n²)

4Sum:

Brute Force: O(n⁴)
Optimized: O(n³)

#Space Complexity:

Usually O(1)

#Key Learnings:

- Opposite Direction Pointers
- Same Direction Pointers
- Duplicate Handling
- In-place Array Modification
- Pair Sum Optimization
- Triplet and Quadruplet Problems
- Dutch National Flag Algorithm
- Greedy Pointer Movement
- Area Maximization Problems

#Status:

✅ Pattern Completed

Total Questions Solved: 13
Difficulty Covered: Easy → Medium → Hard
