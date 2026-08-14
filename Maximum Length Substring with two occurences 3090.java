import java.util.*;
public class MaximumSubstring3090 
{
    public static boolean isvalid(String s)
    {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(map.containsKey(s.charAt(i)))
            {
                if(map.get(s.charAt(i))>=2)
                    return false;
                else
                    map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else
                map.put(s.charAt(i),1);
        }
        return true;
    }
    public static int maximumLengthSubstring(String s) 
    {
        int Res=0;
        int left=0,right=0;
        String sub="";
        while(right<=s.length())
        {
            sub=s.substring(left, right);
            
            if(isvalid(sub))
            {
                right=right+1;
                //System.out.println(sub);
                if(Res<sub.length())
                {
                    Res=sub.length();
                }
            }
            else
            {
                left=left+1;
            }
        }
        return Res;    
    }
    public static void main(String[] args) 
    {
        String s="bcbbbcba";
        String s1="aaaa";  
        int res=maximumLengthSubstring(s1);
        System.out.println(res);  
    }    
}
