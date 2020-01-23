public class Node
{
  int data;
  Node nextNode = null;

  public Node(int data)
  {
    this.data = data;
  }

  public void printData()
  {
    System.out.println("Value of current Node: " + data);
  }
}