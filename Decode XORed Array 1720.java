public class DecodeXOR1720 
{
    public static int[] decode(int[] encoded, int first) 
    {
        int[] res=new int[encoded.length+1];
        res[0]=first;
        for(int i=1;i<res.length;i++)
        {
            res[i]=res[i-1]^encoded[i-1];
        }
        return res;    
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
        int[] dec1={1,2,3};
        int[] dec2={6,2,7,3};
        int[] res=decode(dec2, 4);
        Display(res);
    }    
}
