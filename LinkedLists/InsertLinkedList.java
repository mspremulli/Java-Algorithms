package LinkedLists;

import java.io.BufferedWriter;
import java.io.IOException;

public class InsertLinkedList {
  static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
    SinglyLinkedListNode node = head;
    SinglyLinkedListNode tempHead = head.next;
    for (int i = 0; i < position - 1; i++) {
      node = node.next;
      tempHead = tempHead.next;
    }
    node.next = new SinglyLinkedListNode(data);

    while(tempHead != null){
      node = node.next;
      node.next = new SinglyLinkedListNode(tempHead.data);
      tempHead = tempHead.next;
    }

    return head;
  }

  static class SinglyLinkedListNode {
    public int data;
    public SinglyLinkedListNode next;

    public SinglyLinkedListNode(int nodeData) {
      this.data = nodeData;
      this.next = null;
    }
  }

  static class SinglyLinkedList {
    public SinglyLinkedListNode head;
    public SinglyLinkedListNode tail;

    public SinglyLinkedList() {
      this.head = null;
      this.tail = null;
    }

    public void insertNode(int nodeData) {
      SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

      if (this.head == null) {
        this.head = node;
      } else {
        this.tail.next = node;
      }

      this.tail = node;
    }
  }

  public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
    while (node != null) {
      bufferedWriter.write(String.valueOf(node.data));

      node = node.next;

      if (node != null) {
        bufferedWriter.write(sep);
      }
    }
  }


  public static void main(String[] args) {

  }

}
