/** Array-based list of integers */
public class IntAList {
  private int[] items;
  private int size;

  public IntAList() {
    items = new int[100];
    size = 0;
  }

  private void resize(int capacity) {
    int[] a = new int[capacity];
    System.arrarycopy(items, 0, a, 0, size);
    items = a;
  }

  public void addLast(int x) {
    if (size == items.length) {
      resize(size * RFACTOR);
    }
    items[size] = x;
    size += 1;
  }

  public int removeLast() {
    int returnItem = getLast();
    items[size - 1] = 0;
    size -= 1;
    return returnItem;
  }

  public int getLast() {
    return items[size - 1];
  }

  public int get(int i) {
    return items[i];
  }

  public int size() {
    return size;
  }
}
