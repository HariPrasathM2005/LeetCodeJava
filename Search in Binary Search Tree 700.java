class TreeNode
{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class SearchinBST700
{
    static TreeNode root=null;
    static TreeNode temp=null;
    static TreeNode p=null;
    //static TreeNode root2=null;
    public static TreeNode Insert(TreeNode root,int val)
    {
        temp=new TreeNode(val);
        temp.left=null;
        temp.right=null;
        if(root==null)
        {
            root=temp;
            return root;
        }
        if(root.val>val)
        {
            root.left=Insert(root.left,val);
        }
        else if(root.val<val)
        {
            root.right=Insert(root.right,val);
        }
        return root;
    }
    public static void Display(TreeNode root)
    {
        if(root==null)
            return;
        System.out.print(root.val+" ");
        Display(root.left);
        Display(root.right);
    }
    public static TreeNode Search(TreeNode root,int val)
    {
        if(root==null)
            return null;
        if(root.val==val)
            return root;
        else if(root.val>val)
            root=Search(root.left,val);
        else if(root.val<val)
            root=Search(root.right,val);
        return root;
    }
    public static void main(String[] args)
    {
        root=Insert(root,4);
        root=Insert(root,2);
        root=Insert(root,5);
        root=Insert(root,1);
        Display(root);
        System.out.println();
        TreeNode root2=null;
        root2=Search(root,2);
        Display(root2);
    }
}
