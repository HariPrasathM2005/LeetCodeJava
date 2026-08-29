import java.util.*;
public class CheckifNandDouble1346 
{
    public static boolean checkIfExist3(int[] arr) 
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                for(int j=0;j<arr.length;j++)
                {
                    if(i!=j && arr[j]*2==arr[i])
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static boolean checkIfExist2(int[] arr) 
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(i!=j && arr[j]*2==arr[i])
                {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean checkIfExist(int[] arr) 
    {
        Arrays.sort(arr);//2,3,5,10
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0 && arr[i]>=0)
            {
                for(int j=0;j<i;j++)
                {
                    if(arr[j]*2==arr[i] && i!=j)
                    {
                        return true;
                    }
                }
            }
            else if(arr[i]<0)
            {
                for(int j=0;j<=i;j++)
                {
                    if(arr[i]*2==arr[j] && i!=j)
                    {
                        return true;
                    }
                }
            }
        }
        return false;    
    }
    public static void main(String[] args) 
    {
        int[] arr={-10,12,-20,-8,15};
        boolean Res=checkIfExist(arr);
        System.out.println(Res);
    }    
}
