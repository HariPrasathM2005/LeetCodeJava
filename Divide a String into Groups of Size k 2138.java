public class DivideString2138 
{
    public static String[] divideString(String s, int k, char fill) 
    {
        int len=0;
        if(s.length()%k==0)
            len=s.length()/k;
        else
            len=(s.length()/k)+1;
        String[] res=new String[len];
        String sub="";
        int ind=0;
        for(int i=0;i<s.length();i++)
        {
            sub=sub+s.charAt(i);
            if((i+1)%k==0)
            {
                res[ind]=sub;
                sub="";
                ind=ind+1;
            }
        }
        if(s.length()%k>0)
        {
            for(int i=0;i<k-(s.length()%k);i++)
                sub=sub+fill;
            res[ind]=sub;
        }
        return res;
    }
    public static void Display(String[] A)
    {
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) 
    {
        String[] res=divideString("abcdefghi", 3, 'x');
        String[] res2=divideString("abcdefghij", 3, 'x');
        Display(res);
        Display(res2);
    }    
}
