class ListNode
{
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class RemoveLinkedListElements203
{
    static ListNode head=null;
    static ListNode temp=null;
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
    public static void Display()
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
    public static ListNode removeElements(ListNode head, int val) 
    {
        if(head==null)
            return head;
        p=head;
        boolean ispresent=false;
        while(p!=null)
        {
            if(head.val==val)
                head=head.next;
            else if(p.next!=null && p.next.val==val)
                p.next=p.next.next;
            else if(p.val==val && p.next==null)
                p.next=null;

            if(p.val==val)
            {
                ispresent=true;
            }
            p=p.next;
        }
        if(ispresent)
            head=removeElements(head, val);
        return head;
    }
    public static void main(String[] args) 
    {
        Insert(3);
        Insert(2);
        Insert(3);
        Insert(3);
        Insert(3);
        Insert(3);
        Insert(4);
        Insert(3);
        Display();
        head=removeElements(head, 3);
        Display();
    }
}
