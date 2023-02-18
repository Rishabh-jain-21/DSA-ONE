// class Solution {
// public static void main(String[] args) {

// }

// public TreeNode invertTree(TreeNode root) {
// // what if the tree is empty it will go for this
// if (root == null) {
// return root;
// }

// if (root.left != null) {
// invertTree(root.left);
// }

// if (root.right != null) {
// invertTree(root.right);
// }
// // swapping the nodes no need to check for null because null be swapped also.
// TreeNode swap = root.left;
// root.left = root.right;
// root.right = swap;
// return root;
// }
// }