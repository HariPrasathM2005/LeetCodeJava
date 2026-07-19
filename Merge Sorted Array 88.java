class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] res=new int[m+n];
        for(int i=0;i<n;i++)
        {
            nums1[i+m]=nums2[i];
        }
        Arrays.sort(nums1);
        for(int i=0;i<nums1.length;i++)
            System.out.print(nums1[i]+" ");
    }
}
