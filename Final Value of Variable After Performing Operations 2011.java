public class PerformanceOperations2011 
{
    public static int finalValueAfterOperations(String[] operations) 
    {
        int res=0;
        for(int i=0;i<operations.length;i++)
        {
            if(operations[i].equals("++X") || operations[i].equals("X++"))
                res=res+1;
            else if(operations[i].equals("--X") || operations[i].equals("X--"))
                res=res-1;
        }
        return res;
    }
    public static void main(String[] args) 
    {
        String[] Op1={"--X","X++","X++"};
        String[] Op2={"++X","++X","X++"};
        String[] Op3={"X++","++X","--X","X--"};
        int res=finalValueAfterOperations(Op3);
        System.out.println(res);
    }    
}
