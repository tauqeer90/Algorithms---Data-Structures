public class GenericQueue<T>
{
  private T[] queueArray;
  private int pushPointer = -1;
  private int popPointer = -1;
  private int objNum = 0;

  public GenericQueue(int size)
  {
    queueArray = (T[]) new Object[size];
  }

  public boolean isFull()
  {
    return objNum == queueArray.length;
  }

  public boolean isEmpty()
  {
    return objNum == 0;
  }

  public void push(T obj)
  {
    if(isFull())
      throw new ArrayIndexOutOfBoundsException("Queue is full.");

    pushPointer++;
    objNum++;
    queueArray[pushPointer] = obj;

    // Resetting the pointer if end of arr is reached because there can be new empty spaces at the start.
    if(pushPointer == queueArray.length -1)
      pushPointer = 0;
  }

  public T pop()
  {
    if(isEmpty())
      throw new IllegalStateException("Queue is empty.");

    popPointer++;
    objNum--;
    T result = queueArray[popPointer];

    // Resetting the counter because there can be new elements at the start.
    if(popPointer == queueArray.length -1)
      popPointer = 0;

    return result;
  }

  public T peek()
  {
  if(isEmpty())
    throw new IllegalStateException("Queue is empty.");
  
  return queueArray[popPointer];
  }

  // A tip for circular queue implementation
  public void circularPush(T obj)
  {
    pushPointer++;
    objNum++;
    if(pushPointer == queueArray.length)
    {
      pushPointer = 0;
      objNum--;
    }
    queueArray[pushPointer] = obj;
  }
}