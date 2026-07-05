/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    static ListNode p=null;
    public boolean hasCycle(ListNode head) 
    {
        if(head==null)
            return false;
        p=head;
        List<Integer> Nums=new ArrayList<>();
        int c=0;
        while(p!=null)
        {
            if(Nums.contains(p.val))
                c=c+1;
            else
                c=0;
            
            if(c>10)
                return true;
            Nums.add(p.val);
            p=p.next;
        }
        return false;
    }
}
