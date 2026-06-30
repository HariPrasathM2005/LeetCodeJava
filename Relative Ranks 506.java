import java.util.Arrays;

public class RelativeRanks506 
{
    public static int[] Sort(int[] A)
    {
        int i=0,temp;
        while(i<A.length-1)
        {
            if(A[i]<A[i+1])
            {
                temp=A[i];
                A[i]=A[i+1];
                A[i+1]=temp;
                if(i>0)
                    i=i-1;
            }
            else
                i=i+1;
        }
        return A;
    }
    public static int FindRank(int[] A,int val)
    {
        for(int i=0;i<A.length;i++)
        {
            if(A[i]==val)
                return i;
        }
        return 0;
    }
    public static void Display(String[] arr)
    {
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+", ");
        System.out.println();
    }
    public static void Display(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static String[] findRelativeRanks(int[] score)
    {
        String[] Res=new String[score.length];
        int[] Temp=Arrays.copyOf(score,score.length);
        Temp=Sort(Temp);
        Display(Temp);
        for(int i=0;i<score.length;i++)
        {
            int rank=FindRank(Temp,score[i]);
            if(rank==0)
                Res[i]="Gold Medal";
            else if(rank==1)
                Res[i]="Silver Medal";
            else if(rank==2)
                Res[i]="Bronze Medal";
            else
                Res[i]=String.valueOf(rank+1);
        }
        return Res;
    }
    public static void main(String[] args) 
    {
        int[] arr={10,3,8,9,4};
        String[] Res=findRelativeRanks(arr);
        Display(Res);
    }    
}
