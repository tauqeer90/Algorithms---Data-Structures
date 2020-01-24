public class SinglyLinkedList {
  private Node firstNode = null;

  public SinglyLinkedList() {
  }

  public void insertFirstNode(int data) {
    if (firstNode == null) {
      firstNode = new Node(data);
      return;
    }
    
    Node tempNode = new Node(data);
    tempNode.nextNode = firstNode;
    firstNode = tempNode;
  }

  public void insertFirstNode(Node node) {
    if (firstNode == null) {
      firstNode = node;
      return;
    }

    Node oldFirstNode = firstNode;
    firstNode = node;
    Node currentNode = firstNode;
    while (currentNode.nextNode != null) {
      currentNode = currentNode.nextNode;
    }

    currentNode.nextNode = oldFirstNode;
  }

  public void insertLastNode(int data) {
    if (firstNode == null) {
      firstNode = new Node(data);
      return;
    }

    Node currentNode = firstNode;
    while (currentNode.nextNode != null) {
      currentNode = currentNode.nextNode;
    }
    currentNode.nextNode = new Node(data);
  }

  public void deleteFirstNode() {
    if (firstNode == null) {
      return;
    }
    firstNode = firstNode.nextNode;
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
}