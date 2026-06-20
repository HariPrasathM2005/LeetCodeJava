public class xorOperation1486 
{
    public static int xorOperation(int n, int start)
    {
        int res=0;
        int[] nums=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=start;
            start=start+2;
        }
        for(int i=0;i<n;i++)
        {
            res=res^nums[i];
        }
        return res;
    }
    public static void main(String[] args) 
    {
        int n=4,Start=3;   
        int val=xorOperation(n, Start);
        System.out.println(val);
    }
}
