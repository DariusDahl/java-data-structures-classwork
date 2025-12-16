package Queue;

public class QueueUnderflowException extends Exception {
	// Exception thrown when a queue is underflow.
	// Should be the same as StackUnderflowException.

	public QueueUnderflowException() {
		super();
	}

	public QueueUnderflowException(String message) {
		super(message);
	}
}
