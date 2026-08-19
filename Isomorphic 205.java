import java.util.*;
public class Isormorphic205
{
    static List<Character> used=new ArrayList<>();
    
    public static boolean isIsomorphic(String s, String t) 
    {
        used.clear();
        if(s.length()!=t.length())
            return false;
        HashMap<Character,Character> map=new HashMap<>();
        //System.out.println(alpha);
        for(int i=0;i<s.length();i++)
        {
            if(!map.containsKey(s.charAt(i)))
            {
                if(!used.contains(t.charAt(i)))
                    map.put(s.charAt(i),t.charAt(i));
                else
                    return false;
                used.add(t.charAt(i));
                System.out.println(used);
            }
            else
            {
                if(map.get(s.charAt(i))!=t.charAt(i))
                    return false;
                
            }
        }
        return true;
    }
    public static void main(String[] args) 
    {
        String s="badc";
        String t="baba";
        boolean Res=isIsomorphic(s, t);
        System.out.println(Res);
    }
}
