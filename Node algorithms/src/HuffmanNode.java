
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
      switch(number){
        case "0":
          if(currentNode.left == null){
            System.out.print(currentNode.data);
            currentNode = root;
          }
          currentNode = currentNode.left;
          break;

        case "1":
          if(currentNode.right == null){
            System.out.print(currentNode.data);
            currentNode = root;
          }
          currentNode = currentNode.right;
          break;
      }
    }
    System.out.println(currentNode.data);
  }
}


