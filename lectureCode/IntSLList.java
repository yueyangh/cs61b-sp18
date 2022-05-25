/** An SLList is a list of integers */
public class IntSLList {

  private static class IntNode {
    private int item;
    private IntNode next;
    private IntNode(int i, IntNode n) {
      item = i;
      next = n;
    }
  }

  private IntNode first;

  /** Create an empty SLList */
  public IntSLList() {
    first = null;
  }

  /** Create a SLList with one integer */
  public IntSLList(int x) {
    first = new IntNode(x, null);
  }

  /** Adds x to the front of the list. */
  public void addFirst(int x){
    first = new IntNode(x, first);
  }

  /** Returns the first item in the list */
  public int getFirst() {
    if (first == null) {
      return 0;
    }
    return first.item;
   }

   /** Adds x to the last of the list without recursion. */
   public void addLast(int x) {
     if (first == null) {
       first = new IntNode(x, first);
       return;
     }
     IntNode p = first;
      while (p.next != null) {
         p = p.next;
      }
      p.next = new IntNode(x, null);
   }

   /** Returns the size of the list that starts at IntNode p. */
   private static int size(IntNode p) {
     if (p.next == null) {
       return 1;
     }
     return 1 + size(p.next);
   }
   /** Return the size of the list using recursion */
   public int size() {
     if (first == null) {
       return 0;
     }
     return size(first);
   }

   public String toString() {
     String s = "";
     IntNode p = first;
     while (p != null) {
       s = s + p.item + " ";
       p = p.next;
     }
     return s;
   }

   public static void main(String[] args) {
     IntSLList L = new IntSLList(15);
     L.addFirst(10);
     L.addFirst(5);
     System.out.println("Size of the list: " + L.size());
     System.out.println("List is: " + L);
   }
}
