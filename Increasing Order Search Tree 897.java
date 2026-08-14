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
    static List<Integer> nums=new ArrayList<>();
    static TreeNode temp=null;
    static TreeNode res=null;
    static TreeNode p=null;
    public static TreeNode Traverse(TreeNode T)
    {
        if(T==null)
        {
            return T;
        }
        nums.add(T.val);
        T.left=Traverse(T.left);
        T.right=Traverse(T.right);
        return T;
    }
    public static TreeNode Construct(TreeNode T,int d)
    {
        temp=new TreeNode(d);
        temp.left=null;
        temp.right=null;
        if(T==null)
        {
            T=temp;
            return T;
        }
        p=T;
        while(p.right!=null)
            p=p.right;
        p.right=temp;
        return T;
    }
    public TreeNode increasingBST(TreeNode root) {
        nums.clear();
        res=null;
        root=Traverse(root);
        nums.sort(null);
        for(int i=0;i<nums.size();i++)
            res=Construct(res,nums.get(i));

        return res;
    }
}
