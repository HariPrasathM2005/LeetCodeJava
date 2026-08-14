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
    static int Sum=0;
    public static TreeNode Traverse(TreeNode T,int low,int high)
    {
        if(T==null)
        {
            return T;
        }
        if(T.val>=low && T.val<=high)
        {
            Sum=Sum+T.val;
        }
        T.left=Traverse(T.left,low,high);
        T.right=Traverse(T.right,low,high);
        return T;
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        Sum=0;
        root=Traverse(root,low,high);
        return Sum;
    }
}
