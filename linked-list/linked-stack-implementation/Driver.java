package Homework_3;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Prompt the user for the number of elements in the stack.
        System.out.print("Enter the number of elements in the stack: ");
        int numElements = input.nextInt();

        // Create a new linked stack.
        NewLinkedStack<Integer> stack = new NewLinkedStack<>();

        // Fill the stack with randomly generated integers.
        for (int i = 0; i < numElements; i++) {
            stack.push((int) (Math.random() * 100));
        }

        // Display the contents of the stack.
        System.out.println("Initial stack contents: " + stack.toString());

        // Compare the topmost element with the bottom most element of the stack and
        // remove the smaller element.
        while (stack.size() > 1) {
            int topElement = stack.top();
            int bottomElement = stack.bottom();

            if (topElement > bottomElement) {
                stack.popFromBottom();
            } else {
                stack.pop();
            }
            System.out.println("Stack contents after removing an element: " + stack.toString());
        }

        // Display the largest element in the stack.
        int largestElement = stack.top();
        System.out.println("The largest element in the stack is: " + largestElement);
        input.close();
    }
}
