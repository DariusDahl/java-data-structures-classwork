/**
 *  COSC2100 - Fall Semester 2023
 *  Worksheet #2 - Main.java
 *  This program calls on the SimpleLL and Node classes to insert/delete nodes into a linked list and print the nodes.
 *  @author - Darius Dahl
 */

package Worksheet_2;

public class Main {

    public static void main(String[] args) {

        // Create a new linked list that takes in any type of object.
        SimpleLL<Object> simpleLL = new SimpleLL<>(null);

        // Insert nodes into the linked list with type double values
        Node node1 = new Node<>(10);
        Node node2 = new Node<>("Hello world!");
        Node node3 = new Node<>(3.14);
        Node node4 = new Node<>(0.5);

        // Insert nodes into the linked list.
        simpleLL.insert(node1);
        simpleLL.insert(node2);
        simpleLL.insert(node3);

        // Print all the nodes in the linked list.
        simpleLL.printAll();

        // Get the node at index 1
        Node<Object> nodeAt1 = simpleLL.getNodeAt(1);

        // Create some spacing to differentiate between other printed values
        System.out.println();

        // Print the node's data
        System.out.println("The value of the node at index 1 is: " + nodeAt1.getInfo());

        // Create some spacing to differentiate between other printed values
        System.out.println();

        // Insert nodes at specific indices
        // Inserts node4 where node3 is at, and thus pushes node3 up one index instead
        // of overwriting it
        simpleLL.insertAt(node4, 2);

        // Print all the nodes in the linked list.
        simpleLL.printAll();

        // Create some spacing to differentiate between other printed values
        System.out.println();

        // Delete the node at index 1.
        Node<Object> deletedNode = simpleLL.deleteAt(nodeAt1);

        // Print all the nodes in the linked list again.
        simpleLL.printAll();

        // Create some spacing to differentiate between other printed values
        System.out.println();

        // Print the value of the deleted node.
        System.out.println("The value of the deleted node is: " + deletedNode.getInfo());

    }
}