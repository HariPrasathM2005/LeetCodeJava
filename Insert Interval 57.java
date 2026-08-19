import java.util.*;
public class InsertInterval57
{
    static List<List<Integer>> arr=new ArrayList<>();
    static List<Integer> sub=new ArrayList<>();
    public static void Display(int[][] A)
    {
        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<A[i].length;j++)
            {
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void Display(int[] A)
    {
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i]+" ");
        }
        System.out.println();
    }
    public static int[][] insert(int[][] intervals, int[] newInterval) 
    {
        arr.clear();

        int i = 0;

        if(intervals.length == 0)
        {
            sub = new ArrayList<>();
            sub.add(newInterval[0]);
            sub.add(newInterval[1]);

            arr.add(sub);

            return toArray();
        }

        while(i < intervals.length)
        {
            sub = new ArrayList<>();

            sub.add(intervals[i][0]);
            sub.add(intervals[i][1]);

            if(intervals[i][1] < newInterval[0])
            {
                arr.add(new ArrayList<>(sub));
                i++;
            }

            else if(intervals[i][0] > newInterval[1])
            {
                sub.clear();
                sub.add(newInterval[0]);
                sub.add(newInterval[1]);

                arr.add(sub);
                while(i < intervals.length)
                {
                    sub = new ArrayList<>();
                    sub.add(intervals[i][0]);
                    sub.add(intervals[i][1]);

                    arr.add(sub);
                    i++;
                }

                break;
            }

            else
            {
                newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
                newInterval[1] = Math.max(newInterval[1], intervals[i][1]);

                i++;
            }
        }

        if(arr.size() == 0 || arr.get(arr.size() - 1).get(1) < newInterval[0])
        {
            sub.clear();
            sub.add(newInterval[0]);
            sub.add(newInterval[1]);
            arr.add(sub);
        }

        System.out.println(arr);

        Simplify();

        System.out.println(arr);

        return toArray();
    }
    public static int[][] toArray()
    {
        int[][] res=new int[arr.size()][arr.get(0).size()];
        for(int i=0;i<res.length;i++)
        {
            for(int j=0;j<res[i].length;j++)
            {
                res[i][j]=arr.get(i).get(j);
            }
        }
        return res;
    }
    public static void Simplify()
    {
        int i = 0;

        while(i < arr.size() - 1)
        {
            if(arr.get(i).get(1) >= arr.get(i + 1).get(0))
            {
                int newEnd = Math.max(
                    arr.get(i).get(1),
                    arr.get(i + 1).get(1)
                );

                arr.get(i).set(1, newEnd);

                arr.remove(i + 1);

            }
            else
            {
                i++;
            }
        }
    }
    public static void main(String[] args) 
    {
        int[][] intervals={{1,2},{3,8},{8,10},{12,16}};
        int[] Interval={4,8};
        int[][] Res=insert(intervals,Interval);
        //System.out.println("Res: ");
        Display(Res);
    }
}
