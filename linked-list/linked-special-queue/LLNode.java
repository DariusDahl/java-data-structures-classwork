/**
 * COSC 2100 – Fall 2023
 * Assignment #4 
 * This class implements nodes to be created and manipulated.
 * @edited by Darius Dahl 
 */

//----------------------------------------------------------------------------
// LLNode.java                by Dale/Joyce/Weems                    Chapter 2
//
// Implements <T> nodes for a Linked List.
//----------------------------------------------------------------------------
package Homework_4;

public class LLNode<T> {
	protected LLNode<T> link;
	protected T info;
  
	public LLNode(T info) {
		this.info = info;
		link = null;
	}
 
	public void setInfo(T info) { 
		this.info = info;
	}
  
	public T getInfo() {
		return info; 
	}
	
	public void setLink(LLNode<T> link) {
		this.link = link;
	}
	
	public LLNode<T> getLink() {
		return link;
	}
}
 
 