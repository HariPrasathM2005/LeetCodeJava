import java.util.*;
import java.io.*;
public class NumbersareAscending2042
{
    public static boolean areNumbersAscending(String s) 
    {
        boolean res=true;
        int prev=0,num=0;
        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i)))
            {
                num=(num*10)+Integer.parseInt(String.valueOf(s.charAt(i)));
            }
            else
            {
                
                if(num<=prev && num!=0)
                    return false;
                if(num!=0)
                {
                    //System.out.println(num);
                    prev=num;
                }
                num=0;
            }
        }
        //System.out.println(num);
        if(num<=prev && num!=0)
            return false;
        return true;    
    }
    public static void main(String[] args) 
    {
        String s1="1 box has 3 blue 4 red 6 green and 12 yellow marbles";
        String s2="hello world 5 x 5";
        String s="12";
        boolean res=areNumbersAscending(s2);
        System.out.println(res);
    }
}
