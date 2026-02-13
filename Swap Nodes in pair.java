/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.techwebdocs.swap;

/**
 *
 * @author mohar
 */
import java.util.*;
import java.io.*;
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
class ListNode
{
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val)
    {
        this.val=val;
    }
    ListNode(int val,ListNode next)
    {
        this.val=val;
        this.next=next;
    }
}
public class Swap 
{
    static ListNode Head=null;
    public static void Insert(int d)
    {
        ListNode Temp=new ListNode(d);
        ListNode p=new ListNode();
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
        return;
        
    }
    public static ListNode swapPairs(ListNode head) 
    {
        ListNode p=new ListNode();
        p=head;
        if(head==null)
            return head;
        ListNode temp=new ListNode();
       
        while(p.next!=null)
        {
            temp.val=p.val;
            p.val=p.next.val;
            p.next.val=temp.val;
            p=p.next;
            if(p.next!=null)
                p=p.next;
        }
        return head;
    }
    public static void Display()
    {
        ListNode p=new ListNode();
        p=Head;
        while(p!=null)
        {
            System.out.print(p.val+"->");
            p=p.next;
        }
        System.out.println();
    }
    public static void main(String[] args) 
    {
        Insert(1);
        Insert(2);
        Insert(3);
        Display();
        Head=swapPairs(Head);
        Display();
    }
}
