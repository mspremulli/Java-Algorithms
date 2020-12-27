public class LowestCommonAncestor {
  public static Node lca(Node root, int v1, int v2) {
    if(v1 > v2){
      int temp = v2;
      v2 = v1;
      v1 = temp;
    }

    if(root.data < v1) return lca(root.right, v1, v2);
    if(root.data > v2) return lca(root.left, v1, v2);
    return root;
  }
}
