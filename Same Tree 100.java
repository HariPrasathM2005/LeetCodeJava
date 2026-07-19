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
    static List<String> t1=new ArrayList<>();
    static List<String> t2=new ArrayList<>();
    public static TreeNode Traverse(TreeNode T,int id)
    {
        if(id==1)
        {
            if(T==null)
            {
                t1.add("null");
                return T;       
            }
            t1.add(String.valueOf(T.val));
            T.left=Traverse(T.left,id);
            T.right=Traverse(T.right,id);
            return T;
        }
        else
        {
            if(T==null)
            {
                t2.add("null");
                return T;
            }
            t2.add(String.valueOf(T.val));
            T.left=Traverse(T.left,id);
            T.right=Traverse(T.right,id);
            return T;
        }
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        t1.clear();
        t2.clear();
        p=Traverse(p,1);
        q=Traverse(q,2);
        return t1.equals(t2);
    }
}
