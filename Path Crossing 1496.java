import java.util.*;
import java.io.*;
public class PathCrossing1496 
{
    public static boolean isPathCrossing(String path) 
    {
        if(path.length()==0)
            return true;
        List<List<Integer>> Cor=new ArrayList<>();
        List<Integer> pos=new ArrayList<>();
        pos.add(0);
        pos.add(0);
        Cor.add(new ArrayList<>(pos));
        for(int i=0;i<path.length();i++)
        {
            //System.out.println(pos);
            
            if(path.charAt(i)=='N')
            {
                pos.set(0,pos.get(0)+1);
            }
            else if(path.charAt(i)=='S')
            {
                pos.set(0,pos.get(0)-1);
            }
            else if(path.charAt(i)=='E')
            {
                pos.set(1,pos.get(1)+1);
            }
            else if(path.charAt(i)=='W')
            {
                pos.set(1,pos.get(1)-1);
            }
            if(Cor.contains(pos))
                return true;
            Cor.add(new ArrayList<>(pos));
        }
        //System.out.println(Cor);
        return false;
    }
    public static void main(String[] args) 
    {
        String dir1="NESWW";
        String dir2="NS";
        String dir3="NNSWWEWSSESSWENNW";
        String dir4="SN";
        boolean res=isPathCrossing(dir3);
        System.out.println(res);
    }    
}
