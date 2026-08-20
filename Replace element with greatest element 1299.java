class Solution {
    public static int findmax(int[] arr,int ind)
    {
        int max=-1;
        for(int i=ind+1;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        return max;
    }
    public int[] replaceElements(int[] arr) {
        int[] res=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=findmax(arr,i);
        }
        return arr;
    }
}
