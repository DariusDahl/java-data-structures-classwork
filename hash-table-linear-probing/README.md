# Hash Table with Linear Probing

This project implements a **Hash Table** in Java using **Linear Probing** as the collision resolution strategy.   It demonstrates how hash tables store and retrieve data efficiently, and how collisions are handled when multiple elements hash to the same index.

## Overview

The program:  
1. Creates a hash table of a specified size using an integer array. 
2. Implements a hash function using the modulo operator (`element % table_size`).
3. Uses **linear probing** to resolve collisions by finding the next available slot. 
4. Provides methods to add elements and display the hash table contents.  
5. Demonstrates table overflow handling when the table is full. 
6. Includes a simple search function to locate elements by value. 

This project showcases hash table implementation, collision resolution techniques, and the trade-offs of linear probing.  

## Features

- **Hash Function**:
  - Uses modulo operation:  `index = element % table_size`
  - Simple and efficient for integer keys. 

- **Linear Probing Collision Resolution**:
  - When a collision occurs, searches sequentially for the next empty slot.
  - Wraps around to the beginning of the table if necessary.

- **Add Operation (`addLP`)**:
  - Inserts elements into the hash table.
  - Handles collisions using linear probing.
  - Prevents insertion when the table is full.

- **String Representation (`toString`)**:
  - Displays hash table contents with empty slots marked as `-`.
  - Shows the current state of the table after each operation.

- **Search Operation**:
  - Linear search to find elements by value.
  - Returns the index where the element is stored. 

## File Breakdown

- **`HashTable.java`**: Implements the hash table with linear probing, add operation, and display functionality.   Includes a main method for testing. 

## Example Output

```text
Empty hash table:
[-, -, -, -, - ]

Start adding elements:
[-, 936, -, -, - ]
[25, 936, -, -, - ]
[25, 936, -, -, 374 ]
[25, 936, 237, -, 374 ]
[25, 936, 237, 587, 374 ]

Full table:
[25, 936, 237, 587, 374 ]

Hash table is full! Cannot add element:  1

No change occured. 
[25, 936, 237, 587, 374 ]

Element 237 found at index 2
```

### How Elements Are Placed

For a hash table of size 5:

1. **936**: `936 % 5 = 1` → placed at index 1
2. **25**: `25 % 5 = 0` → placed at index 0  
3. **374**: `374 % 5 = 4` → placed at index 4
4. **237**:  `237 % 5 = 2` → placed at index 2
5. **587**: `587 % 5 = 2` → collision at index 2!  Linear probing finds next empty slot at index 3
6. **1**: `1 % 5 = 1` → Table is full → cannot insert

## Skills Demonstrated

- **Hash Table Implementation**: 
  - Building a hash table using arrays. 
  - Implementing a hash function for integer keys. 

- **Collision Resolution**:
  - Using linear probing to handle hash collisions. 
  - Understanding the clustering problem with linear probing.

- **Algorithm Design**:
  - Implementing wraparound logic using modulo operator. 
  - Detecting and handling full table conditions.

- **Data Structure Analysis**:
  - Understanding load factor and its impact on performance. 
  - Recognizing trade-offs between different collision resolution methods.

## How to Run

1. Ensure Java is installed on your system.  
2. Compile the file:
   ```bash
   javac HashTable.java
   ```
3. Run the program:
   ```bash
   java HashTable
   ```

## Insights

This project demonstrates: 

1. **Hash Table Efficiency**: Average O(1) time complexity for insertions and lookups when properly sized. 
2. **Linear Probing Trade-offs**: 
   - **Advantages**: Simple to implement, good cache performance. 
   - **Disadvantages**:  Primary clustering can degrade performance as the table fills. 
3. **Load Factor Importance**: Performance degrades significantly when the table becomes nearly full. 
4. **Collision Resolution**: Different strategies (linear probing, quadratic probing, chaining) have different performance characteristics. 

### Key Concepts

- **Hash Function**: Maps keys to array indices using a deterministic calculation. 
- **Collision**:  When two different keys hash to the same index. 
- **Linear Probing**: Sequentially searching for the next empty slot after a collision.  
- **Primary Clustering**:  Consecutive occupied slots that increase collision probability. 
- **Load Factor**:  Ratio of filled slots to total slots (affects performance).

## Possible Extensions

- Implement removal operation with tombstone markers. 
- Add dynamic resizing when load factor exceeds a threshold. 
- Compare linear probing with quadratic probing or separate chaining. 
- Implement a generic version supporting different key types.

---

This project provides hands-on experience with hash tables and demonstrates the importance of collision resolution strategies in maintaining efficient data structure performance. 
