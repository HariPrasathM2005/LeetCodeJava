import java.util.*;
public class Substrings1967 
{
    public static int numOfStrings(String[] patterns, String word)
    {
        int res=0;
        List<String> Pattern=new ArrayList<>();
        for(int i=0;i<word.length();i++)
        {
            for(int j=i;j<word.length();j++)
            {
                Pattern.add(word.substring(i,j+1));
            }
        }
        for(int i=0;i<patterns.length;i++)
        {
            if(Pattern.contains(patterns[i]))
                res=res+1;
        }
        return res;
    }
    public static void main(String[] args) 
    {
        String[] patterns={"a","b","c"};
        String word="aaaaabbbbb";    
        int res=numOfStrings(patterns, word);
        System.out.println(res);
    }
}
