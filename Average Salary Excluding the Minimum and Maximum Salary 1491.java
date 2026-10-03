public class AverageSalaryExcludingminmax1491 
{
    public static double average(int[] salary) 
    {
        double Res=0;
        int i=0;
        while(i<salary.length-1)
        {
            if(salary[i]<salary[i+1])
            {
                int temp=salary[i];
                salary[i]=salary[i+1];
                salary[i+1]=temp;
                if(i>0)
                    i=i-1;
            }
            else
                i=i+1;
        }
        for(i=1;i<salary.length-1;i++)
        {
            Res=Res+salary[i];
        }
        Res=Res/(salary.length-2);
        return Res;
    }
    public static void main(String[] args) 
    {
        int[] salary1={4000,3000,1000,2000};
        int[] salary2={1000,2000,3000};
        double res=average(salary2);
        System.out.println(res);
    }    
}
