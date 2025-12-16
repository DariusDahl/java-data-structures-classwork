# Linked Special Queue

This project implements a **Linked Special Queue** in Java that categorizes elements as either "special" or "normal" based on their values. The queue can split itself into two smaller queues when certain conditions are met, demonstrating advanced queue manipulation techniques.

## Overview

The program: 
1. Prompts the user for the number of `Person` objects to create.
2. Generates random ages (0-119) for each person.
3. Enqueues elements into the queue, categorizing them as: 
   - **Special elements**: Ages ≤ 10 or ≥ 65 (placed at the front of the queue).
   - **Normal elements**: Ages between 11 and 64 (placed after special elements).
4. Displays the queue contents with special elements appearing first.
5. Checks if the number of special elements is ≥ half the total queue size.
6. If the condition is met, splits the queue into two smaller queues by distributing elements alternately.

This project showcases linked list-based queue implementation, conditional element categorization, and dynamic queue splitting. 

## Features

- **Dual-Category Enqueue**:
  - Separates "special" and "normal" elements into two internal linked lists. 
  - Special elements are always placed before normal elements in the queue. 

- **Queue Operations**:
  - `enqueue(int element)`: Adds elements to the appropriate category.
  - `size()`: Returns the total number of elements in the queue. 
  - `sizeSpecial()`: Returns the number of special elements.
  - `toString()`: Provides a formatted string representation of the queue. 

- **Queue Splitting**:
  - `split()`: Divides the queue into two smaller queues by alternating elements.
  - Triggered when special elements comprise at least half of the total queue. 

- **Person Object**:
  - Represents individuals with an `age` attribute used for categorization.

## File Breakdown

- **`LinkedSpecialQueueDriver.java`** (or `TestLSQ.java`): Main driver program to test queue functionality.
- **`LinkedSpecialQueue.java`**: Implements the special queue with categorization and splitting logic.
- **`LLNode.java`**: Represents a generic node in the linked list. 
- **`Person.java`**: Simple class to create `Person` objects with an `age` attribute.

## Example Output

```text
How many elements do you want in the queue? 10
Creating 10 Person objects with following ages: 
Person 1 Age: 86
Person 2 Age:  106
Person 3 Age: 97
Person 4 Age: 10
Person 5 Age: 79
Person 6 Age: 114
Person 7 Age: 109
Person 8 Age: 96
Person 9 Age: 4
Person 10 Age:  64

Queue contents:
Front --> 86 --> 106 --> 97 --> 10 --> 79 --> 114 --> 109 --> 96 --> 4 --> 64 --> Rear

Size of special queue = 9

We should split the queue!!
Queue 1
Front --> 86 --> 97 --> 79 --> 109 --> 4 --> Rear
Queue 2
Front --> 106 --> 10 --> 114 --> 96 --> 64 --> Rear
```

## Skills Demonstrated

- **Conditional Data Categorization**: 
  - Dynamically organizing elements based on value ranges. 

- **Linked List Queue Implementation**:
  - Managing separate linked lists for different element categories. 

- **Queue Splitting Algorithm**:
  - Alternately distributing elements into two new queues.

- **String Representation**:
  - Building formatted output strings for complex data structures.

- **Object-Oriented Design**:
  - Using classes (`Person`, `LLNode`) to model real-world entities and data structures.

## How to Run

1. Ensure Java is installed on your system.
2.  Compile the files:
   ```bash
   javac LinkedSpecialQueueDriver. java LinkedSpecialQueue.java LLNode.java Person.java
   ```
3. Run the program:
   ```bash
   java LinkedSpecialQueueDriver
   ```
4. Enter the number of elements when prompted.

## Insights

This project demonstrates: 
1. Advanced queue manipulation with conditional element placement.
2. The flexibility of linked list structures for implementing custom data organization.
3. Practical applications of queue splitting algorithms for load balancing or categorization tasks.
4. How to maintain multiple internal data structures within a single queue interface.

---

This project provides hands-on experience with advanced queue operations and demonstrates practical applications of linked list data structures. 
