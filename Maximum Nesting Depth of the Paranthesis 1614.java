public class MaximumNestingGap1614 
{
    public static int maxDepth(String s) 
    {
        int res=0;
        int max=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                res=res+1;
            }
            else if(s.charAt(i)==')')
            {
                if(max<res)
                    max=res;
                res=res-1;
            }
        }
        return max;
    }
    public static void main(String[] args) 
    {
        String inp1="(1+(2*3)+((8)/4))+1";
        String inp2="(1)+((2))+(((3)))";
        String inp3="()(())((()()))";
        int res=maxDepth(inp3);
        System.out.println(res);
    }    
}
