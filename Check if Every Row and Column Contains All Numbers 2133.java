import java.util.*;
import java.io.*;
public class CheckRowColumn2133 
{
    public static boolean checkValid(int[][] matrix) 
    {
        List<Integer> nums=new ArrayList<>();
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                if(!nums.contains(matrix[i][j]))
                    nums.add(matrix[i][j]);
                else
                    return false;
            }
            nums.clear();
        }
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                if(!nums.contains(matrix[j][i]))
                    nums.add(matrix[j][i]);
                else
                    return false;
            }
            nums.clear();
        }
        return true;
    }
    public static void main(String[] args) 
    {
        int[][] mat1={{1,2,3},{3,1,2},{2,3,1}};
        int[][] mat2={{1,3,2},{1,2,3},{1,2,3}};
        boolean res=checkValid(mat2);
        System.out.println(res);
    }    
}
