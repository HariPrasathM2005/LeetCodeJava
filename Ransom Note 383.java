import java.util.*;
public class Ransomnote383 
{
    public static boolean canConstruct(String ransomNote, String magazine) 
    {
        HashMap<Character,Integer> r=new HashMap<>();
        HashMap<Character,Integer> m=new HashMap<>();
        for(int i=0;i<ransomNote.length();i++)
            r.put(ransomNote.charAt(i),r.getOrDefault(ransomNote.charAt(i), 0)+1);
        for(int i=0;i<magazine.length();i++)
            m.put(magazine.charAt(i),m.getOrDefault(magazine.charAt(i), 0)+1);
        //System.out.println(r);
        for(int i=0;i<ransomNote.length();i++)
        {
            //System.out.println(m.get(ransomNote.charAt(i)));
            if(m.get(ransomNote.charAt(i))!=null)
                m.put(ransomNote.charAt(i),m.get(ransomNote.charAt(i))-1);
            else
                return false;
            if(m.get(ransomNote.charAt(i))<0)
                return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        boolean res=canConstruct("ab", "b");
        System.out.println(res);
    }
}
