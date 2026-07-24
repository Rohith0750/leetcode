/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int sumNumbers(TreeNode root) {
        return sumHelper(root, 0); // Start recursion with initial sum as 0
    }

    // Helper function to compute the sum recursively
    private int sumHelper(TreeNode node, int currentSum) {
        if (node == null) return 0; // Base case: if the node is null, return 0

        currentSum = currentSum * 10 + node.val; // Update the current sum for the path

        // If it's a leaf node, return the current sum
        if (node.left == null && node.right == null) {
            return currentSum; // Return the complete number formed
        }

        // Recursive calls for left and right children
        return sumHelper(node.left, currentSum) + sumHelper(node.right, currentSum); // Sum from both subtrees
    }
}