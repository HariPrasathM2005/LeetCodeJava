import java.util.*;
public class FibonacciNumber509 
{
    public static void FibonnaciSum(int num)
    {
        int n1=0,n2=1,Sum,Res=0;
        List<Integer> Series=new ArrayList<>();
        Series.add(n1);
        Series.add(n2);
        for(int i=2;i<num;i++)
        {
            Sum=n1+n2;
            Series.add(Sum);
            n1=n2;
            n2=Sum;
        }
        System.out.println(Series);
        if(Res>=2)
            Res=Series.get(num-1)+Series.get(num-2);
        else if(Res==1)
            Res=1;
        else if(Res==0)
            Res=0;
        System.out.println(Res);
    }
    public static void main(String[] args) 
    {
        int num=3;
        FibonnaciSum(num);
    }   
}
