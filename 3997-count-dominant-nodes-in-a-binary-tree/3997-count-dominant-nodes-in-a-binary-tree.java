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
    int c=0;
    public int countDominantNodes(TreeNode root) {
        dfs(root);
        return c;
    }
    
    public int dfs(TreeNode root){
        if(root==null) return 0;
        int l=dfs(root.left);
        int r=dfs(root.right);
        if(root.left ==null && root.right==null) {
            c++;
            return root.val;
        }
        else if(root.val>=l && root.val>=r){
            c++;
            return root.val;
        }
        return Math.max(l,r);
    }
}