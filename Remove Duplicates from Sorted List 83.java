import java.util.*;
class ListNode
{
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class RemoveDuplicates83 
{
    static ListNode head=null;
    static ListNode temp=null;
    static ListNode p=null;
    static List<Integer> nums=new ArrayList<>();
    public static void Insert(int d)
    {
        temp=new ListNode(d);
        temp.next=null;
        if(head==null)
        {
            head=temp;
            return;
        }
        p=head;
        while(p.next!=null)
        {
            p=p.next;
        }
        p.next=temp;
    }
    public static ListNode Insert(ListNode head,int d)
    {
        temp=new ListNode(d);
        temp.next=null;
        if(head==null)
        {
            head=temp;
            return head;
        }
        p=head;
        while(p.next!=null)
        {
            p=p.next;
        }
        p.next=temp;
        return head;
    }
    public static void Display()
    {
        nums.clear();
        if(head==null)
            return;
        p=head;
        while(p!=null)
        {
            System.out.print(p.val+" ");
            p=p.next;
        }
        System.out.println();
    }
    public static void Display(ListNode head)
    {
        if(head==null)
            return;
        p=head;
        while(p!=null)
        {
            System.out.print(p.val+" ");
            p=p.next;
        }
        System.out.println();
    }   
    public static ListNode deleteDuplicates(ListNode head) 
    {
        if(head==null)
            return null;
        p=head;
        while(p!=null)
        {
            if(!nums.contains(p.val))
                nums.add(p.val);
            p=p.next;
        }
        head=null;
        for(int i=0;i<nums.size();i++)
        {
            head=Insert(head,nums.get(i));
        }
        //Display(head);
        return head;
    } 
    public static void main(String[] args) 
    {
        Insert(5);
        Insert(4);
        Insert(3);
        Insert(1);
        Insert(1);
        Insert(2);
        Display();
        ListNode res=deleteDuplicates(head);
    }
}
