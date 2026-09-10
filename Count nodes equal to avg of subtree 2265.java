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
    static int tot=0;
    static int l=0;
    static int res=0;
    static TreeNode Temp;
    public static TreeNode Traverse(TreeNode root)
    {
        if(root==null)
        {
            return null;
        }
        tot=tot+root.val;
        l=l+1;
        root.left=Traverse(root.left);
        root.right=Traverse(root.right);
        return root;
    }
    public static void Traverse2(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        tot=0;
        l=0;
        Temp=Traverse(root);
        if(tot/l==root.val)
        {
            res=res+1;
        }
        Traverse2(root.left);
        Traverse2(root.right);
        
        
    }
    public int averageOfSubtree(TreeNode root) 
    {
        tot=0;
        l=0;
        res=0;
        //Temp=root;
        Traverse2(root);
        return res;
    }
}
