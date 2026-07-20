import java.util.*;
public class LongestSubstring 
{
    public static boolean isunique(String s)
    {
        List<Character> S=new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            if(!S.contains(s.charAt(i)))
            {
                S.add(s.charAt(i));
            }
            else
                return false;
        }
        return true;
    }
    public static int lengthOfLongestSubstring(String s)
    {
        List<String> Pattern=new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<s.length();j++)
            {
                Pattern.add(s.substring(i,j+1));
            }
        }
        //System.out.println(Pattern);
        int max=0;
        for(int i=0;i<Pattern.size();i++)
        {
            if(isunique(Pattern.get(i)))
            {
                if(max<Pattern.get(i).length())
                    max=Pattern.get(i).length();
            }
        }
        return max;
    }
    public static int lengthOfLongestSubstring4(String s) 
    {
        int Res=0,max=0;
        List<Character> chrs=new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            if(!chrs.contains(s.charAt(i)))
            {
                chrs.add(s.charAt(i));
                Res=Res+1;
            }
            else
            {
                if(Res>=max)
                {
                    max=Res;
                    chrs.clear();
                    Res=0;
                }
                Res=0;
                chrs.clear();
                i=i-1;
            }
        }
        return max;
    }
    public static int lengthOfLongestSubstring2(String s) 
    {
        int max=0,left=0;
        List<Character> chrs=new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            if(!chrs.contains(s.charAt(i)))
            {
                chrs.add(s.charAt(i));
            }
            else
            {
                if(chrs.size()>=max)
                {
                    max=chrs.size();
                    
                }
                while(chrs.contains(s.charAt(i)))
                {
                    chrs.remove(left);
                    if(max<=chrs.size())
                        max=chrs.size();
                    //System.out.println("Left:"+left+" Inside loop: "+chrs);
                }
                chrs.add(s.charAt(i));
                if(max<=chrs.size())
                    max=chrs.size();
                
            }
            //System.out.println(chrs);
        }
        if(max<=chrs.size())
            max=chrs.size();
        return max;
    }
    public static void main(String[] args) 
    {
        String s="abcabcb"; 
        String s2="bbbb";
        String s3="pwwwkew";
        String s4="dvavdf";
        String s5="ab12!@#1ab";
        int res=lengthOfLongestSubstring2(s);
        System.out.println(res);   
    }
}
