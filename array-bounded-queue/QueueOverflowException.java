package Queue;

public class QueueOverflowException extends Exception {
	// Exception thrown when a queue is overflow.
	// Should be the same as StackOverflowException.

	public QueueOverflowException() {
		super();
	}

	public QueueOverflowException(String message) {
		super(message);
	}
}
