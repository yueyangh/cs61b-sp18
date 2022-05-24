public class IntList {
   public int first;
   public IntList rest;

   public IntList(int f, IntList r) {
      first = f;
      rest = r;
   }

   /** Return the size of the list using recursion
       PRE: at least one item in list */
   public int size() {
      if (rest == null) {
         return 1;
      }
      return 1 + this.rest.size();
   }

   /** Return the size of the list using no recursion
       PRE: list can be null */
   public int iterativeSize() {
      int totalSize = 0;
      IntList p = this;
      while (p != null) {
         totalSize += 1;
         p = p.rest;
      }
      return totalSize;
   }

   /** Returns the ith item in the list
       Assumes the item exist
       this.get(1) is this.rest.get(0)
       "my value of 1 is my neighbor's value of 0" */
   public int get(int i) {
      if (i == 0) {
         return first;
      }
      return rest.get(i-1);
   }

   public static void main(String[] args) {
      IntList L = new IntList(15, null);
      L = new IntList(10, L);
      L = new IntList(5, L)

      System.out.println(L.size());
   }

   // Returns an IntList identical to L, but with all values incremented by x
   // Values in L cannot change (i.e., return a new IntList)
   public static IntList incrList(IntList L, int x) {
     if (L == null) {
       return null;
     }
     IntList Q = incrList(L.rest, x);
     return new IntList(L.first + x, Q);
   }

   // Returns an IntList identical to L, but with all values incremented by x
   // Not allowed to use 'new' (i.e., return L itself)
   public static IntList dincrList(IntList L, int x) {
     if (L == null) {
       return null;
     }
     L.first += x;
     L.rest = dincrList(L.rest, x);

     return L;
}
