# Binary Tree Implementation

This project provides a Java-based implementation of a **Binary Tree** data structure, showcasing traversal algorithms, search functionality, and tree manipulation techniques.

## Overview

A binary tree is a hierarchical data structure where each node has up to two children. This implementation focuses on fundamental binary tree concepts, including search logic, summation, and traversal algorithms.

### Features

- **Tree Traversal**:
  - Pre-Order: Visit the current node first, then traverse the left and right subtrees.
  - In-Order: Traverse the left subtree, visit the current node, then traverse the right subtree.
  - Post-Order: Traverse the left and right subtrees first, then visit the current node.
- **Search Functionality**: Check if a specific value exists within the tree structure.
- **Summation**: Calculate the sum of all values within the tree.
- **ArrayList Operations**:
  - Generate random elements in an ArrayList to simulate tree data.
  - Sort ArrayList elements manually using nested loops.

### File Breakdown

- **`binary_tree_diagram.txt`**: A visual representation of the binary tree structure.
- **`BinaryTree.java`**: Implements various methods for traversal, summation, search, and sorting operations.

### Example Usage

1. Select a traversal order to navigate through the tree:
   - Pre-Order Example Output: `0, 1, 3, 4, 2, 5, 6`
   - In-Order Example Output: `3, 1, 4, 0, 5, 2, 6`
   - Post-Order Example Output: `3, 4, 1, 5, 6, 2, 0`

2. Search for a value in the ArrayList:
   ```text
   Enter the integer that you want to check for in the ArrayList: 42
   Is 42 in ArrayList?: false
   ```

3. Sort the ArrayList and compute the sum:
   ```text
    Original ArrayList: [65, 17, 96, ..., 21, 79, 51]
    Sorted ArrayList: [5, 12, 12, ..., 94, 96, 97]
    The sum of the elements in the ArrayList is: 1225
    ```

### Skills Demonstrated

- **Recursive Algorithms**:
  - Traversals (Pre-, In-, Post-Order).
  - Recursive search and summation operations.
- **Data Monitoring**:
  - Validates whether a target value exists in a dynamically generated tree structure.
- **Sorting**:
  - Manually implements sorting logic on ArrayList values for learning purposes.

### How to Run

1. Ensure Java is installed on your system.
2. Compile the file:
   ```bash
   javac BinaryTree.java
   ```
3. Run the program:
   ```bash
   java BinaryTree
   ```
4. Interact with the program via terminal prompts to explore various tree operations.

---

This project provides a strong introduction to binary tree concepts and recursive programming, with additional applications in list sorting and summation.
