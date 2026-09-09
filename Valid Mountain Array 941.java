public class ValidMountainArray941 
{
    public static boolean validMountainArray(int[] arr) 
    {
        boolean dec=false;
        boolean inc=false;
        for(int i=0;i<arr.length;i++)
        {
            if(i+1<arr.length && arr[i]==arr[i+1])
            {
                return false;
            }
            if(i+1<arr.length && arr[i]>arr[i+1])
            {
                dec=true;
            }
            else if(i+1<arr.length && arr[i]<arr[i+1])
            {
                inc=true;
            }
            if(dec)
            {
                if((i+1<arr.length) && arr[i]<arr[i+1])
                {
                    return false;
                }
            }
        }   
        if(dec==true && inc==true)
            return true; 
        else
            return false;
    }
    public static void main(String[] args) 
    {
        int[] arr={0,2,6,3,5,3,4,1};
        boolean res=validMountainArray(arr);
        System.out.println(res);
    }    
}
