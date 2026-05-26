# 🧩 DSA & Competitive Programming Solutions

A collection of coding problem solutions for practice and revision — covering data structures, algorithms, and general programming challenges from platforms like LeetCode, Codeforces, HackerRank, and more.

**Language:** Java

---

## 📂 Repository Structure

```
├── arrays/
├── strings/
├── linked-list/
├── stacks-and-queues/
├── trees/
├── graphs/
├── dynamic-programming/
├── recursion-and-backtracking/
├── sorting-and-searching/
├── greedy/
├── bit-manipulation/
├── math-and-number-theory/
├── sliding-window/
├── two-pointers/
├── heap-priority-queue/
├── trie/
├── segment-tree/
└── miscellaneous/
```

> Organize by topic. Each folder contains problem files named descriptively, e.g. `TwoSum.java`, `MergeIntervals.java`.

---

## 📊 Progress Tracker

| Platform    | Easy | Medium | Hard | Total |
|-------------|------|--------|------|-------|
| LeetCode    | 0    | 0      | 0    | 0     |
| Codeforces  | —    | —      | —    | 0     |
| HackerRank  | 0    | 0      | 0    | 0     |
| GFG         | 0    | 0      | 0    | 0     |

---

## 🗂️ Topic-Wise Index

| # | Topic | Problems Solved | Key Concepts |
|---|-------|-----------------|--------------|
| 1 | Arrays | 0 | Kadane's, Prefix Sum, Sliding Window |
| 2 | Strings | 0 | Pattern Matching, Anagrams, Palindromes |
| 3 | Linked List | 0 | Reversal, Cycle Detection, Merge |
| 4 | Stacks & Queues | 0 | Monotonic Stack, Next Greater Element |
| 5 | Trees | 0 | Traversals, BST, LCA, Diameter |
| 6 | Graphs | 0 | BFS, DFS, Dijkstra, Topological Sort |
| 7 | Dynamic Programming | 0 | Knapsack, LIS, LCS, DP on Trees |
| 8 | Recursion & Backtracking | 0 | N-Queens, Subsets, Permutations |
| 9 | Sorting & Searching | 0 | Binary Search Variants, Merge Sort |
| 10 | Greedy | 0 | Interval Scheduling, Huffman |
| 11 | Bit Manipulation | 0 | XOR Tricks, Bitmask DP |
| 12 | Heap / Priority Queue | 0 | Top-K, Merge K Sorted |
| 13 | Trie | 0 | Prefix Search, Word Break |
| 14 | Segment Tree | 0 | Range Queries, Lazy Propagation |

---

## 📝 Solution Format

Each solution file follows this template:

```java
/*
 * Problem  : Two Sum
 * Platform : LeetCode (#1)
 * Difficulty: Easy
 * Link     : https://leetcode.com/problems/two-sum/
 *
 * Approach : HashMap — store complement while iterating.
 * Time     : O(n)
 * Space    : O(n)
 */

import java.util.*;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }
}
```

---

## 🛠️ How to Run

**Prerequisites:** Java 17+ and a terminal.

```bash
# Compile
javac arrays/TwoSum.java

# Run
java -cp arrays TwoSum
```

Or open the project in any IDE (IntelliJ IDEA / VS Code / Eclipse).

---

## 🎯 Goals

- [ ] Solve 100 LeetCode problems
- [ ] Complete Striver's SDE Sheet
- [ ] Participate in weekly Codeforces contests
- [ ] Cover all major DP patterns
- [ ] Revise one topic per week

---

## 📚 Resources

- [Striver's SDE Sheet](https://takeuforward.org/interviews/strivers-sde-sheet-top-coding-interview-problems/)
- [NeetCode 150](https://neetcode.io/practice)
- [LeetCode Patterns](https://seanprashad.com/leetcode-patterns/)
- [CP Algorithms](https://cp-algorithms.com/)
- [Big-O Cheat Sheet](https://www.bigocheatsheet.com/)

---

## 🤝 Contributing

This is a personal practice repo, but feel free to fork it and adapt the structure for your own journey.

---

## 📄 License

This repository is for educational purposes. Problem statements belong to their respective platforms.
