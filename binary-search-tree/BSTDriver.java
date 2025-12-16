/**
 * COSC 2100 – Fall 2023
 * Assignment#5
 * This is the main/driver file that is used to test the BST methods that are implemented.
 * @author Darius Dahl
 */

package Homework_5;

public class Main {
    public static void main(String[] args) {
        BST<String> tree = new BST<>();

        tree.add("4"); // D = 4
        tree.add("2"); // B = 2
        tree.add("5"); // F = 5
        tree.add("1"); // A = 1
        tree.add("3"); // C = 3
        tree.add("6"); // G = 6

        System.out.println("Print leaf nodes:");
        tree.printLeafNodes();

        System.out.println("\n\nNumber of interior nodes:");
        System.out.println(tree.countInterior());

        System.out.println("\nRoot successor:");
        tree.getRootSuccessor();

        System.out.println("\nFull binary tree(true/false):");
        System.out.println(tree.isFullBinaryTree());

        System.out.println("\nBalanced binary tree(true/false):");
        System.out.println(tree.isBalanced());
    }
}
