import java.util.*;
public class RearrangeWords1451 
{
    static List<Integer> len=new ArrayList<>();
    static String[] strs;
    public static void Sort()
    {
        int i=0;
        while(i<len.size()-1)
        {
            if(len.get(i)>len.get(i+1))
            {
                String Temp=strs[i];
                strs[i]=strs[i+1];
                strs[i+1]=Temp;
                int temp=len.get(i);
                len.set(i,len.get(i+1));
                len.set(i+1,temp);
                if(i>0)
                    i=i-1;
            }
            else
                i=i+1;
        }
        String ch="";
        ch=ch+Character.toUpperCase(strs[0].charAt(0));
        for(i=1;i<strs[0].length();i++)
        {
            ch=ch+(strs[0].charAt(i));
        }
        strs[0]=ch;
    }
    public static void Display(String[] A)
    {
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i]+" ");
        }
        System.out.println();
    }
    public static String arrangeWords(String text) 
    {
        String res="";
        strs=text.split(" ");
        len.clear();
        for(int i=0;i<strs.length;i++)
        {
            strs[i]=strs[i].toLowerCase();
            len.add(strs[i].length());
        }
        //Display(strs);
        //System.out.println(len);
        Sort();
        //Display(strs);
        for(int i=0;i<strs.length;i++)
        {
            res=res+strs[i];
            if(i!=strs.length-1)
                res=res+" ";
        }
        return res;    
    }
    public static void main(String[] args) 
    {
        String inp="Leetcode is cool";
        String res=arrangeWords(inp);
        System.out.println(res);
    }
}
