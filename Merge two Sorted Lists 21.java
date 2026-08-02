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
    static ListNode head1=null;
    static ListNode head2=null;
    static List<Integer> nums=new ArrayList<>();
    public static void Sort()
    {
        int ind=0;
        while(ind<nums.size()-1)
        {
            if(nums.get(ind)>nums.get(ind+1))
            {
                int temp=nums.get(ind);
                nums.set(ind,nums.get(ind+1));
                nums.set(ind+1,temp);
                if(ind>0)
                    ind=ind-1;
            }
            else
                ind=ind+1;
        }
    }
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        head1=null;
        head2=null;
        nums.clear();
        head1=list1;
        while(head1!=null)
        {
            nums.add(head1.val);
            head1=head1.next;
        }
        head1=list2;
        while(head1!=null)
        {
            nums.add(head1.val);
            head1=head1.next;
        }
        Sort();
        for(int i=0;i<nums.size();i++)
        {
            head2=Insert(head2,nums.get(i));
        }
        return head2;
    }
}
