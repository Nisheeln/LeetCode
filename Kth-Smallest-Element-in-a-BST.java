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
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> li = new ArrayList<>();
        Inorder(root,li);
        return li.get(k-1);
    }
    public void Inorder(TreeNode root, ArrayList<Integer> li){
        if(root == null){
            return;
        }
        Inorder(root.left,li);
        li.add(root.val);
        Inorder(root.right,li);
    }
}