/**
 * COSC 2100 – Fall 2023
 * Assignment#5
 * This is the interface method that is used to implement the BST methods in the BST class.
 * @author Darius Dahl
 */

package Homework_5;

//----------------------------------------------------------------------------
//BSTInterface.java            by Dale/Joyce/Weems                  Chapter 7
//
//Interface for a class that implements a binary search tree (BST).
//
//The trees are unbounded and allow duplicate elements, but do not allow null
//elements. As a general precondition, null elements are not passed as 
//arguments to any of the methods.
//
//----------------------------------------------------------------------------

public interface BSTInterface<T extends Comparable<T>> {
    boolean isEmpty();
    // Returns true if this BST is empty; otherwise, returns false.

    int size();
    // Returns the number of elements in this BST.

    boolean contains(T element);
    // Returns true if this BST contains an element e such that
    // e.compareTo(element) == 0; otherwise, returns false.

    boolean remove(T element);
    // Removes an element e from this BST such that e.compareTo(element) == 0
    // and returns true; if no such element exists, returns false.

    T get(T element);
    // Returns an element e from this BST such that e.compareTo(element) == 0;
    // if no such element exists, returns null.

    void add(T element);
    // Adds element to this BST. The tree retains its BST property.
}