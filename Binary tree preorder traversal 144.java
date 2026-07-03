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
    public static void Preorder(TreeNode T)
    {
        if(T!=null)
        {
            Res.add(T.val);
            Preorder(T.left);
            Preorder(T.right);
        }
    }
    public List<Integer> preorderTraversal(TreeNode root) 
    {
        Res.clear();
        Preorder(root);
        System.out.println(Res);
        return Res;
        
    }
}
