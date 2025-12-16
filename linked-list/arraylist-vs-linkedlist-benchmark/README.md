# ArrayList vs LinkedList Benchmark

This project benchmarks the performance of **ArrayList** and **LinkedList** in Java for random access and swapping operations. It measures execution times for varying input sizes to highlight the strengths and weaknesses of their data access mechanisms.

## Overview

The benchmark program:
1. Inserts random coordinate points (x, y) into an `ArrayList` and a custom `LinkedList`.
2. Performs `n` random swaps of elements within the `ArrayList` and the `LinkedList`.
3. Measures the execution time for these operations and displays the results.

The goal is to compare the performance of direct index-based access (`ArrayList`) versus sequential node traversal (`LinkedList`).

## Features

- **Randomized Data Generation**:
  - Initializes coordinate points with random `x` and `y` values.
- **Benchmarking**:
  - Measures execution time for `ArrayList` and `LinkedList` operations.
- **Performance Analysis**:
  - Highlights differences in access speed for varying input sizes (`N`).

## File Breakdown

- **`Coordinate.java`**: Represents a coordinate point with `x` and `y` values.
- **`Node.java`**: Implements a generic node structure used in the custom `LinkedList`.
- **`LinkedList.java`**: Provides methods to add nodes, retrieve nodes at specific indices, and traverse the linked list.
- **`Main.java`**: Contains benchmarking logic and performance measurement.

## Output Example

```text
N = 10
Time_A (ArrayList): 7500
Time_B (LinkedList): 6000

N = 100
Time_A (ArrayList): 55600
Time_B (LinkedList): 187500

N = 1000
Time_A (ArrayList): 384300
Time_B (LinkedList): 1871900

N = 10000
Time_A (ArrayList): 1111100
Time_B (LinkedList): 117636700
```

### Observations
- For smaller input sizes (`N = 10` and `N = 100`), LinkedList shows competitive performance due to negligible traversal overhead.
- As input size grows, ArrayList performs significantly better because direct index-based access is faster than sequential traversal.

### Skills Demonstrated

- **Performance Benchmarking**:
  - Measures and compares runtime for different data structures.
- **Random Data Manipulation**:
  - Generates and swaps randomized coordinate points.
- **Time Complexity Analysis**:
  - Highlights the impact of indexing (`ArrayList`) versus traversal (`LinkedList`) on execution time for larger datasets.

## How to Run

1. Ensure Java is installed on your system.
2. Compile the files:
   ```bash
   javac Coordinate.java Node.java LinkedList.java Main.java
   ```
3. Run the program:
   ```bash
   java Main
   ```

## Insights

This benchmark project demonstrates:
1. The importance of choosing a data structure based on the required operations. 
   - Use `ArrayList` for fast random access and swap operations.
   - Use `LinkedList` for dynamic data where frequent insertions or deletions are needed.
2. The scalability of `ArrayList` for larger datasets compared to `LinkedList`.

---

This project showcases the trade-offs between access and manipulation efficiency for `ArrayList` and `LinkedList`.
