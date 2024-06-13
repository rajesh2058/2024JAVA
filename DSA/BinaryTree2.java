//count nodes
import java.util.LinkedList;
import java.util.Queue;

import org.w3c.dom.Node;
public class BinaryTree2 {
    //Build a Tree from its Preorder traversal
   static class Node {
       int data;
       Node left;
       Node right;


       Node(int data) {
           this.data = data;
           this.left = null;
           this.right = null;
       }
   }
   static class BinaryTree {
       static int idx = -1;
       public static Node buildTree(int nodes[]) {
           idx++;
           if(nodes[idx] == -1) {
               return null;
           }
           Node newNode = new Node(nodes[idx]); 
           newNode.left = buildTree(nodes);
           newNode.right = buildTree(nodes);
           return newNode;
       }
   }
   //count number of node
 public static int countOfNodes(Node root){
    if(root == null){
        return 0;
    }
    int leftNodes = countOfNodes(root.left);
    int rightNodes =countOfNodes(root.right);
    return leftNodes + rightNodes + 1;
 }
 //sum of node
 public static int sumOfNodes(Node root){
    if(root == null){
        return 0;
    }
    int leftSum = sumOfNodes(root.left);
    int rightSum =sumOfNodes(root.right);
   return leftSum + rightSum + root.data ; //here root.data is different
 }

//height of tree or level of tree
public static int heightOfNodes(Node root){
    if(root == null){
        return 0;
    }
    int leftheight = heightOfNodes(root.left);
    int rightheight = heightOfNodes(root.right);
    int myHeight = Math.max(leftheight, rightheight) + 1;
    return myHeight;
    //this is collection framework
    //  if(leftheight>rightheight){
    //     return leftheight + 1;
    //  }
    //  else{
    //     return rightheight + 1;
    //  }
 }
   
   public static void main(String args[]) {
       int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
       BinaryTree tree = new BinaryTree();
      
       Node root = tree.buildTree(nodes);
       System.out.println(root.data);
       System.out.println(countOfNodes(root));
       System.out.println(sumOfNodes(root));
       System.out.println(heightOfNodes(root));
   }
}


