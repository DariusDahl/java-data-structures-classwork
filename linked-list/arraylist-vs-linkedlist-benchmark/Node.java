package Worksheet_4;

public class Node<T> {
	protected T info;
	protected Node<T> next;
	
	public Node(T tempInfo) {
		this.info = tempInfo;
		this.next = null;
	}	
}
