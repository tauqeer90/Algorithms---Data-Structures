public class GenericStack<T> {
  private T[] stack;
  private int size;
  private int pointer;

  GenericStack(final int size) {
    this.size = size;
    stack = (T[]) new Object[size];
    pointer = -1;
  }

  public void push(final T value) {
    if (isFull()) {
      System.out.println("Stack is full.");
      return;
    }
    pointer++;
    stack[pointer] = value;
  }

  public T pop() {
    if (isEmpty()) {
      throw new ArrayIndexOutOfBoundsException("Stack is empty");
    }
    T value = stack[pointer];
    pointer--;
    return value;
  }

  public boolean isEmpty() {
    return pointer < 0;
  }

  public boolean isFull() {
    return pointer == (size - 1);
  }

  public T peek() {
    if (isEmpty()) {
      throw new ArrayIndexOutOfBoundsException("Stack is empty");
    }
    return stack[pointer];
  }
}