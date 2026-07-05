public class ValidPalindromeII680 
{
    public static boolean validPalindrome(String s) 
    {
        String rev="";
        for(int i=0;i<s.length();i++)
        {
            rev=s.charAt(i)+rev;
        }
        //System.out.println(s);
        //System.out.println(rev);
        int ind1=0,ind2=s.length()-1,e1=0,e2=0;
        while(ind1<=(s.length()/2) && ind2>=0)
        {
            if(s.charAt(ind1)!=s.charAt(ind2))
            {
                //System.out.println(s.charAt(ind1)+" "+s.charAt(ind2));
                e1=e1+1;
                if(e1>1)
                {
                    break;
                }

                ind1=ind1+1;    
            }
            else
            {
                ind1=ind1+1;
                ind2=ind2-1;
            }

        }
        //System.out.println();
        ind1=0;
        ind2=s.length()-1;
        while(ind1<=(s.length()/2) && ind2>=0)
        {
            if(s.charAt(ind1)!=s.charAt(ind2))
            {
                //System.out.println(s.charAt(ind1)+" "+s.charAt(ind2));
                e2=e2+1;
                if(e2>1)
                {
                    break;
                }

                ind2=ind2-1;    
            }
            else
            {
                ind1=ind1+1;
                ind2=ind2-1;
            }

        }
        //System.out.println(e1);
        //System.out.println(e2);

        if(e1<=1 || e2<=1)
            return true;
        else if(e1>1 || e2>1)
            return false;   
        return true;
    }
    public static void main(String[] args) 
    {
        String s="ba";    
        boolean res=validPalindrome(s);
        System.out.println(res);
    }
    
}
