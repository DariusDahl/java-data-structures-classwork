# Simple Linked List Implementation

This project provides a Java-based implementation of a **Singly Linked List** that supports generic data types. It demonstrates the insertion, deletion, and retrieval of nodes within a dynamic list structure.

## Overview

A linked list is a dynamic data structure where elements (nodes) are connected via pointers. This implementation introduces features for manipulating nodes, including adding, removing, and accessing elements at specific positions.

### Features

#### General Operations
- **Node Insertion**:
  - Add a node to the end of the linked list.
  - Insert a node at any index, pushing subsequent elements forward.

- **Node Deletion**:
  - Delete a node from the linked list at any position.
  - Returns the deleted node for validation.

- **Node Retrieval**:
  - Access a node at a specific index and retrieve its stored value.

- **Traversal**:
  - Print all stored data in the linked list in sequential order.

#### Generic Support
- Designed to accept any data type (`String`, `Integer`, `Double`, etc.), making it suitable for diverse applications.

### File Breakdown

- **`Main.java`**:
  - Demonstrates the usage of `SimpleLL` class for manipulating linked list nodes.
- **`SimpleLL.java`**:
  - Implements core linked list functionalities: node insertion, deletion, retrieval, and traversal.

### Example Usage

#### Create and Add Nodes:
```java
SimpleLL<Object> simpleLL = new SimpleLL<>(null);
Node node1 = new Node<>(10);
Node node2 = new Node<>("Hello world!");
simpleLL.insert(node1);
simpleLL.insert(node2);
simpleLL.printAll();
```
```text
10
Hello world!
3.14
```

#### Retrieve Node:
```java
Node<Object> nodeAt1 = simpleLL.getNodeAt(1);
System.out.println("The value of the node at index 1 is: " + nodeAt1.getInfo());
```
```text
The value of the node at index 1 is: Hello world!
```

#### Insert Node at Specific Index:
```java
Node node4 = new Node<>(0.5);
simpleLL.insertAt(node4, 2);
simpleLL.printAll();
```
```text
10
Hello world!
0.5
3.14
```

#### Delete Node:
```java
Node<Object> deletedNode = simpleLL.deleteAt(nodeAt1);
simpleLL.printAll();
System.out.println("The value of the deleted node is: " + deletedNode.getInfo());
```
```text
10
3.14
The value of the deleted node is: Hello world!
```

### Skills Demonstrated

- **Dynamic Memory Management**:
  - Efficiently handle sequential data with dynamic node addition/deletion.
- **Pointer Manipulation**:
  - Understand linked node management with `nextLink`.
- **Generic Programming**:
  - Leverages Java generics for flexible data type support.

### How to Run

1. Ensure Java is installed on your system.
2. Compile the files:
   ```bash
   javac Main.java SimpleLL.java
   ```
3. Run the program:
   ```bash
   java Main
   ```

### Future Extensions

- Add support for doubly linked lists.
- Implement search and sorting algorithms for linked lists.

---

This project introduces dynamic linked list structures with practical applications and highlights the fundamentals of data manipulation using pointers.
