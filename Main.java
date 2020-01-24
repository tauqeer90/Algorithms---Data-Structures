class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    DoublyLinkedList linkedList = new DoublyLinkedList();
    linkedList.insertFirstNode(3);
    linkedList.insertFirstNode(2);
    linkedList.insertFirstNode(1);
    linkedList.insertLastNode(4);
    linkedList.insertFirstNode(0);
    linkedList.insertAfter(0, 15);
    linkedList.insertAfter(2, 20);
    linkedList.insertAfter(4, 40);
    linkedList.insertAfter(6, 60);
    linkedList.printFirstToLastNodes();
    linkedList.deleteKey(40);
    linkedList.deleteKey(3);
    linkedList.deleteKey(0);
    linkedList.deleteKey(10);
    linkedList.printFirstToLastNodes();
    
  }

  private static int getLinkedListLength(Node node) {
    int length = 0;
    while (node != null) {
      length++;
      node = node.nextNode;
    }
    return length;
  }

  private static String sameString(final String str) {
    GenericQueue queue = new GenericQueue<Character>(str.length());
    for (char c : str.toCharArray()) {
      queue.push(c);
    }
    String result = "";
    while (!queue.isEmpty()) {
      result += queue.pop();
    }
    return result;
  }

  private static String reverseString(final String str) {
    GenericStack stack = new GenericStack<Character>(str.length());
    for (char c : str.toCharArray()) {
      stack.push(c);
    }
    String result = "";
    while (!stack.isEmpty()) {
      result += stack.pop();
    }
    return result;
  }
}