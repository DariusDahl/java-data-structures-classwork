# Java Data Structures Classwork

This repository contains a collection of projects from my data structures coursework, focusing on fundamental concepts and their practical implementation in Java. Each folder represents a self-contained module exploring different data structures and algorithms.

## Overview

### Purpose
The goal of this repository is to demonstrate:  
- Hands-on implementation of core data structures and algorithms.  
- Object-Oriented Programming (OOP) principles in Java.  
- Modular design using interfaces and classes.  
- Application of recursive and iterative approaches to solve computational problems.  
- File I/O operations for practical data processing tasks. 
- Collision resolution strategies in hash-based data structures.

### Topics Covered
- Stack (Array-based and Linked)
- Queue (Array-based and Linked with Special Operations)
- Binary Tree and Binary Search Tree
- Recursive Algorithms
- Simple Linked List
- Hash Table with Linear Probing
- ArrayList vs LinkedList Benchmark
- Sorting Algorithms
- File Reading and Writing
- Other data structures as the coursework progresses.     

## Current Projects

### 1. [Array Stack](https://github.com/DariusDahl/data-structures-classwork-java/blob/main/array-stack/)
- **Overview**: A simple stack implementation using arrays. This project demonstrates how to efficiently manage data in a Last-In-First-Out (LIFO) manner.
- **Learning Goals**:
  - Understand stack operations like push, pop, and top.
  - Implement fixed-capacity constraints in stacking with array manipulations.
  - Use validation methods (`isEmpty`, `isFull`) to handle edge cases.

### 2. [Binary Tree](https://github.com/DariusDahl/data-structures-classwork-java/blob/main/binary-tree/)
- **Overview**: A hierarchical binary tree structure implemented in Java. This project showcases recursive algorithms for traversals, summation, and search functionality.
- **Learning Goals**:
  - Explore traversal methods: Pre-Order, In-Order, Post-Order.
  - Implement recursive algorithms for search and summation.
  - Apply sorting techniques on ArrayList data to enhance understanding.

### 3. [Recursive Algorithms](https://github.com/DariusDahl/data-structures-classwork-java/blob/main/recursive-algorithms/)
- **Overview**: A collection of recursive solutions for common computational problems. Projects include Fibonacci number calculation, subset generation, recursive array summation, and filtering subsets divisible by 3 or 5.
- **Learning Goals**:
  - Design and analyze recursive solutions with rigorous base cases.
  - Apply recursion to mathematical, combinatorial, and filtering applications.
  - Optimize recursive approaches for computational efficiency.

### 4. [Simple Linked List](https://github.com/DariusDahl/data-structures-classwork-java/blob/main/linked-list/linked-list-implementation/)
- **Overview**: A generic implementation of a singly linked list. This project demonstrates dynamic data manipulation with operations for inserting, deleting, and accessing nodes at specific positions.
- **Learning Goals**:
  - Understand dynamic memory management via node-based structures.
  - Implement pointer manipulation to create and manage linked nodes.
  - Leverage Java generics for flexible data type support.

### 5. [ArrayList vs LinkedList Benchmark](https://github.com/DariusDahl/data-structures-classwork-java/blob/main/linked-list/arraylist-vs-linkedlist-benchmark/)
- **Overview**: A performance benchmark comparing random access and swapping operations between `ArrayList` and `LinkedList`. Demonstrates scalability and trade-offs between direct indexing (`ArrayList`) and sequential traversal (`LinkedList`).
- **Learning Goals**:
  - Measure and compare the execution time for random access and swap operations.
  - Highlight time complexity differences as input sizes scale (`N` values).
  - Explore the impact of data structure design on performance for large datasets.

