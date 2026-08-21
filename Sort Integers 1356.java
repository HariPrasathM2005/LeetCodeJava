import java.util.*;
import java.io.*;
public class SortIntegers1356
{
    public static int Countbits(int n)
    {
        int res=0;
        while(n>0)
        {
            if(n%2==1)
                res=res+1;
            n=n/2;
        }
        return res;
    }
    public static int[] sortByBits(int[] arr) 
    {
        int[] res=new int[arr.length];
        int[] c=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            c[i]=Countbits(arr[i]);
        }
        Display(c);
        res=sort(arr,c);
        return res;    
    }
    public static int[] sort(int[] A,int[] B)
    {
        int i=0;
        while(i<B.length-1)
        {
            if(B[i]>B[i+1])
            {
                int temp=B[i];
                B[i]=B[i+1];
                B[i+1]=temp;
                temp=A[i];
                A[i]=A[i+1];
                A[i+1]=temp;
                if(i>0)
                    i=i-1;
            }
            else if(B[i]==B[i+1])
            {
                if(A[i]>A[i+1])
                {
                    int temp=B[i];
                    B[i]=B[i+1];
                    B[i+1]=temp;
                    temp=A[i];
                    A[i]=A[i+1];
                    A[i+1]=temp;
                    if(i>0)
                        i=i-1;
                }
                else
                    i=i+1;
            }
            else
                i=i+1;
        }
        return A;
    }
    public static void Display(int[] A)
    {
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i]+" ");
        }   
        System.out.println();
    }
    public static void main(String[] args)
    {
        //int[] nums={0,1,2,3,4,5,6,7,8};
        int[] nums={1024,512,256,128,64,32,16,8,4,2,1};
        int[] res=sortByBits(nums);
        Display(res);
    }
}
