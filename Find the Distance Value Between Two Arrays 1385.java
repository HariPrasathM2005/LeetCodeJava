public class DistancebetweenArrays1385
{
    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) 
    {
        int res=0;
        boolean passed=true;
        for(int i=0;i<arr1.length;i++)
        {
            passed=true;
            for(int j=0;j<arr2.length;j++)
            {
                int diff=arr1[i]-arr2[j];
                if(diff<0)
                    diff=-diff;
                
                if(diff<=d)
                {
                    //System.out.println("Diff: "+diff+" Num1:"+arr1[i]+" Num2:"+arr2[j]);
                    passed=false;
                }
            }
            if(passed)
                res=res+1;
        }
        return res;
    }
    public static void main(String[] args)
    {
        //int res1=findTheDistanceValue(new int[]{4,5,8},new int[]{10,9,1,8}, 2);
        int res2=findTheDistanceValue(new int[]{1,4,2,3},new int[]{-4,-3,6,10,20,30},3);
        System.out.println(res2);
        System.out.println();
        int res3=findTheDistanceValue(new int[]{2,1,100,3}, new int[]{-5,-2,10,-3,7}, 6);
        System.out.println(res3);
    }
}
