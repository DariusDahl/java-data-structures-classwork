/**
 * COSC 2100 – Fall’23
 * Assignment#3
 * This program implements <T> nodes for a Linked List.
 * @author Darius Dahl
 */

//----------------------------------------------------------------------------
// LLNode.java                by Dale/Joyce/Weems                    Chapter 2
//
// Implements <T> nodes for a Linked List.
//----------------------------------------------------------------------------
package Homework_3;

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
