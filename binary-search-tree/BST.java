/**
 * COSC 2100 – Fall 2023
 * Assignment#5
 * This file has the 5 methods and their helper/recursive methods implemented.
 * @author Darius Dahl
 */

package Homework_5;

//----------------------------------------------------------------------------
//BinarySearchTree.java          by Dale/Joyce/Weems                Chapter 7
//
//Defines all constructs for a reference-based BST
//----------------------------------------------------------------------------

public class BST<T extends Comparable<T>> implements BSTInterface<T> {
    protected BSTNode<T> root; // reference to the root of this BST

    boolean found; // used by remove

    public BST()
    // Creates an empty BST object.
    {
        root = null;
    }

    public boolean isEmpty()
    // Returns true if this BST is empty; otherwise, returns false.
    {
        return (root == null);
    }

    private int recSize(BSTNode<T> node)
    // Returns the number of elements in tree.
    {
        if (node == null)
            return 0;
        else
            return recSize(node.getLeft()) + recSize(node.getRight()) + 1;
    }

    public int size()
    // Returns the number of elements in this BST.
    {
        return recSize(root);
    }

    private boolean recContains(T element, BSTNode<T> node)
    // Returns true if tree contains an element e such that
    // e.compareTo(element) == 0; otherwise, returns false.
    {
        if (node == null)
            return false; // element is not found
        else if (element.compareTo(node.getInfo()) < 0)
            return recContains(element, node.getLeft()); // Search left subtree
        else if (element.compareTo(node.getInfo()) > 0)
            return recContains(element, node.getRight()); // Search right subtree
        else
            return true; // element is found
    }

    public boolean contains(T element)
    // Returns true if this BST contains an element e such that
    // e.compareTo(element) == 0; otherwise, returns false.
    {
        return recContains(element, root);
    }

    private T recGet(T element, BSTNode<T> node)
    // Returns an element e from tree such that e.compareTo(element) == 0;
    // if no such element exists, returns null.
    {
        if (node == null)
            return null; // element is not found
        else if (element.compareTo(node.getInfo()) < 0)
            return recGet(element, node.getLeft()); // get from left subtree
        else if (element.compareTo(node.getInfo()) > 0)
            return recGet(element, node.getRight()); // get from right subtree
        else
            return node.getInfo(); // element is found
    }

    public T get(T element)
    // Returns an element e from this BST such that e.compareTo(element) == 0;
    // if no such element exists, returns null.
    {
        return recGet(element, root);
    }

    private BSTNode<T> recAdd(T element, BSTNode<T> node)
    // Adds element to tree; tree retains its BST property.
    {
        if (node == null)
            // Addition place found
            node = new BSTNode<T>(element);
        else if (element.compareTo(node.getInfo()) <= 0)
            node.setLeft(recAdd(element, node.getLeft())); // Add in left subtree
        else
            node.setRight(recAdd(element, node.getRight())); // Add in right subtree
        return node;
    }

    public void add(T element)
    // Adds element to this BST. The tree retains its BST property.
    {
        root = recAdd(element, root);
    }

    private T getPredecessor(BSTNode<T> node)
    // Returns the information held in the rightmost node in tree
    {
        while (node.getRight() != null)
            node = node.getRight();
        return node.getInfo();
    }

    private BSTNode<T> removeNode(BSTNode<T> node)
    // Removes the information at the node referenced by tree.
    // The user's data in the node referenced by tree is no
    // longer in the tree. If tree is a leaf node or has only
    // a non-null child pointer, the node pointed to by tree is
    // removed; otherwise, the user's data is replaced by its
    // logical predecessor and the predecessor's node is removed.
    {
        T data;
        if (node.getLeft() == null)
            return node.getRight();
        else if (node.getRight() == null)
            return node.getLeft();
        else {
            data = getPredecessor(node.getLeft());
            node.setInfo(data);
            node.setLeft(recRemove(data, node.getLeft()));
            return node;
        }
    }

