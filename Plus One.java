/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.techwebdocs.plusone;

/**
 *
 * @author mohar
 */
import java.util.*;
import java.io.*;
public class PlusOne {
    public static double digit(int[] num)
    {
        double sum=0;
        for(int i=0;i<num.length;i++)
            sum=num[i]+(sum*10);
        return sum;
    }
    public static String digit_str(int[] num)
    {
        String str="";
        int carry=0;
        for(int i=num.length-1;i>=0;i--)
        {
            //System.out.println(num[i]);
            if(carry==1 && num[i]!=9)
            {
                str=String.valueOf(num[i]+1)+str;
                carry=0;
            }
            else if(carry==1 && num[i]==9)
            {    
                str='0'+str;
                carry=1;
            }
            else if(num[i]==9 && carry==0 && i==num.length-1)
            {
                System.out.println("Initial");
                carry=1;
                str='0'+str;
            }
            else if(i==num.length-1)
            {
                str=String.valueOf(num[i]+1)+str;
            }
            else
                str=String.valueOf(num[i])+str;
           // System.out.println("String growth: "+str);
           
        }
        if(carry==1)
            str='1'+str;
        return str;
    }
    public static int length(int num)
    {
        int l=0;
        while(num>0)
        {
            l=l+1;
            num=num/10;
        }
        return l;
    }
    public static int[] arr(String num)
    {
        int[] Arr=new int[num.length()];
        int ind=num.length()-1;
        //System.out.println(num);
        ind=0;
        for(int i=0;i<num.length();i++)
        {
            Arr[ind]=((int)num.charAt(ind))-48;
            ind=ind+1;
        }
 
        return Arr;
    }
    public static int[] plusOne(int[] digits) 
    {
       
        String num=digit_str(digits);
        int[] Arr;
       
        System.out.println("plus one: "+num);
       
        Arr=arr(num);
        return Arr;
    }
    
    public static void Display(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) 
    {
       
        int[] arr={1,0,0,9};
        arr=plusOne(arr);
        System.out.print("Main: ");
        Display(arr);
    }
}
