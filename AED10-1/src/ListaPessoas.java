public class ListaPessoas {
  Node head, tail;

  ListaPessoas(){}

  ListaPessoas(Node head, Node tail) {
    this.head = head;
    this.tail = tail;
  }

  @Override
  public String toString() {
    int index = 0;
    Node current = this.head;

    while (current != null) {
      index ++;
      current = current.next;
    }

    return "" + index;
  }
}
