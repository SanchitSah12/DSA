package DataStructures.BinaryTrees;

import javax.swing.*;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }
    int idx = -1;
    public Node buildTree(int node[]){
        idx++;
        if(node[idx] == -1){
            return null;
        }
        Node newNode = new Node(node[idx]);
        newNode.left = buildTree(node);
        newNode.right = buildTree(node);

        return  newNode;
    }

    public void preorder(Node root){
        if(root == null){
            System.out.print("-1 ");
            return;
        }
        System.out.print(root.data+" ");

        preorder(root.left);
        preorder(root.right);
//        System.out.println();

    }

    public void inorder(Node root){
        if(root == null){
            System.out.print("");
            return;
        }

        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public void postorder(Node root){
        if(root == null){
            System.out.print("");
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    public void levelOrder(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()) {
            Node curr = q.remove();
            if(curr == null) {
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }
            else{
                System.out.print(curr.data+" ");
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
        }

    }

    public int NodesAtK(int k, Node root) {
        Queue<Node> q = new LinkedList<>();
        int sum  = 0;
        q.add(root);
        q.add(null);

        while(!q.isEmpty()) {
            Node curr = q.remove();
            if(curr == null) {
                k--;
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
                if(k == 0){
                    return sum;
                }
                else{
                    sum = 0;
                }
            }
            else{
//                System.out.print(curr.data+" ");
                sum += curr.data;
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
        }
        return  sum;
    }

    public int countNodes(Node root){
        if(root==null){
            return 0;
        }
        int left = countNodes(root.left);
        int right = countNodes(root.right);
        return left + right + 1;
    }

    public int sumOfNodes(Node root){
        if(root == null){
            return 0;
        }
        int Leftsum = sumOfNodes(root.left);
        int Rightsum = sumOfNodes(root.right);
        return Leftsum + Rightsum + root.data;
    }
    public int height(Node root) {
        if(root == null){
            return 0;
        }
        int left = height(root.right);
        int right = height(root.left);
        return  Math.max(left, right)+1;
    }

// This code calculates the diameter of a binary tree by recursively finding the maximum diameter of the left and right subtrees, and then adding the heights of the left and right subtrees plus one. The maximum diameter is returned.
   public int diameter(Node root) {
        if(root == null)
            return 0;
        int diamleft = diameter(root.left);
        int diamright = diameter(root.right);
        int diammax = height(root.left) +height(root.right) + 1;
        return Math.max(diamleft,Math.max(diamright,diammax));
    }

    static class TreeInfo{
        int height;
        int diam;

        public TreeInfo(int height, int diam) {
            this.height = height;
            this.diam = diam;
        }
    }

// This code snippet calculates the diameter of a binary tree by recursively finding the height and diameter of each subtree and then calculating the maximum diameter among them.
    public TreeInfo diameter2(Node root){
        if(root == null){
            return new TreeInfo(0,0);
        }
        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);

        int myHeight = Math.max(left.height, right.height)+1;
        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.height + right.height + 1 ;

        int myDiam = Math.max(Math.max(diam1, diam2), diam3);
        return new TreeInfo(myHeight,myDiam);
    }
    

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(arr);
        System.out.println(root.data);
        tree.preorder(root);
        System.out.println("\nInorder");
        tree.inorder(root);
        System.out.println("\nPostOrder");
        tree.postorder(root);
        System.out.println("\nLevelOrder");
        tree.levelOrder(root);

        System.out.println("Count of nodes = "+ tree.countNodes(root));
        System.out.println("Sum of nodes = "+ tree.sumOfNodes(root));
        System.out.println("Height of tree = "+ tree.height(root));
        System.out.println("Diameter of tree = "+ tree.diameter(root));
        System.out.println("Sum at k = "+ tree.NodesAtK(3,root));
        System.out.println("Diameter of tree = "+ tree.diameter2(root).diam);
    }
}
