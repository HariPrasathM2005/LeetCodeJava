import java.util.*;
import java.io.*;
public class ConstructRectangle4922
{
    public static void Display(int[] A)
    {
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i]+" ");
        }
        System.out.println();
    }
    public static int[] constructRectangle(int area)
    {
        int[] res=new int[2];
        int init=(int)Math.sqrt((double)area);
        int l,w;
        int mindiff=area;
        System.out.println(init);
        for(int i=init;i>0;i--)
        {
            if(area%i==0)
            {
                w=i;
                l=area/i;
                if(mindiff>(l-w))
                {
                    mindiff=l-w;
                    res[0]=l;
                    res[1]=w;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) 
    {
        int area=122122;    
        int[] Res=constructRectangle(area);
        Display(Res);
    }
}
