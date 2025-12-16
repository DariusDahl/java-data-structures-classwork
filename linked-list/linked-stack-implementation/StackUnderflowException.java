/**
 * COSC 2100 – Fall’23
 * Assignment#3
 * This program throws an exception for when the stack is empty.
 * @author Darius Dahl
 */

package Homework_3;

public class StackUnderflowException extends RuntimeException {
  public StackUnderflowException() {
    super();
  }

  public StackUnderflowException(String message) {
    super(message);
  }
}