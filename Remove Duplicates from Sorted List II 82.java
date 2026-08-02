/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    static ListNode temp=null;
    static ListNode p=null;
    static ListNode Res=null;
    public static ListNode Insert(ListNode head,int val)
    {
        temp=new ListNode(val);
        temp.next=null;
        if(head==null)
        {
            head=temp;
            return head;
        }
        p=head;
        while(p.next!=null)
            p=p.next;
        p.next=temp;
        return head;
    }
    public ListNode deleteDuplicates(ListNode head) {
        Res=null;
        if(head==null || head.next==null)
        {
            return head;
        }
        int curr=-1000;
        while(head.next!=null)
        {
            if(head.val!=head.next.val && head.val!=curr)
            {
                Res=Insert(Res,head.val);
            }
            else
            {
                curr=head.val;
            }
            head=head.next;
        }
        if(head.val!=curr)
            Res=Insert(Res,head.val);
        return Res;
    
    }
}
