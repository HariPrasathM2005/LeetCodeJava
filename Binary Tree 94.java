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
    static List<Integer> res=new ArrayList<>();
    public static TreeNode Inorder(TreeNode root)
    {
        if(root==null)
            return root;
        root.left=Inorder(root.left);
        res.add(root.val);
        root.right=Inorder(root.right);
        
        return root;
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        res.clear();
        root=Inorder(root);
        return res;
    }
}
