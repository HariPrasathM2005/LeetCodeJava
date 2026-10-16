public class Convert1DArrayto2D2022 
{
    public static int[][] construct2DArray(int[] original, int m, int n) 
    {
        int[][] res=new int[m][n];
        if(m*n!=original.length)
        {
            int[][] Res=new int[0][0];
            return Res;
        }
        int ind=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                res[i][j]=original[ind];
                ind=ind+1;
            }
        }
        return res;
    }
    public static void Display(int[][] A)
    {
        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<A[i].length;j++)
            {
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) 
    {
        int[] nums1={1,2,3,4};
        int[] nums2={1,2,3};
        int[] nums3={1,2};
        int[][] res=construct2DArray(nums3, 1, 1);
        Display(res);
    }    
}
