public class RichestCustomerWealth1672 
{
    public static int maximumWealth(int[][] accounts)
    {
        int Max=0,Sum=0;
        for(int i=0;i<accounts.length;i++)
        {
            Sum=0;
            for(int j=0;j<accounts[i].length;j++)
            {
               Sum=Sum+accounts[i][j]; 
            }
            if(Max<=Sum)
            {
                Max=Sum;
            }
        }
        return Max;
    }
    public static void main(String[] args) 
    {
        int[][] accounts={{1,2,3},{3,4,1}};
        int val=maximumWealth(accounts);
        System.out.println(val);
    }
}
