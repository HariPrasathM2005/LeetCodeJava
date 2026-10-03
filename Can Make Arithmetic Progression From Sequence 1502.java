public class MakeAP1502 
{
    public static boolean canMakeArithmeticProgression(int[] arr) 
    {
        int i=0;
        while(i<arr.length-1)
        {
            if(arr[i]>arr[i+1])
            {
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                if(i>0)
                    i=i-1;
            }
            else
                i=i+1;
        }
        int diff=arr[1]-arr[0];
        for(i=0;i<arr.length-1;i++)
        {
            if(diff!=(arr[i+1]-arr[i]))
                return false;
        }
        return true;
    }
    public static void main(String[] args) 
    {
        int[] nums1={3,5,1};
        int[] nums2={1,2,4};
        boolean Res=canMakeArithmeticProgression(nums2);
        System.out.println(Res);
    }    
}
