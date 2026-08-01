public class NextGreaterElement496 
{
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) 
    {
        int[] Res=new int[nums1.length];
        for(int i=0;i<nums1.length;i++)
        {
            int val=nums1[i];
            boolean exec=false;
            for(int j=0;j<nums2.length;j++)
            {
                if(val==nums2[j])
                {
                    int k=j+1;
                    while(k<nums2.length)
                    {
                        if(nums2[k]>val)
                        {
                            Res[i]=nums2[k];
                            exec=true;
                            break;
                        }
                        k++;
                    }
                    if(exec==false)
                    {
                        Res[i]=-1;
                    
                    }
                }
                
            }
        }
        return Res;
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
        int[] nums1={1,3,5,2,4};
        int[] nums2={6,5,4,3,2,1,7};
        int[] Res=nextGreaterElement(nums1,nums2);
        Display(Res);
    }
    
}
