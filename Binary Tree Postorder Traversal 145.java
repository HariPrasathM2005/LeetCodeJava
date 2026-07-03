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
    static List<Integer> Res=new ArrayList<>();
    public static void PostOrder(TreeNode T)
    {
        if(T!=null)
        {
            PostOrder(T.left);
            PostOrder(T.right);
            Res.add(T.val);
        }
    }
    public List<Integer> postorderTraversal(TreeNode root) 
    {
        Res.clear();
        PostOrder(root);
        return Res;
    }
}
