import java.util.*;
public class UniqueNumberofOccurences1207
{
    public static boolean uniqueOccurrences(int[] arr) 
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        Arrays.sort(arr);
        List<Integer> c=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i],map.get(arr[i])+1);
            }
            else
            {
                map.put(arr[i],1);
            }
        }
        System.out.println(map);
        
        for(Integer key:map.keySet())
        {
            c.add(map.get(key));
        }
        System.out.println(c);
        c.sort(null);
        if(c.size()>=2 && c.get(0).equals(c.get(1)))
        {
            return false;
        }
        for(int i=0;i<c.size()-1;i++)
        {
            if(c.get(i)==c.get(i+1))
            {
                return false;
            }
        }
        return true;    
    }
    public static void main(String[] args) 
    {
        int[] arr={1,2,2,1,1,3,2,3,1};
        boolean Res=uniqueOccurrences(arr);
        System.out.println(Res);
    }
}
