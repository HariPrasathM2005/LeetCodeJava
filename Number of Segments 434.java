public class NumberofSegments434 
{
    public static int countSegments(String s)
    {
        int count=0;
        String[] STR=s.split(" ");
        for(int i=0;i<STR.length;i++)
        {
            if(!STR[i].isBlank())
                count=count+1;
        }
        return count;
    }
    public static void main(String[] args) 
    {
        String s = ", , , ,        a, eaefa";
        s="";
        int res=countSegments(s);
        System.out.println(res);
    }
}
