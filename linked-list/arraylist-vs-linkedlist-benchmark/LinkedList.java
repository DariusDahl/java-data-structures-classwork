package Worksheet_4;

public class Linked_List<T> {
	
	protected Node<T> head;
	protected Node<T> tail;
	
	public Linked_List() {
		head = tail = null;
	}
	
	public void addNode(Node<T> tempNode) {
		// First case where head is null
		if (head == null) {
			head = tempNode;
			tail = head;
		}
		else {
			// Head is not null
			tail.next = tempNode;
			tail = tail.next;
		}
	}
		
	public Node<T> getNodeAt(int index) {
		Node<T> current = head;
		int count = 0;
		while (current != null) {
			if (index == count) {
				return current;
			}
			current = current.next;
			count++;
		}
		System.out.println("Error: Index out of bounds!");
		return null;
	}
	
	public void printAll() {
		Node<T> current = head;
		while (current != null) {
			System.out.println(current.info);
			current = current.next;
		}
	}
}

