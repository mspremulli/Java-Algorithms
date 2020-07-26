package java30DaysOfCode;

import java.util.*;
import java.io.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class day23{

    static void levelOrder(Node root){
        //Write your code here
        System.out.print(root.data + " ");
        printNode(root);
    }

    static void printNode(Node node) {
        //attempt one, did DFS
        // if(node != null){
        //     System.out.print(node.data + " ");
        // }

        // if(node.left != null){
        //      System.out.print(node.left.data + " ");
        // }

        // if(node.right != null){
        //     System.out.print(node.right.data + " ");
        // }

        // if(node.left != null){
        //     printNode(node.left);
        // }

        // if(node.right != null){
        //     printNode(node.right);
        // }

        //attempt2
        Node currentNode = node;
        Queue<Node> queue = new LinkedList();
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

    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
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
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        levelOrder(root);
    }
}