public class DoublyLinkedList
{
  private Node firstNode;
  private Node lastNode;

  public DoublyLinkedList()
  {
    this.firstNode = null;
    this.lastNode = null;
  }

  public void insertFirstNode(int data)
  {
    Node newNode = new Node(data);
    if(firstNode == null)
    {
      firstNode = newNode;
      lastNode = firstNode;
      return;
    }

    newNode.nextNode = firstNode;
    firstNode.previousNode = newNode;
    firstNode = newNode;
  }

  public void insertLastNode(int data)
  {
    Node newNode = new Node(data);
    if(firstNode == null)
    {
      firstNode = newNode;
      lastNode = firstNode;
      return;
    }
    newNode.previousNode = lastNode;
    lastNode.nextNode = newNode;
    lastNode = newNode;
  }

  public void deleteFirstNode()
  {
    if(firstNode == null)
      return;

    firstNode = firstNode.nextNode;
    firstNode.previousNode = null;
  }

  public void deleteLastNode()
  {
    if(lastNode == null)
      return;

    lastNode = lastNode.previousNode;
    lastNode.nextNode = null;
  }

  public void insertAfter(final int key, final int data)
  {
    if(firstNode == null)
      return;

    Node newNode = new Node(data);
    Node currentNode = firstNode; 
    while(currentNode.data != key)
    {
      currentNode = currentNode.nextNode;
      if(currentNode == null)
        return;
    }

    // 4 variables to set:
    // 1- the next node of the one where to be inserted
    // 2 3- the next and the previous one of the new node
    // 4- the previous of the node displaced
    Node tempNode = currentNode.nextNode;
    currentNode.nextNode = newNode;
    newNode.previousNode = currentNode;
    if(currentNode == lastNode)
    {
      lastNode = newNode;
    }
    else
    {
      newNode.nextNode = tempNode;
      tempNode.previousNode = newNode;
    }
  }

  public void deleteKey(final int key)
  {
    if(firstNode == null)
      return;

    Node currentNode = firstNode;
    while(currentNode.data != key)
    {
      currentNode = currentNode.nextNode;
      if(currentNode == null)
        return;
    }

    if(currentNode == firstNode)
    {
      firstNode = currentNode.nextNode;
      firstNode.previousNode = null;
      currentNode = null;
      return;
    }

    if(currentNode == lastNode)
    {
      lastNode = currentNode.previousNode;
      lastNode.nextNode = null;
      currentNode = null;
      return;
    }

    currentNode.previousNode.nextNode = currentNode.nextNode;
    currentNode.nextNode.previousNode = currentNode.previousNode;
    currentNode.nextNode = null;
    currentNode.previousNode = null;
    currentNode = null;
  }

  public void printFirstToLastNodes() {
    Node currentNode = firstNode;
    int size = 0;
    while (currentNode != null) {
      currentNode.printData();
      currentNode = currentNode.nextNode;
      size++;
    }
    System.out.println("Size of linkedList: " + size);
  }

public void printlastToFirst() {
    Node currentNode = lastNode;
    int size = 0;
    while (currentNode != null) {
      currentNode.printData();
      currentNode = currentNode.previousNode;
      size++;
    }
    System.out.println("Size of linkedList: " + size);
  }

  
}