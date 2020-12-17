package Graphs;

import java.util.ArrayList;

class GraphNode {
  ArrayList<GraphNode> connectedNodes;
  long id;

  public GraphNode(long id) {
    connectedNodes = new ArrayList<>();
    this.id = id;
  }
}


public class NearestClone {

  /*
   * For the unweighted graph, <name>:
   *
   * 1. The number of nodes is <name>Nodes.
   * 2. The number of edges is <name>Edges.
   * 3. An edge exists between <name>From[i] to <name>To[i].
   *
   */

  static int findShortest(int graphNodes,
                          int[] graphFrom,
                          int[] graphTo,
                          long[] ids,
                          int val) {
    int shortest = 0;
    ArrayList<GraphNode> Nodes = new ArrayList<>();
    for (var id:ids ) {
      Nodes.add(new GraphNode(id));
    }


    return shortest;
  }
}
