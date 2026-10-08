import java.util.*;
import java.io.*;
public class PrintWordsVertically1324
{
    public static List<String> printVertically(String s) 
    {
        List<String> Res=new ArrayList<>();
        String[] S=s.split(" ");
        //Display(S);
        String great=Greatest(S);
        //System.out.println(great);
        int len=great.length();
        for(int i=0;i<len;i++)
        {
            Res.add("");
        }
        for(int i=0;i<S.length;i++)
        {
            for(int j=0;j<len;j++)
            {

                String word;
                word=Res.get(j);
                if(j<S[i].length())
                    word=word+String.valueOf(S[i].charAt(j));
                else
                    word=word+" ";
                Res.set(j,word);
            }
        }
        //System.out.println(Res);
        for(int i=0;i<Res.size();i++)
        {
            Res.set(i,RemoveTrailing(Res.get(i)));
        }
        //System.out.println(Res);
        return Res;
    }
    public static String Greatest(String[] S)
    {
        int L=S[0].length();
        String Res=S[0];
        for(int i=0;i<S.length;i++)
        {
            if(L<S[i].length())
            {
                L=S[i].length();
                Res=S[i];
            }
        }
        return Res;
    }
    public static String RemoveTrailing(String S)
    {
        String Res="";
        boolean blank=false;
        for(int i=S.length()-1;i>=0;i--)
        {
            if(S.charAt(i)!=' ')
                blank=true;
            if(blank)
                Res=S.charAt(i)+Res;
        }
        return Res;
    }
    public static void Display(String[] s)
    {
        for(int i=0;i<s.length;i++)
        {
            System.out.print(s[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) 
    {
        String inp1="HOW ARE YOU";
        String inp2="TO BE OR NOT TO BE";
        String inp3="CONTEST IS COMING";
        List<String> res=printVertically(inp3);
        System.out.println(res);
    }
}
