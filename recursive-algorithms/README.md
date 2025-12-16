  # Recursive Algorithms

This project provides implementations of fundamental recursive algorithms in Java, focusing on mathematical operations, subsets generation, and array manipulation. It demonstrates the versatility of recursion in problem-solving and algorithm design.

## Overview

Recursion is a technique where a function calls itself to solve smaller instances of a problem. This project explores three important use cases of recursion:
1. Fibonacci sequence calculation.
2. Generating subsets from a set.
3. Summing elements of an array.

### Features

#### 1. **Fibonacci Recursion**
   - Computes the Fibonacci number at a given position using recursion.
   - Demonstrates the recursive structure: \[ F(n) = F(n-1) + F(n-2) \].
   - Example:
     ```text
     Input: n = 10
     Output: 
     The Fibonacci number at position 0 is 0
     The Fibonacci number at position 1 is 1
     ...
     The Fibonacci number at position 9 is 34
     The Fibonacci number at position 10 is 55
     ```

#### 2. **Subset Generation**
   - Generates all possible subsets of a given set using recursion.
   - Contains two recursive calls for each element (taking or ignoring it).
   - Example:
     ```text
     Input: n = 4
     Output:
     { }
     {4}
     {3}
     {3, 4}
     {2}
     {2, 4}
     {2, 3}
     {2, 3, 4}
     {1}
     {1, 4}
     {1, 3}
     {1, 3, 4}
     {1, 2}
     {1, 2, 4}
     {1, 2, 3}
     {1, 2, 3, 4}
     ```

#### 3. **Recursive Array Sum**
   - Calculates the sum of elements in an array recursively.
   - Breaks the problem into smaller subsets until the base case is reached.
   - Example:
     ```text
     Input: A = {2, 3, 5, 1, 2, 4}
     Output:
     Base case: element at n = 1 is 2
     Sum(2) = 5
     Sum(3) = 10
     ...
     Sum of A is: 17
     ```

### Skills Demonstrated

- **Recursive Problem-Solving**:
  - Designing base cases for termination.
  - Breaking down problems into recursive functions.
- **Algorithm Analysis**:
  - Understanding recursion tree structure and function calls.
- **Mathematical Applications**:
  - Using recursion to solve combinatorial and numerical problems.

### File Breakdown

- **`FibonacciRecursion.java`**: Computes Fibonacci numbers recursively.
- **`GenerateSubsets.java`**: Generates all subsets of a given set using recursion.
- **`RecursiveArraySum.java`**: Calculates the sum of an array's elements recursively.

### How to Run

1. Ensure Java is installed on your system.
2. Compile the desired file:
   ```bash
   javac FibonacciRecursion.java
   javac GenerateSubsets.java
   javac RecursiveArraySum.java
   ```
3. Run the program:
   ```bash
   java FibonacciRecursion
   java GenerateSubsets
   java RecursiveArraySum
   ```

---

This project showcases foundational recursive techniques and highlights their application across multiple computational problems.
