//package net.progeny.tree;

public class Node {
  private Node leftNode;
  private Node rightNode;
  private Node padre;
  private int value;

  /**
   * Node constructor with initial Node value
   *
   * @param value Initial value for this node
   */
  public Node(int value) {
    leftNode = null;
    rightNode = null;
    this.value = value;
  }

  /**
   * Set left node pointer for this Node
   *
   * @param node Left node for this Node
   */
  public void setLeftNode(Node node){
    this.leftNode = node; 
  }
  /**
   * Set right node pointer for this Node
   *
   * @param node Right node for this Node
   */
  public void setRightNode(Node node){
    this.rightNode = node; 
  }
  /**
   * Set value for this Node
   *
   * @param value Value for this Node
   */
  public void setValue(int value){
    this.value = value;
  }

  /**
   * @return Left node for this Node
   */
  public Node getLeftNode() {
    return leftNode;
  }
  /**
   * @return Right node for this Node
   */
  public Node getRightNode() {
    return rightNode;
  }
  /**
   * @return Current value for this Node
   */
  public int getValue() {
    return value;
  }
  /**
  * Establece el nodo que representa el padre de 
  * este nodo.
  * 
  * @param pa El nuevo padre.
  */
  public void ponPadre(Node pa){
    padre = pa;
  }

  /**
   * @return String representation of this Node
   */
  @Override
    public String toString() {
      String result = value + "";
      if (leftNode  != null) result = leftNode.toString() + "-" + result;
      if (rightNode != null) result = result + "-" + rightNode.toString();
      return result;
    }
}
