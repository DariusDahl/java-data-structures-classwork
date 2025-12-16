/**
 *  COSC2100 - Fall Semester 2023
 *  Worksheet #2 - Node.java
 *  This program will create a node that takes in any type of object and manipulate the node.
 *  @author - Darius Dahl
 */

package Worksheet_2;

public class Node<T> {

    protected T info;
    protected Node<T> nextLink;

    // Construct the node
    public Node(T info) {
        this.info = info;
        this.nextLink = null;
    }

    // Get the object data for the node
    public T getInfo() {
        return info;
    }

    // Set the object data for the node
    public void setInfo(T info) {
        this.info = info;
    }

    // Get the next link for the linked lsit
    public Node<T> getNextLink() {
        return nextLink;
    }

    // Set the next link for the linked lsit
    public void setNextLink(Node<T> nextLink) {
        this.nextLink = nextLink;
    }
}
