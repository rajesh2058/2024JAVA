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
        public boolean isIdentical(TreeNode root, TreeNode subRoot) {
            if (subRoot == null && root == null) {
                return true;
            }
            if (root == null || subRoot == null) {
                return false;
            }
            if (root.val == subRoot.val) {
                return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
            }
            return false;
        }
    
        public boolean isSubtree(TreeNode root, TreeNode subRoot) {
            if (subRoot == null) {
                return true;
            }
            if (root == null) {
                return false;
            }
            if (isIdentical(root, subRoot)) {
                return true;
            }
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
            boolean result = solution.isSubtree(root, subRoot);
    
            // Print the result
            System.out.println("Is subRoot a subtree of root? " + result);
        }
    }
    
