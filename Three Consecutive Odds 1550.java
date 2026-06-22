public class ThreeConsecutiveOdds1550 
{
    public static boolean threeConsecutiveOdds(int[] arr)
    {   
        int c=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==1)
                c=c+1;
            else
                c=0;
            if(c==3)
                return true;
        }
        return false;
    }
    public static void main(String[] args) 
    {
        int[] arr={1,2,34,3,4,5,7,20,12};   
        boolean val=threeConsecutiveOdds(arr);
        System.out.println(val); 
    }
}
