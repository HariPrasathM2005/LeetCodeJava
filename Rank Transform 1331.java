import java.util.*;
public class RankTransform1331
{
    public static int[] Sort(int[] A)
    {
        int i=0,temp;
        while(i<A.length-1)
        {
            if(A[i]>A[i+1])
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
    static HashMap<Integer, Integer> map = new HashMap<>();
    public static int getRank(int[] A,int num)
    {
        int prev=A[0],rank=1;
        if(prev==num)
            return rank;
        for(int i=1;i<A.length;i++)
        {
            if(prev!=A[i])
            {
                rank++;
                if(num==A[i])
                    return rank;
            }
            prev=A[i];
        }
        return rank;
    }
    public static void Display(int[] A)
    {
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i]+" ");
        }
        System.out.println();
    }
    public static int[] arrayRankTransform(int[] arr) 
    {
        map.clear();
        int[] Res=new int[arr.length];
        int[] A=new int[arr.length];
        A=Arrays.copyOf(arr,arr.length);
        Arrays.sort(A);
        int rank=1;
        for(int i=0;i<A.length;i++)
        {   
            if(!map.containsKey(A[i]))
            {
                map.put(A[i],rank);
                rank++;
            }
        }
        System.out.println(map);
        for(int i=0;i<arr.length;i++)
        {
            Res[i]=map.get(arr[i]);
        }
        return Res;
    }
    public static void main(String[] args) 
    {
        int[] arr={37,12,28,9,100,56,80,5,12};
        int[] arr2={100,100,100};
        int[] Res=arrayRankTransform(arr);
        Display(Res);
        
    }
}
