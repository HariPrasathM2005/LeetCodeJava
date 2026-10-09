import java.util.*;
public class DetermineStringHalves1704
{
    public static boolean halvesAreAlike(String s) 
    {
        List<Character> vowel=new ArrayList<>();
        vowel.add('a');
        vowel.add('e');
        vowel.add('i');
        vowel.add('o');
        vowel.add('u');
        s=s.toLowerCase();
        int c1=0,c2=0;
        String str1="",str2="";
        for(int i=0;i<s.length()/2;i++)
        {
            str1=str1+s.charAt(i);
            if(vowel.contains(s.charAt(i)))
            {
                c1=c1+1;
            }
        }
        for(int i=s.length()/2;i<s.length();i++)
        {
            str2=str2+s.charAt(i);
            if(vowel.contains(s.charAt(i)))
                c2=c2+1;
        }
        System.out.println(str1+" "+str2);
        System.out.println(c1+" "+c2);
        System.out.println(s);
        if(c1==c2)
            return true;
        else
            return false;
    }
    public static void main(String[] args) 
    {
        String s1="Book";    
        String s2="textbook";
        boolean Res=halvesAreAlike(s1);
        System.out.println(Res);
    }
}
