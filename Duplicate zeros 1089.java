class Solution {
    public static int[] duplicate(int[] arr)
    {
        int i=0,ind=0;
        int[] res=new int[arr.length];
        while(ind<arr.length)
        {
            if(arr[i]!=0)
            {
                res[ind]=arr[i];
                ind=ind+1;
            }
            else if(arr[i]==0)
            {
                ind=ind+2;
            }
            i++;
        }
        return res;
    }
    public void duplicateZeros(int[] arr) {
        int[] res = duplicate(arr);

        for(int i = 0; i < arr.length; i++) {
            arr[i] = res[i];
        }
    }
}
