public class Mountain 
{
    public static int Maximum(int[] A)
    {
        int Max=A[0];
        for(int i=0;i<A.length;i++)
        {
            if(Max<A[i])
                Max=A[i];
        }
        return Max;
    }
    public static void Display(int[] A)
    {
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i]+" ");
        }
        System.out.println();
    }
    public static void FindAltitue(int[] A)
    {
        int Height=0;
        int[] Res=new int[A.length+1];
        Res[0]=0;
        for(int i=0;i<A.length;i++)
        {
            Height=Height+A[i];
            Res[i+1]=Height;
        }
        int res;
        res=Maximum(Res);
        System.out.println(res);
    }
    public static void main(String[] args) 
    {
        int[] Arr={-4,-3,-2,-1,4,3,2};
        FindAltitue(Arr);  
        
    }
}
