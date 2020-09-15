package java30DaysOfCode;
import java.util.*;

class Node23 {
    Node23 left, right;
    int data;
    Node23(int data){
        this.data = data;
        left = right = null;
    }
}
class day23{

    static void levelOrder(Node23 root){
        System.out.print(root.data + " ");
        printNode(root);
    }

    static void printNode(Node23 node) {

        Node23 currentNode = node;
        LinkedList<Node23> queue = new LinkedList();
        queue.add(currentNode);

        while(!queue.isEmpty()){
            currentNode = queue.remove();

            if(currentNode.left != null){
                queue.add(currentNode.left);
                System.out.print(currentNode.left.data + " ");
            }
            if(currentNode.right != null){
                queue.add(currentNode.right);
                System.out.print(currentNode.right.data + " ");
            }


        }


    }

    public static Node23 insert(Node23 root, int data){
        if(root==null){
            return new Node23(data);
        }
        else{
            Node23 cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node23 root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        levelOrder(Objects.requireNonNull(root));
    }
}