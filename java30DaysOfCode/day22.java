package java30DaysOfCode;

import java.util.*;

public class day22 {
}

class Node1 {
    Node1 left,right;
    int data;
    Node1(int data){
        this.data=data;
        left=right=null;
    }
}
class Solution{
    public static int getHeight(Node2 node){
        int rightHeight = 0, leftHeight = 0;
        if(node == null) {
            return 0;
        }

        if(node.right != null){
            // System.out.println(node.right.data+ " "+ leftHeight+ "  "+rightHeight);
            rightHeight = getHeight(node.right) + 1;
        }
        // else{
        //     rightHeight--;
        // }

        if(node.left != null){
            // System.out.println(node.left.data+ " "+leftHeight+ "  "+rightHeight);
            leftHeight = getHeight(node.left) + 1;
        }
        // else{
        //      leftHeight--;
        // }


        return Math.max(rightHeight, leftHeight);

    }


    public static Node2 insert(Node2 root, int data){
        if(root==null){
            return new Node2(data);
        }
        else{
            Node2 cur;
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
        Node2 root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println(height);
    }
}