/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.techwebdocs.removenthnode19;

/**
 *
 * @author mohar
 */
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }

}
public class RemoveNthnode19 {
    public static ListNode Head=null;
    public static ListNode Temp=null;
    public static ListNode p=null;
    public static void Insert(int d)
    {
        Temp=new ListNode(d);
        Temp.next=null;
        if(Head==null)
        {
            Head=Temp;
            return;
        }
        p=Head;
        while(p.next!=null)
        {
            p=p.next;
        }
        p.next=Temp;
    }
    public static void Display(ListNode head)
    {
        p=head;
        while(p!=null)
        {
            System.out.print(p.val+"-->");
            p=p.next;
        }
        System.out.println();
    }
    public static int Length(ListNode head)
    {
        int l=0;
        p=head;
        while(p!=null)
        {
            l=l+1;
            p=p.next;
        }
        return l;
    }
    public static ListNode removeNthFromEnd(ListNode head, int n) 
    {
        int l=Length(head);
       // System.out.println("Length: "+l);
        int pos=l-n,ind=2;
        p=head;
        if(head==null)
        {
            return null;
        }
        if(head.next==null)
        {
            return null;
        }
        if(n==1)//Last element
        {
            while(p.next.next!=null)
            {
                p=p.next;
            }
            p.next=null;
            return head;
        }
        else if(pos==0)//First element
        {
            head=head.next;
            return head;
        }
        while(p!=null && pos>=ind)
        {
            p=p.next;
            ind=ind+1;
        }
        p.next=p.next.next;
        return head;
    }
    public static void main(String[] args) 
    {
        ListNode Temp2=new ListNode();
        Insert(1);
        Insert(2);
        //Insert(3);
        //Insert(20);
        //Insert(25);
        //Insert(30);
        Display(Head);
        Temp2=removeNthFromEnd(Head,2);
        Display(Temp2);
    }
}
