import java.util.*;
public class BaseballGame682 
{
    public static int calPoints(String[] operations) 
    {
        int Res=0;
        List<Integer> Nums=new ArrayList<>();
        for(int i=0;i<operations.length;i++)
        {
            if(operations[i].equals("D"))
            {
                Nums.add((2*Nums.get(Nums.size()-1)));
            }
            else if(operations[i].equals("C"))
            {
                Nums.remove(Nums.size()-1);
            }
            else if(operations[i].equals("+"))
            {
                int Sum=0;
                Sum=Nums.get(Nums.size()-2)+Nums.get(Nums.size()-1);
                Nums.add(Sum);
            }
            else
            {
                Nums.add(Integer.parseInt(operations[i]));
            }
        }
        int Sum=0;
        for(int i=0;i<Nums.size();i++)
        {
            Sum=Sum+Nums.get(i);
        }
        Res=Sum;
        return Res;
    }
    public static void main(String[] args) 
    {
        String[] ops={"5","-2","4","C","D","9","+","+"};
        int res=calPoints(ops);
        System.out.println(res);
    }
    
}
