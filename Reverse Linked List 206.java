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
    static ListNode p=null;
    static ListNode head2=null;
    static ListNode temp=null;
    public static void Insert(int val)
    {
        temp=new ListNode(val);
        temp.next=null;
        if(head2==null)
        {
            head2=temp;
            return;
        }
        p=head2;
        while(p.next!=null)
        {
            p=p.next;
        }
        p.next=temp;
    }
    public ListNode reverseList(ListNode head) 
    {
        head2=null;
        if(head==null)
            return null;
        p=head;
        List<Integer> Nums=new ArrayList<>();
        while(p!=null)
        {
            Nums.add(p.val);
            p=p.next;
        }    
        for(int i=Nums.size()-1;i>=0;i--)
        {
            Insert(Nums.get(i));
        }
        return head2;
    }
}
