
import java.util.*;

abstract class Node implements Comparable<Node> {
  public  int frequency; // the frequency of this tree
  public  char data;
  public  Node left, right;
  public Node(int freq) {
    frequency = freq;
  }

  // compares on the frequency
  public int compareTo(Node tree) {
    return frequency - tree.frequency;
  }
}

class HuffmanLeaf extends Node {


  public HuffmanLeaf(int freq, char val) {
    super(freq);
    data = val;
  }
}

class HuffmanNode extends Node {

  public HuffmanNode(Node l, Node r) {
    super(l.frequency + r.frequency);
    left = l;
    right = r;
  }

}


class Decoding {


  void decode(String s, Node root) {

    Node currentNode = root;
    for(String number : s.split("")){
      if(number.equals("0")) {
        if(currentNode.left != null) {
          currentNode = currentNode.left;
        }
        else {
          System.out.print(currentNode.data);
          currentNode = root.left;
        }
      }
      else {
        if(currentNode.right != null) {
          currentNode = currentNode.right;
        }
        else {
          System.out.print(currentNode.data);
          currentNode = root.right;
        }
      }
    }
    System.out.print(currentNode.data);

  }
}


