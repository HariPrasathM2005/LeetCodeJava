public class StudentsDoingHomework1450 
{
    public static int busyStudent(int[] startTime, int[] endTime, int queryTime) 
    {
        int count=0;
        for(int i=0;i<startTime.length;i++)
        {
            if(startTime[i]<=queryTime && queryTime<=endTime[i])
            {
                count=count+1;
            }
        }
        return count;    
    }
    public static void main(String[] args) 
    {
        int[] startTime={4};
        int[] endTime={4};
        int res=busyStudent(startTime, endTime, 4);
        System.out.println(res);
    }    
}
