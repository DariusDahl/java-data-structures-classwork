/**
 * COSC 2100 – Fall 2023
 * Assignment #4 
 * This class implements a queue using a linked list. This class enqueues elements to the queue based on if they
 * are "special" or "normal" elements. This class also writes the queue to a string using the toString method.
 * This class also splits the queue into two smaller queues if the conditions are met.
 * @edited by Darius Dahl
 */

package Homework_4;

public class LinkedSpecialQueue {
	protected LLNode<Integer> front; // reference to the front of this queue
	protected LLNode<Integer> rear; // reference to the rear of this queue
	protected int numElements = 0; // number of elements in this queue
	protected int numSpecial = 0; // number of special elements in this queue

	// Linked list to store the special elements
	protected LLNode<Integer> specialElementsFront;
	protected LLNode<Integer> specialElementsRear;

	public LinkedSpecialQueue() {
		front = null;
		rear = null;
		specialElementsFront = null;
		specialElementsRear = null;
	}

	public int size() {
		// Returns the number of elements in this queue.
		return numElements;
	}

	public int sizeSpecial() {
		// Returns the number of "special" elements in this queue.
		return numSpecial;
	}

	public void enqueue(int element) {
		LLNode<Integer> newNode = new LLNode<>(element);

		if (element > 10 && element < 65) {
			// Regular element
			if (rear == null) {
				front = rear = newNode;
			} else {
				rear.setLink(newNode);
				rear = newNode;
			}
		} else {
			// Special element
			if (specialElementsFront == null) {
				specialElementsFront = specialElementsRear = newNode;
			} else {
				specialElementsRear.setLink(newNode);
				specialElementsRear = newNode;
			}
			numSpecial++;
		}

		numElements++;
	}

	@Override
	public String toString() {
		// TODO (2) Implement this method to return the nicely formatted
		// String representation of the object
		StringBuilder stringBuilder = new StringBuilder();

		// Add the special elements to the string
		LLNode<Integer> current = specialElementsFront;
		while (current != null) {
			stringBuilder.append(current.getInfo()).append(" --> ");
			current = current.getLink();
		}

		// Add the regular elements to the string
		current = front;
		while (current != null) {
			stringBuilder.append(current.getInfo()).append(" --> ");
			current = current.getLink();
		}

		return stringBuilder.toString();
	}

	public LinkedSpecialQueue[] split() {
		// TODO (3) Implement this method to split the queue into two
		// queues and return the array containing two smaller queues.
		LinkedSpecialQueue[] queues = new LinkedSpecialQueue[2];
		queues[0] = new LinkedSpecialQueue();
		queues[1] = new LinkedSpecialQueue();

		// Split the special elements
		LLNode<Integer> current = specialElementsFront;
		int i = 0;
		while (current != null) {
			queues[i].enqueue(current.getInfo());
			current = current.getLink();
			i = (i + 1) % 2;
		}

		// Split the regular elements
		current = front;
		while (current != null) {
			queues[i].enqueue(current.getInfo());
			current = current.getLink();
			i = (i + 1) % 2;
		}

		return queues;
	}
}
