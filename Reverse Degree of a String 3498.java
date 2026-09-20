public class ReverseDegree3498
{
    public static int reverseDegree(String s) 
    {
        int Res=0;
        for(int i=0;i<s.length();i++)
        {
            //System.out.println((Integer.valueOf(s.charAt(i))-96)+" "+(27-(Integer.valueOf(s.charAt(i))-96)));
            //System.out.println((i+1)+" "+(27-(Integer.valueOf(s.charAt(i))-96)));
            Res=Res+((i+1)*(27-(Integer.valueOf(s.charAt(i))-96)));
        }
        return Res;
    }
    public static void main(String[] args) 
    {
        String inp1="abc";
        String inp2="zaza";
        int res=reverseDegree(inp1);
        System.out.println(res);
    }
}
