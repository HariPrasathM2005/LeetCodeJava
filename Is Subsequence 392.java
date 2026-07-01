public class Issubsequence392 
{
    public static boolean isSubsequence(String s, String t)
    {
        if(s.isBlank())
            return true;
        boolean Res=false;
        int ind=0,lim,match=0;
        if(s.length()>t.length())
        {
            return false;
        }
        else
        {
            lim=t.length();
        }
        for(int i=0;i<lim;i++)
        {
            if(t.charAt(i)==s.charAt(ind))
            {
                match=match+1;
                
                System.out.println(match+" "+s.charAt(ind));
                ind=ind+1;
                if(ind>=s.length())
                    break;
            }
        }
        if(match!=0 && match==s.length())
            Res=true;
        return Res;
    }
    public static void main(String[] args) 
    {
        String s="cdsdfs";
        String t="ab";
        boolean res=isSubsequence(s, t);
        System.out.println(res);
    }
}
