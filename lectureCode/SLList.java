/** A genertic list of items */
public class SLList<Type> {

  private class Node {
    public Type item;
    public Node next;

    public Node(Type i, Node n) {
      item = i;
      next = n;
    }
  }

  /** The first item (if it exists) is at sentinel.next. */
  private Node sentinel;
  private int size;

  /** Create an empty SLList */
  public SLList() {
    sentinel = new Node(null, null);
    size = 0;
  }

  /** Create a list with one item */
  public SLList(Type x) {
    sentinel = new Node(null, null);
    sentinel.next = new Node(x, null);
    size = 1;
  }

  /** Add x to the front of the list */
  public void addFirst(Type x) {
    sentinel.next = new Node(x, sentinel.next);
    size += 1;
  }

  /** Return the first item in the list
      PRE: the list at least has one item */
  public Type getFirst() {
    return sentinel.next.item;
  }

  /** Add an item to the end of the list */
  public void addLast(Type x){
    size += 1;
    Node p = sentinel;
    // Advance p to the end of the list
    while (p.next != null) {
      p = p.next;
    }
    p.next = new Node(x, null);
  }

  /** Return the size of the list */
  public int size() {
    return size;
  }

  public String toString() {
    String s = "";
    Node p = sentinel.next;
    while (p != null) {
      s = s + p.item.toString() + " ";
      p = p.next;
    }
    return s;
  }

  public static void main(String[] args) {
    SLList<String> stringList = new SLList<>("an");
    stringList.addFirst("Eat");
    stringList.addLast("apple");
    System.out.println("Size of the list: " + stringList.size());
    System.out.println("List is: " + stringList);
  }
}
