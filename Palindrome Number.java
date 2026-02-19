/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.techwebdocs.palindroe;

/**
 *
 * @author mohar
 */
import java.util.Scanner;
import java.io.*;
import java.util.*;
public class Palindroe {

    public boolean isPalindrome(int x)
    {
        if(x<0)
        {
            return false;
        }
        int n=x;
        int sum=0;
        while(n>0)
        {
            sum=(sum*10)+(n%10);
            n=n/10;
        }
        if(sum==x)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Palindroe p=new Palindroe();
        boolean cond;
        cond=p.isPalindrome(101);
        System.out.println(cond);
    }
}
