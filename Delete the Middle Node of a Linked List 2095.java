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
    public static int findLength(ListNode head)
    {
        int len=0;
        if(head==null)
            return len;
        while(head!=null)
        {
            head=head.next;
            len=len+1;
        }
        return len;
    }
    public static ListNode DeleteMiddle(ListNode head, int ind)
    {
        ListNode temp=head;
        int i=0;
        if(ind==0)
            return null;
        while(temp!=null)
        {
            if(i+1==ind)
            {
                temp.next=temp.next.next;
                
            }
            i=i+1;
            temp=temp.next;

        }
        return head;
    }
    public ListNode deleteMiddle(ListNode head) 
    {
        int len=findLength(head);
        head=DeleteMiddle(head,len/2);
        return head;
    }
}
