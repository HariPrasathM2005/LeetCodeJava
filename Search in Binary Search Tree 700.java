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
    static TreeNode p=null;
    //static TreeNode root=null;
    public static TreeNode search(TreeNode root, int val)
    {
        if(root==null)
            return null;
        if(root.val==val)
            return root;
        else if(root.val<val)
        {
            root=search(root.right,val);
        }
        else if(root.val>val)
        {
            root=search(root.left,val);
        }
        return root;
    }
    public TreeNode searchBST(TreeNode root, int val) {
        root=search(root,val);
        return root;
    }
}
