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
    static List<Integer> val=new ArrayList<>();
    static int Res=0;
    public static TreeNode Traverse(TreeNode T)
    {
        if(T==null)
        {
            return T;
        }
        val.add(T.val);
        T.left=Traverse(T.left);
        T.right=Traverse(T.right);
        return T;
    }
    public static void Iterate()
    {
        Res=100000;
        for(int i=0;i<val.size()-1;i++)
        {
            if(Res>(val.get(i+1)-val.get(i)))
            {
                Res=val.get(i+1)-val.get(i);
            }
        }
    }
    public int minDiffInBST(TreeNode root) {
        val.clear();
        Res=1000;
        root=Traverse(root);
        val.sort(null);
        System.out.println(val);
        Iterate();
        return Res;
    }
}
