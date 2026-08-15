import java.util.*;
public class Base7_504 
{
    public static String convertToBase7(int num) 
    {
        if(num==0)
            return "0";
        String Res="";
        int n=num;
        if(num<0)
        {
            n=-num;
        }
        while(n>0)
        {
            Res=String.valueOf(n%7)+Res;
            n=n/7;
        }
        if(num<0)
            Res='-'+Res;
        return Res;
    }
    public static void main(String[] args)
    {
        int num=-100;
        String Res=convertToBase7(num);
        System.out.println(Res);
    }    
}
