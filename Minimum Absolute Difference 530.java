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
    static int Res=900000;
    static List<Integer> Nodes=new ArrayList<>();
    public static TreeNode Traversal(TreeNode T)
    {
        if(T==null)
        {
            return T;
        }
        Nodes.add(T.val);
        T.left=Traversal(T.left);
        T.right=Traversal(T.right);
        return T;
    }
    public static void Sort()
    {
        int i=Nodes.size();
        int ind=0;
        while(ind<i-1)
        {
            if(Nodes.get(ind)>Nodes.get(ind+1))
            {
                int temp = Nodes.get(ind);
        
                Nodes.set(ind, Nodes.get(ind + 1));
                Nodes.set(ind + 1, temp);
                if (ind > 0)
                    ind = ind - 1;
            }
            else
                ind++;
        }
        for(i=0;i<Nodes.size()-1;i++)
        {
            if(Res >=(Nodes.get(i+1)-Nodes.get(i)))
                Res=Nodes.get(i+1)-Nodes.get(i);
        }
    }
    public int getMinimumDifference(TreeNode root) {
        Res=900000;
        Nodes.clear();
        root=Traversal(root);
        Sort();
        return Res;
    }
}
