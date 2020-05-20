package by.academy.lesson10;

public class LinkedLlist<E> {

    Node<E> currend;
    Node<E> head;
    Node<E> tail;

  class Node <E>{

      Node prev;
      Node next;
      E val;

      public Node(Node prev, Node next, E val) {
          this.prev = prev;
          this.next = next;
          this.val = val;
      }
  }


}
