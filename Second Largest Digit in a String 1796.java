import java.util.*;
import java.io.*;
public class SecondLargestDigit1796 
{
    public static int secondHighest(String s) 
    {
        int res=0;
        List<Integer> nums=new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i)))
            {
                nums.add(Integer.valueOf(s.charAt(i))-48);
            }
        }
        if(nums.size()==0)
            return -1;
        nums.sort(null);
        System.out.println(nums);

        return FindSecondLargest(nums);    
    }
    public static int FindSecondLargest(List<Integer> A)
    {
        int first=A.get(A.size()-1);
        for(int i=A.size()-1;i>=0;i--)
        {
            if(A.get(i)!=first)
                return A.get(i);
        }
        return -1;

    }
    public static void main(String[] args) 
    {
        String s1="dfa123231afd";
        String s2="abc1111";
        int res=secondHighest(s1);
        System.out.println(res);
    }    
}
