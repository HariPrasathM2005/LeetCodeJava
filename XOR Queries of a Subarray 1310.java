
public class XORQueries1310 
{
    public static int[] xorQueries(int[] arr, int[][] queries)
    {
        int[] res=new int[queries.length];
        for(int i=0;i<res.length;i++)
        {
            int ind=queries[i][0];
            res[i]=arr[ind];
            //System.out.println("Start:"+res[i]);
            ind=ind+1;
            while(ind<=queries[i][1])
            {
                if(ind+4<=queries[i][1])
                {
                    res[i]=res[i]^arr[ind]^arr[ind+1]^arr[ind+2]^arr[ind+3]^arr[ind+4];
                    ind=ind+5;
                }
                else if(ind+3<=queries[i][1])
                {
                    res[i]=res[i]^arr[ind]^arr[ind+1]^arr[ind+2]^arr[ind+3];
                    ind=ind+4;
                }
                else if(ind+2<=queries[i][1])
                {
                    res[i]=res[i]^arr[ind]^arr[ind+1]^arr[ind+2];
                    ind=ind+3;
                }
                else if(ind+1<=queries[i][1])
                {
                    res[i]=res[i]^arr[ind]^arr[ind+1];
                    ind=ind+2;
                }
                else
                {
                    res[i]=res[i]^arr[ind];
                    ind=ind+1;
                }
            }
            //res[i]=arr[queries[i][0]]^arr[queries[i][1]];

            //System.out.println(arr[queries[i][0]]+" "+arr[queries[i][1]]);
        }
        return res;
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
        int[] arr={1,3,4,8};
        int[][] queries={{0,1},{1,2},{0,3},{3,3}};
        int[] res=xorQueries(arr, queries);
        Display(res);    
    }    
}
