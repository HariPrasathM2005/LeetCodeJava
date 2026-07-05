class ListNode
{
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class DeleteNode237 
{
    static ListNode head=null;
    static ListNode temp=null;
    static ListNode target=null;
    static ListNode p=null;
    public static void Insert(int val)
    {
        temp=new ListNode(val);
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
    public static void Insert2(int val)
    {
        temp=new ListNode(val);
        temp.next=null;
        if(target==null)
        {
            target=temp;
            return;
        }
        p=target;
        while(p.next!=null)
        {
            p=p.next;
        }
        p.next=temp;
    }
    public static void Display(ListNode Head)
    {
        if(Head==null)
            return;
        p=Head;
        while(p!=null)
        {
            System.out.print(p.val+" ");
            p=p.next;
        }
        System.out.println();
    }
    public static void deleteNode(ListNode node)
    {
        if(node==null)
            return;
        p=node;
        while(p.next!=null)
        {
            p.val=p.next.val;
            if(p.next!=null && p.next.next!=null)
                p=p.next;
            else
            {
                p.next=null;
            }
        }
    }
    public static void main(String[] args) 
    {
        Insert(1);
        Insert(2);
        Insert(3);
        Insert(4);
        Insert(5);

        Insert2(3);
        Insert2(4);
        Insert2(5);

        Display(head);
        Display(target);

        deleteNode(target);
        Display(target);
    }
}
