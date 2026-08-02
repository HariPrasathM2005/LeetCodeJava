import java.util.*;
public class ValidAnagram242
{
    public static boolean isAnagram(String s, String t) 
    {
        if(s.length()!=t.length())
            return false;
        boolean Res=true;
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(map1.containsKey(s.charAt(i)))
                map1.put(s.charAt(i),map1.get(s.charAt(i))+1);
            else
                map1.put(s.charAt(i),1);
        }
        for(int i=0;i<t.length();i++)
        {
            if(map2.containsKey(t.charAt(i)))
                map2.put(t.charAt(i),map2.get(t.charAt(i))+1);
            else
                map2.put(t.charAt(i),1);
        }
        for(int i=0;i<t.length();i++)
        {
            if(map1.containsKey(t.charAt(i)))
            {
                if(map1.get(t.charAt(i))<map2.get(t.charAt(i)))
                {
                    return false;
                }
            }
            else
                return false;
        }
        //System.out.println(map1);
        //System.out.println(map2);
        return Res;
    }
    public static void main(String[] args)
    {
        String s1="abc";
        String s2="bat";
        boolean Res=isAnagram(s1,s2);
        System.out.println(Res);
    }
}
