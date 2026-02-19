/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.techwebdocs.lengthoflastword58;

/**
 *
 * @author mohar
 */
import java.util.*;
import java.io.*;
public class LengthofLastword58 
{
    public static int lengthOfLastWord(String s) 
    {
        int length=0;
        String[] str;
        str=s.split(" ");
        Display(str);
        length=length(str[str.length-1]);
        return length;
    }
    public static int length(String s)
    {
        return s.length();
    }
    public static void Display(String[] str)
    {
        for(int i=0;i<str.length;i++)
        {
            System.out.print(str[i]+" ");
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String str;
        str=sc.nextLine();
        int l;
        l=lengthOfLastWord(str);
        System.out.println("\n"+l);
    }
}
