public class Stack {
  private int size;
  private long[] stack;
  private int pointer;

  public Stack(final int size) {
    this.size = size;
    stack = new long[size];
    pointer = -1;
  }

  public void push(final long value) {
    if (isFull()) {
      System.out.println("Failed to add new element. Stack is full.");
      return;
    }
    pointer++;
    stack[pointer] = value;
  }

  public long pop() {
    if (isEmpty()) {
      System.out.println("Stack is empty.");
      return -1;
    }

    long value = stack[pointer];
    pointer--;
    return value;
  }

  public long peek() {
    if (isEmpty()) {
      System.out.println("Stack is empty.");
      return -1;
    }

    return stack[pointer];
  }

  public boolean isEmpty() {
    return pointer == -1;
  }

  public boolean isFull() {
    return pointer == (size - 1);
  }
}