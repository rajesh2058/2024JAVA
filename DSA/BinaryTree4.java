    //check if tree lies as sub tree in another tree
    // if we put public word infront of class TreeNode
    // then JVM expect file name as TreeNode java
    //but when we just put class TreeNodes it treat it as private - package
    //` so which it will be accessable
    //within package 
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    
    class Solution {
        //checking are values equal or not 
        public boolean isIdentical(TreeNode root, TreeNode subRoot) {
            //condition for leaf too
            if (subRoot == null && root == null) {
                return true;
            }
            if (root == null || subRoot == null) {
                return false;
            }
            //check are root equal or not
            if (root.val == subRoot.val) {
            // if root mach then again check right root
            // and left roots are identical or not
                return isIdentical(root.left, subRoot.left) 
                && isIdentical(root.right, subRoot.right);
            }
            return false;
        }
    
        //check if subtree match or not
        public boolean isSubtree(TreeNode root, TreeNode subRoot) {
            //check subroot is null or not
            if (subRoot == null) {
                return true;
            }
            if (root == null) {
                return false;
            }
            //if isIdentical check value and return true then automatically return true
            if (isIdentical(root, subRoot)) {
                return true;
            }
            //if isIdentical return false then check left root with subroot
            //and with right root with subroot until isidentical return true
            return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
        }
    }
    
    public class BinaryTree4{
        public static void main(String[] args) {
            // Create the main tree
            TreeNode root = new TreeNode(3);
            root.left = new TreeNode(4);
            root.right = new TreeNode(5);
            root.left.left = new TreeNode(1);
            root.left.right = new TreeNode(2);
    
            // Create the subtree
            TreeNode subRoot = new TreeNode(4);
            subRoot.left = new TreeNode(1);
            subRoot.right = new TreeNode(2);
    
            // Check if subRoot is a subtree of root
            Solution solution = new Solution();
            //save boolean result 
            boolean result = solution.isSubtree(root, subRoot);
    
            // Print the result
            System.out.println("Is subRoot a subtree of root? " + result);
        }
    }
    
