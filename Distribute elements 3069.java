class Solution {
    static List<Integer> arr1=new ArrayList<>();
    static List<Integer> arr2=new ArrayList<>();
    public static int[] toArray(List<Integer> A,List<Integer> B)
    {
        int[] res=new int[A.size()+B.size()];
        for(int i=0;i<A.size();i++)
        {
            res[i]=A.get(i);
        }
        for(int i=A.size();i<A.size()+B.size();i++)
        {
            res[i]=B.get(i-A.size());
        }
        return res;
    }
    public static boolean compare()
    {
        if(arr1.get(arr1.size()-1)>arr2.get(arr2.size()-1))
        {
            return true;
        }
        return false;
    }
    public int[] resultArray(int[] nums) {
        arr1.clear();
        arr2.clear();
        arr1.add(nums[0]);
        arr2.add(nums[1]);
        for(int i=2;i<nums.length;i++)
        {
            if(compare())
                arr1.add(nums[i]);
            else
                arr2.add(nums[i]);
        }
        
        int[] res=new int[arr1.size()+arr2.size()];
        res=toArray(arr1,arr2);
        return res;
    }
}
