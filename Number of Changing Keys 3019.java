public class ChangingKeys3019 
{
    public static int countKeyChanges(String s)
    {
        String res;
        int Res=0;
        res=s.toLowerCase();
        for(int i=0;i<res.length()-1;i++)
        {
            if(res.charAt(i)!=res.charAt(i+1))
                Res=Res+1;
        }
        return Res;
    }
    public static void main(String[] args) 
    {
        String s="aAbBcC";
        int val=countKeyChanges(s);
        System.out.println(val);
    }
}
