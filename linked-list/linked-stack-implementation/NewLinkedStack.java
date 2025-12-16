/**
 * COSC 2100 – Fall’23
 * Assignment#3
 * Implements StackInterface using a linked list to hold the elements.
 * @author Darius Dahl
 */

//----------------------------------------------------------------------
// NewLinkedStack.java         by Dale/Joyce/Weems                Chapter 2
//
// Implements StackInterface using a linked list to hold the elements.
//-----------------------------------------------------------------------

package Homework_3;

public class NewLinkedStack<T> implements NewStackInterface<T> {
	protected LLNode<T> top; // reference to the top of this stack

	public NewLinkedStack() {
		top = null;
	}

	public void push(T element)
	// Places element at the top of this stack.
	{
		if (isFull())
			throw new StackOverflowException("Push attempted on a full stack.");

		LLNode<T> newNode = new LLNode<T>(element);
		newNode.setLink(top);
		top = newNode;
	}

	public void pop()
	// Throws StackUnderflowException if this stack is empty,
	// otherwise removes top element from this stack.
	{
		if (isEmpty())
			throw new StackUnderflowException("Pop attempted on an empty stack.");
		else
			top = top.getLink();
	}

	public T top()
	// Throws StackUnderflowException if this stack is empty,
	// otherwise returns top element of this stack.
	{
		if (isEmpty())
			throw new StackUnderflowException("Top attempted on an empty stack.");
		else
			return top.getInfo();
	}

	public boolean isEmpty()
	// Returns true if this stack is empty, otherwise returns false.
	{
		return (top == null);
	}

	public boolean isFull()
	// Returns false - a linked stack is never full
	{
		return false;
	}

	@Override
	public void popFromBottom() throws StackUnderflowException {
		if (isEmpty()) {
			throw new StackUnderflowException("Pop the bottom element attempted on an empty stack.");
		}
		// Iterate to the bottom of the stack.
		LLNode<T> currentNode = top;
		LLNode<T> previousNode = null;
		while (currentNode.getLink() != null) {
			previousNode = currentNode;
			currentNode = currentNode.getLink();
		}
		// Remove the bottom node from the stack.
		if (previousNode == null) {
			top = null;
		} else {
			previousNode.setLink(null);
		}
	}

	@Override
	public T bottom() throws StackUnderflowException {
		if (isEmpty()) {
			throw new StackUnderflowException("Bottom attempted on an empty stack.");
		}
		// Iterate to the bottom of the stack.
		LLNode<T> currentNode = top;
		while (currentNode.getLink() != null) {
			currentNode = currentNode.getLink();
		}
		return currentNode.getInfo();
	}

	@Override
	public String toString() {
		StringBuilder string = new StringBuilder("[");
		// Iterate over the stack and add each element to the string.
		LLNode<T> currentNode = top;
		while (currentNode != null) {
			string.append(currentNode.getInfo());
			if (currentNode.getLink() != null) {
				// Use a comma to separate the current node from the next node.
				string.append(", ");
			}
			currentNode = currentNode.getLink();
		}
		string.append("]");
		return string.toString();
	}

	@Override
	public int size() {
		int size = 0;
		// Iterate over the stack and count the number of elements.
		LLNode<T> currentNode = top;
		while (currentNode != null) {
			size++;
			currentNode = currentNode.getLink();
		}
		return size;
	}

}
