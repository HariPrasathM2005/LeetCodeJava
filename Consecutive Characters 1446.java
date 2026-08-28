import java.util.*;
public class ConsecutiveCharacters1446
{
    public static int maxPower(String s) 
    {
        int res=0;
        int i=0;
        int max=0;
        Character curr=s.charAt(0);
        while(i<s.length())
        {   
            if(curr==s.charAt(i))
            {
                res=res+1;
            }
            else
            {
                if(max<=res)
                    max=res;
                res=1;
                curr=s.charAt(i);
            }
            i=i+1;
        }
        if(max<=res)
            max=res;
        return max;
    }
    public static void main(String[] args) 
    {
        String s1="Leetcode";
        String s2="abbcccddddeeeeedcba"; 
        String s3="j";   
        int res=maxPower(s3);
        System.out.println(res);
    }
}
