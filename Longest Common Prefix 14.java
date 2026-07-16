import java.util.*;
public class LongestCommonPrefix14
{
    public static void Display(String[] A)
    {
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i]+" ");
        }
        System.out.println();
    }
    public static boolean issubstream(String str1,String str2)
    {
        boolean Res=true;
        //System.out.println("Str1: "+str1+" Str2:"+str2);
        try
        {
            for(int i=0;i<str2.length();i++)
            {
                if(str2.charAt(i)!=str1.charAt(i))
                    return false;
            }
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public static String longestCommonPrefix2(String[] strs)
    {
        String Res="",sub="";
        Arrays.sort(strs);
        if(strs.length==0)
            return Res;
        for(int i=0;i<strs[0].length();i++)
        {
            try
            {
                sub=sub+strs[0].charAt(i);
            }
            catch(Exception e)
            {
                return "";
            }
            //System.out.println(sub);
            for(int j=0;j<strs.length;j++)
            {
                if(!issubstream(strs[j],sub))
                {
                    //System.out.println(Res);
                    return Res;
                }
            }
            Res=sub;
        }
        return Res;
    } 
    public static String longestCommonPrefix(String[] strs) 
    {
        String Res="";
        Arrays.sort(strs);
        Display(strs);
        List<Character> Chars=new ArrayList<>();
        for(int i=0;i<strs.length;i++)
        {
            try
            {
                if(!Chars.contains(strs[0].charAt(i)))
                    Chars.add(strs[0].charAt(i));
                
            }
            catch(Exception e)
            {

            }
            for(int j=0;j<strs.length;j++)
            {
                try
                {
                    if(!Chars.contains(strs[j].charAt(i)))
                    {
                        //Res=Res+strs[j].charAt(i);
                        break;
                    }
                    else
                    {
                        if(Res!="" && Res.charAt(Res.length()-1)!=strs[j].charAt(i))
                            Res=Res+strs[j].charAt(i);
                        else if(Res=="")
                            Res=Res+strs[j].charAt(i);
                        else
                            Res=Res;
                    }
                }
                catch(Exception e)
                {
                    //System.out.println(e);
                }
            }
        }
        return Res;
    }
    public static void main(String[] args)
    {
        String[] arr={"flower","flow","flight","fff"};
        String Res=longestCommonPrefix2(arr);
        System.out.println(Res);
    }
}
