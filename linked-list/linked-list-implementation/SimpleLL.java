/**
 *  COSC2100 - Fall Semester 2023
 *  Worksheet #2 - SimpleLL.java
 *  This program will create a simple linked list that takes in any type of object (node) and manipulate the list.
 *  @author - Darius Dahl
 */

package Worksheet_2;

public class SimpleLL<T> {

    private Node<T> head;
    private Node<T> tail;

    // This method instantiates the head and tail nodes
    public SimpleLL(T info) {
        head = tail = null;
    }

    // This method inserts a node into the end of the list
    public void insert(Node<T> tempNode) {
        // First case where head is null
        if (head == null) {
            head = tail = tempNode;
        } else {
            // Head is not null
            tail.nextLink = tempNode;
            tail = tail.nextLink;
        }
    }

    // This method inserts a node anywhere you want in the list, and pushes all
    // elements that come after it up one index
    public void insertAt(Node<T> tempNode, int index) {
        if (head == null) {
            head = tail = tempNode;
        } else if (index == 0) {
            tempNode.setNextLink(head);
            head = tempNode;
        } else {
            Node<T> currentNode = head;
            int currentIndex = 0;
            while (currentNode != null && currentIndex < index - 1) {
                currentNode = currentNode.getNextLink();
                currentIndex++;
            }
            if (currentNode != null) {
                tempNode.setNextLink(currentNode.getNextLink());
                currentNode.setNextLink(tempNode);
            } else {
                tail.setNextLink(tempNode);
                tail = tempNode;
            }
        }
    }

    // This method deletes a node anywhere you want in the list
    public Node<T> deleteAt(Node<T> tNode) {
        Node<T> deletedNode = null;
        if (head == tNode) {
            deletedNode = head;
            head = head.getNextLink();
            if (head == null) {
                tail = null;
            }
        } else {
            Node<T> currentNode = head;
            while (currentNode != null && currentNode.getNextLink() != tNode) {
                currentNode = currentNode.getNextLink();
            }
            if (currentNode != null && currentNode.getNextLink() != null) {
                deletedNode = currentNode.getNextLink();
                currentNode.setNextLink(deletedNode.getNextLink());
                if (deletedNode == tail) {
                    tail = currentNode;
                }
            }
        }
        return deletedNode;
    }

    // This method retrieves the data from any node in the list of your choosing
    public Node<T> getNodeAt(int index) {
        Node<T> current = head;
        int count = 0;
        while (current != null) {
            if (index == count) {
                return current;
            }
            current = current.nextLink;
            count++;
        }
        System.out.println("Error: Index out of bounds!");
        return null;
    }

    // This method prints out the data from all the nodes in the linked list
    public void printAll() {
        Node<T> current = head;
        while (current != null) {
            System.out.println(current.info);
            current = current.nextLink;
        }
    }

}
