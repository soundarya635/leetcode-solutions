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
    public int rob(TreeNode root) {
        int res[]=dfs(root);
        return Math.max(res[0],res[1]);
    }
    public int[] dfs(TreeNode root ){
        if(root==null){
            return new int[2];
        }
        int[] l=dfs(root.left);
        int[] r=dfs(root.right);

        int dp[]=new int[2];
        dp[0]=Math.max(l[0],l[1])+Math.max(r[0],r[1]);

        dp[1]=root.val+l[0]+r[0];

        return dp;
    }
}