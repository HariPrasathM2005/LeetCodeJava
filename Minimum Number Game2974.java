public class MinimumNumberGame2974 
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
    public static void Display(int[] A)
    {
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i]+" ");
        }
        System.out.println();
    }
    public static int[] numberGame(int[] A)
    {
        int[] Res=new int[A.length];
        A=Sort(A);
        Display(A);
        int Alice,bob;
        for(int i=0;i<A.length;i=i+2)
        {
            Alice=A[i];
            bob=A[i+1];
            Res[i]=bob;
            Res[i+1]=Alice;
        }
        return Res;
    }
    public static void main(String[] args) 
    {
        int[] Arr={2,7,9,6,4,6};
        int[] Res=numberGame(Arr);
        Display(Res);  
    }
}
