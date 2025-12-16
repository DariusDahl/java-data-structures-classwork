package Queue;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws QueueOverflowException, QueueUnderflowException {
    // Create a new array-bounded queue with a capacity of 10 elements.
    ArrayBoundedQueue<Integer> queue = new ArrayBoundedQueue<>(10);

    // Create a new Scanner object to read input from the user.
    Scanner scanner = new Scanner(System.in);

    // Display a prompt to the user.
    System.out.println("Enter a command: (enqueue, dequeue, isEmpty, isFull, quit)");

    // Read the user's input.
    String command = scanner.nextLine().toLowerCase();

    // While the user does not enter the "quit" command, keep processing commands.
    while (!command.equals("quit")) {
      switch (command) {
        case "enqueue":
          // Prompt the user to enter an element to enqueue.
          System.out.print("Enter an element to enqueue: ");

          // Read the element from the user.
          int element = scanner.nextInt();
          scanner.nextLine(); // Consume the newline character

          // Enqueue the element into the queue.
          queue.enqueue(element);

          break;
        case "dequeue":
          // Dequeue an element from the queue.
          int dequeuedElement = queue.dequeue();

          // Display the dequeued element to the user.
          System.out.println("Dequeued element: " + dequeuedElement);

          break;
        case "isempty":
          // Check if the queue is empty.
          boolean isEmpty = queue.isEmpty();

          // Display the result to the user.
          System.out.println("Is the queue empty? " + isEmpty);

          break;
        case "isfull":
          // Check if the queue is full.
          boolean isFull = queue.isFull();

          // Display the result to the user.
          System.out.println("Is the queue full? " + isFull);

          break;
        default:
          // Display an error message to the user.
          System.out.println("Invalid command.");
      }

      // Prompt the user to enter the next command.
      System.out.println("Enter a command: (enqueue, dequeue, isEmpty, isFull, quit)");

      // Read the next command from the user.
      command = scanner.nextLine().toLowerCase();
    }

    // Close the Scanner object.
    scanner.close();
  }
}