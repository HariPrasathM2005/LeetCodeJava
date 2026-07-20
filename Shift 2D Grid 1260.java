import java.util.*;
public class Shift2DGrid1260
{
    static List<List<Integer>> Res=new ArrayList<>();
    static List<Integer> Sub=new ArrayList<>();
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
        System.out.println("\n\n");
    }
    public static List<List<Integer>> shiftGrid(int[][] grid, int k) 
    {
        int[] arr=new int[grid.length*grid[0].length];
        int ind=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                arr[ind]=grid[i][j];
                ind++;
            }
        }
        k=k%(grid.length*grid[0].length);
        //System.out.println(k);
        ind=arr.length-k;
        if(!(ind<=arr.length-1))
            ind=0;
        //System.out.println(arr[ind]+" "+ind);
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                Sub.add(arr[ind]);
                if(ind<arr.length-1)
                    ind++;
                else
                    ind=0;
            }
            //System.out.println(Sub);
            Res.add(new ArrayList<>(Sub));
            Sub.clear();
        }
        return Res;
    }
    public static void main(String[] args)
    {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        Display(arr);
        Res=shiftGrid(arr,2);
        System.out.println(Res);
    }
}
