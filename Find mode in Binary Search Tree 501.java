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
    static HashMap<Integer,Integer> map=new HashMap<>();
    static List<Integer> nums=new ArrayList<>();
    static int max=0;
    public static TreeNode Traverse(TreeNode T)
    {
        if(T==null)
        {
            return T;
        }
        if(!nums.contains(T.val))
            nums.add(T.val);
        if(map.containsKey(T.val))
        {
            map.put(T.val,map.get(T.val)+1);
            if(max<=map.get(T.val))
                max=map.get(T.val);
        }
        else
        {
            map.put(T.val,1);
            if(max<1)
                max=1;
        }
        T.left=Traverse(T.left);
        T.right=Traverse(T.right);
        return T;
    }
    public int[] findMode(TreeNode root) {
        map.clear();
        nums.clear();
        max=0;
        root=Traverse(root);
        List<Integer> Res=new ArrayList<>();
        System.out.println(max);
        for(int i=0;i<nums.size();i++)
        {
            if(max==map.get(nums.get(i)))
                Res.add(nums.get(i));
        }       
        int[] res=new int[Res.size()];
        for(int i=0;i<Res.size();i++)
        {
            res[i]=Res.get(i);
        }
        return res;
    }
}