### 6. [Array Bounded Queue](https://github.com/DariusDahl/data-structures-classwork-java/blob/main/array-bounded-queue/)
- **Overview**: A fixed-capacity FIFO (First-In-First-Out) queue implemented using arrays. This project emphasizes exception handling, circular array manipulation, and queue management techniques.
- **Learning Goals**:
  - Efficiently handle data with queue operations (`enqueue`, `dequeue`) and validation checks (`isEmpty`, `isFull`).
  - Implement exception handling for overflow and underflow conditions.
  - Explore dynamic memory management with circular arrays.

### 7. [Sort and Merge ArrayLists](https://github.com/DariusDahl/data-structures-classwork-java/blob/main/sorting-algorithms/sort-and-merge-arraylists/)
- **Overview**: A project that demonstrates sorting and merging multiple `ArrayLists` using the Bubble Sort algorithm. Three separate lists are sorted individually and then merged into a single sorted list.
- **Learning Goals**: 
  - Implement Bubble Sort for ordering elements in ascending order.
  - Practice list manipulation techniques for generating and sorting data.
  - Efficiently merge multiple sorted lists using pointer-based traversal.
 
### 8. [Generate Customer Emails](https://github.com/DariusDahl/data-structures-classwork-java/blob/main/reading-writing-files/)
- **Overview**: A file I/O project that reads customer data from a file, processes it using a template, and generates personalized email files for each customer.  Demonstrates automated content generation and date manipulation.
- **Learning Goals**: 
  - Read and parse structured data from text files.
  - Replace template placeholders with dynamic customer information.
  - Write output to multiple files with automated naming conventions.
  - Calculate expiry dates by manipulating date strings.

### 9. [Linked Stack Implementation](https://github.com/DariusDahl/data-structures-classwork-java/blob/main/linked-list/linked-stack-implementation/)
- **Overview**: A linked list-based stack implementation with extended operations including bottom access and removal.  Uses an iterative algorithm to find the largest element by comparing and removing smaller elements from top and bottom.
- **Learning Goals**:
  - Implement a stack using linked nodes instead of arrays.
  - Add custom operations (`bottom()`, `popFromBottom()`) beyond standard stack functionality.
  - Apply algorithmic problem-solving to find maximum elements through iterative comparison.
  - Manage custom exception handling for stack overflow and underflow conditions. 

### 10. [Linked Special Queue](https://github.com/DariusDahl/data-structures-classwork-java/blob/main/linked-list/linked-special-queue/)
- **Overview**: A linked list-based queue implementation that categorizes elements as "special" or "normal" based on value ranges.  Implements conditional queue splitting when special elements comprise at least half of the total queue size.
- **Learning Goals**:
  - Implement conditional element categorization within a queue structure.
  - Manage multiple internal linked lists for different element types.
  - Design and implement queue splitting algorithms for load distribution.
  - Apply object-oriented principles to model real-world scenarios with `Person` objects.

### 11. [Binary Search Tree](https://github.com/DariusDahl/data-structures-classwork-java/blob/main/binary-search-tree/)
- **Overview**: A comprehensive Binary Search Tree implementation with standard operations (add, remove, search) and advanced analysis methods.  Includes tree traversals, node counting, successor finding, and structural validation (full/balanced tree checks).
- **Learning Goals**: 
  - Implement efficient BST operations maintaining the binary search property.
  - Master recursive tree traversal algorithms (preorder, inorder, postorder).
  - Analyze tree structure through leaf/interior node identification.
  - Validate tree properties including balance and fullness criteria. 

### 12. [Hash Table with Linear Probing](https://github.com/DariusDahl/data-structures-classwork-java/blob/main/hash-table-linear-probing/)
- **Overview**: A hash table implementation using linear probing for collision resolution.   Demonstrates hash function design, collision handling, and the trade-offs of open addressing strategies.
- **Learning Goals**: 
  - Implement a hash table using arrays with modulo-based hash function.
  - Apply linear probing to resolve hash collisions efficiently.
  - Understand primary clustering and its impact on performance. 
  - Handle edge cases including full table conditions and wraparound logic.

---

This repository will grow as I continue to explore more data structures and their functionalities.














