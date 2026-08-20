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
    public static TreeNode Traverse(TreeNode T)
    {
        if(T==null)
        {
            return T;
        }
        res.add(T.val);
        T.left=Traverse(T.left);
        T.right=Traverse(T.right);
        return T;
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        res.clear();
        root1=Traverse(root1);
        root2=Traverse(root2);
        res.sort(null);
        return res;
    }
}
