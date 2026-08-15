import java.util.*;
public class KeyboardRow500 
{
    public static boolean Contains(String words,List<Character> row)
    {
        for(int i=0;i<words.length();i++)
        {
            if(!row.contains(words.charAt(i)))
                return false;
        }
        return true;
    }
    public static String[] findWords(String[] words) 
    {
        List<Character> row1=Arrays.asList('q','w','e','r','t','y','u','i','o','p');
        List<Character> row2=Arrays.asList('a','s','d','f','g','h','j','k','l');
        List<Character> row3=Arrays.asList('z','x','c','v','b','n','m');
        List<String> Res=new ArrayList<>();
        for(int i=0;i<words.length;i++)
        {
            String lower;
            lower=words[i].toLowerCase();
            
            if(row1.contains(lower.charAt(0)))
            {
                if(Contains(lower,row1))
                    Res.add(words[i]);
            }
            else if(row2.contains(lower.charAt(0)))
            {
                if(Contains(lower,row2))
                    Res.add(words[i]);
            }
            else if(row3.contains(lower.charAt(0)))
            {
                if(Contains(lower,row3))
                    Res.add(words[i]);
            }            
        }
        String[] res=new String[Res.size()];
        for(int i=0;i<res.length;i++)
        {
            res[i]=Res.get(i);
        }
        return res;            
    }
    public static void Display(String[] Res)
    {
        for(int i=0;i<Res.length;i++)
        {
            System.out.print(Res[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) 
    {
        String[] inp={"Hello","Alaska","Dad","Peace"};
        String[] res=findWords(inp);
        Display(res);
    }    
}
