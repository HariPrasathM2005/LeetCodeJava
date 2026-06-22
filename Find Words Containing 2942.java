import java.util.*;
public class FindWords2942 
{
    public static boolean isPresent(String words,char x)
    {
        for(int i=0;i<words.length();i++)
        {
            if(words.charAt(i)==x)
                return true;
        }
        return false;
    }
    public static List<Integer> findWordsContaining(String[] words, char x)
    {
        List<Integer> Res=new ArrayList<>();
        for(int i=0;i<words.length;i++)
        {
            if(isPresent(words[i],x))
            {
                Res.add(i);
            }
        }
        return Res;
    }
    public static void main(String[] args) 
    {
        String[] words={"abc","bcd","aaaa","cbc"};
        char x='a';
        List<Integer> Res=findWordsContaining(words, x);
        System.out.println(Res);    
    }
}