    private BSTNode<T> recRemove(T element, BSTNode<T> node)
    // Removes an element e from tree such that e.compareTo(element) == 0
    // and returns true; if no such element exists, returns false.
    {
        if (node == null)
            found = false;
        else if (element.compareTo(node.getInfo()) < 0)
            node.setLeft(recRemove(element, node.getLeft()));
        else if (element.compareTo(node.getInfo()) > 0)
            node.setRight(recRemove(element, node.getRight()));
        else {
            node = removeNode(node);
            found = true;
        }
        return node;
    }

    public boolean remove(T element)
    // Removes an element e from this BST such that e.compareTo(element) == 0
    // and returns true; if no such element exists, returns false.
    {
        root = recRemove(element, root);
        return found;
    }

    // Preorder traversal
    public void preorder() {
        System.out.println("\nPreorder Traversal: ");
        if (root == null)
            System.out.println("Tree is empty");
        else {
            recPreorder(root);
        }
    }

    private void recPreorder(BSTNode<T> node) {
        if (node != null) {
            System.out.print(node.getInfo() + " ");
            recPreorder(node.getLeft());
            recPreorder(node.getRight());
        }
    }

    // Inorder traversal
    public void inorder() {
        System.out.println("\nInorder Traversal: ");
        if (root == null)
            System.out.println("Tree is empty");
        else {
            recInorder(root);
        }
    }

    private void recInorder(BSTNode<T> node) {
        if (node != null) {
            recInorder(node.getLeft());
            System.out.print(node.getInfo() + " ");
            recInorder(node.getRight());
        }
    }

    // Postorder traversal
    public void postorder() {
        System.out.println("\nPostorder Traversal: ");
        if (root == null)
            System.out.println("Tree is empty");
        else {
            recPostorder(root);
        }
    }

    private void recPostorder(BSTNode<T> node) {
        if (node != null) {
            recPostorder(node.getLeft());
            recPostorder(node.getRight());
            System.out.print(node.getInfo() + " ");
        }
    }

    public void printLeafNodes() {
        if (root == null) {
            System.out.println("Tree is empty");
            return;
        }

        recPrintLeafNodes(root);
    }

    private void recPrintLeafNodes(BSTNode<T> node) {
        if (node == null) {
            return;
        }

        if (node.getLeft() == null && node.getRight() == null) {
            System.out.print(node.getInfo() + " ");
            return;
        }

        recPrintLeafNodes(node.getLeft());
        recPrintLeafNodes(node.getRight());
    }

    public int countInterior() {
        if (root == null) {
            return 0;
        }

        return recCountInterior(root);
    }

    private int recCountInterior(BSTNode<T> node) {
        if (node == null) {
            return 0;
        }

        if (node.getLeft() == null && node.getRight() == null) {
            return 0;
        }

        return 1 + recCountInterior(node.getLeft()) + recCountInterior(node.getRight());
    }

    public void getRootSuccessor() {
        if (root == null) {
            System.out.println("Tree is empty");
            return;
        }

        BSTNode<T> successor = root.getRight();
        if (successor == null) {
            System.out.println("Root does not have a successor");
            return;
        }

        while (successor.getLeft() != null) {
            successor = successor.getLeft();
        }

        System.out.println("Successor of root: " + successor.getInfo());
    }

    public boolean isFullBinaryTree() {
        if (root == null) {
            return true;
        } else {
            return recIsFullBinaryTree(root);
        }
    }

    private boolean recIsFullBinaryTree(BSTNode<T> node) {
        if (node.getLeft() == null && node.getRight() == null) {
            return true;
        } else if (node.getLeft() != null && node.getRight() != null) {
            return recIsFullBinaryTree(node.getLeft()) && recIsFullBinaryTree(node.getRight());
        } else {
            return false;
        }
    }

    public boolean isBalanced() {
        if (root == null) {
            return true;
        }

        return recIsBalanced(root) != -1;
    }

    private int recIsBalanced(BSTNode<T> node) {
        if (node == null) {
            return 0;
        }

        int leftHeight = recIsBalanced(node.getLeft());
        if (leftHeight == -1) {
            return -1;
        }

        int rightHeight = recIsBalanced(node.getRight());
        if (rightHeight == -1) {
            return -1;
        }

        int heightDifference = leftHeight - rightHeight;
        if (Math.abs(heightDifference) > 1) {
            return -1;
        }

        return Math.max(leftHeight, rightHeight) + 1;
    }

}