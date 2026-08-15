import java.util.*;
public class IndexofFirstOccurence28 
{
    public static int strStr(String haystack, String needle)
    {
        for(int i=0;i<haystack.length();i++)
        {
            if(haystack.charAt(i)==needle.charAt(0))
            {
                int ind=0;
                int init=i;
                boolean occ=true;
                int c=0;
                while(ind<needle.length() && init+ind<haystack.length())
                {
                    if(haystack.charAt(init+ind)!=needle.charAt(ind))
                    {
                        occ=false;
                        break;
                    }
                    else
                        c=c+1;
                    ind=ind+1;
                }
                if(occ==true && c==needle.length())
                    return init;
            }
        }
        return -1;
    }
    public static void main(String[] args) 
    {
        String s1="mississippi";
        String s2="issipi";
        int res=strStr(s1,s2);
        System.out.println(res);
    }    
}
