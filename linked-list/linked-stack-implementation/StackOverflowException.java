/**
 * COSC 2100 – Fall’23
 * Assignment#3
 * This program throws an overflow exception for when the stack is full.
 * @author Darius Dahl
 */

package Homework_3;

public class StackOverflowException extends RuntimeException {
  public StackOverflowException() {
    super();
  }

  public StackOverflowException(String message) {
    super(message);
  }
}